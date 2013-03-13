package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Parroquia;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ParroquiaDataOnDemand_Roo_DataOnDemand {
    
    declare @type: ParroquiaDataOnDemand: @Component;
    
    private Random ParroquiaDataOnDemand.rnd = new SecureRandom();
    
    private List<Parroquia> ParroquiaDataOnDemand.data;
    
    public Parroquia ParroquiaDataOnDemand.getNewTransientParroquia(int index) {
        com.alojamientosturisticos.domain.Parroquia obj = new com.alojamientosturisticos.domain.Parroquia();
        return obj;
    }
    
    public Parroquia ParroquiaDataOnDemand.getSpecificParroquia(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size()-1)) index = data.size() - 1;
        Parroquia obj = data.get(index);
        return Parroquia.findParroquia(obj.getId());
    }
    
    public Parroquia ParroquiaDataOnDemand.getRandomParroquia() {
        init();
        Parroquia obj = data.get(rnd.nextInt(data.size()));
        return Parroquia.findParroquia(obj.getId());
    }
    
    public boolean ParroquiaDataOnDemand.modifyParroquia(Parroquia obj) {
        return false;
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void ParroquiaDataOnDemand.init() {
        if (data != null) {
            return;
        }
        
        data = com.alojamientosturisticos.domain.Parroquia.findParroquiaEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'Parroquia' illegally returned null");
        if (data.size() > 0) {
            return;
        }
        
        data = new java.util.ArrayList<com.alojamientosturisticos.domain.Parroquia>();
        for (int i = 0; i < 10; i++) {
            com.alojamientosturisticos.domain.Parroquia obj = getNewTransientParroquia(i);
            obj.persist();
            data.add(obj);
        }
    }
    
}
