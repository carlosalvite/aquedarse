package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.TipoCiRif;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect TipoCiRifController_Roo_Controller {
    
    @RequestMapping(value = "/tipocirif", method = RequestMethod.POST)
    public String TipoCiRifController.create(@Valid TipoCiRif tipoCiRif, BindingResult result, ModelMap modelMap) {
        if (tipoCiRif == null) throw new IllegalArgumentException("A tipoCiRif is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("tipoCiRif", tipoCiRif);
            return "tipocirif/create";
        }
        tipoCiRif.persist();
        return "redirect:/tipocirif/" + tipoCiRif.getId();
    }
    
    @RequestMapping(value = "/tipocirif/form", method = RequestMethod.GET)
    public String TipoCiRifController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("tipoCiRif", new TipoCiRif());
        return "tipocirif/create";
    }
    
    @RequestMapping(value = "/tipocirif/{id}", method = RequestMethod.GET)
    public String TipoCiRifController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("tipoCiRif", TipoCiRif.findTipoCiRif(id));
        return "tipocirif/show";
    }
    
    @RequestMapping(value = "/tipocirif", method = RequestMethod.GET)
    public String TipoCiRifController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("tipocirifs", TipoCiRif.findTipoCiRifEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) TipoCiRif.countTipoCiRifs() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("tipocirifs", TipoCiRif.findAllTipoCiRifs());
        }
        return "tipocirif/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String TipoCiRifController.update(@Valid TipoCiRif tipoCiRif, BindingResult result, ModelMap modelMap) {
        if (tipoCiRif == null) throw new IllegalArgumentException("A tipoCiRif is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("tipoCiRif", tipoCiRif);
            return "tipocirif/update";
        }
        tipoCiRif.merge();
        return "redirect:/tipocirif/" + tipoCiRif.getId();
    }
    
    @RequestMapping(value = "/tipocirif/{id}/form", method = RequestMethod.GET)
    public String TipoCiRifController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("tipoCiRif", TipoCiRif.findTipoCiRif(id));
        return "tipocirif/update";
    }
    
    @RequestMapping(value = "/tipocirif/{id}", method = RequestMethod.DELETE)
    public String TipoCiRifController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        TipoCiRif.findTipoCiRif(id).remove();
        return "redirect:/tipocirif?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
}
