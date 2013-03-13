package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect Pais_Roo_JavaBean {
    
    public String Pais.getNombre() {
        return this.nombre;
    }
    
    public void Pais.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String Pais.getRegion() {
        return this.region;
    }
    
    public void Pais.setRegion(String region) {
        this.region = region;
    }
    
}
