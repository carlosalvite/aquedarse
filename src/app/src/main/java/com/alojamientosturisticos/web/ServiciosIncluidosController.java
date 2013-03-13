package com.alojamientosturisticos.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;

import com.alojamientosturisticos.domain.ComodidadGeneral;
import com.alojamientosturisticos.domain.ServiciosIncluidos;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

@RooWebScaffold(path = "serviciosincluidos", automaticallyMaintainView = true, formBackingObject = ServiciosIncluidos.class)
@RequestMapping("/serviciosincluidos/**")
@Controller
public class ServiciosIncluidosController {
	

}
