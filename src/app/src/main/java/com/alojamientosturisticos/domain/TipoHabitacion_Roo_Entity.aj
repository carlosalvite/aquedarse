package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.TipoHabitacion;
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

privileged aspect TipoHabitacion_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager TipoHabitacion.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long TipoHabitacion.id;
    
    @Version
    @Column(name = "version")
    private Integer TipoHabitacion.version;
    
    public Long TipoHabitacion.getId() {
        return this.id;
    }
    
    public void TipoHabitacion.setId(Long id) {
        this.id = id;
    }
    
    public Integer TipoHabitacion.getVersion() {
        return this.version;
    }
    
    public void TipoHabitacion.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void TipoHabitacion.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void TipoHabitacion.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            TipoHabitacion attached = this.entityManager.find(TipoHabitacion.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void TipoHabitacion.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void TipoHabitacion.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        TipoHabitacion merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager TipoHabitacion.entityManager() {
        EntityManager em = new TipoHabitacion().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long TipoHabitacion.countTipoHabitacions() {
        return (Long) entityManager().createQuery("select count(o) from TipoHabitacion o").getSingleResult();
    }
    
    public static List<TipoHabitacion> TipoHabitacion.findAllTipoHabitacions() {
        return entityManager().createQuery("select o from TipoHabitacion o").getResultList();
    }
    
    public static TipoHabitacion TipoHabitacion.findTipoHabitacion(Long id) {
        if (id == null) return null;
        return entityManager().find(TipoHabitacion.class, id);
    }
    
    public static List<TipoHabitacion> TipoHabitacion.findTipoHabitacionEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from TipoHabitacion o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
