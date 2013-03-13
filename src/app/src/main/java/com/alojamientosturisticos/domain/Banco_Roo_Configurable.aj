package com.alojamientosturisticos.domain;

import org.springframework.beans.factory.annotation.Configurable;

privileged aspect Banco_Roo_Configurable {
    
    declare @type: Banco: @Configurable;
    
}
