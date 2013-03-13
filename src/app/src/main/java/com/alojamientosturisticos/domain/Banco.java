package com.alojamientosturisticos.domain;

import javax.persistence.Entity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.entity.RooEntity;

@Entity
@RooJavaBean
@RooToString
@RooEntity
public class Banco {

    private String nombre;
    
    @Override
    public String toString() {
        return nombre;
    }
    
}
