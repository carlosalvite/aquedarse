package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Alojamiento;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect AlojamientoDataOnDemand_Roo_DataOnDemand {
    
    declare @type: AlojamientoDataOnDemand: @Component;
    
    private Random AlojamientoDataOnDemand.rnd = new SecureRandom();
    
    private List<Alojamiento> AlojamientoDataOnDemand.data;
    
    public Alojamiento AlojamientoDataOnDemand.getNewTransientAlojamiento(int index) {
        com.alojamientosturisticos.domain.Alojamiento obj = new com.alojamientosturisticos.domain.Alojamiento();
        obj.setDireccion("direccion_" + index);
        obj.setNombre("nombre_" + index);
        return obj;
    }
    
    public Alojamiento AlojamientoDataOnDemand.getSpecificAlojamiento(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size()-1)) index = data.size() - 1;
        Alojamiento obj = data.get(index);
        return Alojamiento.findAlojamiento(obj.getId());
    }
    
    public Alojamiento AlojamientoDataOnDemand.getRandomAlojamiento() {
        init();
        Alojamiento obj = data.get(rnd.nextInt(data.size()));
        return Alojamiento.findAlojamiento(obj.getId());
    }
    
    public boolean AlojamientoDataOnDemand.modifyAlojamiento(Alojamiento obj) {
        return false;
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void AlojamientoDataOnDemand.init() {
        if (data != null) {
            return;
        }
        
        data = com.alojamientosturisticos.domain.Alojamiento.findAlojamientoEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'Alojamiento' illegally returned null");
        if (data.size() > 0) {
            return;
        }
        
        data = new java.util.ArrayList<com.alojamientosturisticos.domain.Alojamiento>();
        for (int i = 0; i < 10; i++) {
            com.alojamientosturisticos.domain.Alojamiento obj = getNewTransientAlojamiento(i);
            obj.persist();
            data.add(obj);
        }
    }
    
}
