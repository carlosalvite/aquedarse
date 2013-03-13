package com.alojamientosturisticos.domain;

import com.alojamientosturisticos.domain.CuentaBancaria;
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

privileged aspect CuentaBancaria_Roo_Entity {
    
    @PersistenceContext
    transient EntityManager CuentaBancaria.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long CuentaBancaria.id;
    
    @Version
    @Column(name = "version")
    private Integer CuentaBancaria.version;
    
    public Long CuentaBancaria.getId() {
        return this.id;
    }
    
    public void CuentaBancaria.setId(Long id) {
        this.id = id;
    }
    
    public Integer CuentaBancaria.getVersion() {
        return this.version;
    }
    
    public void CuentaBancaria.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional
    public void CuentaBancaria.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void CuentaBancaria.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            CuentaBancaria attached = this.entityManager.find(CuentaBancaria.class, this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void CuentaBancaria.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void CuentaBancaria.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        CuentaBancaria merged = this.entityManager.merge(this);
        this.entityManager.flush();
        this.id = merged.getId();
    }
    
    public static final EntityManager CuentaBancaria.entityManager() {
        EntityManager em = new CuentaBancaria().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long CuentaBancaria.countCuentaBancarias() {
        return (Long) entityManager().createQuery("select count(o) from CuentaBancaria o").getSingleResult();
    }
    
    public static List<CuentaBancaria> CuentaBancaria.findAllCuentaBancarias() {
        return entityManager().createQuery("select o from CuentaBancaria o").getResultList();
    }
    
    public static CuentaBancaria CuentaBancaria.findCuentaBancaria(Long id) {
        if (id == null) return null;
        return entityManager().find(CuentaBancaria.class, id);
    }
    
    public static List<CuentaBancaria> CuentaBancaria.findCuentaBancariaEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from CuentaBancaria o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
