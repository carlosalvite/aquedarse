package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect FechaTemporadaAlta_Roo_ToString {
    
    public String FechaTemporadaAlta.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Version: ").append(getVersion()).append(", ");
        sb.append("Fecha: ").append(getFecha());
        return sb.toString();
    }
    
}
