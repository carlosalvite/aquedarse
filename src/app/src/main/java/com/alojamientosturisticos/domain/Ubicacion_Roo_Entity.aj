package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Ubicacion;
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

privileged aspect Ubicacion_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager Ubicacion.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Ubicacion.id;
    
    @Version
    @Column(name = "version")
    private Integer Ubicacion.version;
    
    public Long Ubicacion.getId() {
        return this.id;
    }
    
    public void Ubicacion.setId(Long id) {
        this.id = id;
    }
    
    public Integer Ubicacion.getVersion() {
        return this.version;
    }
    
    public void Ubicacion.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Ubicacion.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Ubicacion.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Ubicacion attached = this.entityManager.find(Ubicacion.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Ubicacion.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Ubicacion.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Ubicacion merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager Ubicacion.entityManager() {
        EntityManager em = new Ubicacion().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Ubicacion.countUbicacions() {
        return (Long) entityManager().createQuery("select count(o) from Ubicacion o").getSingleResult();
    }
    
    public static List<Ubicacion> Ubicacion.findAllUbicacions() {
        return entityManager().createQuery("select o from Ubicacion o").getResultList();
    }
    
    public static Ubicacion Ubicacion.findUbicacion(Long id) {
        if (id == null) return null;
        return entityManager().find(Ubicacion.class, id);
    }
    
    public static List<Ubicacion> Ubicacion.findUbicacionEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from Ubicacion o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
