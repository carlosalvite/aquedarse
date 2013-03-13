package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect ComodidadesAdicionales_Roo_JavaBean {
    
    public String ComodidadesAdicionales.getNombre() {
        return this.nombre;
    }
    
    public void ComodidadesAdicionales.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
