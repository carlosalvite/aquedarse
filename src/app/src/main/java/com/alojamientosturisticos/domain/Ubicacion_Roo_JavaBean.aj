package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Estado;
import java.lang.String;

privileged aspect Ubicacion_Roo_JavaBean {
    
    public String Ubicacion.getNombre() {
        return this.nombre;
    }
    
    public void Ubicacion.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Estado Ubicacion.getEstado() {
        return this.estado;
    }
    
    public void Ubicacion.setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
