package com.alojamientosturisticos.domain;

import java.lang.String;
import java.lang.SuppressWarnings;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect ComodidadGeneralAdicional_Roo_Finder {
    
    @SuppressWarnings("unchecked")
    public static Query ComodidadGeneralAdicional.findComodidadGeneralAdicionalsByNombreLike(String nombre) {
        if (nombre == null || nombre.length() == 0) throw new IllegalArgumentException("The nombre argument is required");
        nombre = nombre.replace('*', '%');
        if (nombre.charAt(0) != '%') {
            nombre = "%" + nombre;
        }
        if (nombre.charAt(nombre.length() -1) != '%') {
            nombre = nombre + "%";
        }
        EntityManager em = ComodidadGeneralAdicional.entityManager();
        Query q = em.createQuery("SELECT ComodidadGeneralAdicional FROM ComodidadGeneralAdicional AS comodidadgeneraladicional WHERE LOWER(comodidadgeneraladicional.nombre) LIKE LOWER(:nombre)");
        q.setParameter("nombre", nombre);
        return q;
    }
    
}
