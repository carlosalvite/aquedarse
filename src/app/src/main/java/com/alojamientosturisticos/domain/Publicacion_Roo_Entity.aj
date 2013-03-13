package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Publicacion;
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

privileged aspect Publicacion_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager Publicacion.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Publicacion.id;
    
    @Version
    @Column(name = "version")
    private Integer Publicacion.version;
    
    public Long Publicacion.getId() {
        return this.id;
    }
    
    public void Publicacion.setId(Long id) {
        this.id = id;
    }
    
    public Integer Publicacion.getVersion() {
        return this.version;
    }
    
    public void Publicacion.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Publicacion.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Publicacion.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Publicacion attached = this.entityManager.find(Publicacion.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Publicacion.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Publicacion.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Publicacion merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager Publicacion.entityManager() {
        EntityManager em = new Publicacion().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Publicacion.countPublicacions() {
        return (Long) entityManager().createQuery("select count(o) from Publicacion o").getSingleResult();
    }
    
    public static List<Publicacion> Publicacion.findAllPublicacions() {
        return entityManager().createQuery("select o from Publicacion o").getResultList();
    }
    
    public static Publicacion Publicacion.findPublicacion(Long id) {
        if (id == null) return null;
        return entityManager().find(Publicacion.class, id);
    }
    
    public static List<Publicacion> Publicacion.findPublicacionEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from Publicacion o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
