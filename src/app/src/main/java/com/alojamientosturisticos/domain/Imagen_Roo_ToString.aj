package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect Imagen_Roo_ToString {
    
    public String Imagen.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Version: ").append(getVersion()).append(", ");
        sb.append("Alojamiento: ").append(getAlojamiento()).append(", ");
        sb.append("EsPrincipal: ").append(getEsPrincipal()).append(", ");
        sb.append("FileData: ").append(java.util.Arrays.toString(getFileData()));
        return sb.toString();
    }
    
}
