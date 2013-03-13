package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.CuentaBancariaDataOnDemand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect CuentaBancariaIntegrationTest_Roo_IntegrationTest {
    
    declare @type: CuentaBancariaIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: CuentaBancariaIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    @Autowired
    private CuentaBancariaDataOnDemand CuentaBancariaIntegrationTest.dod;
    
    @Test
    public void CuentaBancariaIntegrationTest.testCountCuentaBancarias() {
        org.junit.Assert.assertNotNull("Data on demand for 'CuentaBancaria' failed to initialize correctly", dod.getRandomCuentaBancaria());
        long count = com.alojamientosturisticos.domain.CuentaBancaria.countCuentaBancarias();
        org.junit.Assert.assertTrue("Counter for 'CuentaBancaria' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void CuentaBancariaIntegrationTest.testFindCuentaBancaria() {
        org.junit.Assert.assertNotNull("Data on demand for 'CuentaBancaria' failed to initialize correctly", dod.getRandomCuentaBancaria());
        java.lang.Long id = dod.getRandomCuentaBancaria().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'CuentaBancaria' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.CuentaBancaria obj = com.alojamientosturisticos.domain.CuentaBancaria.findCuentaBancaria(id);
        org.junit.Assert.assertNotNull("Find method for 'CuentaBancaria' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'CuentaBancaria' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void CuentaBancariaIntegrationTest.testFindAllCuentaBancarias() {
        org.junit.Assert.assertNotNull("Data on demand for 'CuentaBancaria' failed to initialize correctly", dod.getRandomCuentaBancaria());
        long count = com.alojamientosturisticos.domain.CuentaBancaria.countCuentaBancarias();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'CuentaBancaria', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.alojamientosturisticos.domain.CuentaBancaria> result = com.alojamientosturisticos.domain.CuentaBancaria.findAllCuentaBancarias();
        org.junit.Assert.assertNotNull("Find all method for 'CuentaBancaria' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'CuentaBancaria' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void CuentaBancariaIntegrationTest.testFindCuentaBancariaEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'CuentaBancaria' failed to initialize correctly", dod.getRandomCuentaBancaria());
        long count = com.alojamientosturisticos.domain.CuentaBancaria.countCuentaBancarias();
        if (count > 20) count = 20;
        java.util.List<com.alojamientosturisticos.domain.CuentaBancaria> result = com.alojamientosturisticos.domain.CuentaBancaria.findCuentaBancariaEntries(0, (int)count);
        org.junit.Assert.assertNotNull("Find entries method for 'CuentaBancaria' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'CuentaBancaria' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    @Transactional
    public void CuentaBancariaIntegrationTest.testFlush() {
        org.junit.Assert.assertNotNull("Data on demand for 'CuentaBancaria' failed to initialize correctly", dod.getRandomCuentaBancaria());
        java.lang.Long id = dod.getRandomCuentaBancaria().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'CuentaBancaria' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.CuentaBancaria obj = com.alojamientosturisticos.domain.CuentaBancaria.findCuentaBancaria(id);
        org.junit.Assert.assertNotNull("Find method for 'CuentaBancaria' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyCuentaBancaria(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'CuentaBancaria' failed to increment on flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void CuentaBancariaIntegrationTest.testMerge() {
        org.junit.Assert.assertNotNull("Data on demand for 'CuentaBancaria' failed to initialize correctly", dod.getRandomCuentaBancaria());
        java.lang.Long id = dod.getRandomCuentaBancaria().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'CuentaBancaria' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.CuentaBancaria obj = com.alojamientosturisticos.domain.CuentaBancaria.findCuentaBancaria(id);
        org.junit.Assert.assertNotNull("Find method for 'CuentaBancaria' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyCuentaBancaria(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.merge();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'CuentaBancaria' failed to increment on merge and flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void CuentaBancariaIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'CuentaBancaria' failed to initialize correctly", dod.getRandomCuentaBancaria());
        com.alojamientosturisticos.domain.CuentaBancaria obj = dod.getNewTransientCuentaBancaria(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'CuentaBancaria' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'CuentaBancaria' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'CuentaBancaria' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional
    public void CuentaBancariaIntegrationTest.testRemove() {
        org.junit.Assert.assertNotNull("Data on demand for 'CuentaBancaria' failed to initialize correctly", dod.getRandomCuentaBancaria());
        java.lang.Long id = dod.getRandomCuentaBancaria().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'CuentaBancaria' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.CuentaBancaria obj = com.alojamientosturisticos.domain.CuentaBancaria.findCuentaBancaria(id);
        org.junit.Assert.assertNotNull("Find method for 'CuentaBancaria' illegally returned null for id '" + id + "'", obj);
        obj.remove();
        org.junit.Assert.assertNull("Failed to remove 'CuentaBancaria' with identifier '" + id + "'", com.alojamientosturisticos.domain.CuentaBancaria.findCuentaBancaria(id));
    }
    
}
