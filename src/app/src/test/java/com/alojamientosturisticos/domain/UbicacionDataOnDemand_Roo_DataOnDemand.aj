package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Ubicacion;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect UbicacionDataOnDemand_Roo_DataOnDemand {
    
    declare @type: UbicacionDataOnDemand: @Component;
    
    private Random UbicacionDataOnDemand.rnd = new SecureRandom();
    
    private List<Ubicacion> UbicacionDataOnDemand.data;
    
    public Ubicacion UbicacionDataOnDemand.getNewTransientUbicacion(int index) {
        com.alojamientosturisticos.domain.Ubicacion obj = new com.alojamientosturisticos.domain.Ubicacion();
        obj.setNombre("nombre_" + index);
        return obj;
    }
    
    public Ubicacion UbicacionDataOnDemand.getSpecificUbicacion(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size()-1)) index = data.size() - 1;
        Ubicacion obj = data.get(index);
        return Ubicacion.findUbicacion(obj.getId());
    }
    
    public Ubicacion UbicacionDataOnDemand.getRandomUbicacion() {
        init();
        Ubicacion obj = data.get(rnd.nextInt(data.size()));
        return Ubicacion.findUbicacion(obj.getId());
    }
    
    public boolean UbicacionDataOnDemand.modifyUbicacion(Ubicacion obj) {
        return false;
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void UbicacionDataOnDemand.init() {
        if (data != null) {
            return;
        }
        
        data = com.alojamientosturisticos.domain.Ubicacion.findUbicacionEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'Ubicacion' illegally returned null");
        if (data.size() > 0) {
            return;
        }
        
        data = new java.util.ArrayList<com.alojamientosturisticos.domain.Ubicacion>();
        for (int i = 0; i < 10; i++) {
            com.alojamientosturisticos.domain.Ubicacion obj = getNewTransientUbicacion(i);
            obj.persist();
            data.add(obj);
        }
    }
    
}
