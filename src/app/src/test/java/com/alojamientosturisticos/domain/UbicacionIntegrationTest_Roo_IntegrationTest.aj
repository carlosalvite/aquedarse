package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.UbicacionDataOnDemand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect UbicacionIntegrationTest_Roo_IntegrationTest {
    
    declare @type: UbicacionIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: UbicacionIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    @Autowired
    private UbicacionDataOnDemand UbicacionIntegrationTest.dod;
    
    @Test
    public void UbicacionIntegrationTest.testCountUbicacions() {
        org.junit.Assert.assertNotNull("Data on demand for 'Ubicacion' failed to initialize correctly", dod.getRandomUbicacion());
        long count = com.alojamientosturisticos.domain.Ubicacion.countUbicacions();
        org.junit.Assert.assertTrue("Counter for 'Ubicacion' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void UbicacionIntegrationTest.testFindUbicacion() {
        org.junit.Assert.assertNotNull("Data on demand for 'Ubicacion' failed to initialize correctly", dod.getRandomUbicacion());
        java.lang.Long id = dod.getRandomUbicacion().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Ubicacion' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Ubicacion obj = com.alojamientosturisticos.domain.Ubicacion.findUbicacion(id);
        org.junit.Assert.assertNotNull("Find method for 'Ubicacion' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'Ubicacion' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void UbicacionIntegrationTest.testFindAllUbicacions() {
        org.junit.Assert.assertNotNull("Data on demand for 'Ubicacion' failed to initialize correctly", dod.getRandomUbicacion());
        long count = com.alojamientosturisticos.domain.Ubicacion.countUbicacions();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'Ubicacion', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.alojamientosturisticos.domain.Ubicacion> result = com.alojamientosturisticos.domain.Ubicacion.findAllUbicacions();
        org.junit.Assert.assertNotNull("Find all method for 'Ubicacion' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'Ubicacion' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void UbicacionIntegrationTest.testFindUbicacionEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'Ubicacion' failed to initialize correctly", dod.getRandomUbicacion());
        long count = com.alojamientosturisticos.domain.Ubicacion.countUbicacions();
        if (count > 20) count = 20;
        java.util.List<com.alojamientosturisticos.domain.Ubicacion> result = com.alojamientosturisticos.domain.Ubicacion.findUbicacionEntries(0, (int)count);
        org.junit.Assert.assertNotNull("Find entries method for 'Ubicacion' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'Ubicacion' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    @Transactional
    public void UbicacionIntegrationTest.testFlush() {
        org.junit.Assert.assertNotNull("Data on demand for 'Ubicacion' failed to initialize correctly", dod.getRandomUbicacion());
        java.lang.Long id = dod.getRandomUbicacion().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Ubicacion' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Ubicacion obj = com.alojamientosturisticos.domain.Ubicacion.findUbicacion(id);
        org.junit.Assert.assertNotNull("Find method for 'Ubicacion' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyUbicacion(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'Ubicacion' failed to increment on flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void UbicacionIntegrationTest.testMerge() {
        org.junit.Assert.assertNotNull("Data on demand for 'Ubicacion' failed to initialize correctly", dod.getRandomUbicacion());
        java.lang.Long id = dod.getRandomUbicacion().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Ubicacion' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Ubicacion obj = com.alojamientosturisticos.domain.Ubicacion.findUbicacion(id);
        org.junit.Assert.assertNotNull("Find method for 'Ubicacion' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyUbicacion(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.merge();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'Ubicacion' failed to increment on merge and flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void UbicacionIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'Ubicacion' failed to initialize correctly", dod.getRandomUbicacion());
        com.alojamientosturisticos.domain.Ubicacion obj = dod.getNewTransientUbicacion(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'Ubicacion' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'Ubicacion' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'Ubicacion' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional
    public void UbicacionIntegrationTest.testRemove() {
        org.junit.Assert.assertNotNull("Data on demand for 'Ubicacion' failed to initialize correctly", dod.getRandomUbicacion());
        java.lang.Long id = dod.getRandomUbicacion().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Ubicacion' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Ubicacion obj = com.alojamientosturisticos.domain.Ubicacion.findUbicacion(id);
        org.junit.Assert.assertNotNull("Find method for 'Ubicacion' illegally returned null for id '" + id + "'", obj);
        obj.remove();
        org.junit.Assert.assertNull("Failed to remove 'Ubicacion' with identifier '" + id + "'", com.alojamientosturisticos.domain.Ubicacion.findUbicacion(id));
    }
    
}
