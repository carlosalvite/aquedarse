package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.FechaTemporadaAltaDataOnDemand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect FechaTemporadaAltaIntegrationTest_Roo_IntegrationTest {
    
    declare @type: FechaTemporadaAltaIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: FechaTemporadaAltaIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    @Autowired
    private FechaTemporadaAltaDataOnDemand FechaTemporadaAltaIntegrationTest.dod;
    
    @Test
    public void FechaTemporadaAltaIntegrationTest.testCountFechaTemporadaAltas() {
        org.junit.Assert.assertNotNull("Data on demand for 'FechaTemporadaAlta' failed to initialize correctly", dod.getRandomFechaTemporadaAlta());
        long count = com.alojamientosturisticos.domain.FechaTemporadaAlta.countFechaTemporadaAltas();
        org.junit.Assert.assertTrue("Counter for 'FechaTemporadaAlta' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void FechaTemporadaAltaIntegrationTest.testFindFechaTemporadaAlta() {
        org.junit.Assert.assertNotNull("Data on demand for 'FechaTemporadaAlta' failed to initialize correctly", dod.getRandomFechaTemporadaAlta());
        java.lang.Long id = dod.getRandomFechaTemporadaAlta().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'FechaTemporadaAlta' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.FechaTemporadaAlta obj = com.alojamientosturisticos.domain.FechaTemporadaAlta.findFechaTemporadaAlta(id);
        org.junit.Assert.assertNotNull("Find method for 'FechaTemporadaAlta' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'FechaTemporadaAlta' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void FechaTemporadaAltaIntegrationTest.testFindAllFechaTemporadaAltas() {
        org.junit.Assert.assertNotNull("Data on demand for 'FechaTemporadaAlta' failed to initialize correctly", dod.getRandomFechaTemporadaAlta());
        long count = com.alojamientosturisticos.domain.FechaTemporadaAlta.countFechaTemporadaAltas();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'FechaTemporadaAlta', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.alojamientosturisticos.domain.FechaTemporadaAlta> result = com.alojamientosturisticos.domain.FechaTemporadaAlta.findAllFechaTemporadaAltas();
        org.junit.Assert.assertNotNull("Find all method for 'FechaTemporadaAlta' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'FechaTemporadaAlta' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void FechaTemporadaAltaIntegrationTest.testFindFechaTemporadaAltaEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'FechaTemporadaAlta' failed to initialize correctly", dod.getRandomFechaTemporadaAlta());
        long count = com.alojamientosturisticos.domain.FechaTemporadaAlta.countFechaTemporadaAltas();
        if (count > 20) count = 20;
        java.util.List<com.alojamientosturisticos.domain.FechaTemporadaAlta> result = com.alojamientosturisticos.domain.FechaTemporadaAlta.findFechaTemporadaAltaEntries(0, (int)count);
        org.junit.Assert.assertNotNull("Find entries method for 'FechaTemporadaAlta' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'FechaTemporadaAlta' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    @Transactional
    public void FechaTemporadaAltaIntegrationTest.testFlush() {
        org.junit.Assert.assertNotNull("Data on demand for 'FechaTemporadaAlta' failed to initialize correctly", dod.getRandomFechaTemporadaAlta());
        java.lang.Long id = dod.getRandomFechaTemporadaAlta().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'FechaTemporadaAlta' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.FechaTemporadaAlta obj = com.alojamientosturisticos.domain.FechaTemporadaAlta.findFechaTemporadaAlta(id);
        org.junit.Assert.assertNotNull("Find method for 'FechaTemporadaAlta' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyFechaTemporadaAlta(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'FechaTemporadaAlta' failed to increment on flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void FechaTemporadaAltaIntegrationTest.testMerge() {
        org.junit.Assert.assertNotNull("Data on demand for 'FechaTemporadaAlta' failed to initialize correctly", dod.getRandomFechaTemporadaAlta());
        java.lang.Long id = dod.getRandomFechaTemporadaAlta().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'FechaTemporadaAlta' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.FechaTemporadaAlta obj = com.alojamientosturisticos.domain.FechaTemporadaAlta.findFechaTemporadaAlta(id);
        org.junit.Assert.assertNotNull("Find method for 'FechaTemporadaAlta' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyFechaTemporadaAlta(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.merge();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'FechaTemporadaAlta' failed to increment on merge and flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void FechaTemporadaAltaIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'FechaTemporadaAlta' failed to initialize correctly", dod.getRandomFechaTemporadaAlta());
        com.alojamientosturisticos.domain.FechaTemporadaAlta obj = dod.getNewTransientFechaTemporadaAlta(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'FechaTemporadaAlta' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'FechaTemporadaAlta' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'FechaTemporadaAlta' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional
    public void FechaTemporadaAltaIntegrationTest.testRemove() {
        org.junit.Assert.assertNotNull("Data on demand for 'FechaTemporadaAlta' failed to initialize correctly", dod.getRandomFechaTemporadaAlta());
        java.lang.Long id = dod.getRandomFechaTemporadaAlta().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'FechaTemporadaAlta' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.FechaTemporadaAlta obj = com.alojamientosturisticos.domain.FechaTemporadaAlta.findFechaTemporadaAlta(id);
        org.junit.Assert.assertNotNull("Find method for 'FechaTemporadaAlta' illegally returned null for id '" + id + "'", obj);
        obj.remove();
        org.junit.Assert.assertNull("Failed to remove 'FechaTemporadaAlta' with identifier '" + id + "'", com.alojamientosturisticos.domain.FechaTemporadaAlta.findFechaTemporadaAlta(id));
    }
    
}
