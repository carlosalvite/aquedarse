package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect Banco_Roo_JavaBean {
    
    public String Banco.getNombre() {
        return this.nombre;
    }
    
    public void Banco.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
