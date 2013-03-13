package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.Configuracion;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect ConfiguracionController_Roo_Controller {
    
    @RequestMapping(value = "/configuracion", method = RequestMethod.POST)
    public String ConfiguracionController.create(@Valid Configuracion configuracion, BindingResult result, ModelMap modelMap) {
        if (configuracion == null) throw new IllegalArgumentException("A configuracion is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("configuracion", configuracion);
            return "configuracion/create";
        }
        configuracion.persist();
        return "redirect:/configuracion/" + configuracion.getId();
    }
    
    @RequestMapping(value = "/configuracion/form", method = RequestMethod.GET)
    public String ConfiguracionController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("configuracion", new Configuracion());
        return "configuracion/create";
    }
    
    @RequestMapping(value = "/configuracion/{id}", method = RequestMethod.GET)
    public String ConfiguracionController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("configuracion", Configuracion.findConfiguracion(id));
        return "configuracion/show";
    }
    
    @RequestMapping(value = "/configuracion", method = RequestMethod.GET)
    public String ConfiguracionController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("configuracions", Configuracion.findConfiguracionEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Configuracion.countConfiguracions() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("configuracions", Configuracion.findAllConfiguracions());
        }
        return "configuracion/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String ConfiguracionController.update(@Valid Configuracion configuracion, BindingResult result, ModelMap modelMap) {
        if (configuracion == null) throw new IllegalArgumentException("A configuracion is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("configuracion", configuracion);
            return "configuracion/update";
        }
        configuracion.merge();
        return "redirect:/configuracion/" + configuracion.getId();
    }
    
    @RequestMapping(value = "/configuracion/{id}/form", method = RequestMethod.GET)
    public String ConfiguracionController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("configuracion", Configuracion.findConfiguracion(id));
        return "configuracion/update";
    }
    
    @RequestMapping(value = "/configuracion/{id}", method = RequestMethod.DELETE)
    public String ConfiguracionController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        Configuracion.findConfiguracion(id).remove();
        return "redirect:/configuracion?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
    @RequestMapping(value = "find/ByClave/form", method = RequestMethod.GET)
    public String ConfiguracionController.findConfiguracionsByClaveForm(ModelMap modelMap) {
        return "configuracion/findConfiguracionsByClave";
    }
    
    @RequestMapping(value = "find/ByClave", method = RequestMethod.GET)
    public String ConfiguracionController.findConfiguracionsByClave(@RequestParam("clave") String clave, ModelMap modelMap) {
        if (clave == null || clave.length() == 0) throw new IllegalArgumentException("A Clave is required.");
        modelMap.addAttribute("configuracions", Configuracion.findConfiguracionsByClave(clave).getResultList());
        return "configuracion/list";
    }
    
}
