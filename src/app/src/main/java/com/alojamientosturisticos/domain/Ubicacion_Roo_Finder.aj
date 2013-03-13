package com.alojamientosturisticos.domain;

import java.lang.String;
import java.lang.SuppressWarnings;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect Ubicacion_Roo_Finder {
    
    @SuppressWarnings("unchecked")
    public static Query Ubicacion.findUbicacionsByNombreLike(String nombre) {
        if (nombre == null || nombre.length() == 0) throw new IllegalArgumentException("The nombre argument is required");
        nombre = nombre.replace('*', '%');
        if (nombre.charAt(0) != '%') {
            nombre = "%" + nombre;
        }
        if (nombre.charAt(nombre.length() -1) != '%') {
            nombre = nombre + "%";
        }
        EntityManager em = Ubicacion.entityManager();
        Query q = em.createQuery("SELECT Ubicacion FROM Ubicacion AS ubicacion WHERE LOWER(ubicacion.nombre) LIKE LOWER(:nombre)");
        q.setParameter("nombre", nombre);
        return q;
    }
    
    @SuppressWarnings("unchecked")
    public static Query Ubicacion.findUbicacionsByNombre(String nombre) {
        if (nombre == null || nombre.length() == 0) throw new IllegalArgumentException("The nombre argument is required");
        EntityManager em = Ubicacion.entityManager();
        Query q = em.createQuery("SELECT Ubicacion FROM Ubicacion AS ubicacion WHERE ubicacion.nombre = :nombre");
        q.setParameter("nombre", nombre);
        return q;
    }
    
}
