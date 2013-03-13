package com.alojamientosturisticos.domain;

import java.util.Date;

privileged aspect FechaTemporadaAlta_Roo_JavaBean {
    
    public Date FechaTemporadaAlta.getFecha() {
        return this.fecha;
    }
    
    public void FechaTemporadaAlta.setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
