package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Alojamiento;
import com.alojamientosturisticos.domain.Banco;
import com.alojamientosturisticos.domain.TipoCiRif;
import java.lang.Boolean;
import java.lang.String;

privileged aspect CuentaBancaria_Roo_JavaBean {
    
    public Banco CuentaBancaria.getBanco() {
        return this.banco;
    }
    
    public void CuentaBancaria.setBanco(Banco banco) {
        this.banco = banco;
    }
    
    public String CuentaBancaria.getNumeroCuenta() {
        return this.numeroCuenta;
    }
    
    public void CuentaBancaria.setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public String CuentaBancaria.getTitularCuenta() {
        return this.titularCuenta;
    }
    
    public void CuentaBancaria.setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }
    
    public String CuentaBancaria.getCiRif() {
        return this.ciRif;
    }
    
    public void CuentaBancaria.setCiRif(String ciRif) {
        this.ciRif = ciRif;
    }
    
    public String CuentaBancaria.getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    public void CuentaBancaria.setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    public TipoCiRif CuentaBancaria.getTipoCiRif() {
        return this.tipoCiRif;
    }
    
    public void CuentaBancaria.setTipoCiRif(TipoCiRif tipoCiRif) {
        this.tipoCiRif = tipoCiRif;
    }
    
    public Alojamiento CuentaBancaria.getAlojamiento() {
        return this.alojamiento;
    }
    
    public void CuentaBancaria.setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }
    
    public Boolean CuentaBancaria.getActiva() {
        return this.activa;
    }
    
    public void CuentaBancaria.setActiva(Boolean activa) {
        this.activa = activa;
    }
    
}
