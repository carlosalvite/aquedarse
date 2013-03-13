package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Alojamiento;
import com.alojamientosturisticos.domain.Comodidades;
import com.alojamientosturisticos.domain.ComodidadesAdicionales;
import com.alojamientosturisticos.domain.FechaTemporadaAlta;
import com.alojamientosturisticos.domain.Moneda;
import com.alojamientosturisticos.domain.ServiciosIncluidos;
import com.alojamientosturisticos.domain.ServiciosIncluidosAdicionales;
import com.alojamientosturisticos.domain.TipoHabitacion;
import com.alojamientosturisticos.domain.TipoTarifa;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.Set;

privileged aspect Publicacion_Roo_JavaBean {
    
    public String Publicacion.getTitulo() {
        return this.titulo;
    }
    
    public void Publicacion.setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public TipoHabitacion Publicacion.getTipoHabitacion() {
        return this.tipoHabitacion;
    }
    
    public void Publicacion.setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
    public Set<ServiciosIncluidos> Publicacion.getServiciosIncluidos() {
        return this.serviciosIncluidos;
    }
    
    public void Publicacion.setServiciosIncluidos(Set<ServiciosIncluidos> serviciosIncluidos) {
        this.serviciosIncluidos = serviciosIncluidos;
    }
    
    public Set<ServiciosIncluidosAdicionales> Publicacion.getServiciosIncluidosAdicionales() {
        return this.serviciosIncluidosAdicionales;
    }
    
    public void Publicacion.setServiciosIncluidosAdicionales(Set<ServiciosIncluidosAdicionales> serviciosIncluidosAdicionales) {
        this.serviciosIncluidosAdicionales = serviciosIncluidosAdicionales;
    }
    
    public String Publicacion.getServiciosIncluidosAdicionalesTrans() {
        return this.serviciosIncluidosAdicionalesTrans;
    }
    
    public void Publicacion.setServiciosIncluidosAdicionalesTrans(String serviciosIncluidosAdicionalesTrans) {
        this.serviciosIncluidosAdicionalesTrans = serviciosIncluidosAdicionalesTrans;
    }
    
    public Set<Comodidades> Publicacion.getComodidades() {
        return this.comodidades;
    }
    
    public void Publicacion.setComodidades(Set<Comodidades> comodidades) {
        this.comodidades = comodidades;
    }
    
    public Set<ComodidadesAdicionales> Publicacion.getComodidadesAdicionales() {
        return this.comodidadesAdicionales;
    }
    
    public void Publicacion.setComodidadesAdicionales(Set<ComodidadesAdicionales> comodidadesAdicionales) {
        this.comodidadesAdicionales = comodidadesAdicionales;
    }
    
    public String Publicacion.getComodidadesAdicionalesTrans() {
        return this.comodidadesAdicionalesTrans;
    }
    
    public void Publicacion.setComodidadesAdicionalesTrans(String comodidadesAdicionalesTrans) {
        this.comodidadesAdicionalesTrans = comodidadesAdicionalesTrans;
    }
    
    public String Publicacion.getCondicionesEspeciales() {
        return this.condicionesEspeciales;
    }
    
    public void Publicacion.setCondicionesEspeciales(String condicionesEspeciales) {
        this.condicionesEspeciales = condicionesEspeciales;
    }
    
    public Integer Publicacion.getHabitacionesDisponibles() {
        return this.habitacionesDisponibles;
    }
    
    public void Publicacion.setHabitacionesDisponibles(Integer habitacionesDisponibles) {
        this.habitacionesDisponibles = habitacionesDisponibles;
    }
    
    public Integer Publicacion.getMinimoNoches() {
        return this.minimoNoches;
    }
    
    public void Publicacion.setMinimoNoches(Integer minimoNoches) {
        this.minimoNoches = minimoNoches;
    }
    
    public Integer Publicacion.getMaximoNoches() {
        return this.maximoNoches;
    }
    
    public void Publicacion.setMaximoNoches(Integer maximoNoches) {
        this.maximoNoches = maximoNoches;
    }
    
    public Integer Publicacion.getCantidadPersonas() {
        return this.cantidadPersonas;
    }
    
    public void Publicacion.setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
    
    public TipoTarifa Publicacion.getTipoTarifa() {
        return this.tipoTarifa;
    }
    
    public void Publicacion.setTipoTarifa(TipoTarifa tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }
    
    public String Publicacion.getTarifaTemporadaBajaStr() {
        return this.tarifaTemporadaBajaStr;
    }
    
    public void Publicacion.setTarifaTemporadaBajaStr(String tarifaTemporadaBajaStr) {
        this.tarifaTemporadaBajaStr = tarifaTemporadaBajaStr;
    }
    
    public Double Publicacion.getTarifaTemporadaBaja() {
        return this.tarifaTemporadaBaja;
    }
    
    public void Publicacion.setTarifaTemporadaBaja(Double tarifaTemporadaBaja) {
        this.tarifaTemporadaBaja = tarifaTemporadaBaja;
    }
    
    public String Publicacion.getTarifaTemporadaAltaStr() {
        return this.tarifaTemporadaAltaStr;
    }
    
    public void Publicacion.setTarifaTemporadaAltaStr(String tarifaTemporadaAltaStr) {
        this.tarifaTemporadaAltaStr = tarifaTemporadaAltaStr;
    }
    
    public Double Publicacion.getTarifaTemporadaAlta() {
        return this.tarifaTemporadaAlta;
    }
    
    public void Publicacion.setTarifaTemporadaAlta(Double tarifaTemporadaAlta) {
        this.tarifaTemporadaAlta = tarifaTemporadaAlta;
    }
    
    public Date Publicacion.getFechaDesde() {
        return this.fechaDesde;
    }
    
    public void Publicacion.setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }
    
    public Date Publicacion.getFechaHasta() {
        return this.fechaHasta;
    }
    
    public void Publicacion.setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
    
    public Set<FechaTemporadaAlta> Publicacion.getFechasTemporadaAlta() {
        return this.fechasTemporadaAlta;
    }
    
    public void Publicacion.setFechasTemporadaAlta(Set<FechaTemporadaAlta> fechasTemporadaAlta) {
        this.fechasTemporadaAlta = fechasTemporadaAlta;
    }
    
    public Double Publicacion.getPorcentajeComision() {
        return this.porcentajeComision;
    }
    
    public void Publicacion.setPorcentajeComision(Double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
    
    public Date Publicacion.getHoraCheckIn() {
        return this.horaCheckIn;
    }
    
    public void Publicacion.setHoraCheckIn(Date horaCheckIn) {
        this.horaCheckIn = horaCheckIn;
    }
    
    public Date Publicacion.getHoraCheckOut() {
        return this.horaCheckOut;
    }
    
    public void Publicacion.setHoraCheckOut(Date horaCheckOut) {
        this.horaCheckOut = horaCheckOut;
    }
    
    public Boolean Publicacion.getTemporadas() {
        return this.temporadas;
    }
    
    public void Publicacion.setTemporadas(Boolean temporadas) {
        this.temporadas = temporadas;
    }
    
    public Moneda Publicacion.getMoneda() {
        return this.moneda;
    }
    
    public void Publicacion.setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
    
    public Alojamiento Publicacion.getAlojamiento() {
        return this.alojamiento;
    }
    
    public void Publicacion.setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }
    
}
