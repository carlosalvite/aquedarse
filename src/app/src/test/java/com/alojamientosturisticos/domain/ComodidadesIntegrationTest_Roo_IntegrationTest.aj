package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.ComodidadesDataOnDemand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ComodidadesIntegrationTest_Roo_IntegrationTest {
    
    declare @type: ComodidadesIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: ComodidadesIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    @Autowired
    private ComodidadesDataOnDemand ComodidadesIntegrationTest.dod;
    
    @Test
    public void ComodidadesIntegrationTest.testCountComodidadeses() {
        org.junit.Assert.assertNotNull("Data on demand for 'Comodidades' failed to initialize correctly", dod.getRandomComodidades());
        long count = com.alojamientosturisticos.domain.Comodidades.countComodidadeses();
        org.junit.Assert.assertTrue("Counter for 'Comodidades' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void ComodidadesIntegrationTest.testFindComodidades() {
        org.junit.Assert.assertNotNull("Data on demand for 'Comodidades' failed to initialize correctly", dod.getRandomComodidades());
        java.lang.Long id = dod.getRandomComodidades().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Comodidades' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Comodidades obj = com.alojamientosturisticos.domain.Comodidades.findComodidades(id);
        org.junit.Assert.assertNotNull("Find method for 'Comodidades' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'Comodidades' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void ComodidadesIntegrationTest.testFindAllComodidadeses() {
        org.junit.Assert.assertNotNull("Data on demand for 'Comodidades' failed to initialize correctly", dod.getRandomComodidades());
        long count = com.alojamientosturisticos.domain.Comodidades.countComodidadeses();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'Comodidades', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.alojamientosturisticos.domain.Comodidades> result = com.alojamientosturisticos.domain.Comodidades.findAllComodidadeses();
        org.junit.Assert.assertNotNull("Find all method for 'Comodidades' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'Comodidades' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void ComodidadesIntegrationTest.testFindComodidadesEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'Comodidades' failed to initialize correctly", dod.getRandomComodidades());
        long count = com.alojamientosturisticos.domain.Comodidades.countComodidadeses();
        if (count > 20) count = 20;
        java.util.List<com.alojamientosturisticos.domain.Comodidades> result = com.alojamientosturisticos.domain.Comodidades.findComodidadesEntries(0, (int)count);
        org.junit.Assert.assertNotNull("Find entries method for 'Comodidades' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'Comodidades' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    @Transactional
    public void ComodidadesIntegrationTest.testFlush() {
        org.junit.Assert.assertNotNull("Data on demand for 'Comodidades' failed to initialize correctly", dod.getRandomComodidades());
        java.lang.Long id = dod.getRandomComodidades().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Comodidades' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Comodidades obj = com.alojamientosturisticos.domain.Comodidades.findComodidades(id);
        org.junit.Assert.assertNotNull("Find method for 'Comodidades' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyComodidades(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'Comodidades' failed to increment on flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void ComodidadesIntegrationTest.testMerge() {
        org.junit.Assert.assertNotNull("Data on demand for 'Comodidades' failed to initialize correctly", dod.getRandomComodidades());
        java.lang.Long id = dod.getRandomComodidades().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Comodidades' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Comodidades obj = com.alojamientosturisticos.domain.Comodidades.findComodidades(id);
        org.junit.Assert.assertNotNull("Find method for 'Comodidades' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyComodidades(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.merge();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'Comodidades' failed to increment on merge and flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void ComodidadesIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'Comodidades' failed to initialize correctly", dod.getRandomComodidades());
        com.alojamientosturisticos.domain.Comodidades obj = dod.getNewTransientComodidades(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'Comodidades' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'Comodidades' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'Comodidades' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional
    public void ComodidadesIntegrationTest.testRemove() {
        org.junit.Assert.assertNotNull("Data on demand for 'Comodidades' failed to initialize correctly", dod.getRandomComodidades());
        java.lang.Long id = dod.getRandomComodidades().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Comodidades' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Comodidades obj = com.alojamientosturisticos.domain.Comodidades.findComodidades(id);
        org.junit.Assert.assertNotNull("Find method for 'Comodidades' illegally returned null for id '" + id + "'", obj);
        obj.remove();
        org.junit.Assert.assertNull("Failed to remove 'Comodidades' with identifier '" + id + "'", com.alojamientosturisticos.domain.Comodidades.findComodidades(id));
    }
    
}
