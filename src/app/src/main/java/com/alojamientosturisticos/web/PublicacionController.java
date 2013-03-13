package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.Comodidades;
import com.alojamientosturisticos.domain.Configuracion;
import com.alojamientosturisticos.domain.FechaTemporadaAlta;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;

import com.alojamientosturisticos.domain.Alojamiento;
import com.alojamientosturisticos.domain.ComodidadesAdicionales;
import com.alojamientosturisticos.domain.Publicacion;
import com.alojamientosturisticos.domain.ServiciosIncluidos;
import com.alojamientosturisticos.domain.ServiciosIncluidosAdicionales;
import com.alojamientosturisticos.domain.TipoHabitacion;
import com.alojamientosturisticos.domain.TipoTarifa;
import com.alojamientosturisticos.util.Util;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.bind.annotation.SessionAttributes;

@RooWebScaffold(path = "publicacion", automaticallyMaintainView = true, formBackingObject = Publicacion.class)
@RequestMapping("/publicacion/**")
@SessionAttributes({"publicacion"})
@Controller
public class PublicacionController {
    
    private final static Logger logger = Logger.getLogger(PublicacionController.class);
    
    /**
     * Valida las fechas asignadas y transforma a formato ingles para que el multidatepicker funcione correctamente.
     * Se ejecuta via ajax.
     * @param response
     * @param fechaDesde
     * @param fechaHasta
     * @return 
     */
    @RequestMapping(value = "/publicacion/asignarFechaDesde", method = RequestMethod.GET)
    public String asignarFechaDesde(
            HttpServletResponse response,
            @RequestParam("fechaDesde") String fechaDesde,
            @RequestParam(required=false,value="fechaHastaX") String fechaHasta) {
       
        response.setContentType("application/json");
        PrintWriter out;
        
        //TODO: Lanzar excepcion cuando no se encuentra la clave
        Integer diasMinimos = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.diasMinimos").getSingleResult()).getValor());
        Integer diasMaximos = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.diasMaximos").getSingleResult()).getValor());
        
        
        //Validamos que la fecha no sea anterior a la fecha actual
        if(Util.stringToDate(fechaDesde).before(Util.getFechaActualSinHora())){
            try {
                out = response.getWriter();
                out.write("{\"error\":\"true\",\"mensajeError\":\"Esta fecha no puede ser anterior a la fecha actual\"}");
                out=null;
            } catch (IOException ex) {
                logger.error("Error escribiendo respuesta json en el response en asignarFechaDesde",ex);
            }
        }
        else if (fechaHasta.length()>0){
            //Validamos que el lapso de vigencia cumpla con los dias minimos
            if (Util.getNumeroDiasEntreFechas(Util.stringToDate(fechaDesde), Util.stringToDate(fechaHasta))<diasMinimos){
                try {
                    out = response.getWriter();
                    out.write("{\"error\":\"true\",\"mensajeError\":\"La vigencia de la publicacion tiene que ser por lo menos de "+diasMinimos+" dias\"}");
                    out=null;
                } catch (IOException ex) {
                    logger.error("Error escribiendo respuesta json en el response en asignarFechaDesde",ex);
                }
            }
            //Validamos que el lapso de vigencia cumpla con los dias maximos
            else if (Util.getNumeroDiasEntreFechas(Util.stringToDate(fechaDesde), Util.stringToDate(fechaHasta))>diasMaximos){
                try {
                    out = response.getWriter();
                    out.write("{\"error\":\"true\",\"mensajeError\":\"La vigencia de la publicacion no puede ser de mas de "+diasMaximos+" dias\"}");
                    out=null;
                } catch (IOException ex) {
                    logger.error("Error escribiendo respuesta json en el response en asignarFechaDesde",ex);
                }
            }
            //Si hay una fecha hasta asignada, verificamos que la fecha desde no sea mayor a la fecha hasta
            else if(Util.stringToDate(fechaDesde).after(Util.stringToDate(fechaHasta))){
                try {
                    out = response.getWriter();
                    out.write("{\"error\":\"true\",\"mensajeError\":\"Esta fecha no puede ser posterior a la fecha en la que finaliza la disponibilidad\"}");
                    out=null;
                } catch (IOException ex) {
                    logger.error("Error escribiendo respuesta json en el response en asignarFechaDesde",ex);
                }
            }
            //No se encontro ningun error, retornamos la fecha en formato ingles para el widget multidatepicker
            else{
                try {
                    out = response.getWriter();
                    out.write("{\"fechaDesdeEnglish\":\""+Util.formatSpanishToEnglish(fechaDesde)+"\"}");
                    out=null;
                } catch (IOException ex) {
                    logger.error("Error escribiendo respuesta json en el response en asignarFechaDesde",ex);
                }
            }
        }
        else{
            try {
                out = response.getWriter();
                out.write("{\"fechaDesdeEnglish\":\""+Util.formatSpanishToEnglish(fechaDesde)+"\"}");
                out=null;
            } catch (IOException ex) {
                logger.error("Error escribiendo respuesta json en el response en asignarFechaDesde",ex);
            }
        }
        
        return null;
    }
    
