package com.alojamientosturisticos.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.TipoTarifa;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "tipotarifa", automaticallyMaintainView = true, formBackingObject = TipoTarifa.class)
@RequestMapping("/tipotarifa/**")
@Controller
public class TipoTarifaController {
}
