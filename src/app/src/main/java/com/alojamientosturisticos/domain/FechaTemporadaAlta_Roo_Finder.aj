package com.alojamientosturisticos.domain;

import java.lang.SuppressWarnings;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect FechaTemporadaAlta_Roo_Finder {
    
    @SuppressWarnings("unchecked")
    public static Query FechaTemporadaAlta.findFechaTemporadaAltasByFecha(Date fecha) {
        if (fecha == null) throw new IllegalArgumentException("The fecha argument is required");
        EntityManager em = FechaTemporadaAlta.entityManager();
        Query q = em.createQuery("SELECT FechaTemporadaAlta FROM FechaTemporadaAlta AS fechatemporadaalta WHERE fechatemporadaalta.fecha = :fecha");
        q.setParameter("fecha", fecha);
        return q;
    }
    
}
