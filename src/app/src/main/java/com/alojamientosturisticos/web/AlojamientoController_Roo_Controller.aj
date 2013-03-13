package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.Alojamiento;
import com.alojamientosturisticos.domain.ComodidadGeneral;
import com.alojamientosturisticos.domain.ComodidadGeneralAdicional;
import com.alojamientosturisticos.domain.TipoAlojamiento;
import com.alojamientosturisticos.domain.Ubicacion;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect AlojamientoController_Roo_Controller {
    
    @RequestMapping(value = "/alojamiento/{id}", method = RequestMethod.GET)
    public String AlojamientoController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("alojamiento", Alojamiento.findAlojamiento(id));
        return "alojamiento/show";
    }
    
    @RequestMapping(value = "/alojamiento", method = RequestMethod.GET)
    public String AlojamientoController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("alojamientoes", Alojamiento.findAlojamientoEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Alojamiento.countAlojamientoes() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
        }
        return "alojamiento/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String AlojamientoController.update(@Valid Alojamiento alojamiento, BindingResult result, ModelMap modelMap) {
        if (alojamiento == null) throw new IllegalArgumentException("A alojamiento is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("alojamiento", alojamiento);
            modelMap.addAttribute("comodidadgenerals", ComodidadGeneral.findAllComodidadGenerals());
            modelMap.addAttribute("comodidadgeneraladicionals", ComodidadGeneralAdicional.findAllComodidadGeneralAdicionals());
            modelMap.addAttribute("tipoalojamientoes", TipoAlojamiento.findAllTipoAlojamientoes());
            modelMap.addAttribute("ubicacions", Ubicacion.findAllUbicacions());
            return "alojamiento/update";
        }
        alojamiento.merge();
        return "redirect:/alojamiento/" + alojamiento.getId();
    }
    
    @RequestMapping(value = "/alojamiento/{id}/form", method = RequestMethod.GET)
    public String AlojamientoController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("alojamiento", Alojamiento.findAlojamiento(id));
        modelMap.addAttribute("comodidadgenerals", ComodidadGeneral.findAllComodidadGenerals());
        modelMap.addAttribute("comodidadgeneraladicionals", ComodidadGeneralAdicional.findAllComodidadGeneralAdicionals());
        modelMap.addAttribute("tipoalojamientoes", TipoAlojamiento.findAllTipoAlojamientoes());
        modelMap.addAttribute("ubicacions", Ubicacion.findAllUbicacions());
        return "alojamiento/update";
    }
    
    @RequestMapping(value = "/alojamiento/{id}", method = RequestMethod.DELETE)
    public String AlojamientoController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        Alojamiento.findAlojamiento(id).remove();
        return "redirect:/alojamiento?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
    @RequestMapping(value = "find/ByNombre/form", method = RequestMethod.GET)
    public String AlojamientoController.findAlojamientoesByNombreForm(ModelMap modelMap) {
        return "alojamiento/findAlojamientoesByNombre";
    }
    
    @RequestMapping(value = "find/ByNombre", method = RequestMethod.GET)
    public String AlojamientoController.findAlojamientoesByNombre(@RequestParam("nombre") String nombre, ModelMap modelMap) {
        if (nombre == null || nombre.length() == 0) throw new IllegalArgumentException("A Nombre is required.");
        modelMap.addAttribute("alojamientoes", Alojamiento.findAlojamientoesByNombre(nombre).getResultList());
        return "alojamiento/list";
    }
    
}