    /**
     * Valida las fechas asignadas y transforma a formato ingles para que el multidatepicker funcione correctamente
     * @param response
     * @param fechaHasta
     * @param fechaDesde
     * @return 
     */
    @RequestMapping(value = "/publicacion/asignarFechaHasta", method = RequestMethod.GET)
    public String asignarFechaHasta(
            HttpServletResponse response,
            @RequestParam("fechaHasta") String fechaHasta,
            @RequestParam(required=false,value="fechaDesdeX") String fechaDesde) {
       
              
        response.setContentType("application/json");
        PrintWriter out;
        
        //TODO: Lanzar excepcion cuando no se encuentra la clave
        Integer diasMinimos = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.diasMinimos").getSingleResult()).getValor());
        Integer diasMaximos = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.diasMaximos").getSingleResult()).getValor());
        
        //Validamos que la fecha no sea anterior a la fecha actual
        if(Util.stringToDate(fechaHasta).before(Util.getFechaActualSinHora())){
            try {
                out = response.getWriter();
                out.write("{\"error\":\"true\",\"mensajeError\":\"Esta fecha no puede ser anterior a la fecha actual\"}");
                out=null;
            } catch (IOException ex) {
                logger.error("Error escribiendo respuesta json en el response en asignarFechaHasta",ex);
            }
        }
        //Si hay una fecha desde asignada, verificamos que la fecha hasta no sea menor a la fecha desde
        else if (fechaDesde.length()>0){
            if(Util.stringToDate(fechaHasta).before(Util.stringToDate(fechaDesde))){
                try {
                    out = response.getWriter();
                    out.write("{\"error\":\"true\",\"mensajeError\":\"Esta fecha no puede ser anterior a la fecha de inicio de la disponibilidad\"}");
                    out=null;
                } catch (IOException ex) {
                    logger.error("Error escribiendo respuesta json en el response en asignarFechaHasta",ex);
                }
            }
            //Validamos que el lapso de vigencia cumpla con los dias minimos
            else if (Util.getNumeroDiasEntreFechas(Util.stringToDate(fechaDesde), Util.stringToDate(fechaHasta))<diasMinimos){
                try {
                    out = response.getWriter();
                    out.write("{\"error\":\"true\",\"mensajeError\":\"La vigencia de la publicacion tiene que ser por lo menos de "+diasMinimos+" dias\"}");
                    out=null;
                } catch (IOException ex) {
                    logger.error("Error escribiendo respuesta json en el response en asignarFechaHasta",ex);
                }
            }
            //Validamos que el lapso de vigencia cumpla con los dias maximos
            else if (Util.getNumeroDiasEntreFechas(Util.stringToDate(fechaDesde), Util.stringToDate(fechaHasta))>diasMaximos){
                try {
                    out = response.getWriter();
                    out.write("{\"error\":\"true\",\"mensajeError\":\"La vigencia de la publicacion no puede ser de mas de "+diasMaximos+" dias\"}");
                    out=null;
                } catch (IOException ex) {
                    logger.error("Error escribiendo respuesta json en el response en asignarFechaHasta",ex);
                }
            }
            //No se encontro ningun error, retornamos la fecha en formato ingles para el widget multidatepicker
            else{
                try {
                    out = response.getWriter();
                    out.write("{\"fechaHastaEnglish\":\""+Util.formatSpanishToEnglish(fechaHasta)+"\"}");
                    out=null;
                } catch (IOException ex) {
                    logger.error("Error escribiendo respuesta json en el response en asignarFechaHasta",ex);
                }
            }
            
        }
        //No se encontro ningun error, retornamos la fecha en formato ingles para el widget multidatepicker
        else{
            try {
                out = response.getWriter();
                out.write("{\"fechaHastaEnglish\":\""+Util.formatSpanishToEnglish(fechaHasta)+"\"}");
                out=null;
            } catch (IOException ex) {
                logger.error("Error escribiendo respuesta json en el response en asignarFechaHasta",ex);
            }
        }
        return null;
    }
    
