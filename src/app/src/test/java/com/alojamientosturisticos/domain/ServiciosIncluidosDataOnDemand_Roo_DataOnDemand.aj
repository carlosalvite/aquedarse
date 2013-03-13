package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.ServiciosIncluidos;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ServiciosIncluidosDataOnDemand_Roo_DataOnDemand {
    
    declare @type: ServiciosIncluidosDataOnDemand: @Component;
    
    private Random ServiciosIncluidosDataOnDemand.rnd = new SecureRandom();
    
    private List<ServiciosIncluidos> ServiciosIncluidosDataOnDemand.data;
    
    public ServiciosIncluidos ServiciosIncluidosDataOnDemand.getNewTransientServiciosIncluidos(int index) {
        com.alojamientosturisticos.domain.ServiciosIncluidos obj = new com.alojamientosturisticos.domain.ServiciosIncluidos();
        obj.setNombre("nombre_" + index);
        return obj;
    }
    
    public ServiciosIncluidos ServiciosIncluidosDataOnDemand.getSpecificServiciosIncluidos(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size()-1)) index = data.size() - 1;
        ServiciosIncluidos obj = data.get(index);
        return ServiciosIncluidos.findServiciosIncluidos(obj.getId());
    }
    
    public ServiciosIncluidos ServiciosIncluidosDataOnDemand.getRandomServiciosIncluidos() {
        init();
        ServiciosIncluidos obj = data.get(rnd.nextInt(data.size()));
        return ServiciosIncluidos.findServiciosIncluidos(obj.getId());
    }
    
    public boolean ServiciosIncluidosDataOnDemand.modifyServiciosIncluidos(ServiciosIncluidos obj) {
        return false;
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void ServiciosIncluidosDataOnDemand.init() {
        if (data != null) {
            return;
        }
        
        data = com.alojamientosturisticos.domain.ServiciosIncluidos.findServiciosIncluidosEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'ServiciosIncluidos' illegally returned null");
        if (data.size() > 0) {
            return;
        }
        
        data = new java.util.ArrayList<com.alojamientosturisticos.domain.ServiciosIncluidos>();
        for (int i = 0; i < 10; i++) {
            com.alojamientosturisticos.domain.ServiciosIncluidos obj = getNewTransientServiciosIncluidos(i);
            obj.persist();
            data.add(obj);
        }
    }
    
}
