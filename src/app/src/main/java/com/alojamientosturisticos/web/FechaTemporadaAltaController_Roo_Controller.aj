package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.FechaTemporadaAlta;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect FechaTemporadaAltaController_Roo_Controller {
    
    @RequestMapping(value = "/fechatemporadaalta", method = RequestMethod.POST)
    public String FechaTemporadaAltaController.create(@Valid FechaTemporadaAlta fechaTemporadaAlta, BindingResult result, ModelMap modelMap) {
        if (fechaTemporadaAlta == null) throw new IllegalArgumentException("A fechaTemporadaAlta is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("fechaTemporadaAlta", fechaTemporadaAlta);
            modelMap.addAttribute("fechaTemporadaAlta_fecha_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
            return "fechatemporadaalta/create";
        }
        fechaTemporadaAlta.persist();
        return "redirect:/fechatemporadaalta/" + fechaTemporadaAlta.getId();
    }
    
    @RequestMapping(value = "/fechatemporadaalta/form", method = RequestMethod.GET)
    public String FechaTemporadaAltaController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("fechaTemporadaAlta", new FechaTemporadaAlta());
        modelMap.addAttribute("fechaTemporadaAlta_fecha_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        return "fechatemporadaalta/create";
    }
    
    @RequestMapping(value = "/fechatemporadaalta/{id}", method = RequestMethod.GET)
    public String FechaTemporadaAltaController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("fechaTemporadaAlta_fecha_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("fechaTemporadaAlta", FechaTemporadaAlta.findFechaTemporadaAlta(id));
        return "fechatemporadaalta/show";
    }
    
    @RequestMapping(value = "/fechatemporadaalta", method = RequestMethod.GET)
    public String FechaTemporadaAltaController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("fechatemporadaaltas", FechaTemporadaAlta.findFechaTemporadaAltaEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) FechaTemporadaAlta.countFechaTemporadaAltas() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("fechatemporadaaltas", FechaTemporadaAlta.findAllFechaTemporadaAltas());
        }
        modelMap.addAttribute("fechaTemporadaAlta_fecha_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        return "fechatemporadaalta/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String FechaTemporadaAltaController.update(@Valid FechaTemporadaAlta fechaTemporadaAlta, BindingResult result, ModelMap modelMap) {
        if (fechaTemporadaAlta == null) throw new IllegalArgumentException("A fechaTemporadaAlta is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("fechaTemporadaAlta", fechaTemporadaAlta);
            modelMap.addAttribute("fechaTemporadaAlta_fecha_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
            return "fechatemporadaalta/update";
        }
        fechaTemporadaAlta.merge();
        return "redirect:/fechatemporadaalta/" + fechaTemporadaAlta.getId();
    }
    
    @RequestMapping(value = "/fechatemporadaalta/{id}/form", method = RequestMethod.GET)
    public String FechaTemporadaAltaController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("fechaTemporadaAlta", FechaTemporadaAlta.findFechaTemporadaAlta(id));
        modelMap.addAttribute("fechaTemporadaAlta_fecha_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        return "fechatemporadaalta/update";
    }
    
    @RequestMapping(value = "/fechatemporadaalta/{id}", method = RequestMethod.DELETE)
    public String FechaTemporadaAltaController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        FechaTemporadaAlta.findFechaTemporadaAlta(id).remove();
        return "redirect:/fechatemporadaalta?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
    @RequestMapping(value = "find/ByFecha/form", method = RequestMethod.GET)
    public String FechaTemporadaAltaController.findFechaTemporadaAltasByFechaForm(ModelMap modelMap) {
        modelMap.addAttribute("fechaTemporadaAlta_fecha_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        return "fechatemporadaalta/findFechaTemporadaAltasByFecha";
    }
    
    @RequestMapping(value = "find/ByFecha", method = RequestMethod.GET)
    public String FechaTemporadaAltaController.findFechaTemporadaAltasByFecha(@RequestParam("fecha") @DateTimeFormat(style = "S-") Date fecha, ModelMap modelMap) {
        if (fecha == null) throw new IllegalArgumentException("A Fecha is required.");
        modelMap.addAttribute("fechatemporadaaltas", FechaTemporadaAlta.findFechaTemporadaAltasByFecha(fecha).getResultList());
        modelMap.addAttribute("fechaTemporadaAlta_fecha_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        return "fechatemporadaalta/list";
    }
    
}
