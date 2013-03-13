package com.alojamientosturisticos.domain;

import java.lang.String;
import java.lang.SuppressWarnings;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect Configuracion_Roo_Finder {
    
    @SuppressWarnings("unchecked")
    public static Query Configuracion.findConfiguracionsByClave(String clave) {
        if (clave == null || clave.length() == 0) throw new IllegalArgumentException("The clave argument is required");
        EntityManager em = Configuracion.entityManager();
        Query q = em.createQuery("SELECT Configuracion FROM Configuracion AS configuracion WHERE configuracion.clave = :clave");
        q.setParameter("clave", clave);
        return q;
    }
    
}
