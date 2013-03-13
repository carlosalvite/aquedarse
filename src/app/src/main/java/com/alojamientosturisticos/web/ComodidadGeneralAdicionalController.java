package com.alojamientosturisticos.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.ComodidadGeneralAdicional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "comodidadgeneraladicional", automaticallyMaintainView = true, formBackingObject = ComodidadGeneralAdicional.class)
@RequestMapping("/comodidadgeneraladicional/**")
@Controller
public class ComodidadGeneralAdicionalController {
}
