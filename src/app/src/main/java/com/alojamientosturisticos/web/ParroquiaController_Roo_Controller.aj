package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.Parroquia;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect ParroquiaController_Roo_Controller {
    
    @RequestMapping(value = "/parroquia", method = RequestMethod.POST)
    public String ParroquiaController.create(@Valid Parroquia parroquia, BindingResult result, ModelMap modelMap) {
        if (parroquia == null) throw new IllegalArgumentException("A parroquia is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("parroquia", parroquia);
            return "parroquia/create";
        }
        parroquia.persist();
        return "redirect:/parroquia/" + parroquia.getId();
    }
    
    @RequestMapping(value = "/parroquia/form", method = RequestMethod.GET)
    public String ParroquiaController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("parroquia", new Parroquia());
        return "parroquia/create";
    }
    
    @RequestMapping(value = "/parroquia/{id}", method = RequestMethod.GET)
    public String ParroquiaController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("parroquia", Parroquia.findParroquia(id));
        return "parroquia/show";
    }
    
    @RequestMapping(value = "/parroquia", method = RequestMethod.GET)
    public String ParroquiaController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("parroquias", Parroquia.findParroquiaEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Parroquia.countParroquias() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("parroquias", Parroquia.findAllParroquias());
        }
        return "parroquia/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String ParroquiaController.update(@Valid Parroquia parroquia, BindingResult result, ModelMap modelMap) {
        if (parroquia == null) throw new IllegalArgumentException("A parroquia is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("parroquia", parroquia);
            return "parroquia/update";
        }
        parroquia.merge();
        return "redirect:/parroquia/" + parroquia.getId();
    }
    
    @RequestMapping(value = "/parroquia/{id}/form", method = RequestMethod.GET)
    public String ParroquiaController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("parroquia", Parroquia.findParroquia(id));
        return "parroquia/update";
    }
    
    @RequestMapping(value = "/parroquia/{id}", method = RequestMethod.DELETE)
    public String ParroquiaController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        Parroquia.findParroquia(id).remove();
        return "redirect:/parroquia?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
}
