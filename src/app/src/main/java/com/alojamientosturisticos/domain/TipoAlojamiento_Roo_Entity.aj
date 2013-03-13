package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.TipoAlojamiento;
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

privileged aspect TipoAlojamiento_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager TipoAlojamiento.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long TipoAlojamiento.id;
    
    @Version
    @Column(name = "version")
    private Integer TipoAlojamiento.version;
    
    public Long TipoAlojamiento.getId() {
        return this.id;
    }
    
    public void TipoAlojamiento.setId(Long id) {
        this.id = id;
    }
    
    public Integer TipoAlojamiento.getVersion() {
        return this.version;
    }
    
    public void TipoAlojamiento.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void TipoAlojamiento.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void TipoAlojamiento.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            TipoAlojamiento attached = this.entityManager.find(TipoAlojamiento.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void TipoAlojamiento.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void TipoAlojamiento.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        TipoAlojamiento merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager TipoAlojamiento.entityManager() {
        EntityManager em = new TipoAlojamiento().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long TipoAlojamiento.countTipoAlojamientoes() {
        return (Long) entityManager().createQuery("select count(o) from TipoAlojamiento o").getSingleResult();
    }
    
    public static List<TipoAlojamiento> TipoAlojamiento.findAllTipoAlojamientoes() {
        return entityManager().createQuery("select o from TipoAlojamiento o").getResultList();
    }
    
    public static TipoAlojamiento TipoAlojamiento.findTipoAlojamiento(Long id) {
        if (id == null) return null;
        return entityManager().find(TipoAlojamiento.class, id);
    }
    
    public static List<TipoAlojamiento> TipoAlojamiento.findTipoAlojamientoEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from TipoAlojamiento o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
