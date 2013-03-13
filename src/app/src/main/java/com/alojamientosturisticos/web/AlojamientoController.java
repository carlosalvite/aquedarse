package com.alojamientosturisticos.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.Alojamiento;
import com.alojamientosturisticos.domain.ComodidadGeneral;
import com.alojamientosturisticos.domain.ComodidadGeneralAdicional;
import com.alojamientosturisticos.domain.CuentaBancaria;
import com.alojamientosturisticos.domain.Estado;
import com.alojamientosturisticos.domain.Imagen;
import com.alojamientosturisticos.domain.Publicacion;
import com.alojamientosturisticos.domain.ServiciosIncluidosAdicionales;
import com.alojamientosturisticos.domain.TipoAlojamiento;
import com.alojamientosturisticos.domain.Ubicacion;
import com.alojamientosturisticos.form.AlojamientoMegaForm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.validation.Valid;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RooWebScaffold(path = "alojamiento", automaticallyMaintainView = true, formBackingObject = Alojamiento.class)
@RequestMapping("/alojamiento/**")
@Controller
public class AlojamientoController {
    
    private static Logger logger = Logger.getLogger(AlojamientoController.class);
    
    @RequestMapping(value = "/alojamiento", method = RequestMethod.POST)
    public String create(
            @Valid AlojamientoMegaForm alojamientoMegaForm, 
            BindingResult result, 
            ModelMap modelMap) {
        if (alojamientoMegaForm == null) throw new IllegalArgumentException("A alojamiento is required");
        
        //Verificamos que el usuario seleccione una ubicacion existente, sino existe, le pedimos que la cree
        String nombreEstado = alojamientoMegaForm.getUbicacion().getNombre();
        String[] nombreEstadoSplitted = nombreEstado.split(", Estado");
        String nombreUbicacion = "";
        if(nombreEstadoSplitted.length>0)
            nombreUbicacion = nombreEstadoSplitted[0];
        String estadoUbicacion = "";
        if (nombreEstadoSplitted.length>1)        
            estadoUbicacion = nombreEstadoSplitted[1];
        
        List<Ubicacion> ubicaciones = Ubicacion.findAllUbicacions();
        Boolean huboResultado = false;
        Iterator ite = ubicaciones.iterator();
        while ((ite.hasNext())){
            Ubicacion laUbicacion = (Ubicacion)ite.next();
            //Verificamos que la ubicacion existe y seteamos la relacion
            if (((laUbicacion.getEstado().getNombre().trim()).equals(estadoUbicacion.trim()))&&((laUbicacion.getNombre().trim()).equals(nombreUbicacion.trim()))){
                alojamientoMegaForm.getAlojamiento().setUbicacion(laUbicacion);
                huboResultado=true;
                break;
            }else
            {
                huboResultado=false;
            }
        }
        if ((!huboResultado)&&(alojamientoMegaForm.getUbicacion().getEstado()==null))
            result.addError(new FieldError(result.getObjectName(), "ubicacion.nombre", "No se ha encontrado ninguna ubicacion con este nombre. À Desea crear una nueva ?"));
        
        //Validacion de nombre
        //Validamos que el nombre tenga mas de 3 caraceteres y menos de 255
        if ((alojamientoMegaForm.getAlojamiento().getNombre().length()<3)||((alojamientoMegaForm.getAlojamiento().getNombre().length()>255))){
            result.addError(new FieldError(result.getObjectName(), "alojamiento.nombre", "La longitud del nombre debe tener entre 3 y 255 caracteres"));
        }
        //Validamos que no existan dos alojamientos con el mismo nombre en la misma ubicacion
        String elNombreAlojamiento = alojamientoMegaForm.getAlojamiento().getNombre();
        List<Alojamiento> alojamientosByNombre = Alojamiento.findAlojamientoesByNombre(elNombreAlojamiento.trim()).getResultList();
        if(alojamientosByNombre.size()>0){
            Iterator it = alojamientosByNombre.iterator();
            while(it.hasNext()){
                Alojamiento elAlojamiento = (Alojamiento)it.next();
                if (elAlojamiento.getUbicacion().getNombre().equals(nombreUbicacion)){
                    result.addError(new FieldError(result.getObjectName(), "alojamiento.nombre", "Ya existe un alojamiento con este nombre en esta ubicacion"));
                }
            }
        }
        
        //Validacion de direccion
        if ((alojamientoMegaForm.getAlojamiento().getDireccion().length()<10)||(alojamientoMegaForm.getAlojamiento().getDireccion().length()>255)){
            result.addError(new FieldError(result.getObjectName(), "alojamiento.direccion", "La longitud de la direccion debe tener entre 10 y 255 caracteres"));
        }
        //Validacion de descripcion general
        if (alojamientoMegaForm.getAlojamiento().getDescripcionGeneral().length()>500){
            result.addError(new FieldError(result.getObjectName(), "alojamiento.descripcionGeneral", "La longitud maxima es de 500 caracteres"));
        }
        
        if (result.hasErrors()) {
            modelMap.addAttribute("alojamientoMegaForm", alojamientoMegaForm);
            List<ComodidadGeneral> comodidades = ComodidadGeneral.findAllComodidadGenerals();
            Collections.sort(comodidades, ComodidadGeneral.compararComodidadesGenerales);
            modelMap.addAttribute("comodidadgenerals", comodidades);
            modelMap.addAttribute("tipoalojamientoes", TipoAlojamiento.findAllTipoAlojamientoes());
            modelMap.addAttribute("ubicacions", Ubicacion.findAllUbicacions());
            modelMap.addAttribute("estadoes", Estado.findAllEstadoes());
            return "alojamiento/create";
        }
        
        alojamientoMegaForm.getAlojamiento().persist();
        
        if (alojamientoMegaForm.getUbicacion().getEstado()!=null){
            if(alojamientoMegaForm.getUbicacion().getNombre().length()<2){
                result.addError(new FieldError(result.getObjectName(), "ubicacion.nombre", "No se ha encontrado ninguna ubicacion con este nombre. À Desea crear una nueva ?"));
            }
            Ubicacion laNuevaUbicacion = new Ubicacion();
            laNuevaUbicacion.setNombre(alojamientoMegaForm.getUbicacion().getNombre());
            laNuevaUbicacion.setEstado(alojamientoMegaForm.getUbicacion().getEstado());
            laNuevaUbicacion.persist();
            alojamientoMegaForm.getAlojamiento().setUbicacion(laNuevaUbicacion);
            alojamientoMegaForm.getAlojamiento().merge();
        }
        
        if (result.hasErrors()) {
            modelMap.addAttribute("alojamientoMegaForm", alojamientoMegaForm);
            List<ComodidadGeneral> comodidades = ComodidadGeneral.findAllComodidadGenerals();
            Collections.sort(comodidades, ComodidadGeneral.compararComodidadesGenerales);
            modelMap.addAttribute("comodidadgenerals", comodidades);
            modelMap.addAttribute("tipoalojamientoes", TipoAlojamiento.findAllTipoAlojamientoes());
            modelMap.addAttribute("ubicacions", Ubicacion.findAllUbicacions());
            modelMap.addAttribute("estadoes", Estado.findAllEstadoes());
            modelMap.addAttribute("comodidadgeneraladicionals", ComodidadGeneralAdicional.findAllComodidadGeneralAdicionals());
            return "alojamiento/create";
        }
                
        //Agregamos las comodidades generales adicionales 
        if (alojamientoMegaForm.getAlojamiento().getComodidadesGeneralesAdicionalesTrans() != null){            
            String[] lasComodidadesNuevas = alojamientoMegaForm.getAlojamiento().getComodidadesGeneralesAdicionalesTrans().split(",");
            Set<ComodidadGeneralAdicional> comodidadesGeneralesAdicionales = new HashSet<ComodidadGeneralAdicional>();
            for (int i = 0; i < lasComodidadesNuevas.length; i++) {
                //Si el servicio no existe, lo creamos
                if (ComodidadGeneralAdicional.findComodidadGeneralAdicionalsByNombreLike(lasComodidadesNuevas[i]).getResultList().size() == 0) {
                    ComodidadGeneralAdicional elNuevoServicio = new ComodidadGeneralAdicional();
                    //TODO: setear la primera letra en Mayuscula
                    elNuevoServicio.setNombre(lasComodidadesNuevas[i]);
                    elNuevoServicio.persist();
                    comodidadesGeneralesAdicionales.add(elNuevoServicio);
                } //Si existe, solo lo relacionamos
                else {
                    //Verificamos que ya no este agregado en el list para no repetirlo
                    if (!comodidadesGeneralesAdicionales.equals((ComodidadGeneralAdicional) ComodidadGeneralAdicional.findComodidadGeneralAdicionalsByNombreLike(lasComodidadesNuevas[i]).getSingleResult())) {
                        comodidadesGeneralesAdicionales.add((ComodidadGeneralAdicional) ComodidadGeneralAdicional.findComodidadGeneralAdicionalsByNombreLike(lasComodidadesNuevas[i]).getSingleResult());
                    }
                }
            }
            alojamientoMegaForm.getAlojamiento().setComodidadesGeneralesAdicionales(comodidadesGeneralesAdicionales);
            alojamientoMegaForm.getAlojamiento().merge();
        }
        
        //return "redirect:/alojamiento/" + alojamientoMegaForm.getAlojamiento().getId();
        return "redirect:/alojamiento/registrarAlojamientoFotos/" + alojamientoMegaForm.getAlojamiento().getId();
    }
    
