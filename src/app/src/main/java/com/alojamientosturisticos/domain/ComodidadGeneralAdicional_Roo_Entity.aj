package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.ComodidadGeneralAdicional;
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

privileged aspect ComodidadGeneralAdicional_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager ComodidadGeneralAdicional.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long ComodidadGeneralAdicional.id;
    
    @Version
    @Column(name = "version")
    private Integer ComodidadGeneralAdicional.version;
    
    public Long ComodidadGeneralAdicional.getId() {
        return this.id;
    }
    
    public void ComodidadGeneralAdicional.setId(Long id) {
        this.id = id;
    }
    
    public Integer ComodidadGeneralAdicional.getVersion() {
        return this.version;
    }
    
    public void ComodidadGeneralAdicional.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void ComodidadGeneralAdicional.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void ComodidadGeneralAdicional.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            ComodidadGeneralAdicional attached = this.entityManager.find(ComodidadGeneralAdicional.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void ComodidadGeneralAdicional.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void ComodidadGeneralAdicional.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        ComodidadGeneralAdicional merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager ComodidadGeneralAdicional.entityManager() {
        EntityManager em = new ComodidadGeneralAdicional().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long ComodidadGeneralAdicional.countComodidadGeneralAdicionals() {
        return (Long) entityManager().createQuery("select count(o) from ComodidadGeneralAdicional o").getSingleResult();
    }
    
    public static List<ComodidadGeneralAdicional> ComodidadGeneralAdicional.findAllComodidadGeneralAdicionals() {
        return entityManager().createQuery("select o from ComodidadGeneralAdicional o").getResultList();
    }
    
    public static ComodidadGeneralAdicional ComodidadGeneralAdicional.findComodidadGeneralAdicional(Long id) {
        if (id == null) return null;
        return entityManager().find(ComodidadGeneralAdicional.class, id);
    }
    
    public static List<ComodidadGeneralAdicional> ComodidadGeneralAdicional.findComodidadGeneralAdicionalEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from ComodidadGeneralAdicional o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
