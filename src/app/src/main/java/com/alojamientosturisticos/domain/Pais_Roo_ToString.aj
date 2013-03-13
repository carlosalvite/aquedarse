package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect Pais_Roo_ToString {
    
    public String Pais.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Version: ").append(getVersion()).append(", ");
        sb.append("Nombre: ").append(getNombre()).append(", ");
        sb.append("Region: ").append(getRegion());
        return sb.toString();
    }
    
}
