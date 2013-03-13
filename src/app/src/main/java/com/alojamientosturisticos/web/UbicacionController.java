package com.alojamientosturisticos.web;

import java.io.IOException;
import java.util.logging.Level;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.Ubicacion;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RooWebScaffold(path = "ubicacion", automaticallyMaintainView = true, formBackingObject = Ubicacion.class)
@RequestMapping("/ubicacion/**")
@Controller
public class UbicacionController {
    
    private static Logger logger = Logger.getLogger(UbicacionController.class);
    
    /*
     * 
     * @term String termino de busqueda
     */
    @RequestMapping(value = "/ubicacion/autocomplete", method = RequestMethod.GET)
    public void ubicacionAutocomplete(
            @RequestParam("term") String term,
            HttpServletResponse response,
            ModelMap modelMap) 
    {        
        List<Ubicacion> lasUbicaciones = Ubicacion.findUbicacionsByNombreLike(term).getResultList();
        
        if (lasUbicaciones.size()>0)
            modelMap.addAttribute("seEncontroUbicacion", true);
        else
            modelMap.addAttribute("seEncontroUbicacion", false);
        
        ObjectMapper mapper = new ObjectMapper();
        String resultados = "[";
        int contador = 0;

        Iterator ite = lasUbicaciones.iterator();
        while(ite.hasNext()){
            contador = contador +1;
            Ubicacion laUbicacion = (Ubicacion)ite.next();
            resultados=resultados +"\""+laUbicacion.getNombre()+", Estado "+laUbicacion.getEstado()+  "\"";
        }
        if (contador==lasUbicaciones.size()){
           resultados = resultados + "]"; 
        }else{
            resultados = resultados + ",";
        }

        response.setContentType("application/json");
        PrintWriter out;
        try {
            out = response.getWriter();
            out.write(resultados);
        } catch (IOException ex) {
            logger.error("Error escribiendo respuesta json en el response",ex);
        }  
    }
}
