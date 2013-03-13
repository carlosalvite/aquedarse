package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Alojamiento;
import java.lang.SuppressWarnings;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect Imagen_Roo_Finder {
    
    @SuppressWarnings("unchecked")
    public static Query Imagen.findImagensByAlojamiento(Alojamiento alojamiento) {
        if (alojamiento == null) throw new IllegalArgumentException("The alojamiento argument is required");
        EntityManager em = Imagen.entityManager();
        Query q = em.createQuery("SELECT Imagen FROM Imagen AS imagen WHERE imagen.alojamiento = :alojamiento");
        q.setParameter("alojamiento", alojamiento);
        return q;
    }
    
}
