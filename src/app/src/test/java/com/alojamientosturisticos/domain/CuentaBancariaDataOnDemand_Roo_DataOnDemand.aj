package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.BancoDataOnDemand;
import com.alojamientosturisticos.domain.CuentaBancaria;
import com.alojamientosturisticos.domain.TipoCiRifDataOnDemand;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect CuentaBancariaDataOnDemand_Roo_DataOnDemand {
    
    declare @type: CuentaBancariaDataOnDemand: @Component;
    
    private Random CuentaBancariaDataOnDemand.rnd = new SecureRandom();
    
    private List<CuentaBancaria> CuentaBancariaDataOnDemand.data;
    
    @Autowired
    private BancoDataOnDemand CuentaBancariaDataOnDemand.bancoDataOnDemand;
    
    @Autowired
    private TipoCiRifDataOnDemand CuentaBancariaDataOnDemand.tipoCiRifDataOnDemand;
    
    public CuentaBancaria CuentaBancariaDataOnDemand.getNewTransientCuentaBancaria(int index) {
        com.alojamientosturisticos.domain.CuentaBancaria obj = new com.alojamientosturisticos.domain.CuentaBancaria();
        obj.setActiva(new Boolean(true));
        obj.setBanco(bancoDataOnDemand.getRandomBanco());
        obj.setCiRif("ciRif_" + index);
        obj.setCorreoElectronico("correoElectronico_" + index);
        obj.setNumeroCuenta("numeroCuenta_" + index);
        obj.setTipoCiRif(tipoCiRifDataOnDemand.getRandomTipoCiRif());
        obj.setTitularCuenta("titularCuenta_" + index);
        return obj;
    }
    
    public CuentaBancaria CuentaBancariaDataOnDemand.getSpecificCuentaBancaria(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size()-1)) index = data.size() - 1;
        CuentaBancaria obj = data.get(index);
        return CuentaBancaria.findCuentaBancaria(obj.getId());
    }
    
    public CuentaBancaria CuentaBancariaDataOnDemand.getRandomCuentaBancaria() {
        init();
        CuentaBancaria obj = data.get(rnd.nextInt(data.size()));
        return CuentaBancaria.findCuentaBancaria(obj.getId());
    }
    
    public boolean CuentaBancariaDataOnDemand.modifyCuentaBancaria(CuentaBancaria obj) {
        return false;
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void CuentaBancariaDataOnDemand.init() {
        if (data != null) {
            return;
        }
        
        data = com.alojamientosturisticos.domain.CuentaBancaria.findCuentaBancariaEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'CuentaBancaria' illegally returned null");
        if (data.size() > 0) {
            return;
        }
        
        data = new java.util.ArrayList<com.alojamientosturisticos.domain.CuentaBancaria>();
        for (int i = 0; i < 10; i++) {
            com.alojamientosturisticos.domain.CuentaBancaria obj = getNewTransientCuentaBancaria(i);
            obj.persist();
            data.add(obj);
        }
    }
    
}
