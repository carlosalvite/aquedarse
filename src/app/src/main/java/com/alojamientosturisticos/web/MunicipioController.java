package com.alojamientosturisticos.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.Municipio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "municipio", automaticallyMaintainView = true, formBackingObject = Municipio.class)
@RequestMapping("/municipio/**")
@Controller
public class MunicipioController {
}
