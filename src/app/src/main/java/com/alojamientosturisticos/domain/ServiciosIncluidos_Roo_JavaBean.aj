package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect ServiciosIncluidos_Roo_JavaBean {
    
    public String ServiciosIncluidos.getNombre() {
        return this.nombre;
    }
    
    public void ServiciosIncluidos.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
