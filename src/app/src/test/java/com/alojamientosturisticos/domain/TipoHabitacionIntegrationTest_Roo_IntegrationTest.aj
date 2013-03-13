package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.TipoHabitacionDataOnDemand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect TipoHabitacionIntegrationTest_Roo_IntegrationTest {
    
    declare @type: TipoHabitacionIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: TipoHabitacionIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    @Autowired
    private TipoHabitacionDataOnDemand TipoHabitacionIntegrationTest.dod;
    
    @Test
    public void TipoHabitacionIntegrationTest.testCountTipoHabitacions() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoHabitacion' failed to initialize correctly", dod.getRandomTipoHabitacion());
        long count = com.alojamientosturisticos.domain.TipoHabitacion.countTipoHabitacions();
        org.junit.Assert.assertTrue("Counter for 'TipoHabitacion' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void TipoHabitacionIntegrationTest.testFindTipoHabitacion() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoHabitacion' failed to initialize correctly", dod.getRandomTipoHabitacion());
        java.lang.Long id = dod.getRandomTipoHabitacion().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'TipoHabitacion' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.TipoHabitacion obj = com.alojamientosturisticos.domain.TipoHabitacion.findTipoHabitacion(id);
        org.junit.Assert.assertNotNull("Find method for 'TipoHabitacion' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'TipoHabitacion' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void TipoHabitacionIntegrationTest.testFindAllTipoHabitacions() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoHabitacion' failed to initialize correctly", dod.getRandomTipoHabitacion());
        long count = com.alojamientosturisticos.domain.TipoHabitacion.countTipoHabitacions();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'TipoHabitacion', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.alojamientosturisticos.domain.TipoHabitacion> result = com.alojamientosturisticos.domain.TipoHabitacion.findAllTipoHabitacions();
        org.junit.Assert.assertNotNull("Find all method for 'TipoHabitacion' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'TipoHabitacion' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void TipoHabitacionIntegrationTest.testFindTipoHabitacionEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoHabitacion' failed to initialize correctly", dod.getRandomTipoHabitacion());
        long count = com.alojamientosturisticos.domain.TipoHabitacion.countTipoHabitacions();
        if (count > 20) count = 20;
        java.util.List<com.alojamientosturisticos.domain.TipoHabitacion> result = com.alojamientosturisticos.domain.TipoHabitacion.findTipoHabitacionEntries(0, (int)count);
        org.junit.Assert.assertNotNull("Find entries method for 'TipoHabitacion' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'TipoHabitacion' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    @Transactional
    public void TipoHabitacionIntegrationTest.testFlush() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoHabitacion' failed to initialize correctly", dod.getRandomTipoHabitacion());
        java.lang.Long id = dod.getRandomTipoHabitacion().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'TipoHabitacion' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.TipoHabitacion obj = com.alojamientosturisticos.domain.TipoHabitacion.findTipoHabitacion(id);
        org.junit.Assert.assertNotNull("Find method for 'TipoHabitacion' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyTipoHabitacion(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'TipoHabitacion' failed to increment on flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void TipoHabitacionIntegrationTest.testMerge() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoHabitacion' failed to initialize correctly", dod.getRandomTipoHabitacion());
        java.lang.Long id = dod.getRandomTipoHabitacion().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'TipoHabitacion' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.TipoHabitacion obj = com.alojamientosturisticos.domain.TipoHabitacion.findTipoHabitacion(id);
        org.junit.Assert.assertNotNull("Find method for 'TipoHabitacion' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyTipoHabitacion(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.merge();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'TipoHabitacion' failed to increment on merge and flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void TipoHabitacionIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoHabitacion' failed to initialize correctly", dod.getRandomTipoHabitacion());
        com.alojamientosturisticos.domain.TipoHabitacion obj = dod.getNewTransientTipoHabitacion(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'TipoHabitacion' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'TipoHabitacion' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'TipoHabitacion' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional
    public void TipoHabitacionIntegrationTest.testRemove() {
        org.junit.Assert.assertNotNull("Data on demand for 'TipoHabitacion' failed to initialize correctly", dod.getRandomTipoHabitacion());
        java.lang.Long id = dod.getRandomTipoHabitacion().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'TipoHabitacion' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.TipoHabitacion obj = com.alojamientosturisticos.domain.TipoHabitacion.findTipoHabitacion(id);
        org.junit.Assert.assertNotNull("Find method for 'TipoHabitacion' illegally returned null for id '" + id + "'", obj);
        obj.remove();
        org.junit.Assert.assertNull("Failed to remove 'TipoHabitacion' with identifier '" + id + "'", com.alojamientosturisticos.domain.TipoHabitacion.findTipoHabitacion(id));
    }
    
}
