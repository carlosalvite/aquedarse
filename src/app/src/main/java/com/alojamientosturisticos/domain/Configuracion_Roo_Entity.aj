package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Configuracion;
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

privileged aspect Configuracion_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager Configuracion.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Configuracion.id;
    
    @Version
    @Column(name = "version")
    private Integer Configuracion.version;
    
    public Long Configuracion.getId() {
        return this.id;
    }
    
    public void Configuracion.setId(Long id) {
        this.id = id;
    }
    
    public Integer Configuracion.getVersion() {
        return this.version;
    }
    
    public void Configuracion.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Configuracion.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Configuracion.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Configuracion attached = this.entityManager.find(Configuracion.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Configuracion.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Configuracion.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Configuracion merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager Configuracion.entityManager() {
        EntityManager em = new Configuracion().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Configuracion.countConfiguracions() {
        return (Long) entityManager().createQuery("select count(o) from Configuracion o").getSingleResult();
    }
    
    public static List<Configuracion> Configuracion.findAllConfiguracions() {
        return entityManager().createQuery("select o from Configuracion o").getResultList();
    }
    
    public static Configuracion Configuracion.findConfiguracion(Long id) {
        if (id == null) return null;
        return entityManager().find(Configuracion.class, id);
    }
    
    public static List<Configuracion> Configuracion.findConfiguracionEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from Configuracion o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
