package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.TipoAlojamiento;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect TipoAlojamientoDataOnDemand_Roo_DataOnDemand {
    
    declare @type: TipoAlojamientoDataOnDemand: @Component;
    
    private Random TipoAlojamientoDataOnDemand.rnd = new SecureRandom();
    
    private List<TipoAlojamiento> TipoAlojamientoDataOnDemand.data;
    
    public TipoAlojamiento TipoAlojamientoDataOnDemand.getNewTransientTipoAlojamiento(int index) {
        com.alojamientosturisticos.domain.TipoAlojamiento obj = new com.alojamientosturisticos.domain.TipoAlojamiento();
        obj.setNombre("nombre_" + index);
        return obj;
    }
    
    public TipoAlojamiento TipoAlojamientoDataOnDemand.getSpecificTipoAlojamiento(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size()-1)) index = data.size() - 1;
        TipoAlojamiento obj = data.get(index);
        return TipoAlojamiento.findTipoAlojamiento(obj.getId());
    }
    
    public TipoAlojamiento TipoAlojamientoDataOnDemand.getRandomTipoAlojamiento() {
        init();
        TipoAlojamiento obj = data.get(rnd.nextInt(data.size()));
        return TipoAlojamiento.findTipoAlojamiento(obj.getId());
    }
    
    public boolean TipoAlojamientoDataOnDemand.modifyTipoAlojamiento(TipoAlojamiento obj) {
        return false;
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void TipoAlojamientoDataOnDemand.init() {
        if (data != null) {
            return;
        }
        
        data = com.alojamientosturisticos.domain.TipoAlojamiento.findTipoAlojamientoEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'TipoAlojamiento' illegally returned null");
        if (data.size() > 0) {
            return;
        }
        
        data = new java.util.ArrayList<com.alojamientosturisticos.domain.TipoAlojamiento>();
        for (int i = 0; i < 10; i++) {
            com.alojamientosturisticos.domain.TipoAlojamiento obj = getNewTransientTipoAlojamiento(i);
            obj.persist();
            data.add(obj);
        }
    }
    
}
