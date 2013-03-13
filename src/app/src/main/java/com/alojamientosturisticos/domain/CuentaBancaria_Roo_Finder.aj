package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Alojamiento;
import java.lang.Boolean;
import java.lang.SuppressWarnings;
import javax.persistence.EntityManager;
import javax.persistence.Query;

privileged aspect CuentaBancaria_Roo_Finder {
    
    @SuppressWarnings("unchecked")
    public static Query CuentaBancaria.findCuentaBancariasByAlojamiento(Alojamiento alojamiento) {
        if (alojamiento == null) throw new IllegalArgumentException("The alojamiento argument is required");
        EntityManager em = CuentaBancaria.entityManager();
        Query q = em.createQuery("SELECT CuentaBancaria FROM CuentaBancaria AS cuentabancaria WHERE cuentabancaria.alojamiento = :alojamiento");
        q.setParameter("alojamiento", alojamiento);
        return q;
    }
    
    @SuppressWarnings("unchecked")
    public static Query CuentaBancaria.findCuentaBancariasByAlojamientoAndActiva(Alojamiento alojamiento, Boolean activa) {
        if (alojamiento == null) throw new IllegalArgumentException("The alojamiento argument is required");
        if (activa == null) throw new IllegalArgumentException("The activa argument is required");
        EntityManager em = CuentaBancaria.entityManager();
        Query q = em.createQuery("SELECT CuentaBancaria FROM CuentaBancaria AS cuentabancaria WHERE cuentabancaria.alojamiento = :alojamiento AND cuentabancaria.activa = :activa");
        q.setParameter("alojamiento", alojamiento);
        q.setParameter("activa", activa);
        return q;
    }
    
}
