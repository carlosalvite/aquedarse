package com.alojamientosturisticos.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Set;
import com.alojamientosturisticos.domain.ServiciosIncluidos;
import java.util.Date;
import java.util.HashSet;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import com.alojamientosturisticos.domain.FechaTemporadaAlta;

@Entity
@RooJavaBean
@RooToString
@RooEntity(finders = { "findPublicacionsByAlojamiento" })
public class Publicacion {

    @NotNull
    @Size(min = 3, max = 100)
    private String titulo;

    @NotNull
    @ManyToOne(targetEntity = TipoHabitacion.class)
    @JoinColumn
    private TipoHabitacion tipoHabitacion;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<ServiciosIncluidos> serviciosIncluidos = new HashSet<ServiciosIncluidos>();

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<ServiciosIncluidosAdicionales> serviciosIncluidosAdicionales = new HashSet<ServiciosIncluidosAdicionales>();

    @Transient
    private String serviciosIncluidosAdicionalesTrans;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Comodidades> comodidades = new HashSet<Comodidades>();

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<ComodidadesAdicionales> comodidadesAdicionales = new HashSet<ComodidadesAdicionales>();

    @Transient
    private String comodidadesAdicionalesTrans;

    @Lob
    @Size(max = 500)
    @Column(length = 500)
    private String condicionesEspeciales;

    @NotNull
    @NumberFormat(style = Style.NUMBER)
    @Min(1)
    @Max(9999)
    private Integer habitacionesDisponibles;

    @NotNull
    private Integer minimoNoches;

    @NotNull
    private Integer maximoNoches;

    @NotNull
    private Integer cantidadPersonas;

    @NotNull
    @ManyToOne(targetEntity = TipoTarifa.class)
    @JoinColumn
    private TipoTarifa tipoTarifa;

    @Transient
    private String tarifaTemporadaBajaStr;

    private Double tarifaTemporadaBaja;

    @Transient
    private String tarifaTemporadaAltaStr;

    private Double tarifaTemporadaAlta;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "S-")
    private Date fechaDesde;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "S-")
    private Date fechaHasta;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<FechaTemporadaAlta> fechasTemporadaAlta = new HashSet<FechaTemporadaAlta>();

    private Double porcentajeComision;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "-S")
    private Date horaCheckIn;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "-S")
    private Date horaCheckOut;

    private Boolean temporadas;

    @ManyToOne(targetEntity = Moneda.class)
    @JoinColumn
    private Moneda moneda;

    @ManyToOne(targetEntity = Alojamiento.class)
    @JoinColumn
    private Alojamiento alojamiento;
}
