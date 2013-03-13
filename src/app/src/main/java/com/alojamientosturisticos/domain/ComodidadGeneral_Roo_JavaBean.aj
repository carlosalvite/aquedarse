package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect ComodidadGeneral_Roo_JavaBean {
    
    public String ComodidadGeneral.getNombre() {
        return this.nombre;
    }
    
    public void ComodidadGeneral.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
