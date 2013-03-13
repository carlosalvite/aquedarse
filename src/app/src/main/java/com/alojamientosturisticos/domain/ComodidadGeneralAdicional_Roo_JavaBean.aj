package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect ComodidadGeneralAdicional_Roo_JavaBean {
    
    public String ComodidadGeneralAdicional.getNombre() {
        return this.nombre;
    }
    
    public void ComodidadGeneralAdicional.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