    @RequestMapping(value = "/publicacion/registrarpublicacion", method = RequestMethod.POST)
    public String registrarPublicacion(
            @RequestParam("fechasTemporadaAltaArray") String fechasTemporadaAlta,
            @Valid @ModelAttribute("publicacion") Publicacion publicacion,
            BindingResult result, 
            ModelMap modelMap,
            SessionStatus status) {
        if (publicacion == null) throw new IllegalArgumentException("A publicacion is required");
        
        
        //TODO: validaciones
        
        //Validamos la cantidad de habitaciones disponibles
        Configuracion minHabConf = (Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroHabitacionesMin").getSingleResult();
        Integer minHab = Integer.parseInt(minHabConf.getValor());
        Configuracion maxHabConf = (Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroHabitacionesMax").getSingleResult();
        Integer maxHab = Integer.parseInt(maxHabConf.getValor());
        if (publicacion.getHabitacionesDisponibles()!=null){
	        if ((maxHab<publicacion.getHabitacionesDisponibles())||(publicacion.getHabitacionesDisponibles()<minHab)){
	        	result.addError(new FieldError(result.getObjectName(), "habitacionesDisponibles", "Numero de habitaciones invalido"));
	        }
        }
        
        //Validamos el minimo de noches por reservacion
        Configuracion minMinNochesConf = (Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroNochesMinMin").getSingleResult();
        Integer minMinNoches = Integer.parseInt(minMinNochesConf.getValor());
        Configuracion minMaxNochesConf = (Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroNochesMinMax").getSingleResult();
        Integer minMaxNoches = Integer.parseInt(minMaxNochesConf.getValor());
        if (publicacion.getMinimoNoches()!=null){
        	if ((minMaxNoches<publicacion.getMinimoNoches())||(publicacion.getMinimoNoches()<minMinNoches)){
        		result.addError(new FieldError(result.getObjectName(), "minimoNoches", "Minimo de noches invalido"));
        	}
        }
        
        //Validamos el maximo de noches por reservacion
        Configuracion maxMinNochesConf = (Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroNochesMaxMin").getSingleResult();
        Integer maxMinNoches = Integer.parseInt(maxMinNochesConf.getValor());
        Configuracion maxMaxNochesConf = (Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroNochesMaxMax").getSingleResult();
        Integer maxMaxNoches = Integer.parseInt(maxMaxNochesConf.getValor());
        if (publicacion.getMaximoNoches()!=null){
        	if ((maxMaxNoches<publicacion.getMaximoNoches())||(publicacion.getMaximoNoches()<maxMinNoches)){
        		result.addError(new FieldError(result.getObjectName(), "maximoNoches", "Maximo de noches invalido"));
        	}
        }
        
        //Validamos que el minimo de noches no sea mayor que el maximo de noches
        if ((publicacion.getMaximoNoches()!=null)&&(publicacion.getMinimoNoches()!=null)){
        	if (publicacion.getMinimoNoches()>publicacion.getMaximoNoches()){
        		result.addError(new FieldError(result.getObjectName(), "minimoNoches", "El minimo de noches no puede ser mayor al maximo de noches"));	
        	}
        }
        
        //Preparamos el campo tarifa baja para guardarlo en la bd
        if (publicacion.getTarifaTemporadaBajaStr().trim().length()>1){
        	String[] tarifaTemporadaBajaStr = publicacion.getTarifaTemporadaBajaStr().split("BsF");
        	String tarifaTempEngStr = tarifaTemporadaBajaStr[1].replace(".", "");
        	publicacion.setTarifaTemporadaBaja(Double.parseDouble(tarifaTempEngStr.replace(",",".")));
        }else{
        	result.addError(new FieldError(result.getObjectName(), "tarifaTemporadaBajaStr", "Campo obligatorio"));
        }
        
        //Preparamos el campo tarifa alta para guardarlo en la bd
        if (publicacion.getTarifaTemporadaAltaStr().trim().length()>1){
        	String[] tarifaTemporadaAltaStr = publicacion.getTarifaTemporadaAltaStr().split("BsF");
        	String tarifaTempEngStr = tarifaTemporadaAltaStr[1].replace(".", "");
        	publicacion.setTarifaTemporadaAlta(Double.parseDouble(tarifaTempEngStr.replace(",",".")));
        }else{
        	if(publicacion.getTemporadas()){
        		result.addError(new FieldError(result.getObjectName(), "tarifaTemporadaAltaStr", "Campo obligatorio"));
        	}
        }

        //Validamos que se seleccione por lo menos una fecha de temporada alta si aplica
        List lasFechasArrayTest =  Arrays.asList(fechasTemporadaAlta.split(","));
        if(publicacion.getTemporadas()){
	        if (lasFechasArrayTest.size()==1){
	        	result.addError(new ObjectError("publicacion", "Debe seleccionar en el calendario los d’as de temporada alta"));
	        }
        }
        
        //Validamos si el tipo de habitacion seleccionado es id=1, lo que quiere decir que el usuario debe seleccionar una opcion
        //Esto es necesario porque sino el widget no funciona bien cuando se le coloca una opcion nula que diga "seleccionar"
        /*if(publicacion.getTipoHabitacion().getId()==1){
        	result.addError(new FieldError(result.getObjectName(), "tipoHabitacion", "Campo obligatorio"));
        }*/
       
        
        
        if (result.hasErrors()) {
            modelMap.addAttribute("publicacion", publicacion);
            modelMap.addAttribute("comodidadeses", Comodidades.findAllComodidadeses());
            modelMap.addAttribute("serviciosincluidoses", ServiciosIncluidos.findAllServiciosIncluidoses());
            modelMap.addAttribute("tipohabitacions", TipoHabitacion.findAllTipoHabitacions());
            modelMap.addAttribute("tipotarifas", TipoTarifa.findAllTipoTarifas());
            logger.debug("errores2 " + result.toString());
            
            //Buscamos el porcentaje de comision a aplicar
            //Verificamos si el hospedaje puede tener algun porcentaje especial 
            //TODO:
            //Si no tiene porcentaje especial, aplicamos el default
            Integer comisionDefault = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.porcentajeComisionDefault").getSingleResult()).getValor());
            modelMap.addAttribute("comisionAplicar", comisionDefault);
            
            //Construimos el list de numeros para el campo cantidadPersonas
            Integer cantidadPersonasMin = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.cantidadPersonasMin").getSingleResult()).getValor());
            Integer cantidadPersonasMax = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.cantidadPersonasMax").getSingleResult()).getValor());
            List <Integer> cantidadPersonas = new ArrayList<Integer>();
            for (int i=cantidadPersonasMin; i <= cantidadPersonasMax; i++ ){
            	cantidadPersonas.add(i);
            }
            modelMap.addAttribute("cantidadPersonasList",cantidadPersonas);
            
            //Construimos el list de numeros para el campo habitacionesDisponibles
            Integer habitacionesMin = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroHabitacionesMin").getSingleResult()).getValor());
            Integer habitacionesMax = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroHabitacionesMax").getSingleResult()).getValor());
            List <Integer> cantidadHabitaciones = new ArrayList<Integer>();
            for (int i=habitacionesMin; i <= habitacionesMax; i++ ){
            	cantidadHabitaciones.add(i);
            }
            modelMap.addAttribute("cantidadHabitacionesList",cantidadHabitaciones);
            
            //Construimos el list de numeros para el campo minimoNoches
            Integer minimoNochesMin = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroNochesMinMin").getSingleResult()).getValor());
            Integer maximoNochesMin = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroNochesMinMax").getSingleResult()).getValor());
            List <Integer> cantidadNochesMin = new ArrayList<Integer>();
            for (int i=minimoNochesMin; i <= maximoNochesMin; i++ ){
            	cantidadNochesMin.add(i);
            }
            modelMap.addAttribute("cantidadNochesMinList",cantidadNochesMin);
            
            //Construimos el list de numeros para el campo maximoNoches
            Integer minimoNochesMax = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroNochesMaxMin").getSingleResult()).getValor());
            Integer maximoNochesMax = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroNochesMaxMax").getSingleResult()).getValor());
            List <Integer> cantidadNochesMax = new ArrayList<Integer>();
            for (int i=minimoNochesMax; i <= maximoNochesMax; i++ ){
            	cantidadNochesMax.add(i);
            }
            modelMap.addAttribute("cantidadNochesMaxList",cantidadNochesMax);
            
            return "publicacion/registrarPublicacion";
        };
        
        
        publicacion.persist();
        
        //Agregamos los servicios adicionales 
        Set<ServiciosIncluidosAdicionales> serviciosIncluidosAdicionales = new HashSet<ServiciosIncluidosAdicionales>();
        if (publicacion.getServiciosIncluidosAdicionalesTrans()!=null){
	        String[] losServiciosNuevos = publicacion.getServiciosIncluidosAdicionalesTrans().split(",");
	        for (int i=0; i< losServiciosNuevos.length; i++ ){
	        	//Si el servicio no existe, lo creamos
	        	if(ServiciosIncluidosAdicionales.findServiciosIncluidosAdicionalesesByNombreLike(losServiciosNuevos[i]).getResultList().size()==0){
	        		ServiciosIncluidosAdicionales elNuevoServicio = new ServiciosIncluidosAdicionales();
	        		//TODO: setear la primera letra en Mayuscula
	        		elNuevoServicio.setNombre(losServiciosNuevos[i]);
	        		elNuevoServicio.persist();
	        		serviciosIncluidosAdicionales.add(elNuevoServicio);
	        	}
	        	//Si existe, solo lo relacionamos
	        	else{
	        		//Verificamos que ya no este agregado en el list para no repetirlo
	        		if (!serviciosIncluidosAdicionales.equals((ServiciosIncluidosAdicionales)ServiciosIncluidosAdicionales.findServiciosIncluidosAdicionalesesByNombreLike(losServiciosNuevos[i]).getSingleResult()))
	        			serviciosIncluidosAdicionales.add((ServiciosIncluidosAdicionales)ServiciosIncluidosAdicionales.findServiciosIncluidosAdicionalesesByNombreLike(losServiciosNuevos[i]).getSingleResult());
	        	}
	        }
        }
        
        //Agregamos las comodidades adicionales 
        Set<ComodidadesAdicionales> comodidadesAdicionales = new HashSet<ComodidadesAdicionales>();
        if (publicacion.getComodidadesAdicionalesTrans()!=null){
        	String[] lasComodidadesNuevas = publicacion.getComodidadesAdicionalesTrans().split(",");
	        for (int i=0; i< lasComodidadesNuevas.length; i++ ){
	        	//Si el servicio no existe, lo creamos
	        	if(ComodidadesAdicionales.findComodidadesAdicionalesesByNombreLike(lasComodidadesNuevas[i]).getResultList().size()==0){
	        		ComodidadesAdicionales laNuevaComodidad = new ComodidadesAdicionales();
	        		//TODO: setear la primera letra en Mayuscula
	        		laNuevaComodidad.setNombre(lasComodidadesNuevas[i]);
	        		laNuevaComodidad.persist();
	        		comodidadesAdicionales.add(laNuevaComodidad);
	        	}
	        	//Si existe, solo lo relacionamos
	        	else{
	        		//Verificamos que ya no este agregado en el list para no repetirlo
	        		if (!comodidadesAdicionales.equals((ComodidadesAdicionales)ComodidadesAdicionales.findComodidadesAdicionalesesByNombreLike(lasComodidadesNuevas[i]).getSingleResult()))
	        			comodidadesAdicionales.add((ComodidadesAdicionales)ComodidadesAdicionales.findComodidadesAdicionalesesByNombreLike(lasComodidadesNuevas[i]).getSingleResult());
	        	}
	        }
        }
        publicacion.setComodidadesAdicionales(comodidadesAdicionales);
        publicacion.setServiciosIncluidosAdicionales(serviciosIncluidosAdicionales);
        publicacion.merge();
        
        if (publicacion.getTemporadas()){
            //Seteamos las fechas de la temporada alta
            List lasFechasArray =  Arrays.asList(fechasTemporadaAlta.split(","));
            //Validamos que se seleccione por lo menos una fecha para temporada alta
            if (lasFechasArray.size()>0){
	            Iterator ite = lasFechasArray.iterator();
	            while(ite.hasNext()){
	                Date laFechaTemporadaAlta = Util.stringToDate((String)ite.next());
	                //Creamos la fecha, pero primero buscamos si ya existe. Sino existe, la creamos
	                if(FechaTemporadaAlta.findFechaTemporadaAltasByFecha(laFechaTemporadaAlta).getResultList().size()>0){
	                    Set <FechaTemporadaAlta> lasFechasTemporadaAltaSet = publicacion.getFechasTemporadaAlta();
	                    lasFechasTemporadaAltaSet.add((FechaTemporadaAlta)FechaTemporadaAlta.findFechaTemporadaAltasByFecha(laFechaTemporadaAlta).getSingleResult());
	                    publicacion.setFechasTemporadaAlta(lasFechasTemporadaAltaSet);
	                    publicacion.merge();
	                }else{
	                    FechaTemporadaAlta laNuevaFechaTemporadaAlta = new FechaTemporadaAlta();
	                    laNuevaFechaTemporadaAlta.setFecha(laFechaTemporadaAlta);
	                    laNuevaFechaTemporadaAlta.persist();
	                    laNuevaFechaTemporadaAlta = (FechaTemporadaAlta)FechaTemporadaAlta.findFechaTemporadaAltasByFecha(laFechaTemporadaAlta).getSingleResult();
	                    Set <FechaTemporadaAlta> lasFechasTemporadaAltaSet = publicacion.getFechasTemporadaAlta();
	                    lasFechasTemporadaAltaSet.add(laNuevaFechaTemporadaAlta);
	                    publicacion.setFechasTemporadaAlta(lasFechasTemporadaAltaSet);
	                    publicacion.merge();
	                }
	            }
            }
        }
        return "redirect:/publicacion/consultarPublicacionPropietario" + publicacion.getId();
    }
    
    @RequestMapping(value = "/publicacion/registrarpublicacionform", method = RequestMethod.GET)
    public String registrarPublicacionForm(
    		@RequestParam ("idAlojamiento") Long idAlojamiento,
    		ModelMap modelMap) {
        
    	Publicacion laPublicacion = new Publicacion();
    	
    	Alojamiento elAlojamiento = Alojamiento.findAlojamiento(idAlojamiento);
    	
    	laPublicacion.setAlojamiento(elAlojamiento);
    	
    	modelMap.addAttribute("nombreAlojamiento", elAlojamiento.getNombre());
    	modelMap.addAttribute("publicacion", laPublicacion);
        modelMap.addAttribute("comodidadeses", Comodidades.findAllComodidadeses());
        modelMap.addAttribute("fechatemporadaaltas", FechaTemporadaAlta.findAllFechaTemporadaAltas());
        modelMap.addAttribute("serviciosincluidoses", ServiciosIncluidos.findAllServiciosIncluidoses());
        modelMap.addAttribute("tipohabitacions", TipoHabitacion.findAllTipoHabitacions());
        modelMap.addAttribute("tipotarifas", TipoTarifa.findAllTipoTarifas());
        modelMap.addAttribute("serviciosincluidosadicionaleses", ServiciosIncluidosAdicionales.findAllServiciosIncluidosAdicionaleses());
        modelMap.addAttribute("comodidadesadicionaleses", ComodidadesAdicionales.findAllComodidadesAdicionaleses());
        //Buscamos el porcentaje de comision a aplicar
        //Verificamos si el hospedaje puede tener algun porcentaje especial 
        //TODO:
        //Si no tiene porcentaje especial, aplicamos el default
        //Integer comisionDefault = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.porcentajeComisionDefault").getSingleResult()).getValor());
       // modelMap.addAttribute("comisionAplicar", comisionDefault);
        
        //Construimos el list de numeros para el campo cantidadPersonas
        Integer cantidadPersonasMin = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.cantidadPersonasMin").getSingleResult()).getValor());
        Integer cantidadPersonasMax = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.cantidadPersonasMax").getSingleResult()).getValor());
        List <Integer> cantidadPersonas = new ArrayList<Integer>();
        for (int i=cantidadPersonasMin; i <= cantidadPersonasMax; i++ ){
        	cantidadPersonas.add(i);
        }
        modelMap.addAttribute("cantidadPersonasList",cantidadPersonas);
        
        //Construimos el list de numeros para el campo habitacionesDisponibles
        Integer habitacionesMin = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroHabitacionesMin").getSingleResult()).getValor());
        Integer habitacionesMax = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroHabitacionesMax").getSingleResult()).getValor());
        List <Integer> cantidadHabitaciones = new ArrayList<Integer>();
        for (int i=habitacionesMin; i <= habitacionesMax; i++ ){
        	cantidadHabitaciones.add(i);
        }
        modelMap.addAttribute("cantidadHabitacionesList",cantidadHabitaciones);
        
        //Construimos el list de numeros para el campo minimoNoches
        Integer minimoNochesMin = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroNochesMinMin").getSingleResult()).getValor());
        Integer maximoNochesMin = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroNochesMinMax").getSingleResult()).getValor());
        List <Integer> cantidadNochesMin = new ArrayList<Integer>();
        for (int i=minimoNochesMin; i <= maximoNochesMin; i++ ){
        	cantidadNochesMin.add(i);
        }
        modelMap.addAttribute("cantidadNochesMinList",cantidadNochesMin);
        
        //Construimos el list de numeros para el campo maximoNoches
        Integer minimoNochesMax = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroNochesMaxMin").getSingleResult()).getValor());
        Integer maximoNochesMax = Integer.parseInt(((Configuracion)Configuracion.findConfiguracionsByClave("publicacion.numeroNochesMaxMax").getSingleResult()).getValor());
        List <Integer> cantidadNochesMax = new ArrayList<Integer>();
        for (int i=minimoNochesMax; i <= maximoNochesMax; i++ ){
        	cantidadNochesMax.add(i);
        }
        modelMap.addAttribute("cantidadNochesMaxList",cantidadNochesMax);
        
        return "publicacion/registrarPublicacion";
    }
    
    /**
     * Permite consultar la publicacion registrada por el propietario
     * @param id
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/publicacion/consultarPublicacionPropietario{id}", method = RequestMethod.GET)
    public String consultarPublicacionPropietario(
    		@PathVariable("id") Long id, 
    		ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("publicacion_horaCheckOut_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("-S", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_fechaDesde_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_fechaHasta_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_horaCheckIn_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("-S", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        Publicacion laPublicacion = Publicacion.findPublicacion(id);
        modelMap.addAttribute("publicacion", laPublicacion);
        
        //Buscamos las fechas de temporada alta y las metemos en un arreglo de String para mostrarlas en el calendario (multidatepicker)
        
        Set<FechaTemporadaAlta> fechasTemporadaAlta = laPublicacion.getFechasTemporadaAlta();
        Iterator it = fechasTemporadaAlta.iterator();
        String lasFechas = "";
        Integer i = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        while (it.hasNext()){
        	FechaTemporadaAlta laFecha = (FechaTemporadaAlta)it.next();
        	Date laFechaDate = laFecha.getFecha();
        	
        	if (i==0)
        		lasFechas = "\""+ sdf.format(laFechaDate).toString() + "\"";
        	else 
        		lasFechas = lasFechas  +  "," +  "\""+ sdf.format(laFechaDate).toString() + "\"";
        	
        	i = i+1;
        }
        modelMap.addAttribute("fechasTemporadaAlta",lasFechas);
        
        //Mandamos las fechas desde y hasta formateadas para que el calendario las entienda
        modelMap.addAttribute("fechaDesde","\""+sdf.format(laPublicacion.getFechaDesde())+"\"");
        modelMap.addAttribute("fechaHasta","\""+sdf.format(laPublicacion.getFechaHasta())+"\"");
        
        Double laTarifaTotalBaja = Util.tarifaTotal(laPublicacion.getTipoTarifa().getId(), laPublicacion.getTarifaTemporadaBaja(), laPublicacion.getMinimoNoches(), laPublicacion.getCantidadPersonas());
        modelMap.addAttribute("totalTarifaBaja", laTarifaTotalBaja);
        
        Double laComisionBaja = Util.comision(laTarifaTotalBaja);
        modelMap.addAttribute("comisionBaja", laComisionBaja);
        
        Double elPvpBaja = Util.pvp(laTarifaTotalBaja, laComisionBaja);
        modelMap.addAttribute("pvpBaja",elPvpBaja);
        
        Double comisionPlataformaBaja = Util.comisionPlataforma(laTarifaTotalBaja);
        modelMap.addAttribute("comisionPlataformaBaja",comisionPlataformaBaja);
        
        Double pagoAlojamientoBaja = Util.pagoAlojamiento(laTarifaTotalBaja, comisionPlataformaBaja);
        modelMap.addAttribute("pagoAlojamientoBaja",pagoAlojamientoBaja);
        
        if (laPublicacion.getTemporadas()==true){
        	Double laTarifaTotalAlta = Util.tarifaTotal(laPublicacion.getTipoTarifa().getId(), laPublicacion.getTarifaTemporadaAlta(), laPublicacion.getMinimoNoches(), laPublicacion.getCantidadPersonas());
            modelMap.addAttribute("totalTarifaAlta", laTarifaTotalAlta);
            
            Double laComisionAlta = Util.comision(laTarifaTotalAlta);
            modelMap.addAttribute("comisionAlta", laComisionAlta);
            
            Double elPvpAlta = Util.pvp(laTarifaTotalAlta, laComisionAlta);
            modelMap.addAttribute("pvpAlta",elPvpAlta);
            
            Double comisionPlataformaAlta = Util.comisionPlataforma(laTarifaTotalAlta);
            modelMap.addAttribute("comisionPlataformaAlta",comisionPlataformaAlta);
            
            Double pagoAlojamientoAlta = Util.pagoAlojamiento(laTarifaTotalAlta, comisionPlataformaAlta);
            modelMap.addAttribute("pagoAlojamientoAlta",pagoAlojamientoAlta);
        }
        
        return "publicacion/consultarPublicacionPropietario";
    }
    
    @RequestMapping(value = "/publicacion/listarPublicacionesPropietario", method = RequestMethod.GET)
    public String listarPublicacionesPropietario( 
    		@RequestParam ("idAlojamiento") Long idAlojamiento,
    		ModelMap modelMap) {
        
    	Alojamiento elAlojamiento = Alojamiento.findAlojamiento(idAlojamiento);
    	
    	List <Publicacion> lasPublicaciones = Publicacion.findPublicacionsByAlojamiento(elAlojamiento).getResultList();
    	modelMap.addAttribute("lasPublicaciones", lasPublicaciones);
    	
    	return "publicacion/listarPublicacionesPropietario";
    }
    
    @RequestMapping(value = "/publicacion/calcularMontosAjax", method = RequestMethod.GET)
    public String calcularMontosAjax(
            HttpServletResponse response,
            @RequestParam("tipoTarifaId") Long tipoTarifaId,
            @RequestParam("tarifa") String tarifaStr,
            @RequestParam("noches") Integer noches,
            @RequestParam("personas") Integer personas
            ) {

    	//Cambiamos la tarifa de formato es-VE a en-US para poder calcular
    	//TODO: en un futuro, obtener el simbolo de la moneda dependiendo del pais
    	String[] tarifaArrayStr = tarifaStr.split("BsF");
    	String tarifaTempStr = tarifaArrayStr[1].replace(".", "");
    	Double tarifa = Double.parseDouble(tarifaTempStr.replace(",","."));

    	Double tarifaTotal = Util.tarifaTotal(tipoTarifaId, tarifa, noches, personas);

        Double comisionTotalAquedarse = Util.comision(tarifaTotal);
     
        Double pvp = Util.pvp(tarifaTotal, comisionTotalAquedarse);
  
        Double comisionTotalPagoElectronico = Util.comisionPlataforma(tarifaTotal);
 
        Double pagoTotalHospedaje = Util.pagoAlojamiento(tarifaTotal, comisionTotalPagoElectronico);
        
    	
        response.setContentType("application/json");
        PrintWriter out;
    
        try {
            out = response.getWriter();
            out.write("{\"tarifaTotal\":\""+tarifaTotal+"\",\"comisionTotalAquedarse\":\""+comisionTotalAquedarse+"\",\"pvp\":\""+pvp+"\",\"comisionTotalPagoElectronico\":\""+comisionTotalPagoElectronico+"\",\"pagoTotalHospedaje\":\""+pagoTotalHospedaje+"\"}");
            out=null;
        } catch (IOException ex) {
            logger.error("Error escribiendo respuesta json en el response en calcularMontosAjax",ex);
        }
        
        
        return null;
    }
    
   
}
