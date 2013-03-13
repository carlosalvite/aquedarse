package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Moneda;
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

privileged aspect Moneda_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager Moneda.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Moneda.id;
    
    @Version
    @Column(name = "version")
    private Integer Moneda.version;
    
    public Long Moneda.getId() {
        return this.id;
    }
    
    public void Moneda.setId(Long id) {
        this.id = id;
    }
    
    public Integer Moneda.getVersion() {
        return this.version;
    }
    
    public void Moneda.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Moneda.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Moneda.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Moneda attached = this.entityManager.find(Moneda.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Moneda.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Moneda.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Moneda merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager Moneda.entityManager() {
        EntityManager em = new Moneda().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Moneda.countMonedas() {
        return (Long) entityManager().createQuery("select count(o) from Moneda o").getSingleResult();
    }
    
    public static List<Moneda> Moneda.findAllMonedas() {
        return entityManager().createQuery("select o from Moneda o").getResultList();
    }
    
    public static Moneda Moneda.findMoneda(Long id) {
        if (id == null) return null;
        return entityManager().find(Moneda.class, id);
    }
    
    public static List<Moneda> Moneda.findMonedaEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from Moneda o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
