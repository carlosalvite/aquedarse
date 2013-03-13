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
@RooEntity(finders = { "findCuentaBancariasByAlojamiento", "findCuentaBancariasByAlojamientoAndActiva" })
public class CuentaBancaria {

    @NotNull
    @ManyToOne(targetEntity = Banco.class)
    @JoinColumn
    private Banco banco;

    @NotNull
    @Size(min = 20, max = 20)
    private String numeroCuenta;

    @NotNull
    @Size(min = 3, max = 50)
    private String titularCuenta;

    @NotNull
    @Size(min = 5, max = 10)
    private String ciRif;

    @NotNull
    @Size(min = 5, max = 40)
    private String correoElectronico;

    @NotNull
    @ManyToOne(targetEntity = TipoCiRif.class)
    @JoinColumn
    private TipoCiRif tipoCiRif;

    @ManyToOne(targetEntity = Alojamiento.class)
    @JoinColumn
    private Alojamiento alojamiento;

    private Boolean activa;
}
