package com.alojamientosturisticos.domain;

import org.springframework.beans.factory.annotation.Configurable;

privileged aspect Publicacion_Roo_Configurable {
    
    declare @type: Publicacion: @Configurable;
    
}
