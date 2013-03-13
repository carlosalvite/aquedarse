package com.alojamientosturisticos.domain;

import org.springframework.beans.factory.annotation.Configurable;

privileged aspect Configuracion_Roo_Configurable {
    
    declare @type: Configuracion: @Configurable;
    
}
