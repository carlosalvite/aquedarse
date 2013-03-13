package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.Alojamiento;
import com.alojamientosturisticos.domain.Imagen;
import java.lang.Long;
import java.lang.String;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

privileged aspect ImagenController_Roo_Controller {
    
    @RequestMapping(value = "/imagen", method = RequestMethod.POST)
    public String ImagenController.create(@Valid Imagen imagen, BindingResult result, ModelMap modelMap) {
        if (imagen == null) throw new IllegalArgumentException("A imagen is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("imagen", imagen);
            modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
            return "imagen/create";
        }
        imagen.persist();
        return "redirect:/imagen/" + imagen.getId();
    }
    
    @RequestMapping(value = "/imagen/form", method = RequestMethod.GET)
    public String ImagenController.createForm(ModelMap modelMap) {
        modelMap.addAttribute("imagen", new Imagen());
        modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
        return "imagen/create";
    }
    
    @RequestMapping(value = "/imagen/{id}", method = RequestMethod.GET)
    public String ImagenController.show(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("imagen", Imagen.findImagen(id));
        return "imagen/show";
    }
    
    @RequestMapping(value = "/imagen", method = RequestMethod.GET)
    public String ImagenController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, ModelMap modelMap) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            modelMap.addAttribute("imagens", Imagen.findImagenEntries(page == null ? 0 : (page.intValue() - 1) * sizeNo, sizeNo));
            float nrOfPages = (float) Imagen.countImagens() / sizeNo;
            modelMap.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            modelMap.addAttribute("imagens", Imagen.findAllImagens());
        }
        return "imagen/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public String ImagenController.update(@Valid Imagen imagen, BindingResult result, ModelMap modelMap) {
        if (imagen == null) throw new IllegalArgumentException("A imagen is required");
        if (result.hasErrors()) {
            modelMap.addAttribute("imagen", imagen);
            modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
            return "imagen/update";
        }
        imagen.merge();
        return "redirect:/imagen/" + imagen.getId();
    }
    
    @RequestMapping(value = "/imagen/{id}/form", method = RequestMethod.GET)
    public String ImagenController.updateForm(@PathVariable("id") Long id, ModelMap modelMap) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        modelMap.addAttribute("imagen", Imagen.findImagen(id));
        modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
        return "imagen/update";
    }
    
    @RequestMapping(value = "/imagen/{id}", method = RequestMethod.DELETE)
    public String ImagenController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (id == null) throw new IllegalArgumentException("An Identifier is required");
        Imagen.findImagen(id).remove();
        return "redirect:/imagen?page=" + ((page == null) ? "1" : page.toString()) + "&size=" + ((size == null) ? "10" : size.toString());
    }
    
    @RequestMapping(value = "find/ByAlojamiento/form", method = RequestMethod.GET)
    public String ImagenController.findImagensByAlojamientoForm(ModelMap modelMap) {
        modelMap.addAttribute("alojamientoes", Alojamiento.findAllAlojamientoes());
        return "imagen/findImagensByAlojamiento";
    }
    
    @RequestMapping(value = "find/ByAlojamiento", method = RequestMethod.GET)
    public String ImagenController.findImagensByAlojamiento(@RequestParam("alojamiento") Alojamiento alojamiento, ModelMap modelMap) {
        if (alojamiento == null) throw new IllegalArgumentException("A Alojamiento is required.");
        modelMap.addAttribute("imagens", Imagen.findImagensByAlojamiento(alojamiento).getResultList());
        return "imagen/list";
    }
    
}
