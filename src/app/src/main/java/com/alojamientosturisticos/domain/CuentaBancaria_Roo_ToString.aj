package com.alojamientosturisticos.domain;

import java.lang.String;

privileged aspect CuentaBancaria_Roo_ToString {
    
    public String CuentaBancaria.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Version: ").append(getVersion()).append(", ");
        sb.append("Banco: ").append(getBanco()).append(", ");
        sb.append("NumeroCuenta: ").append(getNumeroCuenta()).append(", ");
        sb.append("TitularCuenta: ").append(getTitularCuenta()).append(", ");
        sb.append("CiRif: ").append(getCiRif()).append(", ");
        sb.append("CorreoElectronico: ").append(getCorreoElectronico()).append(", ");
        sb.append("TipoCiRif: ").append(getTipoCiRif()).append(", ");
        sb.append("Alojamiento: ").append(getAlojamiento()).append(", ");
        sb.append("Activa: ").append(getActiva());
        return sb.toString();
    }
    
}
