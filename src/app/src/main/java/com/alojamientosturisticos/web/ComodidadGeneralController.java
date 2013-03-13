package com.alojamientosturisticos.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.ComodidadGeneral;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RooWebScaffold(path = "comodidadgeneral", automaticallyMaintainView = true, formBackingObject = ComodidadGeneral.class)
@RequestMapping("/comodidadgeneral/**")
@Controller
public class ComodidadGeneralController {
    
    private static Logger logger = Logger.getLogger(ComodidadGeneralController.class);
    
    /*
     * Crea una nueva comodidad general via ajax
     */
    @RequestMapping(value = "/comodidadgeneral/crearasignarcomodidadgeneral", method = RequestMethod.GET)
    public void crearComodidadGeneral(
            HttpServletResponse response,
            @RequestParam("nombreComodidad") String nombreComodidad,
            ModelMap modelMap) {
 
        
        
        response.setContentType("application/json");
        PrintWriter out;
        
        ComodidadGeneral laNuevaComodidad = new ComodidadGeneral();
        
        //Validamos la longitud
        if((nombreComodidad.length()>100)||(nombreComodidad.length()<2)){
            try {
                out = response.getWriter();
                out.write("{\"mensajeError\": \"El nombre de la comodidad debe contener entre 2 y 100 caracteres \", \"error\": \"true\"}");
                out=null;
            } catch (IOException ex) {
                logger.error("Error escribiendo respuesta json en crearComodidadGeneral",ex);
            } 
        }
        //Validamos que no exista una comodidad similar
        else if(ComodidadGeneral.findComodidadGeneralsByNombreLike(nombreComodidad).getResultList().size()>0){
            try {
                out = response.getWriter();
                out.write("{\"mensajeError\": \"Ya existe una comodidad similar a esta. Por favor verifique\", \"error\": \"true\"}");
                out=null;
            } catch (IOException ex) {
                logger.error("Error escribiendo respuesta json en crearComodidadGeneral",ex);
            } 
        }
        else {
            laNuevaComodidad.setNombre(nombreComodidad);
            laNuevaComodidad.persist();
            try {
                out = response.getWriter();
                out.write("{\"comodidadGeneral\": \"" +laNuevaComodidad.getNombre()+ "\", \"idComodidad\": \""+ laNuevaComodidad.getId() +"\", \"error\": \"false\"}");
                out=null;
            } catch (IOException ex) {
                logger.error("Error escribiendo respuesta json en crearComodidadGeneral",ex);
            }
        }
        
    }
}
