package com.alojamientosturisticos.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.TipoAlojamiento;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "tipoalojamiento", automaticallyMaintainView = true, formBackingObject = TipoAlojamiento.class)
@RequestMapping("/tipoalojamiento/**")
@Controller
public class TipoAlojamientoController {
}
