package com.alojamientosturisticos.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.Comodidades;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "comodidades", automaticallyMaintainView = true, formBackingObject = Comodidades.class)
@RequestMapping("/comodidades/**")
@Controller
public class ComodidadesController {
}
