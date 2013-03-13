package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.TipoTarifa;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect TipoTarifaController_Roo_Controller {
    
    @RequestMapping(value = "/tipotarifa", method = RequestMethod.POST)
    public String TipoTarifaController.create(@Valid TipoTarifa tipoTarifa, BindingResult result, ModelMap modelMap) {
        if (tipoTarifa == null) throw new IllegalArgumentException("A tipoTarifa is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("tipoTarifa", tipoTarifa);
            return "tipotarifa/create";
        }
        tipoTarifa.persist();
        return "redirect:/tipotarifa/" + tipoTarifa.getId();
    }
    
    @RequestMapping(value = "/tipotarifa/form", method = RequestMethod.GET)
    public String TipoTarifaController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("tipoTarifa", new TipoTarifa());
        return "tipotarifa/create";
    }
    
    @RequestMapping(value = "/tipotarifa/{id}", method = RequestMethod.GET)
    public String TipoTarifaController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("tipoTarifa", TipoTarifa.findTipoTarifa(id));
        return "tipotarifa/show";
    }
    
    @RequestMapping(value = "/tipotarifa", method = RequestMethod.GET)
    public String TipoTarifaController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("tipotarifas", TipoTarifa.findTipoTarifaEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) TipoTarifa.countTipoTarifas() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("tipotarifas", TipoTarifa.findAllTipoTarifas());
        }
        return "tipotarifa/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String TipoTarifaController.update(@Valid TipoTarifa tipoTarifa, BindingResult result, ModelMap modelMap) {
        if (tipoTarifa == null) throw new IllegalArgumentException("A tipoTarifa is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("tipoTarifa", tipoTarifa);
            return "tipotarifa/update";
        }
        tipoTarifa.merge();
        return "redirect:/tipotarifa/" + tipoTarifa.getId();
    }
    
    @RequestMapping(value = "/tipotarifa/{id}/form", method = RequestMethod.GET)
    public String TipoTarifaController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("tipoTarifa", TipoTarifa.findTipoTarifa(id));
        return "tipotarifa/update";
    }
    
    @RequestMapping(value = "/tipotarifa/{id}", method = RequestMethod.DELETE)
    public String TipoTarifaController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        TipoTarifa.findTipoTarifa(id).remove();
        return "redirect:/tipotarifa?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
}
