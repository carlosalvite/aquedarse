package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect Configuracion_Roo_ToString {
    
    public String Configuracion.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Version: ").append(getVersion()).append(", ");
        sb.append("Clave: ").append(getClave()).append(", ");
        sb.append("Valor: ").append(getValor()).append(", ");
        sb.append("Descripcion: ").append(getDescripcion());
        return sb.toString();
    }
    
}
