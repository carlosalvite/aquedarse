package com.alojamientosturisticos.domain;

import org.springframework.beans.factory.annotation.Configurable;

privileged aspect Estado_Roo_Configurable {
    
    declare @type: Estado: @Configurable;
    
}
