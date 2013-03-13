package com.alojamientosturisticos.domain;

import java.util.Comparator;
import java.util.List;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.entity.RooEntity;

@Entity
@RooJavaBean
@RooToString
@RooEntity(finders = { "findComodidadGeneralsByNombreLike" })
public class ComodidadGeneral {

    @NotNull
    @Size(min = 2, max = 50)
    private String nombre;

    @Override
    public String toString() {
        return nombre;
    }
    
    public static final Comparator compararComodidadesGenerales = new Comparator() {        
        @Override
        public int compare(Object o1, Object o2) {
            
            String nombre1 = ((ComodidadGeneral)o1).getNombre();        
            String nombre2 = ((ComodidadGeneral)o2).getNombre();

            return nombre1.compareTo(nombre2);            
            
        }
    };
}
