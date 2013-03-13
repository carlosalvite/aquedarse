package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.FechaTemporadaAlta;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect FechaTemporadaAltaDataOnDemand_Roo_DataOnDemand {
    
    declare @type: FechaTemporadaAltaDataOnDemand: @Component;
    
    private Random FechaTemporadaAltaDataOnDemand.rnd = new SecureRandom();
    
    private List<FechaTemporadaAlta> FechaTemporadaAltaDataOnDemand.data;
    
    public FechaTemporadaAlta FechaTemporadaAltaDataOnDemand.getNewTransientFechaTemporadaAlta(int index) {
        com.alojamientosturisticos.domain.FechaTemporadaAlta obj = new com.alojamientosturisticos.domain.FechaTemporadaAlta();
        return obj;
    }
    
    public FechaTemporadaAlta FechaTemporadaAltaDataOnDemand.getSpecificFechaTemporadaAlta(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size()-1)) index = data.size() - 1;
        FechaTemporadaAlta obj = data.get(index);
        return FechaTemporadaAlta.findFechaTemporadaAlta(obj.getId());
    }
    
    public FechaTemporadaAlta FechaTemporadaAltaDataOnDemand.getRandomFechaTemporadaAlta() {
        init();
        FechaTemporadaAlta obj = data.get(rnd.nextInt(data.size()));
        return FechaTemporadaAlta.findFechaTemporadaAlta(obj.getId());
    }
    
    public boolean FechaTemporadaAltaDataOnDemand.modifyFechaTemporadaAlta(FechaTemporadaAlta obj) {
        return false;
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void FechaTemporadaAltaDataOnDemand.init() {
        if (data != null) {
            return;
        }
        
        data = com.alojamientosturisticos.domain.FechaTemporadaAlta.findFechaTemporadaAltaEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'FechaTemporadaAlta' illegally returned null");
        if (data.size() > 0) {
            return;
        }
        
        data = new java.util.ArrayList<com.alojamientosturisticos.domain.FechaTemporadaAlta>();
        for (int i = 0; i < 10; i++) {
            com.alojamientosturisticos.domain.FechaTemporadaAlta obj = getNewTransientFechaTemporadaAlta(i);
            obj.persist();
            data.add(obj);
        }
    }
    
}
