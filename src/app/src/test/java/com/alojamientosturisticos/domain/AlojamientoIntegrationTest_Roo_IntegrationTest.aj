package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.AlojamientoDataOnDemand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect AlojamientoIntegrationTest_Roo_IntegrationTest {
    
    declare @type: AlojamientoIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: AlojamientoIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    @Autowired
    private AlojamientoDataOnDemand AlojamientoIntegrationTest.dod;
    
    @Test
    public void AlojamientoIntegrationTest.testCountAlojamientoes() {
        org.junit.Assert.assertNotNull("Data on demand for 'Alojamiento' failed to initialize correctly", dod.getRandomAlojamiento());
        long count = com.alojamientosturisticos.domain.Alojamiento.countAlojamientoes();
        org.junit.Assert.assertTrue("Counter for 'Alojamiento' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void AlojamientoIntegrationTest.testFindAlojamiento() {
        org.junit.Assert.assertNotNull("Data on demand for 'Alojamiento' failed to initialize correctly", dod.getRandomAlojamiento());
        java.lang.Long id = dod.getRandomAlojamiento().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Alojamiento' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Alojamiento obj = com.alojamientosturisticos.domain.Alojamiento.findAlojamiento(id);
        org.junit.Assert.assertNotNull("Find method for 'Alojamiento' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'Alojamiento' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void AlojamientoIntegrationTest.testFindAllAlojamientoes() {
        org.junit.Assert.assertNotNull("Data on demand for 'Alojamiento' failed to initialize correctly", dod.getRandomAlojamiento());
        long count = com.alojamientosturisticos.domain.Alojamiento.countAlojamientoes();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'Alojamiento', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.alojamientosturisticos.domain.Alojamiento> result = com.alojamientosturisticos.domain.Alojamiento.findAllAlojamientoes();
        org.junit.Assert.assertNotNull("Find all method for 'Alojamiento' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'Alojamiento' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void AlojamientoIntegrationTest.testFindAlojamientoEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'Alojamiento' failed to initialize correctly", dod.getRandomAlojamiento());
        long count = com.alojamientosturisticos.domain.Alojamiento.countAlojamientoes();
        if (count > 20) count = 20;
        java.util.List<com.alojamientosturisticos.domain.Alojamiento> result = com.alojamientosturisticos.domain.Alojamiento.findAlojamientoEntries(0, (int)count);
        org.junit.Assert.assertNotNull("Find entries method for 'Alojamiento' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'Alojamiento' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    @Transactional
    public void AlojamientoIntegrationTest.testFlush() {
        org.junit.Assert.assertNotNull("Data on demand for 'Alojamiento' failed to initialize correctly", dod.getRandomAlojamiento());
        java.lang.Long id = dod.getRandomAlojamiento().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Alojamiento' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Alojamiento obj = com.alojamientosturisticos.domain.Alojamiento.findAlojamiento(id);
        org.junit.Assert.assertNotNull("Find method for 'Alojamiento' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyAlojamiento(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'Alojamiento' failed to increment on flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void AlojamientoIntegrationTest.testMerge() {
        org.junit.Assert.assertNotNull("Data on demand for 'Alojamiento' failed to initialize correctly", dod.getRandomAlojamiento());
        java.lang.Long id = dod.getRandomAlojamiento().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Alojamiento' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Alojamiento obj = com.alojamientosturisticos.domain.Alojamiento.findAlojamiento(id);
        org.junit.Assert.assertNotNull("Find method for 'Alojamiento' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyAlojamiento(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.merge();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'Alojamiento' failed to increment on merge and flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void AlojamientoIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'Alojamiento' failed to initialize correctly", dod.getRandomAlojamiento());
        com.alojamientosturisticos.domain.Alojamiento obj = dod.getNewTransientAlojamiento(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'Alojamiento' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'Alojamiento' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'Alojamiento' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional
    public void AlojamientoIntegrationTest.testRemove() {
        org.junit.Assert.assertNotNull("Data on demand for 'Alojamiento' failed to initialize correctly", dod.getRandomAlojamiento());
        java.lang.Long id = dod.getRandomAlojamiento().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Alojamiento' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Alojamiento obj = com.alojamientosturisticos.domain.Alojamiento.findAlojamiento(id);
        org.junit.Assert.assertNotNull("Find method for 'Alojamiento' illegally returned null for id '" + id + "'", obj);
        obj.remove();
        org.junit.Assert.assertNull("Failed to remove 'Alojamiento' with identifier '" + id + "'", com.alojamientosturisticos.domain.Alojamiento.findAlojamiento(id));
    }
    
}
