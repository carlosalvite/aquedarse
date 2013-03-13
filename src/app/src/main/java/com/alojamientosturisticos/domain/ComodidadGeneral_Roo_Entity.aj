package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.ComodidadGeneral;
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

privileged aspect ComodidadGeneral_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager ComodidadGeneral.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long ComodidadGeneral.id;
    
    @Version
    @Column(name = "version")
    private Integer ComodidadGeneral.version;
    
    public Long ComodidadGeneral.getId() {
        return this.id;
    }
    
    public void ComodidadGeneral.setId(Long id) {
        this.id = id;
    }
    
    public Integer ComodidadGeneral.getVersion() {
        return this.version;
    }
    
    public void ComodidadGeneral.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void ComodidadGeneral.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void ComodidadGeneral.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            ComodidadGeneral attached = this.entityManager.find(ComodidadGeneral.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void ComodidadGeneral.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void ComodidadGeneral.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        ComodidadGeneral merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager ComodidadGeneral.entityManager() {
        EntityManager em = new ComodidadGeneral().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long ComodidadGeneral.countComodidadGenerals() {
        return (Long) entityManager().createQuery("select count(o) from ComodidadGeneral o").getSingleResult();
    }
    
    public static List<ComodidadGeneral> ComodidadGeneral.findAllComodidadGenerals() {
        return entityManager().createQuery("select o from ComodidadGeneral o").getResultList();
    }
    
    public static ComodidadGeneral ComodidadGeneral.findComodidadGeneral(Long id) {
        if (id == null) return null;
        return entityManager().find(ComodidadGeneral.class, id);
    }
    
    public static List<ComodidadGeneral> ComodidadGeneral.findComodidadGeneralEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from ComodidadGeneral o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
