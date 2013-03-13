package com.alojamientosturisticos.domain;

import org.springframework.beans.factory.annotation.Configurable;

privileged aspect Moneda_Roo_Configurable {
    
    declare @type: Moneda: @Configurable;
    
}
