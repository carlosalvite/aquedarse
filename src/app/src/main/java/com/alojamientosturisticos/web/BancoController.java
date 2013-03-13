package com.alojamientosturisticos.web;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.Banco;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "banco", automaticallyMaintainView = true, formBackingObject = Banco.class)
@RequestMapping("/banco/**")
@Controller
public class BancoController {
}
