package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.Alojamiento;
import java.lang.Long;
import java.lang.String;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect AlojamientoController_Roo_Controller {
    
    @RequestMapping(value = "/alojamiento/{id}", method = RequestMethod.GET)
    public String AlojamientoController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("alojamiento", Alojamiento.findAlojamiento(id));
        return "alojamiento/show";
    }
    
    @RequestMapping(value = "/alojamiento", method = RequestMethod.GET)
    public String AlojamientoController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("alojamientoes", Alojamiento.findAlojamientoEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Alojamiento.countAlojamientoes() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
        }
        return "alojamiento/list";
    }
    
    @RequestMapping(value = "/alojamiento/{id}", method = RequestMethod.DELETE)
    public String AlojamientoController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        Alojamiento.findAlojamiento(id).remove();
        return "redirect:/alojamiento?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
    @RequestMapping(value = "find/ByNombre/form", method = RequestMethod.GET)
    public String AlojamientoController.findAlojamientoesByNombreForm(ModelMap modelMap) {
        return "alojamiento/findAlojamientoesByNombre";
    }
    
    @RequestMapping(value = "find/ByNombre", method = RequestMethod.GET)
    public String AlojamientoController.findAlojamientoesByNombre(@RequestParam("nombre") String nombre, ModelMap modelMap) {
        if (nombre == null || nombre.length() == 0) throw new IllegalArgumentException("A Nombre is required.");
        modelMap.addAttribute("alojamientoes", Alojamiento.findAlojamientoesByNombre(nombre).getResultList());
        return "alojamiento/list";
    }
    
}
