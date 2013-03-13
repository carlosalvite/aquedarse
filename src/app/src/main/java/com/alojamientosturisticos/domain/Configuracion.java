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
@RooEntity(finders = { "findConfiguracionsByClave" })
public class Configuracion {

    @NotNull
    @Size(min = 3, max = 55)
    private String clave;

    @NotNull
    @Size(min = 3, max = 55)
    private String valor;

    @NotNull
    @Size(min = 3, max = 100)
    private String descripcion;
}
