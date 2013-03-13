package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Municipio;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect MunicipioDataOnDemand_Roo_DataOnDemand {
    
    declare @type: MunicipioDataOnDemand: @Component;
    
    private Random MunicipioDataOnDemand.rnd = new SecureRandom();
    
    private List<Municipio> MunicipioDataOnDemand.data;
    
    public Municipio MunicipioDataOnDemand.getNewTransientMunicipio(int index) {
        com.alojamientosturisticos.domain.Municipio obj = new com.alojamientosturisticos.domain.Municipio();
        return obj;
    }
    
    public Municipio MunicipioDataOnDemand.getSpecificMunicipio(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size()-1)) index = data.size() - 1;
        Municipio obj = data.get(index);
        return Municipio.findMunicipio(obj.getId());
    }
    
    public Municipio MunicipioDataOnDemand.getRandomMunicipio() {
        init();
        Municipio obj = data.get(rnd.nextInt(data.size()));
        return Municipio.findMunicipio(obj.getId());
    }
    
    public boolean MunicipioDataOnDemand.modifyMunicipio(Municipio obj) {
        return false;
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void MunicipioDataOnDemand.init() {
        if (data != null) {
            return;
        }
        
        data = com.alojamientosturisticos.domain.Municipio.findMunicipioEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'Municipio' illegally returned null");
        if (data.size() > 0) {
            return;
        }
        
        data = new java.util.ArrayList<com.alojamientosturisticos.domain.Municipio>();
        for (int i = 0; i < 10; i++) {
            com.alojamientosturisticos.domain.Municipio obj = getNewTransientMunicipio(i);
            obj.persist();
            data.add(obj);
        }
    }
    
}
