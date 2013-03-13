package com.alojamientosturisticos.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.entity.RooEntity;

@Entity
@RooJavaBean
@RooToString
@RooEntity
public class Pais {
	
	@NotNull
    private String nombre;
	
	@NotNull
    private String region;
}
