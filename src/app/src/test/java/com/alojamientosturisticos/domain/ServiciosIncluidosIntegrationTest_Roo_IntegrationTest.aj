package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.ServiciosIncluidosDataOnDemand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ServiciosIncluidosIntegrationTest_Roo_IntegrationTest {
    
    declare @type: ServiciosIncluidosIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: ServiciosIncluidosIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    @Autowired
    private ServiciosIncluidosDataOnDemand ServiciosIncluidosIntegrationTest.dod;
    
    @Test
    public void ServiciosIncluidosIntegrationTest.testCountServiciosIncluidoses() {
        org.junit.Assert.assertNotNull("Data on demand for 'ServiciosIncluidos' failed to initialize correctly", dod.getRandomServiciosIncluidos());
        long count = com.alojamientosturisticos.domain.ServiciosIncluidos.countServiciosIncluidoses();
        org.junit.Assert.assertTrue("Counter for 'ServiciosIncluidos' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void ServiciosIncluidosIntegrationTest.testFindServiciosIncluidos() {
        org.junit.Assert.assertNotNull("Data on demand for 'ServiciosIncluidos' failed to initialize correctly", dod.getRandomServiciosIncluidos());
        java.lang.Long id = dod.getRandomServiciosIncluidos().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'ServiciosIncluidos' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.ServiciosIncluidos obj = com.alojamientosturisticos.domain.ServiciosIncluidos.findServiciosIncluidos(id);
        org.junit.Assert.assertNotNull("Find method for 'ServiciosIncluidos' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'ServiciosIncluidos' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void ServiciosIncluidosIntegrationTest.testFindAllServiciosIncluidoses() {
        org.junit.Assert.assertNotNull("Data on demand for 'ServiciosIncluidos' failed to initialize correctly", dod.getRandomServiciosIncluidos());
        long count = com.alojamientosturisticos.domain.ServiciosIncluidos.countServiciosIncluidoses();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'ServiciosIncluidos', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.alojamientosturisticos.domain.ServiciosIncluidos> result = com.alojamientosturisticos.domain.ServiciosIncluidos.findAllServiciosIncluidoses();
        org.junit.Assert.assertNotNull("Find all method for 'ServiciosIncluidos' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'ServiciosIncluidos' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void ServiciosIncluidosIntegrationTest.testFindServiciosIncluidosEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'ServiciosIncluidos' failed to initialize correctly", dod.getRandomServiciosIncluidos());
        long count = com.alojamientosturisticos.domain.ServiciosIncluidos.countServiciosIncluidoses();
        if (count > 20) count = 20;
        java.util.List<com.alojamientosturisticos.domain.ServiciosIncluidos> result = com.alojamientosturisticos.domain.ServiciosIncluidos.findServiciosIncluidosEntries(0, (int)count);
        org.junit.Assert.assertNotNull("Find entries method for 'ServiciosIncluidos' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'ServiciosIncluidos' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    @Transactional
    public void ServiciosIncluidosIntegrationTest.testFlush() {
        org.junit.Assert.assertNotNull("Data on demand for 'ServiciosIncluidos' failed to initialize correctly", dod.getRandomServiciosIncluidos());
        java.lang.Long id = dod.getRandomServiciosIncluidos().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'ServiciosIncluidos' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.ServiciosIncluidos obj = com.alojamientosturisticos.domain.ServiciosIncluidos.findServiciosIncluidos(id);
        org.junit.Assert.assertNotNull("Find method for 'ServiciosIncluidos' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyServiciosIncluidos(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'ServiciosIncluidos' failed to increment on flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void ServiciosIncluidosIntegrationTest.testMerge() {
        org.junit.Assert.assertNotNull("Data on demand for 'ServiciosIncluidos' failed to initialize correctly", dod.getRandomServiciosIncluidos());
        java.lang.Long id = dod.getRandomServiciosIncluidos().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'ServiciosIncluidos' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.ServiciosIncluidos obj = com.alojamientosturisticos.domain.ServiciosIncluidos.findServiciosIncluidos(id);
        org.junit.Assert.assertNotNull("Find method for 'ServiciosIncluidos' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyServiciosIncluidos(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.merge();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'ServiciosIncluidos' failed to increment on merge and flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void ServiciosIncluidosIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'ServiciosIncluidos' failed to initialize correctly", dod.getRandomServiciosIncluidos());
        com.alojamientosturisticos.domain.ServiciosIncluidos obj = dod.getNewTransientServiciosIncluidos(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'ServiciosIncluidos' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'ServiciosIncluidos' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'ServiciosIncluidos' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional
    public void ServiciosIncluidosIntegrationTest.testRemove() {
        org.junit.Assert.assertNotNull("Data on demand for 'ServiciosIncluidos' failed to initialize correctly", dod.getRandomServiciosIncluidos());
        java.lang.Long id = dod.getRandomServiciosIncluidos().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'ServiciosIncluidos' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.ServiciosIncluidos obj = com.alojamientosturisticos.domain.ServiciosIncluidos.findServiciosIncluidos(id);
        org.junit.Assert.assertNotNull("Find method for 'ServiciosIncluidos' illegally returned null for id '" + id + "'", obj);
        obj.remove();
        org.junit.Assert.assertNull("Failed to remove 'ServiciosIncluidos' with identifier '" + id + "'", com.alojamientosturisticos.domain.ServiciosIncluidos.findServiciosIncluidos(id));
    }
    
}
