package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect Publicacion_Roo_ToString {
    
    public String Publicacion.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Version: ").append(getVersion()).append(", ");
        sb.append("Titulo: ").append(getTitulo()).append(", ");
        sb.append("TipoHabitacion: ").append(getTipoHabitacion()).append(", ");
        sb.append("ServiciosIncluidos: ").append(getServiciosIncluidos() == null ? "null" : getServiciosIncluidos().size()).append(", ");
        sb.append("ServiciosIncluidosAdicionales: ").append(getServiciosIncluidosAdicionales() == null ? "null" : getServiciosIncluidosAdicionales().size()).append(", ");
        sb.append("ServiciosIncluidosAdicionalesTrans: ").append(getServiciosIncluidosAdicionalesTrans()).append(", ");
        sb.append("Comodidades: ").append(getComodidades() == null ? "null" : getComodidades().size()).append(", ");
        sb.append("ComodidadesAdicionales: ").append(getComodidadesAdicionales() == null ? "null" : getComodidadesAdicionales().size()).append(", ");
        sb.append("ComodidadesAdicionalesTrans: ").append(getComodidadesAdicionalesTrans()).append(", ");
        sb.append("CondicionesEspeciales: ").append(getCondicionesEspeciales()).append(", ");
        sb.append("HabitacionesDisponibles: ").append(getHabitacionesDisponibles()).append(", ");
        sb.append("MinimoNoches: ").append(getMinimoNoches()).append(", ");
        sb.append("MaximoNoches: ").append(getMaximoNoches()).append(", ");
        sb.append("CantidadPersonas: ").append(getCantidadPersonas()).append(", ");
        sb.append("TipoTarifa: ").append(getTipoTarifa()).append(", ");
        sb.append("TarifaTemporadaBajaStr: ").append(getTarifaTemporadaBajaStr()).append(", ");
        sb.append("TarifaTemporadaBaja: ").append(getTarifaTemporadaBaja()).append(", ");
        sb.append("TarifaTemporadaAltaStr: ").append(getTarifaTemporadaAltaStr()).append(", ");
        sb.append("TarifaTemporadaAlta: ").append(getTarifaTemporadaAlta()).append(", ");
        sb.append("FechaDesde: ").append(getFechaDesde()).append(", ");
        sb.append("FechaHasta: ").append(getFechaHasta()).append(", ");
        sb.append("FechasTemporadaAlta: ").append(getFechasTemporadaAlta() == null ? "null" : getFechasTemporadaAlta().size()).append(", ");
        sb.append("PorcentajeComision: ").append(getPorcentajeComision()).append(", ");
        sb.append("HoraCheckIn: ").append(getHoraCheckIn()).append(", ");
        sb.append("HoraCheckOut: ").append(getHoraCheckOut()).append(", ");
        sb.append("Temporadas: ").append(getTemporadas()).append(", ");
        sb.append("Moneda: ").append(getMoneda()).append(", ");
        sb.append("Alojamiento: ").append(getAlojamiento());
        return sb.toString();
    }
    
}
