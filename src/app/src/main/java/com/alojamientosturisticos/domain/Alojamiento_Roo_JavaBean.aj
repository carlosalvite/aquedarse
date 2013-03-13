package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.ComodidadGeneral;
import com.alojamientosturisticos.domain.ComodidadGeneralAdicional;
import com.alojamientosturisticos.domain.TipoAlojamiento;
import com.alojamientosturisticos.domain.Ubicacion;
import java.lang.String;
import java.util.List;
import java.util.Set;

privileged aspect Alojamiento_Roo_JavaBean {
    
    public String Alojamiento.getNombre() {
        return this.nombre;
    }
    
    public void Alojamiento.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String Alojamiento.getDescripcionGeneral() {
        return this.descripcionGeneral;
    }
    
    public void Alojamiento.setDescripcionGeneral(String descripcionGeneral) {
        this.descripcionGeneral = descripcionGeneral;
    }
    
    public TipoAlojamiento Alojamiento.getTipoAlojamiento() {
        return this.tipoAlojamiento;
    }
    
    public void Alojamiento.setTipoAlojamiento(TipoAlojamiento tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }
    
    public Ubicacion Alojamiento.getUbicacion() {
        return this.ubicacion;
    }
    
    public void Alojamiento.setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public String Alojamiento.getDireccion() {
        return this.direccion;
    }
    
    public void Alojamiento.setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String Alojamiento.getLatitudGps() {
        return this.latitudGps;
    }
    
    public void Alojamiento.setLatitudGps(String latitudGps) {
        this.latitudGps = latitudGps;
    }
    
    public String Alojamiento.getLongitudGps() {
        return this.longitudGps;
    }
    
    public void Alojamiento.setLongitudGps(String longitudGps) {
        this.longitudGps = longitudGps;
    }
    
    public List<ComodidadGeneral> Alojamiento.getComodidadesGenerales() {
        return this.comodidadesGenerales;
    }
    
    public void Alojamiento.setComodidadesGenerales(List<ComodidadGeneral> comodidadesGenerales) {
        this.comodidadesGenerales = comodidadesGenerales;
    }
    
    public Set<ComodidadGeneralAdicional> Alojamiento.getComodidadesGeneralesAdicionales() {
        return this.comodidadesGeneralesAdicionales;
    }
    
    public void Alojamiento.setComodidadesGeneralesAdicionales(Set<ComodidadGeneralAdicional> comodidadesGeneralesAdicionales) {
        this.comodidadesGeneralesAdicionales = comodidadesGeneralesAdicionales;
    }
    
    public String Alojamiento.getComodidadesGeneralesAdicionalesTrans() {
        return this.comodidadesGeneralesAdicionalesTrans;
    }
    
    public void Alojamiento.setComodidadesGeneralesAdicionalesTrans(String comodidadesGeneralesAdicionalesTrans) {
        this.comodidadesGeneralesAdicionalesTrans = comodidadesGeneralesAdicionalesTrans;
    }
    
}
