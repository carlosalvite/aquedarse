/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alojamientosturisticos.form;

import com.alojamientosturisticos.domain.Alojamiento;
import com.alojamientosturisticos.domain.Imagen;
import com.alojamientosturisticos.domain.Ubicacion;

/**
 *
 * @author carlosalvite
 */
public class AlojamientoMegaForm {
    
    private Alojamiento alojamiento;
    private Ubicacion ubicacion;
    
    public AlojamientoMegaForm(){
        alojamiento = new Alojamiento();
        ubicacion = new Ubicacion();
    }
    
    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }
    
    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
}
