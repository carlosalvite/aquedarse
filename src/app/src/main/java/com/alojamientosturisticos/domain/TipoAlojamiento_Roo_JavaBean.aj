package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect TipoAlojamiento_Roo_JavaBean {
    
    public String TipoAlojamiento.getNombre() {
        return this.nombre;
    }
    
    public void TipoAlojamiento.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
