package com.MVC.Ciclo3.Controlller;

import com.MVC.Ciclo3.entity.Empresa;
import com.MVC.Ciclo3.service.iEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EmpresaController {
    @Autowired
    private iEmpresaService empresaService;
    private final Logger LOG = Logger.getLogger(""+UsuarioController.class );
    @GetMapping("/Empresas/List")
    public String getListEmpresa(Model model){
        LOG.log(Level.INFO, "getListEmpresas");
        List<Empresa> empresas = empresaService.FindAll();
        model.addAttribute("empresas", empresas);
        return "/Empresas/List";
    }
    @GetMapping("/Empresas/Editar")
    public String CreateEmpresa(Model model){
        LOG.log(Level.INFO, "CreateEmpresa");

        Empresa empresa = new Empresa();
        model.addAttribute("empresa", empresa);
        return"/Empresas/Editar";
    }
}
