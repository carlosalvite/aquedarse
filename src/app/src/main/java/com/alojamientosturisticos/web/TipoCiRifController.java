package com.alojamientosturisticos.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.TipoCiRif;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "tipocirif", automaticallyMaintainView = true, formBackingObject = TipoCiRif.class)
@RequestMapping("/tipocirif/**")
@Controller
public class TipoCiRifController {
}
