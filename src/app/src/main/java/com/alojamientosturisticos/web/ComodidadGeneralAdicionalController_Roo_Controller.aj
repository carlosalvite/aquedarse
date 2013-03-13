package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.ComodidadGeneralAdicional;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect ComodidadGeneralAdicionalController_Roo_Controller {
    
    @RequestMapping(value = "/comodidadgeneraladicional", method = RequestMethod.POST)
    public String ComodidadGeneralAdicionalController.create(@Valid ComodidadGeneralAdicional comodidadGeneralAdicional, BindingResult result, ModelMap modelMap) {
        if (comodidadGeneralAdicional == null) throw new IllegalArgumentException("A comodidadGeneralAdicional is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("comodidadGeneralAdicional", comodidadGeneralAdicional);
            return "comodidadgeneraladicional/create";
        }
        comodidadGeneralAdicional.persist();
        return "redirect:/comodidadgeneraladicional/" + comodidadGeneralAdicional.getId();
    }
    
    @RequestMapping(value = "/comodidadgeneraladicional/form", method = RequestMethod.GET)
    public String ComodidadGeneralAdicionalController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("comodidadGeneralAdicional", new ComodidadGeneralAdicional());
        return "comodidadgeneraladicional/create";
    }
    
    @RequestMapping(value = "/comodidadgeneraladicional/{id}", method = RequestMethod.GET)
    public String ComodidadGeneralAdicionalController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("comodidadGeneralAdicional", ComodidadGeneralAdicional.findComodidadGeneralAdicional(id));
        return "comodidadgeneraladicional/show";
    }
    
    @RequestMapping(value = "/comodidadgeneraladicional", method = RequestMethod.GET)
    public String ComodidadGeneralAdicionalController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("comodidadgeneraladicionals", ComodidadGeneralAdicional.findComodidadGeneralAdicionalEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) ComodidadGeneralAdicional.countComodidadGeneralAdicionals() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("comodidadgeneraladicionals", ComodidadGeneralAdicional.findAllComodidadGeneralAdicionals());
        }
        return "comodidadgeneraladicional/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String ComodidadGeneralAdicionalController.update(@Valid ComodidadGeneralAdicional comodidadGeneralAdicional, BindingResult result, ModelMap modelMap) {
        if (comodidadGeneralAdicional == null) throw new IllegalArgumentException("A comodidadGeneralAdicional is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("comodidadGeneralAdicional", comodidadGeneralAdicional);
            return "comodidadgeneraladicional/update";
        }
        comodidadGeneralAdicional.merge();
        return "redirect:/comodidadgeneraladicional/" + comodidadGeneralAdicional.getId();
    }
    
    @RequestMapping(value = "/comodidadgeneraladicional/{id}/form", method = RequestMethod.GET)
    public String ComodidadGeneralAdicionalController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("comodidadGeneralAdicional", ComodidadGeneralAdicional.findComodidadGeneralAdicional(id));
        return "comodidadgeneraladicional/update";
    }
    
    @RequestMapping(value = "/comodidadgeneraladicional/{id}", method = RequestMethod.DELETE)
    public String ComodidadGeneralAdicionalController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        ComodidadGeneralAdicional.findComodidadGeneralAdicional(id).remove();
        return "redirect:/comodidadgeneraladicional?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
    @RequestMapping(value = "find/ByNombreLike/form", method = RequestMethod.GET)
    public String ComodidadGeneralAdicionalController.findComodidadGeneralAdicionalsByNombreLikeForm(ModelMap modelMap) {
        return "comodidadgeneraladicional/findComodidadGeneralAdicionalsByNombreLike";
    }
    
    @RequestMapping(value = "find/ByNombreLike", method = RequestMethod.GET)
    public String ComodidadGeneralAdicionalController.findComodidadGeneralAdicionalsByNombreLike(@RequestParam("nombre") String nombre, ModelMap modelMap) {
        if (nombre == null || nombre.length() == 0) throw new IllegalArgumentException("A Nombre is required.");
        modelMap.addAttribute("comodidadgeneraladicionals", ComodidadGeneralAdicional.findComodidadGeneralAdicionalsByNombreLike(nombre).getResultList());
        return "comodidadgeneraladicional/list";
    }
    
}
