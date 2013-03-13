package com.alojamientosturisticos.domain;

import java.lang.String;
import java.lang.SuppressWarnings;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect ComodidadGeneral_Roo_Finder {
    
    @SuppressWarnings("unchecked")
    public static Query ComodidadGeneral.findComodidadGeneralsByNombreLike(String nombre) {
        if (nombre == null || nombre.length() == 0) throw new IllegalArgumentException("The nombre argument is required");
        nombre = nombre.replace('*', '%');
        if (nombre.charAt(0) != '%') {
            nombre = "%" + nombre;
        }
        if (nombre.charAt(nombre.length() -1) != '%') {
            nombre = nombre + "%";
        }
        EntityManager em = ComodidadGeneral.entityManager();
        Query q = em.createQuery("SELECT ComodidadGeneral FROM ComodidadGeneral AS comodidadgeneral WHERE LOWER(comodidadgeneral.nombre) LIKE LOWER(:nombre)");
        q.setParameter("nombre", nombre);
        return q;
    }
    
}
