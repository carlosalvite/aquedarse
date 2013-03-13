package com.alojamientosturisticos.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.Configuracion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "configuracion", automaticallyMaintainView = true, formBackingObject = Configuracion.class)
@RequestMapping("/configuracion/**")
@Controller
public class ConfiguracionController {
}
