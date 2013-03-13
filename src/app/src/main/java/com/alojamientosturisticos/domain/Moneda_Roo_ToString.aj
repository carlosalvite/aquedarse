package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect Moneda_Roo_ToString {
    
    public String Moneda.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Version: ").append(getVersion()).append(", ");
        sb.append("Simbolo: ").append(getSimbolo()).append(", ");
        sb.append("SeparadorMiles: ").append(getSeparadorMiles()).append(", ");
        sb.append("SeparadorDecimales: ").append(getSeparadorDecimales()).append(", ");
        sb.append("Pais: ").append(getPais());
        return sb.toString();
    }
    
}
