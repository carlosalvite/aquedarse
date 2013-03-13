package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.ServiciosIncluidosAdicionales;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect ServiciosIncluidosAdicionalesController_Roo_Controller {
    
    @RequestMapping(value = "/serviciosincluidosadicionales", method = RequestMethod.POST)
    public String ServiciosIncluidosAdicionalesController.create(@Valid ServiciosIncluidosAdicionales serviciosIncluidosAdicionales, BindingResult result, ModelMap modelMap) {
        if (serviciosIncluidosAdicionales == null) throw new IllegalArgumentException("A serviciosIncluidosAdicionales is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("serviciosIncluidosAdicionales", serviciosIncluidosAdicionales);
            return "serviciosincluidosadicionales/create";
        }
        serviciosIncluidosAdicionales.persist();
        return "redirect:/serviciosincluidosadicionales/" + serviciosIncluidosAdicionales.getId();
    }
    
    @RequestMapping(value = "/serviciosincluidosadicionales/form", method = RequestMethod.GET)
    public String ServiciosIncluidosAdicionalesController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("serviciosIncluidosAdicionales", new ServiciosIncluidosAdicionales());
        return "serviciosincluidosadicionales/create";
    }
    
    @RequestMapping(value = "/serviciosincluidosadicionales/{id}", method = RequestMethod.GET)
    public String ServiciosIncluidosAdicionalesController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("serviciosIncluidosAdicionales", ServiciosIncluidosAdicionales.findServiciosIncluidosAdicionales(id));
        return "serviciosincluidosadicionales/show";
    }
    
    @RequestMapping(value = "/serviciosincluidosadicionales", method = RequestMethod.GET)
    public String ServiciosIncluidosAdicionalesController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("serviciosincluidosadicionaleses", ServiciosIncluidosAdicionales.findServiciosIncluidosAdicionalesEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) ServiciosIncluidosAdicionales.countServiciosIncluidosAdicionaleses() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("serviciosincluidosadicionaleses", ServiciosIncluidosAdicionales.findAllServiciosIncluidosAdicionaleses());
        }
        return "serviciosincluidosadicionales/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String ServiciosIncluidosAdicionalesController.update(@Valid ServiciosIncluidosAdicionales serviciosIncluidosAdicionales, BindingResult result, ModelMap modelMap) {
        if (serviciosIncluidosAdicionales == null) throw new IllegalArgumentException("A serviciosIncluidosAdicionales is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("serviciosIncluidosAdicionales", serviciosIncluidosAdicionales);
            return "serviciosincluidosadicionales/update";
        }
        serviciosIncluidosAdicionales.merge();
        return "redirect:/serviciosincluidosadicionales/" + serviciosIncluidosAdicionales.getId();
    }
    
    @RequestMapping(value = "/serviciosincluidosadicionales/{id}/form", method = RequestMethod.GET)
    public String ServiciosIncluidosAdicionalesController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("serviciosIncluidosAdicionales", ServiciosIncluidosAdicionales.findServiciosIncluidosAdicionales(id));
        return "serviciosincluidosadicionales/update";
    }
    
    @RequestMapping(value = "/serviciosincluidosadicionales/{id}", method = RequestMethod.DELETE)
    public String ServiciosIncluidosAdicionalesController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        ServiciosIncluidosAdicionales.findServiciosIncluidosAdicionales(id).remove();
        return "redirect:/serviciosincluidosadicionales?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
    @RequestMapping(value = "find/ByNombreLike/form", method = RequestMethod.GET)
    public String ServiciosIncluidosAdicionalesController.findServiciosIncluidosAdicionalesesByNombreLikeForm(ModelMap modelMap) {
        return "serviciosincluidosadicionales/findServiciosIncluidosAdicionalesesByNombreLike";
    }
    
    @RequestMapping(value = "find/ByNombreLike", method = RequestMethod.GET)
    public String ServiciosIncluidosAdicionalesController.findServiciosIncluidosAdicionalesesByNombreLike(@RequestParam("nombre") String nombre, ModelMap modelMap) {
        if (nombre == null || nombre.length() == 0) throw new IllegalArgumentException("A Nombre is required.");
        modelMap.addAttribute("serviciosincluidosadicionaleses", ServiciosIncluidosAdicionales.findServiciosIncluidosAdicionalesesByNombreLike(nombre).getResultList());
        return "serviciosincluidosadicionales/list";
    }
    
}
