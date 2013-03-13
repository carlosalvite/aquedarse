package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.TipoHabitacion;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect TipoHabitacionController_Roo_Controller {
    
    @RequestMapping(value = "/tipohabitacion", method = RequestMethod.POST)
    public String TipoHabitacionController.create(@Valid TipoHabitacion tipoHabitacion, BindingResult result, ModelMap modelMap) {
        if (tipoHabitacion == null) throw new IllegalArgumentException("A tipoHabitacion is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("tipoHabitacion", tipoHabitacion);
            return "tipohabitacion/create";
        }
        tipoHabitacion.persist();
        return "redirect:/tipohabitacion/" + tipoHabitacion.getId();
    }
    
    @RequestMapping(value = "/tipohabitacion/form", method = RequestMethod.GET)
    public String TipoHabitacionController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("tipoHabitacion", new TipoHabitacion());
        return "tipohabitacion/create";
    }
    
    @RequestMapping(value = "/tipohabitacion/{id}", method = RequestMethod.GET)
    public String TipoHabitacionController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("tipoHabitacion", TipoHabitacion.findTipoHabitacion(id));
        return "tipohabitacion/show";
    }
    
    @RequestMapping(value = "/tipohabitacion", method = RequestMethod.GET)
    public String TipoHabitacionController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("tipohabitacions", TipoHabitacion.findTipoHabitacionEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) TipoHabitacion.countTipoHabitacions() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("tipohabitacions", TipoHabitacion.findAllTipoHabitacions());
        }
        return "tipohabitacion/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String TipoHabitacionController.update(@Valid TipoHabitacion tipoHabitacion, BindingResult result, ModelMap modelMap) {
        if (tipoHabitacion == null) throw new IllegalArgumentException("A tipoHabitacion is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("tipoHabitacion", tipoHabitacion);
            return "tipohabitacion/update";
        }
        tipoHabitacion.merge();
        return "redirect:/tipohabitacion/" + tipoHabitacion.getId();
    }
    
    @RequestMapping(value = "/tipohabitacion/{id}/form", method = RequestMethod.GET)
    public String TipoHabitacionController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("tipoHabitacion", TipoHabitacion.findTipoHabitacion(id));
        return "tipohabitacion/update";
    }
    
    @RequestMapping(value = "/tipohabitacion/{id}", method = RequestMethod.DELETE)
    public String TipoHabitacionController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        TipoHabitacion.findTipoHabitacion(id).remove();
        return "redirect:/tipohabitacion?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
}