    @RequestMapping(value = "/alojamiento/form", method = RequestMethod.GET)
    public String createForm(
            ModelMap modelMap) {
        
        modelMap.addAttribute("alojamientoMegaForm", new AlojamientoMegaForm());
        List<ComodidadGeneral> comodidades = ComodidadGeneral.findAllComodidadGenerals();
        Collections.sort(comodidades, ComodidadGeneral.compararComodidadesGenerales);
        modelMap.addAttribute("comodidadgenerals", comodidades);
        modelMap.addAttribute("tipoalojamientoes", TipoAlojamiento.findAllTipoAlojamientoes());
        modelMap.addAttribute("ubicacions", Ubicacion.findAllUbicacions());
        modelMap.addAttribute("estadoes", Estado.findAllEstadoes());
        modelMap.addAttribute("comodidadgeneraladicionals", ComodidadGeneralAdicional.findAllComodidadGeneralAdicionals());
        return "alojamiento/create";
    }
    
    @RequestMapping(value = "/alojamiento/registrarAlojamientoFotos/{id}", method = RequestMethod.GET)
    public String registrarAlojamientoFotos(
            @PathVariable("id") Long id, 
            ModelMap modelMap
            ) {
        
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        Alojamiento alojamiento = Alojamiento.findAlojamiento(id);
        modelMap.addAttribute("alojamiento", alojamiento);
        modelMap.addAttribute("imagenes", Imagen.findImagensByAlojamiento(alojamiento).getResultList());
        
        return "alojamiento/registrarAlojamientoFotos";
    }
    
