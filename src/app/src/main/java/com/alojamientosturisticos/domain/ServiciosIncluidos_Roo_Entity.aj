package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.ServiciosIncluidos;
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

privileged aspect ServiciosIncluidos_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager ServiciosIncluidos.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long ServiciosIncluidos.id;
    
    @Version
    @Column(name = "version")
    private Integer ServiciosIncluidos.version;
    
    public Long ServiciosIncluidos.getId() {
        return this.id;
    }
    
    public void ServiciosIncluidos.setId(Long id) {
        this.id = id;
    }
    
    public Integer ServiciosIncluidos.getVersion() {
        return this.version;
    }
    
    public void ServiciosIncluidos.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void ServiciosIncluidos.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void ServiciosIncluidos.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            ServiciosIncluidos attached = this.entityManager.find(ServiciosIncluidos.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void ServiciosIncluidos.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void ServiciosIncluidos.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        ServiciosIncluidos merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager ServiciosIncluidos.entityManager() {
        EntityManager em = new ServiciosIncluidos().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long ServiciosIncluidos.countServiciosIncluidoses() {
        return (Long) entityManager().createQuery("select count(o) from ServiciosIncluidos o").getSingleResult();
    }
    
    public static List<ServiciosIncluidos> ServiciosIncluidos.findAllServiciosIncluidoses() {
        return entityManager().createQuery("select o from ServiciosIncluidos o").getResultList();
    }
    
    public static ServiciosIncluidos ServiciosIncluidos.findServiciosIncluidos(Long id) {
        if (id == null) return null;
        return entityManager().find(ServiciosIncluidos.class, id);
    }
    
    public static List<ServiciosIncluidos> ServiciosIncluidos.findServiciosIncluidosEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from ServiciosIncluidos o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
