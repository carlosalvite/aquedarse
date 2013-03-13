package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Comodidades;
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

privileged aspect Comodidades_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager Comodidades.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Comodidades.id;
    
    @Version
    @Column(name = "version")
    private Integer Comodidades.version;
    
    public Long Comodidades.getId() {
        return this.id;
    }
    
    public void Comodidades.setId(Long id) {
        this.id = id;
    }
    
    public Integer Comodidades.getVersion() {
        return this.version;
    }
    
    public void Comodidades.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Comodidades.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Comodidades.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Comodidades attached = this.entityManager.find(Comodidades.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Comodidades.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Comodidades.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Comodidades merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager Comodidades.entityManager() {
        EntityManager em = new Comodidades().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Comodidades.countComodidadeses() {
        return (Long) entityManager().createQuery("select count(o) from Comodidades o").getSingleResult();
    }
    
    public static List<Comodidades> Comodidades.findAllComodidadeses() {
        return entityManager().createQuery("select o from Comodidades o").getResultList();
    }
    
    public static Comodidades Comodidades.findComodidades(Long id) {
        if (id == null) return null;
        return entityManager().find(Comodidades.class, id);
    }
    
    public static List<Comodidades> Comodidades.findComodidadesEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from Comodidades o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
