package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.ComodidadesAdicionales;
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

privileged aspect ComodidadesAdicionales_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager ComodidadesAdicionales.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long ComodidadesAdicionales.id;
    
    @Version
    @Column(name = "version")
    private Integer ComodidadesAdicionales.version;
    
    public Long ComodidadesAdicionales.getId() {
        return this.id;
    }
    
    public void ComodidadesAdicionales.setId(Long id) {
        this.id = id;
    }
    
    public Integer ComodidadesAdicionales.getVersion() {
        return this.version;
    }
    
    public void ComodidadesAdicionales.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void ComodidadesAdicionales.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void ComodidadesAdicionales.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            ComodidadesAdicionales attached = this.entityManager.find(ComodidadesAdicionales.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void ComodidadesAdicionales.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void ComodidadesAdicionales.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        ComodidadesAdicionales merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager ComodidadesAdicionales.entityManager() {
        EntityManager em = new ComodidadesAdicionales().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long ComodidadesAdicionales.countComodidadesAdicionaleses() {
        return (Long) entityManager().createQuery("select count(o) from ComodidadesAdicionales o").getSingleResult();
    }
    
    public static List<ComodidadesAdicionales> ComodidadesAdicionales.findAllComodidadesAdicionaleses() {
        return entityManager().createQuery("select o from ComodidadesAdicionales o").getResultList();
    }
    
    public static ComodidadesAdicionales ComodidadesAdicionales.findComodidadesAdicionales(Long id) {
        if (id == null) return null;
        return entityManager().find(ComodidadesAdicionales.class, id);
    }
    
    public static List<ComodidadesAdicionales> ComodidadesAdicionales.findComodidadesAdicionalesEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from ComodidadesAdicionales o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
