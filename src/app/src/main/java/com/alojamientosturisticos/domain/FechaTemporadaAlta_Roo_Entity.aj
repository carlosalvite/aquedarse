package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.FechaTemporadaAlta;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Transactional;

privileged aspect FechaTemporadaAlta_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager FechaTemporadaAlta.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long FechaTemporadaAlta.id;
    
    @Version
    @Column(name = "version")
    private Integer FechaTemporadaAlta.version;
    
    public Long FechaTemporadaAlta.getId() {
        return this.id;
    }
    
    public void FechaTemporadaAlta.setId(Long id) {
        this.id = id;
    }
    
    public Integer FechaTemporadaAlta.getVersion() {
        return this.version;
    }
    
    public void FechaTemporadaAlta.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void FechaTemporadaAlta.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void FechaTemporadaAlta.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            FechaTemporadaAlta attached = this.entityManager.find(FechaTemporadaAlta.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void FechaTemporadaAlta.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void FechaTemporadaAlta.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        FechaTemporadaAlta merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager FechaTemporadaAlta.entityManager() {
        EntityManager em = new FechaTemporadaAlta().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long FechaTemporadaAlta.countFechaTemporadaAltas() {
        return (Long) entityManager().createQuery("select count(o) from FechaTemporadaAlta o").getSingleResult();
    }
    
    public static List<FechaTemporadaAlta> FechaTemporadaAlta.findAllFechaTemporadaAltas() {
        return entityManager().createQuery("select o from FechaTemporadaAlta o").getResultList();
    }
    
    public static FechaTemporadaAlta FechaTemporadaAlta.findFechaTemporadaAlta(Long id) {
        if (id == null) return null;
        return entityManager().find(FechaTemporadaAlta.class, id);
    }
    
    public static List<FechaTemporadaAlta> FechaTemporadaAlta.findFechaTemporadaAltaEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from FechaTemporadaAlta o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
