package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Pais;
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

privileged aspect Pais_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager Pais.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Pais.id;
    
    @Version
    @Column(name = "version")
    private Integer Pais.version;
    
    public Long Pais.getId() {
        return this.id;
    }
    
    public void Pais.setId(Long id) {
        this.id = id;
    }
    
    public Integer Pais.getVersion() {
        return this.version;
    }
    
    public void Pais.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Pais.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Pais.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Pais attached = this.entityManager.find(Pais.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Pais.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Pais.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Pais merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager Pais.entityManager() {
        EntityManager em = new Pais().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Pais.countPaises() {
        return (Long) entityManager().createQuery("select count(o) from Pais o").getSingleResult();
    }
    
    public static List<Pais> Pais.findAllPaises() {
        return entityManager().createQuery("select o from Pais o").getResultList();
    }
    
    public static Pais Pais.findPais(Long id) {
        if (id == null) return null;
        return entityManager().find(Pais.class, id);
    }
    
    public static List<Pais> Pais.findPaisEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from Pais o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
