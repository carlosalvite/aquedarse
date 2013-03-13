package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.ComodidadGeneralDataOnDemand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ComodidadGeneralIntegrationTest_Roo_IntegrationTest {
    
    declare @type: ComodidadGeneralIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: ComodidadGeneralIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    @Autowired
    private ComodidadGeneralDataOnDemand ComodidadGeneralIntegrationTest.dod;
    
    @Test
    public void ComodidadGeneralIntegrationTest.testCountComodidadGenerals() {
        org.junit.Assert.assertNotNull("Data on demand for 'ComodidadGeneral' failed to initialize correctly", dod.getRandomComodidadGeneral());
        long count = com.alojamientosturisticos.domain.ComodidadGeneral.countComodidadGenerals();
        org.junit.Assert.assertTrue("Counter for 'ComodidadGeneral' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void ComodidadGeneralIntegrationTest.testFindComodidadGeneral() {
        org.junit.Assert.assertNotNull("Data on demand for 'ComodidadGeneral' failed to initialize correctly", dod.getRandomComodidadGeneral());
        java.lang.Long id = dod.getRandomComodidadGeneral().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'ComodidadGeneral' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.ComodidadGeneral obj = com.alojamientosturisticos.domain.ComodidadGeneral.findComodidadGeneral(id);
        org.junit.Assert.assertNotNull("Find method for 'ComodidadGeneral' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'ComodidadGeneral' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void ComodidadGeneralIntegrationTest.testFindAllComodidadGenerals() {
        org.junit.Assert.assertNotNull("Data on demand for 'ComodidadGeneral' failed to initialize correctly", dod.getRandomComodidadGeneral());
        long count = com.alojamientosturisticos.domain.ComodidadGeneral.countComodidadGenerals();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'ComodidadGeneral', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.alojamientosturisticos.domain.ComodidadGeneral> result = com.alojamientosturisticos.domain.ComodidadGeneral.findAllComodidadGenerals();
        org.junit.Assert.assertNotNull("Find all method for 'ComodidadGeneral' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'ComodidadGeneral' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void ComodidadGeneralIntegrationTest.testFindComodidadGeneralEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'ComodidadGeneral' failed to initialize correctly", dod.getRandomComodidadGeneral());
        long count = com.alojamientosturisticos.domain.ComodidadGeneral.countComodidadGenerals();
        if (count > 20) count = 20;
        java.util.List<com.alojamientosturisticos.domain.ComodidadGeneral> result = com.alojamientosturisticos.domain.ComodidadGeneral.findComodidadGeneralEntries(0, (int)count);
        org.junit.Assert.assertNotNull("Find entries method for 'ComodidadGeneral' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'ComodidadGeneral' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    @Transactional
    public void ComodidadGeneralIntegrationTest.testFlush() {
        org.junit.Assert.assertNotNull("Data on demand for 'ComodidadGeneral' failed to initialize correctly", dod.getRandomComodidadGeneral());
        java.lang.Long id = dod.getRandomComodidadGeneral().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'ComodidadGeneral' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.ComodidadGeneral obj = com.alojamientosturisticos.domain.ComodidadGeneral.findComodidadGeneral(id);
        org.junit.Assert.assertNotNull("Find method for 'ComodidadGeneral' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyComodidadGeneral(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'ComodidadGeneral' failed to increment on flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void ComodidadGeneralIntegrationTest.testMerge() {
        org.junit.Assert.assertNotNull("Data on demand for 'ComodidadGeneral' failed to initialize correctly", dod.getRandomComodidadGeneral());
        java.lang.Long id = dod.getRandomComodidadGeneral().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'ComodidadGeneral' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.ComodidadGeneral obj = com.alojamientosturisticos.domain.ComodidadGeneral.findComodidadGeneral(id);
        org.junit.Assert.assertNotNull("Find method for 'ComodidadGeneral' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyComodidadGeneral(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.merge();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'ComodidadGeneral' failed to increment on merge and flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void ComodidadGeneralIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'ComodidadGeneral' failed to initialize correctly", dod.getRandomComodidadGeneral());
        com.alojamientosturisticos.domain.ComodidadGeneral obj = dod.getNewTransientComodidadGeneral(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'ComodidadGeneral' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'ComodidadGeneral' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'ComodidadGeneral' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional
    public void ComodidadGeneralIntegrationTest.testRemove() {
        org.junit.Assert.assertNotNull("Data on demand for 'ComodidadGeneral' failed to initialize correctly", dod.getRandomComodidadGeneral());
        java.lang.Long id = dod.getRandomComodidadGeneral().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'ComodidadGeneral' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.ComodidadGeneral obj = com.alojamientosturisticos.domain.ComodidadGeneral.findComodidadGeneral(id);
        org.junit.Assert.assertNotNull("Find method for 'ComodidadGeneral' illegally returned null for id '" + id + "'", obj);
        obj.remove();
        org.junit.Assert.assertNull("Failed to remove 'ComodidadGeneral' with identifier '" + id + "'", com.alojamientosturisticos.domain.ComodidadGeneral.findComodidadGeneral(id));
    }
    
}
