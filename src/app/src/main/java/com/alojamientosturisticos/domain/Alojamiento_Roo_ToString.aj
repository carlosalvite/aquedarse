package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect Alojamiento_Roo_ToString {
    
    public String Alojamiento.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Version: ").append(getVersion()).append(", ");
        sb.append("Nombre: ").append(getNombre()).append(", ");
        sb.append("DescripcionGeneral: ").append(getDescripcionGeneral()).append(", ");
        sb.append("TipoAlojamiento: ").append(getTipoAlojamiento()).append(", ");
        sb.append("Ubicacion: ").append(getUbicacion()).append(", ");
        sb.append("Direccion: ").append(getDireccion()).append(", ");
        sb.append("LatitudGps: ").append(getLatitudGps()).append(", ");
        sb.append("LongitudGps: ").append(getLongitudGps()).append(", ");
        sb.append("ComodidadesGenerales: ").append(getComodidadesGenerales() == null ? "null" : getComodidadesGenerales().size()).append(", ");
        sb.append("ComodidadesGeneralesAdicionales: ").append(getComodidadesGeneralesAdicionales() == null ? "null" : getComodidadesGeneralesAdicionales().size()).append(", ");
        sb.append("ComodidadesGeneralesAdicionalesTrans: ").append(getComodidadesGeneralesAdicionalesTrans());
        return sb.toString();
    }
    
}
