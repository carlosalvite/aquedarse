package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect TipoHabitacion_Roo_JavaBean {
    
    public String TipoHabitacion.getNombre() {
        return this.nombre;
    }
    
    public void TipoHabitacion.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
