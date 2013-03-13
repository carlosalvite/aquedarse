package com.alojamientosturisticos.domain;

import org.springframework.beans.factory.annotation.Configurable;

privileged aspect Alojamiento_Roo_Configurable {
    
    declare @type: Alojamiento: @Configurable;
    
}
