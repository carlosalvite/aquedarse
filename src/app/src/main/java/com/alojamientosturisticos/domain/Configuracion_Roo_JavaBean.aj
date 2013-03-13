package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect Configuracion_Roo_JavaBean {
    
    public String Configuracion.getClave() {
        return this.clave;
    }
    
    public void Configuracion.setClave(String clave) {
        this.clave = clave;
    }
    
    public String Configuracion.getValor() {
        return this.valor;
    }
    
    public void Configuracion.setValor(String valor) {
        this.valor = valor;
    }
    
    public String Configuracion.getDescripcion() {
        return this.descripcion;
    }
    
    public void Configuracion.setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
