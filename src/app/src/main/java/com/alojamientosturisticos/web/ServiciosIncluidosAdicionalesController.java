package com.alojamientosturisticos.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;

import com.alojamientosturisticos.domain.ComodidadGeneral;
import com.alojamientosturisticos.domain.ServiciosIncluidosAdicionales;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "serviciosincluidosadicionales", automaticallyMaintainView = true, formBackingObject = ServiciosIncluidosAdicionales.class)
@RequestMapping("/serviciosincluidosadicionales/**")
@Controller
public class ServiciosIncluidosAdicionalesController {

	private static Logger logger = Logger.getLogger(ServiciosIncluidosAdicionalesController.class);
    
    /**
     * Crea un nuevo servicio incluido adicional
     * @param response
     * @param nombreComodidad
     * @param modelMap
     */
   /*@RequestMapping(value = "/serviciosincluidosadicionales/crearservicioincluidoadicional", method = RequestMethod.GET)
    public void crearServicioIncluidoAdicional(
            HttpServletResponse response,
            @RequestParam("nombreServicio") String nombreServicio,
            ModelMap modelMap) {

        response.setContentType("application/json");
        PrintWriter out;
        
        ServiciosIncluidosAdicionales elNuevoServicio = new ServiciosIncluidosAdicionales();
        
        //Validamos la longitud
        if((nombreServicio.length()>100)||(nombreServicio.length()<2)){
            try {
                out = response.getWriter();
                out.write("{\"mensajeError\": \"El nombre del servicio debe contener entre 2 y 100 caracteres \", \"error\": \"true\"}");
                out=null;
            } catch (IOException ex) {
                logger.error("Error escribiendo respuesta json en crearServicioIncluidoAdicional",ex);
            } 
        }
        //Validamos que no exista una comodidad similar
        else if(ServiciosIncluidosAdicionales.findServiciosIncluidosAdicionalesesByNombreLike(nombreServicio).getResultList().size()>0){
            try {
                out = response.getWriter();
                out.write("{\"mensajeError\": \"Ya existe un servicio similar a este. Por favor verifique\", \"error\": \"true\"}");
                out=null;
            } catch (IOException ex) {
                logger.error("Error escribiendo respuesta json en crearServicioIncluidoAdicional",ex);
            } 
        }
        else {
        	elNuevoServicio.setNombre(nombreServicio);
        	elNuevoServicio.persist();
            try {
                out = response.getWriter();
                out.write("{\"servicioAdicional\": \"" +elNuevoServicio.getNombre()+ "\", \"idServicio\": \""+ elNuevoServicio.getId() +"\", \"error\": \"false\"}");
                out=null;
            } catch (IOException ex) {
                logger.error("Error escribiendo respuesta json en crearServicioIncluidoAdicional",ex);
            }
        }
        
    }*/
}
