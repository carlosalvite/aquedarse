package com.alojamientosturisticos.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.entity.RooEntity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;
import com.alojamientosturisticos.domain.ComodidadGeneralAdicional;
import java.util.HashSet;
import javax.persistence.CascadeType;
import javax.persistence.Transient;

@Entity
@RooJavaBean
@RooToString
@RooEntity(finders = { "findAlojamientoesByNombre" })
public class Alojamiento {

    private String nombre;

    @Lob
    @Size(max = 500)
    @Column(length = 500)
    private String descripcionGeneral;

    @ManyToOne(targetEntity = TipoAlojamiento.class)
    @JoinColumn
    private TipoAlojamiento tipoAlojamiento;

    @ManyToOne(targetEntity = Ubicacion.class)
    @JoinColumn
    private Ubicacion ubicacion;

    @NotNull
    @Size(min = 3, max = 255)
    private String direccion;

    @Size(max = 255)
    private String latitudGps;

    @Size(max = 255)
    private String longitudGps;

    @ManyToMany(targetEntity = ComodidadGeneral.class)
    @JoinColumn
    private List<ComodidadGeneral> comodidadesGenerales;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<ComodidadGeneralAdicional> comodidadesGeneralesAdicionales = new HashSet<ComodidadGeneralAdicional>();
    
    @Transient
    private String comodidadesGeneralesAdicionalesTrans;
}
