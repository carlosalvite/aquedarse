package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect Municipio_Roo_ToString {
    
    public String Municipio.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}
