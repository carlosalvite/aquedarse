package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect Estado_Roo_JavaBean {
    
    public String Estado.getNombre() {
        return this.nombre;
    }
    
    public void Estado.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
