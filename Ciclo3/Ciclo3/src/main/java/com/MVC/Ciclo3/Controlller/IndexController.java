package com.MVC.Ciclo3.Controlller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.model.IAttribute;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class IndexController {
    private final Logger LOG = Logger.getLogger(""+IndexController.class );
    @GetMapping("/")
    public String index(Model model){
        LOG.log(Level.INFO, "Index");
        var mensaje = "Bienvenidos al sistema de transacciones ";
        model.addAttribute("mensaje", mensaje);
        return "index";
    }
}
