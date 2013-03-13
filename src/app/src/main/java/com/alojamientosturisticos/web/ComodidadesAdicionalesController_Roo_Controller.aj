package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.ComodidadesAdicionales;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect ComodidadesAdicionalesController_Roo_Controller {
    
    @RequestMapping(value = "/comodidadesadicionales", method = RequestMethod.POST)
    public String ComodidadesAdicionalesController.create(@Valid ComodidadesAdicionales comodidadesAdicionales, BindingResult result, ModelMap modelMap) {
        if (comodidadesAdicionales == null) throw new IllegalArgumentException("A comodidadesAdicionales is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("comodidadesAdicionales", comodidadesAdicionales);
            return "comodidadesadicionales/create";
        }
        comodidadesAdicionales.persist();
        return "redirect:/comodidadesadicionales/" + comodidadesAdicionales.getId();
    }
    
    @RequestMapping(value = "/comodidadesadicionales/form", method = RequestMethod.GET)
    public String ComodidadesAdicionalesController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("comodidadesAdicionales", new ComodidadesAdicionales());
        return "comodidadesadicionales/create";
    }
    
    @RequestMapping(value = "/comodidadesadicionales/{id}", method = RequestMethod.GET)
    public String ComodidadesAdicionalesController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("comodidadesAdicionales", ComodidadesAdicionales.findComodidadesAdicionales(id));
        return "comodidadesadicionales/show";
    }
    
    @RequestMapping(value = "/comodidadesadicionales", method = RequestMethod.GET)
    public String ComodidadesAdicionalesController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("comodidadesadicionaleses", ComodidadesAdicionales.findComodidadesAdicionalesEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) ComodidadesAdicionales.countComodidadesAdicionaleses() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("comodidadesadicionaleses", ComodidadesAdicionales.findAllComodidadesAdicionaleses());
        }
        return "comodidadesadicionales/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String ComodidadesAdicionalesController.update(@Valid ComodidadesAdicionales comodidadesAdicionales, BindingResult result, ModelMap modelMap) {
        if (comodidadesAdicionales == null) throw new IllegalArgumentException("A comodidadesAdicionales is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("comodidadesAdicionales", comodidadesAdicionales);
            return "comodidadesadicionales/update";
        }
        comodidadesAdicionales.merge();
        return "redirect:/comodidadesadicionales/" + comodidadesAdicionales.getId();
    }
    
    @RequestMapping(value = "/comodidadesadicionales/{id}/form", method = RequestMethod.GET)
    public String ComodidadesAdicionalesController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("comodidadesAdicionales", ComodidadesAdicionales.findComodidadesAdicionales(id));
        return "comodidadesadicionales/update";
    }
    
    @RequestMapping(value = "/comodidadesadicionales/{id}", method = RequestMethod.DELETE)
    public String ComodidadesAdicionalesController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        ComodidadesAdicionales.findComodidadesAdicionales(id).remove();
        return "redirect:/comodidadesadicionales?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
    @RequestMapping(value = "find/ByNombreLike/form", method = RequestMethod.GET)
    public String ComodidadesAdicionalesController.findComodidadesAdicionalesesByNombreLikeForm(ModelMap modelMap) {
        return "comodidadesadicionales/findComodidadesAdicionalesesByNombreLike";
    }
    
    @RequestMapping(value = "find/ByNombreLike", method = RequestMethod.GET)
    public String ComodidadesAdicionalesController.findComodidadesAdicionalesesByNombreLike(@RequestParam("nombre") String nombre, ModelMap modelMap) {
        if (nombre == null || nombre.length() == 0) throw new IllegalArgumentException("A Nombre is required.");
        modelMap.addAttribute("comodidadesadicionaleses", ComodidadesAdicionales.findComodidadesAdicionalesesByNombreLike(nombre).getResultList());
        return "comodidadesadicionales/list";
    }
    
}
