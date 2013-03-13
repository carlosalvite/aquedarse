package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.Comodidades;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect ComodidadesController_Roo_Controller {
    
    @RequestMapping(value = "/comodidades", method = RequestMethod.POST)
    public String ComodidadesController.create(@Valid Comodidades comodidades, BindingResult result, ModelMap modelMap) {
        if (comodidades == null) throw new IllegalArgumentException("A comodidades is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("comodidades", comodidades);
            return "comodidades/create";
        }
        comodidades.persist();
        return "redirect:/comodidades/" + comodidades.getId();
    }
    
    @RequestMapping(value = "/comodidades/form", method = RequestMethod.GET)
    public String ComodidadesController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("comodidades", new Comodidades());
        return "comodidades/create";
    }
    
    @RequestMapping(value = "/comodidades/{id}", method = RequestMethod.GET)
    public String ComodidadesController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("comodidades", Comodidades.findComodidades(id));
        return "comodidades/show";
    }
    
    @RequestMapping(value = "/comodidades", method = RequestMethod.GET)
    public String ComodidadesController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("comodidadeses", Comodidades.findComodidadesEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Comodidades.countComodidadeses() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("comodidadeses", Comodidades.findAllComodidadeses());
        }
        return "comodidades/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String ComodidadesController.update(@Valid Comodidades comodidades, BindingResult result, ModelMap modelMap) {
        if (comodidades == null) throw new IllegalArgumentException("A comodidades is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("comodidades", comodidades);
            return "comodidades/update";
        }
        comodidades.merge();
        return "redirect:/comodidades/" + comodidades.getId();
    }
    
    @RequestMapping(value = "/comodidades/{id}/form", method = RequestMethod.GET)
    public String ComodidadesController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("comodidades", Comodidades.findComodidades(id));
        return "comodidades/update";
    }
    
    @RequestMapping(value = "/comodidades/{id}", method = RequestMethod.DELETE)
    public String ComodidadesController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        Comodidades.findComodidades(id).remove();
        return "redirect:/comodidades?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
}
