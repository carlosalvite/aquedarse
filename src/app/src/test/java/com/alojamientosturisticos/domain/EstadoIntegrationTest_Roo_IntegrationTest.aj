package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.EstadoDataOnDemand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect EstadoIntegrationTest_Roo_IntegrationTest {
    
    declare @type: EstadoIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: EstadoIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    @Autowired
    private EstadoDataOnDemand EstadoIntegrationTest.dod;
    
    @Test
    public void EstadoIntegrationTest.testCountEstadoes() {
        org.junit.Assert.assertNotNull("Data on demand for 'Estado' failed to initialize correctly", dod.getRandomEstado());
        long count = com.alojamientosturisticos.domain.Estado.countEstadoes();
        org.junit.Assert.assertTrue("Counter for 'Estado' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void EstadoIntegrationTest.testFindEstado() {
        org.junit.Assert.assertNotNull("Data on demand for 'Estado' failed to initialize correctly", dod.getRandomEstado());
        java.lang.Long id = dod.getRandomEstado().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Estado' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Estado obj = com.alojamientosturisticos.domain.Estado.findEstado(id);
        org.junit.Assert.assertNotNull("Find method for 'Estado' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'Estado' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void EstadoIntegrationTest.testFindAllEstadoes() {
        org.junit.Assert.assertNotNull("Data on demand for 'Estado' failed to initialize correctly", dod.getRandomEstado());
        long count = com.alojamientosturisticos.domain.Estado.countEstadoes();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'Estado', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.alojamientosturisticos.domain.Estado> result = com.alojamientosturisticos.domain.Estado.findAllEstadoes();
        org.junit.Assert.assertNotNull("Find all method for 'Estado' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'Estado' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void EstadoIntegrationTest.testFindEstadoEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'Estado' failed to initialize correctly", dod.getRandomEstado());
        long count = com.alojamientosturisticos.domain.Estado.countEstadoes();
        if (count > 20) count = 20;
        java.util.List<com.alojamientosturisticos.domain.Estado> result = com.alojamientosturisticos.domain.Estado.findEstadoEntries(0, (int)count);
        org.junit.Assert.assertNotNull("Find entries method for 'Estado' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'Estado' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    @Transactional
    public void EstadoIntegrationTest.testFlush() {
        org.junit.Assert.assertNotNull("Data on demand for 'Estado' failed to initialize correctly", dod.getRandomEstado());
        java.lang.Long id = dod.getRandomEstado().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Estado' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Estado obj = com.alojamientosturisticos.domain.Estado.findEstado(id);
        org.junit.Assert.assertNotNull("Find method for 'Estado' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyEstado(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'Estado' failed to increment on flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void EstadoIntegrationTest.testMerge() {
        org.junit.Assert.assertNotNull("Data on demand for 'Estado' failed to initialize correctly", dod.getRandomEstado());
        java.lang.Long id = dod.getRandomEstado().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Estado' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Estado obj = com.alojamientosturisticos.domain.Estado.findEstado(id);
        org.junit.Assert.assertNotNull("Find method for 'Estado' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyEstado(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.merge();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'Estado' failed to increment on merge and flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void EstadoIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'Estado' failed to initialize correctly", dod.getRandomEstado());
        com.alojamientosturisticos.domain.Estado obj = dod.getNewTransientEstado(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'Estado' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'Estado' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'Estado' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional
    public void EstadoIntegrationTest.testRemove() {
        org.junit.Assert.assertNotNull("Data on demand for 'Estado' failed to initialize correctly", dod.getRandomEstado());
        java.lang.Long id = dod.getRandomEstado().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Estado' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Estado obj = com.alojamientosturisticos.domain.Estado.findEstado(id);
        org.junit.Assert.assertNotNull("Find method for 'Estado' illegally returned null for id '" + id + "'", obj);
        obj.remove();
        org.junit.Assert.assertNull("Failed to remove 'Estado' with identifier '" + id + "'", com.alojamientosturisticos.domain.Estado.findEstado(id));
    }
    
}
