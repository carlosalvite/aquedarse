package com.alojamientosturisticos.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.entity.RooEntity;

@Entity
@RooJavaBean
@RooToString
@RooEntity(finders = { "findUbicacionsByNombreLike", "findUbicacionsByNombre" })
public class Ubicacion {

    @NotNull
    @Size(min = 3, max = 255)
    private String nombre;

    @ManyToOne(targetEntity = Estado.class)
    @JoinColumn
    private Estado estado;

    @Override
    public String toString() {
        return nombre;
    }
}
