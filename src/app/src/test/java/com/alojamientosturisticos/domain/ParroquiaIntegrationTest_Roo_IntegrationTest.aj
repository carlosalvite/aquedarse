package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.ParroquiaDataOnDemand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ParroquiaIntegrationTest_Roo_IntegrationTest {
    
    declare @type: ParroquiaIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: ParroquiaIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    @Autowired
    private ParroquiaDataOnDemand ParroquiaIntegrationTest.dod;
    
    @Test
    public void ParroquiaIntegrationTest.testCountParroquias() {
        org.junit.Assert.assertNotNull("Data on demand for 'Parroquia' failed to initialize correctly", dod.getRandomParroquia());
        long count = com.alojamientosturisticos.domain.Parroquia.countParroquias();
        org.junit.Assert.assertTrue("Counter for 'Parroquia' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void ParroquiaIntegrationTest.testFindParroquia() {
        org.junit.Assert.assertNotNull("Data on demand for 'Parroquia' failed to initialize correctly", dod.getRandomParroquia());
        java.lang.Long id = dod.getRandomParroquia().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Parroquia' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Parroquia obj = com.alojamientosturisticos.domain.Parroquia.findParroquia(id);
        org.junit.Assert.assertNotNull("Find method for 'Parroquia' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'Parroquia' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void ParroquiaIntegrationTest.testFindAllParroquias() {
        org.junit.Assert.assertNotNull("Data on demand for 'Parroquia' failed to initialize correctly", dod.getRandomParroquia());
        long count = com.alojamientosturisticos.domain.Parroquia.countParroquias();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'Parroquia', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.alojamientosturisticos.domain.Parroquia> result = com.alojamientosturisticos.domain.Parroquia.findAllParroquias();
        org.junit.Assert.assertNotNull("Find all method for 'Parroquia' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'Parroquia' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void ParroquiaIntegrationTest.testFindParroquiaEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'Parroquia' failed to initialize correctly", dod.getRandomParroquia());
        long count = com.alojamientosturisticos.domain.Parroquia.countParroquias();
        if (count > 20) count = 20;
        java.util.List<com.alojamientosturisticos.domain.Parroquia> result = com.alojamientosturisticos.domain.Parroquia.findParroquiaEntries(0, (int)count);
        org.junit.Assert.assertNotNull("Find entries method for 'Parroquia' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'Parroquia' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    @Transactional
    public void ParroquiaIntegrationTest.testFlush() {
        org.junit.Assert.assertNotNull("Data on demand for 'Parroquia' failed to initialize correctly", dod.getRandomParroquia());
        java.lang.Long id = dod.getRandomParroquia().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Parroquia' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Parroquia obj = com.alojamientosturisticos.domain.Parroquia.findParroquia(id);
        org.junit.Assert.assertNotNull("Find method for 'Parroquia' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyParroquia(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'Parroquia' failed to increment on flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void ParroquiaIntegrationTest.testMerge() {
        org.junit.Assert.assertNotNull("Data on demand for 'Parroquia' failed to initialize correctly", dod.getRandomParroquia());
        java.lang.Long id = dod.getRandomParroquia().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Parroquia' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Parroquia obj = com.alojamientosturisticos.domain.Parroquia.findParroquia(id);
        org.junit.Assert.assertNotNull("Find method for 'Parroquia' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyParroquia(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.merge();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'Parroquia' failed to increment on merge and flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void ParroquiaIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'Parroquia' failed to initialize correctly", dod.getRandomParroquia());
        com.alojamientosturisticos.domain.Parroquia obj = dod.getNewTransientParroquia(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'Parroquia' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'Parroquia' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'Parroquia' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional
    public void ParroquiaIntegrationTest.testRemove() {
        org.junit.Assert.assertNotNull("Data on demand for 'Parroquia' failed to initialize correctly", dod.getRandomParroquia());
        java.lang.Long id = dod.getRandomParroquia().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Parroquia' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Parroquia obj = com.alojamientosturisticos.domain.Parroquia.findParroquia(id);
        org.junit.Assert.assertNotNull("Find method for 'Parroquia' illegally returned null for id '" + id + "'", obj);
        obj.remove();
        org.junit.Assert.assertNull("Failed to remove 'Parroquia' with identifier '" + id + "'", com.alojamientosturisticos.domain.Parroquia.findParroquia(id));
    }
    
}
