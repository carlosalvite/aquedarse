package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.TipoAlojamientoDataOnDemand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect TipoAlojamientoIntegrationTest_Roo_IntegrationTest {
    
    declare @type: TipoAlojamientoIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: TipoAlojamientoIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    @Autowired
    private TipoAlojamientoDataOnDemand TipoAlojamientoIntegrationTest.dod;
    
    @Test
    public void TipoAlojamientoIntegrationTest.testCountTipoAlojamientoes() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoAlojamiento' failed to initialize correctly", dod.getRandomTipoAlojamiento());
        long count = com.alojamientosturisticos.domain.TipoAlojamiento.countTipoAlojamientoes();
        org.junit.Assert.assertTrue("Counter for 'TipoAlojamiento' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void TipoAlojamientoIntegrationTest.testFindTipoAlojamiento() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoAlojamiento' failed to initialize correctly", dod.getRandomTipoAlojamiento());
        java.lang.Long id = dod.getRandomTipoAlojamiento().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'TipoAlojamiento' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.TipoAlojamiento obj = com.alojamientosturisticos.domain.TipoAlojamiento.findTipoAlojamiento(id);
        org.junit.Assert.assertNotNull("Find method for 'TipoAlojamiento' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'TipoAlojamiento' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void TipoAlojamientoIntegrationTest.testFindAllTipoAlojamientoes() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoAlojamiento' failed to initialize correctly", dod.getRandomTipoAlojamiento());
        long count = com.alojamientosturisticos.domain.TipoAlojamiento.countTipoAlojamientoes();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'TipoAlojamiento', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.alojamientosturisticos.domain.TipoAlojamiento> result = com.alojamientosturisticos.domain.TipoAlojamiento.findAllTipoAlojamientoes();
        org.junit.Assert.assertNotNull("Find all method for 'TipoAlojamiento' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'TipoAlojamiento' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void TipoAlojamientoIntegrationTest.testFindTipoAlojamientoEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoAlojamiento' failed to initialize correctly", dod.getRandomTipoAlojamiento());
        long count = com.alojamientosturisticos.domain.TipoAlojamiento.countTipoAlojamientoes();
        if (count > 20) count = 20;
        java.util.List<com.alojamientosturisticos.domain.TipoAlojamiento> result = com.alojamientosturisticos.domain.TipoAlojamiento.findTipoAlojamientoEntries(0, (int)count);
        org.junit.Assert.assertNotNull("Find entries method for 'TipoAlojamiento' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'TipoAlojamiento' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    @Transactional
    public void TipoAlojamientoIntegrationTest.testFlush() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoAlojamiento' failed to initialize correctly", dod.getRandomTipoAlojamiento());
        java.lang.Long id = dod.getRandomTipoAlojamiento().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'TipoAlojamiento' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.TipoAlojamiento obj = com.alojamientosturisticos.domain.TipoAlojamiento.findTipoAlojamiento(id);
        org.junit.Assert.assertNotNull("Find method for 'TipoAlojamiento' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyTipoAlojamiento(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'TipoAlojamiento' failed to increment on flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void TipoAlojamientoIntegrationTest.testMerge() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoAlojamiento' failed to initialize correctly", dod.getRandomTipoAlojamiento());
        java.lang.Long id = dod.getRandomTipoAlojamiento().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'TipoAlojamiento' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.TipoAlojamiento obj = com.alojamientosturisticos.domain.TipoAlojamiento.findTipoAlojamiento(id);
        org.junit.Assert.assertNotNull("Find method for 'TipoAlojamiento' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyTipoAlojamiento(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.merge();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'TipoAlojamiento' failed to increment on merge and flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void TipoAlojamientoIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoAlojamiento' failed to initialize correctly", dod.getRandomTipoAlojamiento());
        com.alojamientosturisticos.domain.TipoAlojamiento obj = dod.getNewTransientTipoAlojamiento(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'TipoAlojamiento' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'TipoAlojamiento' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'TipoAlojamiento' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional
    public void TipoAlojamientoIntegrationTest.testRemove() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoAlojamiento' failed to initialize correctly", dod.getRandomTipoAlojamiento());
        java.lang.Long id = dod.getRandomTipoAlojamiento().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'TipoAlojamiento' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.TipoAlojamiento obj = com.alojamientosturisticos.domain.TipoAlojamiento.findTipoAlojamiento(id);
        org.junit.Assert.assertNotNull("Find method for 'TipoAlojamiento' illegally returned null for id '" + id + "'", obj);
        obj.remove();
        org.junit.Assert.assertNull("Failed to remove 'TipoAlojamiento' with identifier '" + id + "'", com.alojamientosturisticos.domain.TipoAlojamiento.findTipoAlojamiento(id));
    }
    
}
