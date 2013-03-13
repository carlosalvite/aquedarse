package com.alojamientosturisticos.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Type;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.entity.RooEntity;

@Entity
@RooJavaBean
@RooToString
@RooEntity(finders = { "findImagensByAlojamiento" })
public class Imagen {

    @ManyToOne(targetEntity = Alojamiento.class)
    @JoinColumn
    private Alojamiento alojamiento;

    Boolean esPrincipal;

    @Type(type="binary")
    @Column(length = 104857600)
    @Basic(fetch = FetchType.LAZY)
    private byte[] fileData;
}
