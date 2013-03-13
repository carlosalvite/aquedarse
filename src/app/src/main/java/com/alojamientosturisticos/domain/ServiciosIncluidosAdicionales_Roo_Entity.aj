package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.ServiciosIncluidosAdicionales;
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

privileged aspect ServiciosIncluidosAdicionales_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager ServiciosIncluidosAdicionales.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long ServiciosIncluidosAdicionales.id;
    
    @Version
    @Column(name = "version")
    private Integer ServiciosIncluidosAdicionales.version;
    
    public Long ServiciosIncluidosAdicionales.getId() {
        return this.id;
    }
    
    public void ServiciosIncluidosAdicionales.setId(Long id) {
        this.id = id;
    }
    
    public Integer ServiciosIncluidosAdicionales.getVersion() {
        return this.version;
    }
    
    public void ServiciosIncluidosAdicionales.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void ServiciosIncluidosAdicionales.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void ServiciosIncluidosAdicionales.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            ServiciosIncluidosAdicionales attached = this.entityManager.find(ServiciosIncluidosAdicionales.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void ServiciosIncluidosAdicionales.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void ServiciosIncluidosAdicionales.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        ServiciosIncluidosAdicionales merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager ServiciosIncluidosAdicionales.entityManager() {
        EntityManager em = new ServiciosIncluidosAdicionales().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long ServiciosIncluidosAdicionales.countServiciosIncluidosAdicionaleses() {
        return (Long) entityManager().createQuery("select count(o) from ServiciosIncluidosAdicionales o").getSingleResult();
    }
    
    public static List<ServiciosIncluidosAdicionales> ServiciosIncluidosAdicionales.findAllServiciosIncluidosAdicionaleses() {
        return entityManager().createQuery("select o from ServiciosIncluidosAdicionales o").getResultList();
    }
    
    public static ServiciosIncluidosAdicionales ServiciosIncluidosAdicionales.findServiciosIncluidosAdicionales(Long id) {
        if (id == null) return null;
        return entityManager().find(ServiciosIncluidosAdicionales.class, id);
    }
    
    public static List<ServiciosIncluidosAdicionales> ServiciosIncluidosAdicionales.findServiciosIncluidosAdicionalesEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from ServiciosIncluidosAdicionales o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
