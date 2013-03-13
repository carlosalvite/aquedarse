package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.TipoCiRif;
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

privileged aspect TipoCiRif_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager TipoCiRif.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long TipoCiRif.id;
    
    @Version
    @Column(name = "version")
    private Integer TipoCiRif.version;
    
    public Long TipoCiRif.getId() {
        return this.id;
    }
    
    public void TipoCiRif.setId(Long id) {
        this.id = id;
    }
    
    public Integer TipoCiRif.getVersion() {
        return this.version;
    }
    
    public void TipoCiRif.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void TipoCiRif.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void TipoCiRif.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            TipoCiRif attached = this.entityManager.find(TipoCiRif.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void TipoCiRif.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void TipoCiRif.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        TipoCiRif merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager TipoCiRif.entityManager() {
        EntityManager em = new TipoCiRif().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long TipoCiRif.countTipoCiRifs() {
        return (Long) entityManager().createQuery("select count(o) from TipoCiRif o").getSingleResult();
    }
    
    public static List<TipoCiRif> TipoCiRif.findAllTipoCiRifs() {
        return entityManager().createQuery("select o from TipoCiRif o").getResultList();
    }
    
    public static TipoCiRif TipoCiRif.findTipoCiRif(Long id) {
        if (id == null) return null;
        return entityManager().find(TipoCiRif.class, id);
    }
    
    public static List<TipoCiRif> TipoCiRif.findTipoCiRifEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from TipoCiRif o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
