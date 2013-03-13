package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Alojamiento;
import java.lang.Boolean;

privileged aspect Imagen_Roo_JavaBean {
    
    public Alojamiento Imagen.getAlojamiento() {
        return this.alojamiento;
    }
    
    public void Imagen.setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }
    
    public Boolean Imagen.getEsPrincipal() {
        return this.esPrincipal;
    }
    
    public void Imagen.setEsPrincipal(Boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }
    
    public byte[] Imagen.getFileData() {
        return this.fileData;
    }
    
    public void Imagen.setFileData(byte[] fileData) {
        this.fileData = fileData;
    }
    
}
