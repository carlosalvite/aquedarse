package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Alojamiento;
import java.lang.SuppressWarnings;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect Publicacion_Roo_Finder {
    
    @SuppressWarnings("unchecked")
    public static Query Publicacion.findPublicacionsByAlojamiento(Alojamiento alojamiento) {
        if (alojamiento == null) throw new IllegalArgumentException("The alojamiento argument is required");
        EntityManager em = Publicacion.entityManager();
        Query q = em.createQuery("SELECT Publicacion FROM Publicacion AS publicacion WHERE publicacion.alojamiento = :alojamiento");
        q.setParameter("alojamiento", alojamiento);
        return q;
    }
    
}
