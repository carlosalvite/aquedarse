package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Alojamiento;
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

privileged aspect Alojamiento_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager Alojamiento.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Alojamiento.id;
    
    @Version
    @Column(name = "version")
    private Integer Alojamiento.version;
    
    public Long Alojamiento.getId() {
        return this.id;
    }
    
    public void Alojamiento.setId(Long id) {
        this.id = id;
    }
    
    public Integer Alojamiento.getVersion() {
        return this.version;
    }
    
    public void Alojamiento.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Alojamiento.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Alojamiento.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Alojamiento attached = this.entityManager.find(Alojamiento.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Alojamiento.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Alojamiento.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Alojamiento merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager Alojamiento.entityManager() {
        EntityManager em = new Alojamiento().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Alojamiento.countAlojamientoes() {
        return (Long) entityManager().createQuery("select count(o) from Alojamiento o").getSingleResult();
    }
    
    public static List<Alojamiento> Alojamiento.findAllAlojamientoes() {
        return entityManager().createQuery("select o from Alojamiento o").getResultList();
    }
    
    public static Alojamiento Alojamiento.findAlojamiento(Long id) {
        if (id == null) return null;
        return entityManager().find(Alojamiento.class, id);
    }
    
    public static List<Alojamiento> Alojamiento.findAlojamientoEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from Alojamiento o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
