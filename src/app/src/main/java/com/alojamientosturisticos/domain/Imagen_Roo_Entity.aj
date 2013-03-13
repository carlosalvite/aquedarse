package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Imagen;
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

privileged aspect Imagen_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager Imagen.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Imagen.id;
    
    @Version
    @Column(name = "version")
    private Integer Imagen.version;
    
    public Long Imagen.getId() {
        return this.id;
    }
    
    public void Imagen.setId(Long id) {
        this.id = id;
    }
    
    public Integer Imagen.getVersion() {
        return this.version;
    }
    
    public void Imagen.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Imagen.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Imagen.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Imagen attached = this.entityManager.find(Imagen.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Imagen.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Imagen.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Imagen merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager Imagen.entityManager() {
        EntityManager em = new Imagen().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Imagen.countImagens() {
        return (Long) entityManager().createQuery("select count(o) from Imagen o").getSingleResult();
    }
    
    public static List<Imagen> Imagen.findAllImagens() {
        return entityManager().createQuery("select o from Imagen o").getResultList();
    }
    
    public static Imagen Imagen.findImagen(Long id) {
        if (id == null) return null;
        return entityManager().find(Imagen.class, id);
    }
    
    public static List<Imagen> Imagen.findImagenEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from Imagen o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
