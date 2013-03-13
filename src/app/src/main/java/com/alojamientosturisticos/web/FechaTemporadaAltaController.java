package com.alojamientosturisticos.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.FechaTemporadaAlta;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "fechatemporadaalta", automaticallyMaintainView = true, formBackingObject = FechaTemporadaAlta.class)
@RequestMapping("/fechatemporadaalta/**")
@Controller
public class FechaTemporadaAltaController {
}
