package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect TipoCiRif_Roo_JavaBean {
    
    public String TipoCiRif.getNombre() {
        return this.nombre;
    }
    
    public void TipoCiRif.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
