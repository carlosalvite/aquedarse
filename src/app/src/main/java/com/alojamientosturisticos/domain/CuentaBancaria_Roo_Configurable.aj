package com.alojamientosturisticos.domain;

import org.springframework.beans.factory.annotation.Configurable;

privileged aspect CuentaBancaria_Roo_Configurable {
    
    declare @type: CuentaBancaria: @Configurable;
    
}
