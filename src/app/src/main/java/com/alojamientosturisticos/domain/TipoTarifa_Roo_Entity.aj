package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.TipoTarifa;
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

privileged aspect TipoTarifa_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager TipoTarifa.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long TipoTarifa.id;
    
    @Version
    @Column(name = "version")
    private Integer TipoTarifa.version;
    
    public Long TipoTarifa.getId() {
        return this.id;
    }
    
    public void TipoTarifa.setId(Long id) {
        this.id = id;
    }
    
    public Integer TipoTarifa.getVersion() {
        return this.version;
    }
    
    public void TipoTarifa.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void TipoTarifa.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void TipoTarifa.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            TipoTarifa attached = this.entityManager.find(TipoTarifa.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void TipoTarifa.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void TipoTarifa.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        TipoTarifa merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager TipoTarifa.entityManager() {
        EntityManager em = new TipoTarifa().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long TipoTarifa.countTipoTarifas() {
        return (Long) entityManager().createQuery("select count(o) from TipoTarifa o").getSingleResult();
    }
    
    public static List<TipoTarifa> TipoTarifa.findAllTipoTarifas() {
        return entityManager().createQuery("select o from TipoTarifa o").getResultList();
    }
    
    public static TipoTarifa TipoTarifa.findTipoTarifa(Long id) {
        if (id == null) return null;
        return entityManager().find(TipoTarifa.class, id);
    }
    
    public static List<TipoTarifa> TipoTarifa.findTipoTarifaEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from TipoTarifa o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
