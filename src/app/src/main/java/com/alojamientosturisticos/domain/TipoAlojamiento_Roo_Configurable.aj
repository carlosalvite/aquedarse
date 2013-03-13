package com.alojamientosturisticos.domain;

import org.springframework.beans.factory.annotation.Configurable;

privileged aspect TipoAlojamiento_Roo_Configurable {
    
    declare @type: TipoAlojamiento: @Configurable;
    
}
