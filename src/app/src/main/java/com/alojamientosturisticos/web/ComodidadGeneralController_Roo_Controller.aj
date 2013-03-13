package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.ComodidadGeneral;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect ComodidadGeneralController_Roo_Controller {
    
    @RequestMapping(value = "/comodidadgeneral", method = RequestMethod.POST)
    public String ComodidadGeneralController.create(@Valid ComodidadGeneral comodidadGeneral, BindingResult result, ModelMap modelMap) {
        if (comodidadGeneral == null) throw new IllegalArgumentException("A comodidadGeneral is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("comodidadGeneral", comodidadGeneral);
            return "comodidadgeneral/create";
        }
        comodidadGeneral.persist();
        return "redirect:/comodidadgeneral/" + comodidadGeneral.getId();
    }
    
    @RequestMapping(value = "/comodidadgeneral/form", method = RequestMethod.GET)
    public String ComodidadGeneralController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("comodidadGeneral", new ComodidadGeneral());
        return "comodidadgeneral/create";
    }
    
    @RequestMapping(value = "/comodidadgeneral/{id}", method = RequestMethod.GET)
    public String ComodidadGeneralController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("comodidadGeneral", ComodidadGeneral.findComodidadGeneral(id));
        return "comodidadgeneral/show";
    }
    
    @RequestMapping(value = "/comodidadgeneral", method = RequestMethod.GET)
    public String ComodidadGeneralController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("comodidadgenerals", ComodidadGeneral.findComodidadGeneralEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) ComodidadGeneral.countComodidadGenerals() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("comodidadgenerals", ComodidadGeneral.findAllComodidadGenerals());
        }
        return "comodidadgeneral/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String ComodidadGeneralController.update(@Valid ComodidadGeneral comodidadGeneral, BindingResult result, ModelMap modelMap) {
        if (comodidadGeneral == null) throw new IllegalArgumentException("A comodidadGeneral is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("comodidadGeneral", comodidadGeneral);
            return "comodidadgeneral/update";
        }
        comodidadGeneral.merge();
        return "redirect:/comodidadgeneral/" + comodidadGeneral.getId();
    }
    
    @RequestMapping(value = "/comodidadgeneral/{id}/form", method = RequestMethod.GET)
    public String ComodidadGeneralController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("comodidadGeneral", ComodidadGeneral.findComodidadGeneral(id));
        return "comodidadgeneral/update";
    }
    
    @RequestMapping(value = "/comodidadgeneral/{id}", method = RequestMethod.DELETE)
    public String ComodidadGeneralController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        ComodidadGeneral.findComodidadGeneral(id).remove();
        return "redirect:/comodidadgeneral?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
    @RequestMapping(value = "find/ByNombreLike/form", method = RequestMethod.GET)
    public String ComodidadGeneralController.findComodidadGeneralsByNombreLikeForm(ModelMap modelMap) {
        return "comodidadgeneral/findComodidadGeneralsByNombreLike";
    }
    
    @RequestMapping(value = "find/ByNombreLike", method = RequestMethod.GET)
    public String ComodidadGeneralController.findComodidadGeneralsByNombreLike(@RequestParam("nombre") String nombre, ModelMap modelMap) {
        if (nombre == null || nombre.length() == 0) throw new IllegalArgumentException("A Nombre is required.");
        modelMap.addAttribute("comodidadgenerals", ComodidadGeneral.findComodidadGeneralsByNombreLike(nombre).getResultList());
        return "comodidadgeneral/list";
    }
    
}
