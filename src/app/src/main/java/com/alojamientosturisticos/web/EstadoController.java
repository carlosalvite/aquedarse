package com.alojamientosturisticos.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.Estado;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "estado", automaticallyMaintainView = true, formBackingObject = Estado.class)
@RequestMapping("/estado/**")
@Controller
public class EstadoController {
}
