package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect Parroquia_Roo_ToString {
    
    public String Parroquia.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Version: ").append(getVersion());
        return sb.toString();
    }
    
}
