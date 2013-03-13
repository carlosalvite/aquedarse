package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.Municipio;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect MunicipioController_Roo_Controller {
    
    @RequestMapping(value = "/municipio", method = RequestMethod.POST)
    public String MunicipioController.create(@Valid Municipio municipio, BindingResult result, ModelMap modelMap) {
        if (municipio == null) throw new IllegalArgumentException("A municipio is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("municipio", municipio);
            return "municipio/create";
        }
        municipio.persist();
        return "redirect:/municipio/" + municipio.getId();
    }
    
    @RequestMapping(value = "/municipio/form", method = RequestMethod.GET)
    public String MunicipioController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("municipio", new Municipio());
        return "municipio/create";
    }
    
    @RequestMapping(value = "/municipio/{id}", method = RequestMethod.GET)
    public String MunicipioController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("municipio", Municipio.findMunicipio(id));
        return "municipio/show";
    }
    
    @RequestMapping(value = "/municipio", method = RequestMethod.GET)
    public String MunicipioController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("municipios", Municipio.findMunicipioEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Municipio.countMunicipios() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("municipios", Municipio.findAllMunicipios());
        }
        return "municipio/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String MunicipioController.update(@Valid Municipio municipio, BindingResult result, ModelMap modelMap) {
        if (municipio == null) throw new IllegalArgumentException("A municipio is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("municipio", municipio);
            return "municipio/update";
        }
        municipio.merge();
        return "redirect:/municipio/" + municipio.getId();
    }
    
    @RequestMapping(value = "/municipio/{id}/form", method = RequestMethod.GET)
    public String MunicipioController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("municipio", Municipio.findMunicipio(id));
        return "municipio/update";
    }
    
    @RequestMapping(value = "/municipio/{id}", method = RequestMethod.DELETE)
    public String MunicipioController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        Municipio.findMunicipio(id).remove();
        return "redirect:/municipio?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
}
