package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.Estado;
import com.alojamientosturisticos.domain.Ubicacion;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect UbicacionController_Roo_Controller {
    
    @RequestMapping(value = "/ubicacion", method = RequestMethod.POST)
    public String UbicacionController.create(@Valid Ubicacion ubicacion, BindingResult result, ModelMap modelMap) {
        if (ubicacion == null) throw new IllegalArgumentException("A ubicacion is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("ubicacion", ubicacion);
            modelMap.addAttribute("estadoes", Estado.findAllEstadoes());
            return "ubicacion/create";
        }
        ubicacion.persist();
        return "redirect:/ubicacion/" + ubicacion.getId();
    }
    
    @RequestMapping(value = "/ubicacion/form", method = RequestMethod.GET)
    public String UbicacionController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("ubicacion", new Ubicacion());
        modelMap.addAttribute("estadoes", Estado.findAllEstadoes());
        return "ubicacion/create";
    }
    
    @RequestMapping(value = "/ubicacion/{id}", method = RequestMethod.GET)
    public String UbicacionController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("ubicacion", Ubicacion.findUbicacion(id));
        return "ubicacion/show";
    }
    
    @RequestMapping(value = "/ubicacion", method = RequestMethod.GET)
    public String UbicacionController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("ubicacions", Ubicacion.findUbicacionEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Ubicacion.countUbicacions() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("ubicacions", Ubicacion.findAllUbicacions());
        }
        return "ubicacion/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String UbicacionController.update(@Valid Ubicacion ubicacion, BindingResult result, ModelMap modelMap) {
        if (ubicacion == null) throw new IllegalArgumentException("A ubicacion is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("ubicacion", ubicacion);
            modelMap.addAttribute("estadoes", Estado.findAllEstadoes());
            return "ubicacion/update";
        }
        ubicacion.merge();
        return "redirect:/ubicacion/" + ubicacion.getId();
    }
    
    @RequestMapping(value = "/ubicacion/{id}/form", method = RequestMethod.GET)
    public String UbicacionController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("ubicacion", Ubicacion.findUbicacion(id));
        modelMap.addAttribute("estadoes", Estado.findAllEstadoes());
        return "ubicacion/update";
    }
    
    @RequestMapping(value = "/ubicacion/{id}", method = RequestMethod.DELETE)
    public String UbicacionController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        Ubicacion.findUbicacion(id).remove();
        return "redirect:/ubicacion?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
    @RequestMapping(value = "find/ByNombreLike/form", method = RequestMethod.GET)
    public String UbicacionController.findUbicacionsByNombreLikeForm(ModelMap modelMap) {
        return "ubicacion/findUbicacionsByNombreLike";
    }
    
    @RequestMapping(value = "find/ByNombreLike", method = RequestMethod.GET)
    public String UbicacionController.findUbicacionsByNombreLike(@RequestParam("nombre") String nombre, ModelMap modelMap) {
        if (nombre == null || nombre.length() == 0) throw new IllegalArgumentException("A Nombre is required.");
        modelMap.addAttribute("ubicacions", Ubicacion.findUbicacionsByNombreLike(nombre).getResultList());
        return "ubicacion/list";
    }
    
    @RequestMapping(value = "find/ByNombre/form", method = RequestMethod.GET)
    public String UbicacionController.findUbicacionsByNombreForm(ModelMap modelMap) {
        return "ubicacion/findUbicacionsByNombre";
    }
    
    @RequestMapping(value = "find/ByNombre", method = RequestMethod.GET)
    public String UbicacionController.findUbicacionsByNombre(@RequestParam("nombre") String nombre, ModelMap modelMap) {
        if (nombre == null || nombre.length() == 0) throw new IllegalArgumentException("A Nombre is required.");
        modelMap.addAttribute("ubicacions", Ubicacion.findUbicacionsByNombre(nombre).getResultList());
        return "ubicacion/list";
    }
    
}
