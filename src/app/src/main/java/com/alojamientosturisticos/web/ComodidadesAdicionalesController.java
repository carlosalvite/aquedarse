package com.alojamientosturisticos.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.ComodidadesAdicionales;
import com.alojamientosturisticos.domain.ServiciosIncluidosAdicionales;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "comodidadesadicionales", automaticallyMaintainView = true, formBackingObject = ComodidadesAdicionales.class)
@RequestMapping("/comodidadesadicionales/**")
@Controller
public class ComodidadesAdicionalesController {
	
private static Logger logger = Logger.getLogger(ComodidadesAdicionalesController.class);
    
    /**
     * Crea una nueva comodidad adicional
     * @param response
     * @param nombreComodidad
     * @param modelMap
     */
    /*@RequestMapping(value = "/comodidadesadicionales/crearcomodidadadicional", method = RequestMethod.GET)
    public void crearComodidadAdicional(
            HttpServletResponse response,
            @RequestParam("nombreComodidad") String nombreComodidad,
            ModelMap modelMap) {

        response.setContentType("application/json");
        PrintWriter out;
        
        ComodidadesAdicionales laNuevaComodidad = new ComodidadesAdicionales();
        
        //Validamos la longitud
        if((nombreComodidad.length()>100)||(nombreComodidad.length()<2)){
            try {
                out = response.getWriter();
                out.write("{\"mensajeError\": \"El nombre de la comodidad debe contener entre 2 y 100 caracteres \", \"error\": \"true\"}");
                out=null;
            } catch (IOException ex) {
                logger.error("Error escribiendo respuesta json en crearComodidadAdicional",ex);
            } 
        }
        //Validamos que no exista una comodidad similar
        else if(ComodidadesAdicionales.findComodidadesAdicionalesesByNombreLike(nombreComodidad).getResultList().size()>0){
            try {
                out = response.getWriter();
                out.write("{\"mensajeError\": \"Ya existe una comodidad similar a esta. Por favor verifique\", \"error\": \"true\"}");
                out=null;
            } catch (IOException ex) {
                logger.error("Error escribiendo respuesta json en crearComodidadAdicional",ex);
            } 
        }
        else {
        	laNuevaComodidad.setNombre(nombreComodidad);
        	laNuevaComodidad.persist();
            try {
                out = response.getWriter();
                out.write("{\"comodidadAdicional\": \"" +laNuevaComodidad.getNombre()+ "\", \"idComodidad\": \""+ laNuevaComodidad.getId() +"\", \"error\": \"false\"}");
                out=null;
            } catch (IOException ex) {
                logger.error("Error escribiendo respuesta json en crearComodidadAdicional",ex);
            }
        }
        
    }*/
}
