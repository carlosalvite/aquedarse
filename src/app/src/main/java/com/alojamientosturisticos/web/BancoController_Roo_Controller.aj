package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.Banco;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect BancoController_Roo_Controller {
    
    @RequestMapping(value = "/banco", method = RequestMethod.POST)
    public String BancoController.create(@Valid Banco banco, BindingResult result, ModelMap modelMap) {
        if (banco == null) throw new IllegalArgumentException("A banco is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("banco", banco);
            return "banco/create";
        }
        banco.persist();
        return "redirect:/banco/" + banco.getId();
    }
    
    @RequestMapping(value = "/banco/form", method = RequestMethod.GET)
    public String BancoController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("banco", new Banco());
        return "banco/create";
    }
    
    @RequestMapping(value = "/banco/{id}", method = RequestMethod.GET)
    public String BancoController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("banco", Banco.findBanco(id));
        return "banco/show";
    }
    
    @RequestMapping(value = "/banco", method = RequestMethod.GET)
    public String BancoController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("bancoes", Banco.findBancoEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Banco.countBancoes() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("bancoes", Banco.findAllBancoes());
        }
        return "banco/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String BancoController.update(@Valid Banco banco, BindingResult result, ModelMap modelMap) {
        if (banco == null) throw new IllegalArgumentException("A banco is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("banco", banco);
            return "banco/update";
        }
        banco.merge();
        return "redirect:/banco/" + banco.getId();
    }
    
    @RequestMapping(value = "/banco/{id}/form", method = RequestMethod.GET)
    public String BancoController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("banco", Banco.findBanco(id));
        return "banco/update";
    }
    
    @RequestMapping(value = "/banco/{id}", method = RequestMethod.DELETE)
    public String BancoController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        Banco.findBanco(id).remove();
        return "redirect:/banco?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
}
