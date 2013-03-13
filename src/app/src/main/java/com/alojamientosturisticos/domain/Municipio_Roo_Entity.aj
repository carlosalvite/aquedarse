package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Municipio;
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

privileged aspect Municipio_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager Municipio.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Municipio.id;
    
    @Version
    @Column(name = "version")
    private Integer Municipio.version;
    
    public Long Municipio.getId() {
        return this.id;
    }
    
    public void Municipio.setId(Long id) {
        this.id = id;
    }
    
    public Integer Municipio.getVersion() {
        return this.version;
    }
    
    public void Municipio.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Municipio.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Municipio.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Municipio attached = this.entityManager.find(Municipio.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Municipio.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Municipio.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Municipio merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager Municipio.entityManager() {
        EntityManager em = new Municipio().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Municipio.countMunicipios() {
        return (Long) entityManager().createQuery("select count(o) from Municipio o").getSingleResult();
    }
    
    public static List<Municipio> Municipio.findAllMunicipios() {
        return entityManager().createQuery("select o from Municipio o").getResultList();
    }
    
    public static Municipio Municipio.findMunicipio(Long id) {
        if (id == null) return null;
        return entityManager().find(Municipio.class, id);
    }
    
    public static List<Municipio> Municipio.findMunicipioEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from Municipio o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
