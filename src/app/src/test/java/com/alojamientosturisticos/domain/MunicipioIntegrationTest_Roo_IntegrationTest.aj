package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.MunicipioDataOnDemand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect MunicipioIntegrationTest_Roo_IntegrationTest {
    
    declare @type: MunicipioIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: MunicipioIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext.xml");
    
    @Autowired
    private MunicipioDataOnDemand MunicipioIntegrationTest.dod;
    
    @Test
    public void MunicipioIntegrationTest.testCountMunicipios() {
        org.junit.Assert.assertNotNull("Data on demand for 'Municipio' failed to initialize correctly", dod.getRandomMunicipio());
        long count = com.alojamientosturisticos.domain.Municipio.countMunicipios();
        org.junit.Assert.assertTrue("Counter for 'Municipio' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void MunicipioIntegrationTest.testFindMunicipio() {
        org.junit.Assert.assertNotNull("Data on demand for 'Municipio' failed to initialize correctly", dod.getRandomMunicipio());
        java.lang.Long id = dod.getRandomMunicipio().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Municipio' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Municipio obj = com.alojamientosturisticos.domain.Municipio.findMunicipio(id);
        org.junit.Assert.assertNotNull("Find method for 'Municipio' illegally returned null for id '" + id + "'", obj);
        org.junit.Assert.assertEquals("Find method for 'Municipio' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void MunicipioIntegrationTest.testFindAllMunicipios() {
        org.junit.Assert.assertNotNull("Data on demand for 'Municipio' failed to initialize correctly", dod.getRandomMunicipio());
        long count = com.alojamientosturisticos.domain.Municipio.countMunicipios();
        org.junit.Assert.assertTrue("Too expensive to perform a find all test for 'Municipio', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        java.util.List<com.alojamientosturisticos.domain.Municipio> result = com.alojamientosturisticos.domain.Municipio.findAllMunicipios();
        org.junit.Assert.assertNotNull("Find all method for 'Municipio' illegally returned null", result);
        org.junit.Assert.assertTrue("Find all method for 'Municipio' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void MunicipioIntegrationTest.testFindMunicipioEntries() {
        org.junit.Assert.assertNotNull("Data on demand for 'Municipio' failed to initialize correctly", dod.getRandomMunicipio());
        long count = com.alojamientosturisticos.domain.Municipio.countMunicipios();
        if (count > 20) count = 20;
        java.util.List<com.alojamientosturisticos.domain.Municipio> result = com.alojamientosturisticos.domain.Municipio.findMunicipioEntries(0, (int)count);
        org.junit.Assert.assertNotNull("Find entries method for 'Municipio' illegally returned null", result);
        org.junit.Assert.assertEquals("Find entries method for 'Municipio' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    @Transactional
    public void MunicipioIntegrationTest.testFlush() {
        org.junit.Assert.assertNotNull("Data on demand for 'Municipio' failed to initialize correctly", dod.getRandomMunicipio());
        java.lang.Long id = dod.getRandomMunicipio().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Municipio' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Municipio obj = com.alojamientosturisticos.domain.Municipio.findMunicipio(id);
        org.junit.Assert.assertNotNull("Find method for 'Municipio' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyMunicipio(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'Municipio' failed to increment on flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void MunicipioIntegrationTest.testMerge() {
        org.junit.Assert.assertNotNull("Data on demand for 'Municipio' failed to initialize correctly", dod.getRandomMunicipio());
        java.lang.Long id = dod.getRandomMunicipio().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Municipio' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Municipio obj = com.alojamientosturisticos.domain.Municipio.findMunicipio(id);
        org.junit.Assert.assertNotNull("Find method for 'Municipio' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyMunicipio(obj);
        java.lang.Integer currentVersion = obj.getVersion();
        obj.merge();
        obj.flush();
        org.junit.Assert.assertTrue("Version for 'Municipio' failed to increment on merge and flush directive", obj.getVersion() > currentVersion || !modified);
    }
    
    @Test
    @Transactional
    public void MunicipioIntegrationTest.testPersist() {
        org.junit.Assert.assertNotNull("Data on demand for 'Municipio' failed to initialize correctly", dod.getRandomMunicipio());
        com.alojamientosturisticos.domain.Municipio obj = dod.getNewTransientMunicipio(Integer.MAX_VALUE);
        org.junit.Assert.assertNotNull("Data on demand for 'Municipio' failed to provide a new transient entity", obj);
        org.junit.Assert.assertNull("Expected 'Municipio' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        org.junit.Assert.assertNotNull("Expected 'Municipio' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional
    public void MunicipioIntegrationTest.testRemove() {
        org.junit.Assert.assertNotNull("Data on demand for 'Municipio' failed to initialize correctly", dod.getRandomMunicipio());
        java.lang.Long id = dod.getRandomMunicipio().getId();
        org.junit.Assert.assertNotNull("Data on demand for 'Municipio' failed to provide an identifier", id);
        com.alojamientosturisticos.domain.Municipio obj = com.alojamientosturisticos.domain.Municipio.findMunicipio(id);
        org.junit.Assert.assertNotNull("Find method for 'Municipio' illegally returned null for id '" + id + "'", obj);
        obj.remove();
        org.junit.Assert.assertNull("Failed to remove 'Municipio' with identifier '" + id + "'", com.alojamientosturisticos.domain.Municipio.findMunicipio(id));
    }
    
}
