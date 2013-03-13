package com.alojamientosturisticos.domain;

import org.springframework.beans.factory.annotation.Configurable;

privileged aspect TipoHabitacion_Roo_Configurable {
    
    declare @type: TipoHabitacion: @Configurable;
    
}
