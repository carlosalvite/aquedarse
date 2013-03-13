package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.TipoAlojamiento;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect TipoAlojamientoController_Roo_Controller {
    
    @RequestMapping(value = "/tipoalojamiento", method = RequestMethod.POST)
    public String TipoAlojamientoController.create(@Valid TipoAlojamiento tipoAlojamiento, BindingResult result, ModelMap modelMap) {
        if (tipoAlojamiento == null) throw new IllegalArgumentException("A tipoAlojamiento is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("tipoAlojamiento", tipoAlojamiento);
            return "tipoalojamiento/create";
        }
        tipoAlojamiento.persist();
        return "redirect:/tipoalojamiento/" + tipoAlojamiento.getId();
    }
    
    @RequestMapping(value = "/tipoalojamiento/form", method = RequestMethod.GET)
    public String TipoAlojamientoController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("tipoAlojamiento", new TipoAlojamiento());
        return "tipoalojamiento/create";
    }
    
    @RequestMapping(value = "/tipoalojamiento/{id}", method = RequestMethod.GET)
    public String TipoAlojamientoController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("tipoAlojamiento", TipoAlojamiento.findTipoAlojamiento(id));
        return "tipoalojamiento/show";
    }
    
    @RequestMapping(value = "/tipoalojamiento", method = RequestMethod.GET)
    public String TipoAlojamientoController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("tipoalojamientoes", TipoAlojamiento.findTipoAlojamientoEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) TipoAlojamiento.countTipoAlojamientoes() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("tipoalojamientoes", TipoAlojamiento.findAllTipoAlojamientoes());
        }
        return "tipoalojamiento/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String TipoAlojamientoController.update(@Valid TipoAlojamiento tipoAlojamiento, BindingResult result, ModelMap modelMap) {
        if (tipoAlojamiento == null) throw new IllegalArgumentException("A tipoAlojamiento is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("tipoAlojamiento", tipoAlojamiento);
            return "tipoalojamiento/update";
        }
        tipoAlojamiento.merge();
        return "redirect:/tipoalojamiento/" + tipoAlojamiento.getId();
    }
    
    @RequestMapping(value = "/tipoalojamiento/{id}/form", method = RequestMethod.GET)
    public String TipoAlojamientoController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("tipoAlojamiento", TipoAlojamiento.findTipoAlojamiento(id));
        return "tipoalojamiento/update";
    }
    
    @RequestMapping(value = "/tipoalojamiento/{id}", method = RequestMethod.DELETE)
    public String TipoAlojamientoController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        TipoAlojamiento.findTipoAlojamiento(id).remove();
        return "redirect:/tipoalojamiento?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
}
