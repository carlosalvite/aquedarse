package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect ServiciosIncluidosAdicionales_Roo_JavaBean {
    
    public String ServiciosIncluidosAdicionales.getNombre() {
        return this.nombre;
    }
    
    public void ServiciosIncluidosAdicionales.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
