package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Estado;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect EstadoDataOnDemand_Roo_DataOnDemand {
    
    declare @type: EstadoDataOnDemand: @Component;
    
    private Random EstadoDataOnDemand.rnd = new SecureRandom();
    
    private List<Estado> EstadoDataOnDemand.data;
    
    public Estado EstadoDataOnDemand.getNewTransientEstado(int index) {
        com.alojamientosturisticos.domain.Estado obj = new com.alojamientosturisticos.domain.Estado();
        obj.setNombre("nombre_" + index);
        return obj;
    }
    
    public Estado EstadoDataOnDemand.getSpecificEstado(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size()-1)) index = data.size() - 1;
        Estado obj = data.get(index);
        return Estado.findEstado(obj.getId());
    }
    
    public Estado EstadoDataOnDemand.getRandomEstado() {
        init();
        Estado obj = data.get(rnd.nextInt(data.size()));
        return Estado.findEstado(obj.getId());
    }
    
    public boolean EstadoDataOnDemand.modifyEstado(Estado obj) {
        return false;
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void EstadoDataOnDemand.init() {
        if (data != null) {
            return;
        }
        
        data = com.alojamientosturisticos.domain.Estado.findEstadoEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'Estado' illegally returned null");
        if (data.size() > 0) {
            return;
        }
        
        data = new java.util.ArrayList<com.alojamientosturisticos.domain.Estado>();
        for (int i = 0; i < 10; i++) {
            com.alojamientosturisticos.domain.Estado obj = getNewTransientEstado(i);
            obj.persist();
            data.add(obj);
        }
    }
    
}
