package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.ServiciosIncluidos;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect ServiciosIncluidosController_Roo_Controller {
    
    @RequestMapping(value = "/serviciosincluidos", method = RequestMethod.POST)
    public String ServiciosIncluidosController.create(@Valid ServiciosIncluidos serviciosIncluidos, BindingResult result, ModelMap modelMap) {
        if (serviciosIncluidos == null) throw new IllegalArgumentException("A serviciosIncluidos is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("serviciosIncluidos", serviciosIncluidos);
            return "serviciosincluidos/create";
        }
        serviciosIncluidos.persist();
        return "redirect:/serviciosincluidos/" + serviciosIncluidos.getId();
    }
    
    @RequestMapping(value = "/serviciosincluidos/form", method = RequestMethod.GET)
    public String ServiciosIncluidosController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("serviciosIncluidos", new ServiciosIncluidos());
        return "serviciosincluidos/create";
    }
    
    @RequestMapping(value = "/serviciosincluidos/{id}", method = RequestMethod.GET)
    public String ServiciosIncluidosController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("serviciosIncluidos", ServiciosIncluidos.findServiciosIncluidos(id));
        return "serviciosincluidos/show";
    }
    
    @RequestMapping(value = "/serviciosincluidos", method = RequestMethod.GET)
    public String ServiciosIncluidosController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("serviciosincluidoses", ServiciosIncluidos.findServiciosIncluidosEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) ServiciosIncluidos.countServiciosIncluidoses() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("serviciosincluidoses", ServiciosIncluidos.findAllServiciosIncluidoses());
        }
        return "serviciosincluidos/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String ServiciosIncluidosController.update(@Valid ServiciosIncluidos serviciosIncluidos, BindingResult result, ModelMap modelMap) {
        if (serviciosIncluidos == null) throw new IllegalArgumentException("A serviciosIncluidos is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("serviciosIncluidos", serviciosIncluidos);
            return "serviciosincluidos/update";
        }
        serviciosIncluidos.merge();
        return "redirect:/serviciosincluidos/" + serviciosIncluidos.getId();
    }
    
    @RequestMapping(value = "/serviciosincluidos/{id}/form", method = RequestMethod.GET)
    public String ServiciosIncluidosController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("serviciosIncluidos", ServiciosIncluidos.findServiciosIncluidos(id));
        return "serviciosincluidos/update";
    }
    
    @RequestMapping(value = "/serviciosincluidos/{id}", method = RequestMethod.DELETE)
    public String ServiciosIncluidosController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        ServiciosIncluidos.findServiciosIncluidos(id).remove();
        return "redirect:/serviciosincluidos?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
}
