package com.alojamientosturisticos.domain;

import org.springframework.beans.factory.annotation.Configurable;

privileged aspect Ubicacion_Roo_Configurable {
    
    declare @type: Ubicacion: @Configurable;
    
}
