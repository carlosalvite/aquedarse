package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.TipoHabitacion;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect TipoHabitacionDataOnDemand_Roo_DataOnDemand {
    
    declare @type: TipoHabitacionDataOnDemand: @Component;
    
    private Random TipoHabitacionDataOnDemand.rnd = new SecureRandom();
    
    private List<TipoHabitacion> TipoHabitacionDataOnDemand.data;
    
    public TipoHabitacion TipoHabitacionDataOnDemand.getNewTransientTipoHabitacion(int index) {
        com.alojamientosturisticos.domain.TipoHabitacion obj = new com.alojamientosturisticos.domain.TipoHabitacion();
        obj.setNombre("nombre_" + index);
        return obj;
    }
    
    public TipoHabitacion TipoHabitacionDataOnDemand.getSpecificTipoHabitacion(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size()-1)) index = data.size() - 1;
        TipoHabitacion obj = data.get(index);
        return TipoHabitacion.findTipoHabitacion(obj.getId());
    }
    
    public TipoHabitacion TipoHabitacionDataOnDemand.getRandomTipoHabitacion() {
        init();
        TipoHabitacion obj = data.get(rnd.nextInt(data.size()));
        return TipoHabitacion.findTipoHabitacion(obj.getId());
    }
    
    public boolean TipoHabitacionDataOnDemand.modifyTipoHabitacion(TipoHabitacion obj) {
        return false;
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void TipoHabitacionDataOnDemand.init() {
        if (data != null) {
            return;
        }
        
        data = com.alojamientosturisticos.domain.TipoHabitacion.findTipoHabitacionEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'TipoHabitacion' illegally returned null");
        if (data.size() > 0) {
            return;
        }
        
        data = new java.util.ArrayList<com.alojamientosturisticos.domain.TipoHabitacion>();
        for (int i = 0; i < 10; i++) {
            com.alojamientosturisticos.domain.TipoHabitacion obj = getNewTransientTipoHabitacion(i);
            obj.persist();
            data.add(obj);
        }
    }
    
}
