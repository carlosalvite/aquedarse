package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.Alojamiento;
import com.alojamientosturisticos.domain.Banco;
import com.alojamientosturisticos.domain.CuentaBancaria;
import com.alojamientosturisticos.domain.TipoCiRif;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect CuentaBancariaController_Roo_Controller {
    
    @RequestMapping(value = "/cuentabancaria/{id}", method = RequestMethod.GET)
    public String CuentaBancariaController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("cuentaBancaria", CuentaBancaria.findCuentaBancaria(id));
        return "cuentabancaria/show";
    }
    
    @RequestMapping(value = "/cuentabancaria", method = RequestMethod.GET)
    public String CuentaBancariaController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("cuentabancarias", CuentaBancaria.findCuentaBancariaEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) CuentaBancaria.countCuentaBancarias() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("cuentabancarias", CuentaBancaria.findAllCuentaBancarias());
        }
        return "cuentabancaria/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String CuentaBancariaController.update(@Valid CuentaBancaria cuentaBancaria, BindingResult result, ModelMap modelMap) {
        if (cuentaBancaria == null) throw new IllegalArgumentException("A cuentaBancaria is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("cuentaBancaria", cuentaBancaria);
            modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
            modelMap.addAttribute("bancoes", Banco.findAllBancoes());
            modelMap.addAttribute("tipocirifs", TipoCiRif.findAllTipoCiRifs());
            return "cuentabancaria/update";
        }
        cuentaBancaria.merge();
        return "redirect:/cuentabancaria/" + cuentaBancaria.getId();
    }
    
    @RequestMapping(value = "/cuentabancaria/{id}/form", method = RequestMethod.GET)
    public String CuentaBancariaController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("cuentaBancaria", CuentaBancaria.findCuentaBancaria(id));
        modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
        modelMap.addAttribute("bancoes", Banco.findAllBancoes());
        modelMap.addAttribute("tipocirifs", TipoCiRif.findAllTipoCiRifs());
        return "cuentabancaria/update";
    }
    
    @RequestMapping(value = "/cuentabancaria/{id}", method = RequestMethod.DELETE)
    public String CuentaBancariaController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        CuentaBancaria.findCuentaBancaria(id).remove();
        return "redirect:/cuentabancaria?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
    @RequestMapping(value = "find/ByAlojamiento/form", method = RequestMethod.GET)
    public String CuentaBancariaController.findCuentaBancariasByAlojamientoForm(ModelMap modelMap) {
        modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
        return "cuentabancaria/findCuentaBancariasByAlojamiento";
    }
    
    @RequestMapping(value = "find/ByAlojamiento", method = RequestMethod.GET)
    public String CuentaBancariaController.findCuentaBancariasByAlojamiento(@RequestParam("alojamiento") Alojamiento alojamiento, ModelMap modelMap) {
        if (alojamiento == null) throw new IllegalArgumentException("A Alojamiento is required.");
        modelMap.addAttribute("cuentabancarias", CuentaBancaria.findCuentaBancariasByAlojamiento(alojamiento).getResultList());
        return "cuentabancaria/list";
    }
    
    @RequestMapping(value = "find/ByAlojamientoAndActiva/form", method = RequestMethod.GET)
    public String CuentaBancariaController.findCuentaBancariasByAlojamientoAndActivaForm(ModelMap modelMap) {
        modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
        return "cuentabancaria/findCuentaBancariasByAlojamientoAndActiva";
    }
    
    @RequestMapping(value = "find/ByAlojamientoAndActiva", method = RequestMethod.GET)
    public String CuentaBancariaController.findCuentaBancariasByAlojamientoAndActiva(@RequestParam("alojamiento") Alojamiento alojamiento, @RequestParam("activa") Boolean activa, ModelMap modelMap) {
        if (alojamiento == null) throw new IllegalArgumentException("A Alojamiento is required.");
        if (activa == null) throw new IllegalArgumentException("A Activa is required.");
        modelMap.addAttribute("cuentabancarias", CuentaBancaria.findCuentaBancariasByAlojamientoAndActiva(alojamiento, activa).getResultList());
        return "cuentabancaria/list";
    }
    
}
