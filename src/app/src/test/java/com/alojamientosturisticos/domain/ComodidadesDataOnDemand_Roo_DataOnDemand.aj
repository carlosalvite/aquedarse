package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Comodidades;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ComodidadesDataOnDemand_Roo_DataOnDemand {
    
    declare @type: ComodidadesDataOnDemand: @Component;
    
    private Random ComodidadesDataOnDemand.rnd = new SecureRandom();
    
    private List<Comodidades> ComodidadesDataOnDemand.data;
    
    public Comodidades ComodidadesDataOnDemand.getNewTransientComodidades(int index) {
        com.alojamientosturisticos.domain.Comodidades obj = new com.alojamientosturisticos.domain.Comodidades();
        obj.setNombre("nombre_" + index);
        return obj;
    }
    
    public Comodidades ComodidadesDataOnDemand.getSpecificComodidades(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size()-1)) index = data.size() - 1;
        Comodidades obj = data.get(index);
        return Comodidades.findComodidades(obj.getId());
    }
    
    public Comodidades ComodidadesDataOnDemand.getRandomComodidades() {
        init();
        Comodidades obj = data.get(rnd.nextInt(data.size()));
        return Comodidades.findComodidades(obj.getId());
    }
    
    public boolean ComodidadesDataOnDemand.modifyComodidades(Comodidades obj) {
        return false;
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void ComodidadesDataOnDemand.init() {
        if (data != null) {
            return;
        }
        
        data = com.alojamientosturisticos.domain.Comodidades.findComodidadesEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'Comodidades' illegally returned null");
        if (data.size() > 0) {
            return;
        }
        
        data = new java.util.ArrayList<com.alojamientosturisticos.domain.Comodidades>();
        for (int i = 0; i < 10; i++) {
            com.alojamientosturisticos.domain.Comodidades obj = getNewTransientComodidades(i);
            obj.persist();
            data.add(obj);
        }
    }
    
}
