package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.ComodidadGeneral;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ComodidadGeneralDataOnDemand_Roo_DataOnDemand {
    
    declare @type: ComodidadGeneralDataOnDemand: @Component;
    
    private Random ComodidadGeneralDataOnDemand.rnd = new SecureRandom();
    
    private List<ComodidadGeneral> ComodidadGeneralDataOnDemand.data;
    
    public ComodidadGeneral ComodidadGeneralDataOnDemand.getNewTransientComodidadGeneral(int index) {
        com.alojamientosturisticos.domain.ComodidadGeneral obj = new com.alojamientosturisticos.domain.ComodidadGeneral();
        obj.setNombre("nombre_" + index);
        return obj;
    }
    
    public ComodidadGeneral ComodidadGeneralDataOnDemand.getSpecificComodidadGeneral(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size()-1)) index = data.size() - 1;
        ComodidadGeneral obj = data.get(index);
        return ComodidadGeneral.findComodidadGeneral(obj.getId());
    }
    
    public ComodidadGeneral ComodidadGeneralDataOnDemand.getRandomComodidadGeneral() {
        init();
        ComodidadGeneral obj = data.get(rnd.nextInt(data.size()));
        return ComodidadGeneral.findComodidadGeneral(obj.getId());
    }
    
    public boolean ComodidadGeneralDataOnDemand.modifyComodidadGeneral(ComodidadGeneral obj) {
        return false;
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void ComodidadGeneralDataOnDemand.init() {
        if (data != null) {
            return;
        }
        
        data = com.alojamientosturisticos.domain.ComodidadGeneral.findComodidadGeneralEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'ComodidadGeneral' illegally returned null");
        if (data.size() > 0) {
            return;
        }
        
        data = new java.util.ArrayList<com.alojamientosturisticos.domain.ComodidadGeneral>();
        for (int i = 0; i < 10; i++) {
            com.alojamientosturisticos.domain.ComodidadGeneral obj = getNewTransientComodidadGeneral(i);
            obj.persist();
            data.add(obj);
        }
    }
    
}
