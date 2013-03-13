package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Parroquia;
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

privileged aspect Parroquia_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager Parroquia.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Parroquia.id;
    
    @Version
    @Column(name = "version")
    private Integer Parroquia.version;
    
    public Long Parroquia.getId() {
        return this.id;
    }
    
    public void Parroquia.setId(Long id) {
        this.id = id;
    }
    
    public Integer Parroquia.getVersion() {
        return this.version;
    }
    
    public void Parroquia.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Parroquia.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Parroquia.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Parroquia attached = this.entityManager.find(Parroquia.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Parroquia.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Parroquia.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Parroquia merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager Parroquia.entityManager() {
        EntityManager em = new Parroquia().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Parroquia.countParroquias() {
        return (Long) entityManager().createQuery("select count(o) from Parroquia o").getSingleResult();
    }
    
    public static List<Parroquia> Parroquia.findAllParroquias() {
        return entityManager().createQuery("select o from Parroquia o").getResultList();
    }
    
    public static Parroquia Parroquia.findParroquia(Long id) {
        if (id == null) return null;
        return entityManager().find(Parroquia.class, id);
    }
    
    public static List<Parroquia> Parroquia.findParroquiaEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from Parroquia o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
