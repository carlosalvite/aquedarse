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
@RooEntity
public class Moneda {
	
	@NotNull
    private String simbolo;
	
	@NotNull
	private String separadorMiles;
	
	@NotNull
	private String separadorDecimales;
    
	@NotNull
    @ManyToOne(targetEntity = Pais.class)
    @JoinColumn
    private Pais pais;
	
	/*@Override
    public String toString() {
        return nombre;
    }*/
}
