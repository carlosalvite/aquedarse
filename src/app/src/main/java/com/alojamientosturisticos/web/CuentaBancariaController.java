package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.Alojamiento;
import com.alojamientosturisticos.domain.Banco;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.CuentaBancaria;
import com.alojamientosturisticos.domain.TipoCiRif;
import java.util.List;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@RooWebScaffold(path = "cuentabancaria", automaticallyMaintainView = true, formBackingObject = CuentaBancaria.class)
@RequestMapping("/cuentabancaria/**")
@SessionAttributes({"cuentaBancaria"})
@Controller
public class CuentaBancariaController {
    /**
     * Realiza la persistencia de una cuenta bancaria
     * @param cuentaBancaria
     * @param result
     * @param modelMap
     * @param session
     * @return 
     */
    @RequestMapping(value = "/cuentabancaria", method = RequestMethod.POST)
    public String create(
            @Valid @ModelAttribute("cuentaBancaria") CuentaBancaria cuentaBancaria,             
            BindingResult result, 
            ModelMap modelMap,
            SessionStatus session
            ) {
        if (cuentaBancaria == null) throw new IllegalArgumentException("A cuentaBancaria is required");
        
        //Verificamos que el correo electronico sea valido
        String fullRegexEmail = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (!cuentaBancaria.getCorreoElectronico().matches(fullRegexEmail)){
            result.addError(new FieldError(result.getObjectName(), "correoElectronico", "Correo electronico invalido"));
        }
        
        if (result.hasErrors()) {
            
            modelMap.addAttribute("cuentaBancaria", cuentaBancaria);
            modelMap.addAttribute("tipocirifs", TipoCiRif.findAllTipoCiRifs());
            modelMap.addAttribute("bancoes", Banco.findAllBancoes());
            
            return "cuentabancaria/create";
        }
        
        //Desactivo las otras cuentas bancarias que tenga este Alojamiento
        List<CuentaBancaria> otrasCuentas = CuentaBancaria.findCuentaBancariasByAlojamiento(cuentaBancaria.getAlojamiento()).getResultList();
        for (int i = 0; i < otrasCuentas.size(); i++){
            otrasCuentas.get(i).setActiva(false);
            otrasCuentas.get(i).merge();
        }        
        
        //Hago setActiva(true) a la cuenta que estoy guardando para que quede como predeterminada
        cuentaBancaria.setActiva(true);
        
        cuentaBancaria.persist();
        
        session.setComplete();
        
        return "redirect:/alojamiento/finWizard/?id=" + cuentaBancaria.getAlojamiento().getId();
        
        
    }
    
    /**
     * Muestra el formulario para registrar una cuenta bancaria
     * @param id
     * @param modelMap
     * @return 
     */
    @RequestMapping(value = "/cuentabancaria/form", method = RequestMethod.GET)
    public String createForm(
            @RequestParam("id") long id,
            ModelMap modelMap
            ) {
        
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.setAlojamiento(Alojamiento.findAlojamiento(id));
        modelMap.addAttribute("cuentaBancaria", cuentaBancaria);
        modelMap.addAttribute("tipocirifs", TipoCiRif.findAllTipoCiRifs());
        modelMap.addAttribute("bancoes", Banco.findAllBancoes());
        
        return "cuentabancaria/create";
    }
}
