package com.alojamientosturisticos.domain;

import java.lang.String;
import java.lang.SuppressWarnings;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect Alojamiento_Roo_Finder {
    
    @SuppressWarnings("unchecked")
    public static Query Alojamiento.findAlojamientoesByNombre(String nombre) {
        if (nombre == null || nombre.length() == 0) throw new IllegalArgumentException("The nombre argument is required");
        EntityManager em = Alojamiento.entityManager();
        Query q = em.createQuery("SELECT Alojamiento FROM Alojamiento AS alojamiento WHERE alojamiento.nombre = :nombre");
        q.setParameter("nombre", nombre);
        return q;
    }
    
}