    @RequestMapping(value = "/alojamiento/mostrar", method = RequestMethod.GET)
    public String mostrar(
            @RequestParam("id") long id, 
            ModelMap modelMap
            ) {
        
        Alojamiento alojamiento = Alojamiento.findAlojamiento(id);
        modelMap.addAttribute("alojamiento", alojamiento);
        
        List<Imagen> imgs = Imagen.findImagensByAlojamiento(alojamiento).getResultList();
        
        ArrayList imagenes = new ArrayList();
        
        int contador = 0;
        
        for (int i = 0; i < imgs.size(); i++){
            contador = contador + 1;
            ArrayList imagen = new ArrayList();
            imagen.add(imgs.get(i).getId());
            imagen.add(imgs.get(i).getAlojamiento());
            imagen.add(imgs.get(i).getEsPrincipal());
            imagen.add("#" + String.valueOf(contador));
            imagenes.add(imagen);
        }
        
        
        modelMap.addAttribute("imagenes", imagenes);
        
        
        CuentaBancaria cuentaBancaria = (CuentaBancaria) CuentaBancaria.findCuentaBancariasByAlojamientoAndActiva(alojamiento, true).getSingleResult();
        modelMap.addAttribute("cuentaBancaria", cuentaBancaria);
        
        List<ComodidadGeneral> comodidades = alojamiento.getComodidadesGenerales();
        Collections.sort(comodidades, ComodidadGeneral.compararComodidadesGenerales);
        modelMap.addAttribute("comodidadgenerals", comodidades);
        
        
        return "alojamiento/mostrar";
    }
    
    @RequestMapping(value = "/alojamiento/panelDeControl", method = RequestMethod.GET)
    public String showPanelDeControl(
            @RequestParam("id") long id, 
            ModelMap modelMap
            ) {
        
        Alojamiento alojamiento = Alojamiento.findAlojamiento(id);
        modelMap.addAttribute("alojamiento", alojamiento);
        
        List<Publicacion> publicaciones = Publicacion.findPublicacionsByAlojamiento(alojamiento).getResultList();
        
        return "alojamiento/panelDeControl";
    }
    
}
