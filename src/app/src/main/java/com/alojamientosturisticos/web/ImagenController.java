package com.alojamientosturisticos.web;

import com.alojamientosturisticos.domain.Alojamiento;
import java.util.logging.Level;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import com.alojamientosturisticos.domain.Imagen;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

@RooWebScaffold(path = "imagen", automaticallyMaintainView = true, formBackingObject = Imagen.class)
@RequestMapping("/imagen/**")
@Controller
public class ImagenController {
    
    private static Logger logger = Logger.getLogger(ImagenController.class);

    //Hacemos bind de la data del request a byte[]
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
    }
    
    @RequestMapping(value = "/imagen/uploadImagen", method = RequestMethod.POST)
    public void uploadImagen(
            MultipartHttpServletRequest request,
            HttpServletResponse response,
            @RequestParam(required = false, value="esPrincipal") Boolean esPrincipal,
            @RequestParam(required = false, value="idAlojamiento") Long idAlojamiento,
            ModelMap modelMap
            ) {
        
        Imagen laImagen = new Imagen();
        if (esPrincipal != null){
            if (esPrincipal){
                laImagen.setEsPrincipal(esPrincipal);
            }
        }
        else{
            laImagen.setEsPrincipal(false);
        }
        
        response.setContentType("application/json");
        PrintWriter out;
        
        try {
            
            laImagen.setFileData(request.getFile("file").getBytes());
            laImagen.setAlojamiento(Alojamiento.findAlojamiento(idAlojamiento));
            laImagen.persist();
            
            try {
                out = response.getWriter();
                out.write("{\"idImagen\": \""+laImagen.getId()+"\"}");
                out = null;
            } catch (IOException ex) {
                logger.error("Error escribiendo respuesta json en crearComodidadGeneral",ex);
            }
            
        } catch (IOException ex) {
            logger.error("Error guardando archivo de imagen", ex);
        }
        
    }
    
    @RequestMapping(value = "/imagen/previewImagen", method = RequestMethod.GET)
    public void previewImagen(
            @RequestParam("id") Long id,
            HttpServletResponse response
            ){
        //response.setContentType("");
        if (id == null) {
            throw new IllegalArgumentException("An image Identifier is required");
        }
        
        Imagen laImagen = Imagen.findImagen(id);
        
        try {
            
            response.setContentType("image/jpg");                     
            response.getOutputStream().write(laImagen.getFileData());            
            response.getOutputStream().close();
            
        } catch (IOException ex) {
            logger.error("Error renderizando preview de imagen",ex);
        }
    }
    
    @RequestMapping(value = "/imagen/deleteImagen", method = RequestMethod.POST)
    public void deleteImagen(
            @RequestParam("id") Long id,
            HttpServletResponse response
            ){
        //response.setContentType("");
        if (id == null) {
            throw new IllegalArgumentException("An image Identifier is required");
        }
        
        Imagen laImagen = Imagen.findImagen(id);
        laImagen.remove();        
        
    }
    
   
    
}
