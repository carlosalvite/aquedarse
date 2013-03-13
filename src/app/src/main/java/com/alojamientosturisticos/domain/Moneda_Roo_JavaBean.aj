package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Pais;
import java.lang.String;

privileged aspect Moneda_Roo_JavaBean {
    
    public String Moneda.getSimbolo() {
        return this.simbolo;
    }
    
    public void Moneda.setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    
    public String Moneda.getSeparadorMiles() {
        return this.separadorMiles;
    }
    
    public void Moneda.setSeparadorMiles(String separadorMiles) {
        this.separadorMiles = separadorMiles;
    }
    
    public String Moneda.getSeparadorDecimales() {
        return this.separadorDecimales;
    }
    
    public void Moneda.setSeparadorDecimales(String separadorDecimales) {
        this.separadorDecimales = separadorDecimales;
    }
    
    public Pais Moneda.getPais() {
        return this.pais;
    }
    
    public void Moneda.setPais(Pais pais) {
        this.pais = pais;
    }
    
}
