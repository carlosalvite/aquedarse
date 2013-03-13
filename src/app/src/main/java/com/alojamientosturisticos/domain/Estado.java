package com.alojamientosturisticos.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.entity.RooEntity;

@Entity
@RooJavaBean
@RooToString
@RooEntity
public class Estado {
    
    @NotNull
    @Size(min = 2)
    private String nombre;

    @Override
    public String toString() {
        return nombre;
    }
}
