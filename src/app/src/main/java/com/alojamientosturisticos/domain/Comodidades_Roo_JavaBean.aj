package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect Comodidades_Roo_JavaBean {
    
    public String Comodidades.getNombre() {
        return this.nombre;
    }
    
    public void Comodidades.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
