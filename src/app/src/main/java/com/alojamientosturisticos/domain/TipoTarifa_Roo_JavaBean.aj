package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect TipoTarifa_Roo_JavaBean {
    
    public String TipoTarifa.getNombre() {
        return this.nombre;
    }
    
    public void TipoTarifa.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
