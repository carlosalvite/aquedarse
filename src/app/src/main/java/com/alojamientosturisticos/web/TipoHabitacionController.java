package com.alojamientosturisticos.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.TipoHabitacion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "tipohabitacion", automaticallyMaintainView = true, formBackingObject = TipoHabitacion.class)
@RequestMapping("/tipohabitacion/**")
@Controller
public class TipoHabitacionController {
}
