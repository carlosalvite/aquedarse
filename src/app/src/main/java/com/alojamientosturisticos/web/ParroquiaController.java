package com.alojamientosturisticos.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.Parroquia;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "parroquia", automaticallyMaintainView = true, formBackingObject = Parroquia.class)
@RequestMapping("/parroquia/**")
@Controller
public class ParroquiaController {
}
