package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.Banco;
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

privileged aspect Banco_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager Banco.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Banco.id;
    
    @Version
    @Column(name = "version")
    private Integer Banco.version;
    
    public Long Banco.getId() {
        return this.id;
    }
    
    public void Banco.setId(Long id) {
        this.id = id;
    }
    
    public Integer Banco.getVersion() {
        return this.version;
    }
    
    public void Banco.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void Banco.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Banco.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Banco attached = this.entityManager.find(Banco.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Banco.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Banco.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Banco merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager Banco.entityManager() {
        EntityManager em = new Banco().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Banco.countBancoes() {
        return (Long) entityManager().createQuery("select count(o) from Banco o").getSingleResult();
    }
    
    public static List<Banco> Banco.findAllBancoes() {
        return entityManager().createQuery("select o from Banco o").getResultList();
    }
    
    public static Banco Banco.findBanco(Long id) {
        if (id == null) return null;
        return entityManager().find(Banco.class, id);
    }
    
    public static List<Banco> Banco.findBancoEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from Banco o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
