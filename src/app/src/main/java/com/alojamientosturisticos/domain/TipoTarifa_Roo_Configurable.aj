package com.alojamientosturisticos.domain;

import org.springframework.beans.factory.annotation.Configurable;

privileged aspect TipoTarifa_Roo_Configurable {
    
    declare @type: TipoTarifa: @Configurable;
    
}
