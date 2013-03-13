package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.Alojamiento;
import com.alojamientosturisticos.domain.Comodidades;
import com.alojamientosturisticos.domain.ComodidadesAdicionales;
import com.alojamientosturisticos.domain.FechaTemporadaAlta;
import com.alojamientosturisticos.domain.Moneda;
import com.alojamientosturisticos.domain.Publicacion;
import com.alojamientosturisticos.domain.ServiciosIncluidos;
import com.alojamientosturisticos.domain.ServiciosIncluidosAdicionales;
import com.alojamientosturisticos.domain.TipoHabitacion;
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

privileged aspect PublicacionController_Roo_Controller {
    
    @RequestMapping(value = "/publicacion", method = RequestMethod.POST)
    public String PublicacionController.create(@Valid Publicacion publicacion, BindingResult result, ModelMap modelMap) {
        if (publicacion == null) throw new IllegalArgumentException("A publicacion is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("publicacion", publicacion);
            modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
            modelMap.addAttribute("comodidadeses", Comodidades.findAllComodidadeses());
            modelMap.addAttribute("comodidadesadicionaleses", ComodidadesAdicionales.findAllComodidadesAdicionaleses());
            modelMap.addAttribute("fechatemporadaaltas", FechaTemporadaAlta.findAllFechaTemporadaAltas());
            modelMap.addAttribute("monedas", Moneda.findAllMonedas());
            modelMap.addAttribute("serviciosincluidoses", ServiciosIncluidos.findAllServiciosIncluidoses());
            modelMap.addAttribute("serviciosincluidosadicionaleses", ServiciosIncluidosAdicionales.findAllServiciosIncluidosAdicionaleses());
            modelMap.addAttribute("tipohabitacions", TipoHabitacion.findAllTipoHabitacions());
            modelMap.addAttribute("tipotarifas", TipoTarifa.findAllTipoTarifas());
            modelMap.addAttribute("publicacion_horaCheckOut_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("-S", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
            modelMap.addAttribute("publicacion_fechaDesde_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
            modelMap.addAttribute("publicacion_fechaHasta_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
            modelMap.addAttribute("publicacion_horaCheckIn_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("-S", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
            return "publicacion/create";
        }
        publicacion.persist();
        return "redirect:/publicacion/" + publicacion.getId();
    }
    
    @RequestMapping(value = "/publicacion/form", method = RequestMethod.GET)
    public String PublicacionController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("publicacion", new Publicacion());
        modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
        modelMap.addAttribute("comodidadeses", Comodidades.findAllComodidadeses());
        modelMap.addAttribute("comodidadesadicionaleses", ComodidadesAdicionales.findAllComodidadesAdicionaleses());
        modelMap.addAttribute("fechatemporadaaltas", FechaTemporadaAlta.findAllFechaTemporadaAltas());
        modelMap.addAttribute("monedas", Moneda.findAllMonedas());
        modelMap.addAttribute("serviciosincluidoses", ServiciosIncluidos.findAllServiciosIncluidoses());
        modelMap.addAttribute("serviciosincluidosadicionaleses", ServiciosIncluidosAdicionales.findAllServiciosIncluidosAdicionaleses());
        modelMap.addAttribute("tipohabitacions", TipoHabitacion.findAllTipoHabitacions());
        modelMap.addAttribute("tipotarifas", TipoTarifa.findAllTipoTarifas());
        modelMap.addAttribute("publicacion_horaCheckOut_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("-S", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_fechaDesde_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_fechaHasta_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_horaCheckIn_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("-S", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        return "publicacion/create";
    }
    
    @RequestMapping(value = "/publicacion/{id}", method = RequestMethod.GET)
    public String PublicacionController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("publicacion_horaCheckOut_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("-S", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_fechaDesde_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_fechaHasta_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_horaCheckIn_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("-S", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion", Publicacion.findPublicacion(id));
        return "publicacion/show";
    }
    
    @RequestMapping(value = "/publicacion", method = RequestMethod.GET)
    public String PublicacionController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("publicacions", Publicacion.findPublicacionEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Publicacion.countPublicacions() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("publicacions", Publicacion.findAllPublicacions());
        }
        modelMap.addAttribute("publicacion_horaCheckOut_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("-S", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_fechaDesde_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_fechaHasta_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_horaCheckIn_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("-S", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        return "publicacion/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String PublicacionController.update(@Valid Publicacion publicacion, BindingResult result, ModelMap modelMap) {
        if (publicacion == null) throw new IllegalArgumentException("A publicacion is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("publicacion", publicacion);
            modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
            modelMap.addAttribute("comodidadeses", Comodidades.findAllComodidadeses());
            modelMap.addAttribute("comodidadesadicionaleses", ComodidadesAdicionales.findAllComodidadesAdicionaleses());
            modelMap.addAttribute("fechatemporadaaltas", FechaTemporadaAlta.findAllFechaTemporadaAltas());
            modelMap.addAttribute("monedas", Moneda.findAllMonedas());
            modelMap.addAttribute("serviciosincluidoses", ServiciosIncluidos.findAllServiciosIncluidoses());
            modelMap.addAttribute("serviciosincluidosadicionaleses", ServiciosIncluidosAdicionales.findAllServiciosIncluidosAdicionaleses());
            modelMap.addAttribute("tipohabitacions", TipoHabitacion.findAllTipoHabitacions());
            modelMap.addAttribute("tipotarifas", TipoTarifa.findAllTipoTarifas());
            modelMap.addAttribute("publicacion_horaCheckOut_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("-S", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
            modelMap.addAttribute("publicacion_fechaDesde_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
            modelMap.addAttribute("publicacion_fechaHasta_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
            modelMap.addAttribute("publicacion_horaCheckIn_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("-S", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
            return "publicacion/update";
        }
        publicacion.merge();
        return "redirect:/publicacion/" + publicacion.getId();
    }
    
    @RequestMapping(value = "/publicacion/{id}/form", method = RequestMethod.GET)
    public String PublicacionController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("publicacion", Publicacion.findPublicacion(id));
        modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
        modelMap.addAttribute("comodidadeses", Comodidades.findAllComodidadeses());
        modelMap.addAttribute("comodidadesadicionaleses", ComodidadesAdicionales.findAllComodidadesAdicionaleses());
        modelMap.addAttribute("fechatemporadaaltas", FechaTemporadaAlta.findAllFechaTemporadaAltas());
        modelMap.addAttribute("monedas", Moneda.findAllMonedas());
        modelMap.addAttribute("serviciosincluidoses", ServiciosIncluidos.findAllServiciosIncluidoses());
        modelMap.addAttribute("serviciosincluidosadicionaleses", ServiciosIncluidosAdicionales.findAllServiciosIncluidosAdicionaleses());
        modelMap.addAttribute("tipohabitacions", TipoHabitacion.findAllTipoHabitacions());
        modelMap.addAttribute("tipotarifas", TipoTarifa.findAllTipoTarifas());
        modelMap.addAttribute("publicacion_horaCheckOut_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("-S", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_fechaDesde_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_fechaHasta_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("S-", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        modelMap.addAttribute("publicacion_horaCheckIn_date_format", org.joda.time.format.DateTimeFormat.patternForStyle("-S", org.springframework.context.i18n.LocaleContextHolder.getLocale()));
        return "publicacion/update";
    }
    
    @RequestMapping(value = "/publicacion/{id}", method = RequestMethod.DELETE)
    public String PublicacionController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        Publicacion.findPublicacion(id).remove();
        return "redirect:/publicacion?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
    @RequestMapping(value = "find/ByAlojamiento/form", method = RequestMethod.GET)
    public String PublicacionController.findPublicacionsByAlojamientoForm(ModelMap modelMap) {
        modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
        return "publicacion/findPublicacionsByAlojamiento";
    }
    
    @RequestMapping(value = "find/ByAlojamiento", method = RequestMethod.GET)
    public String PublicacionController.findPublicacionsByAlojamiento(@RequestParam("alojamiento") Alojamiento alojamiento, ModelMap modelMap) {
        if (alojamiento == null) throw new IllegalArgumentException("A Alojamiento is required.");
        modelMap.addAttribute("publicacions", Publicacion.findPublicacionsByAlojamiento(alojamiento).getResultList());
        return "publicacion/list";
    }
    
}
