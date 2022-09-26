package com.MVC.Ciclo3.Controlller;

import com.MVC.Ciclo3.entity.Empresa;
import com.MVC.Ciclo3.entity.MovimientoDinero;
import com.MVC.Ciclo3.service.IMovimientoDineroService;
import com.MVC.Ciclo3.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EmpresaController {
    @Autowired
    private IEmpresaService empresaService;
    @Autowired
    private IMovimientoDineroService TransaccionesEmpresa;
    private final Logger LOG = Logger.getLogger(""+UsuarioController.class );
    @GetMapping("/Empresas/List")
    public String getListEmpresa(Model model){
        LOG.log(Level.INFO, "getListEmpresas");
        List<Empresa> empresas = empresaService.FindAll();
        model.addAttribute("empresas", empresas);
        return "Empresas/List";
    }
    @GetMapping("/Empresas/crear")
    public String CreateEmpresa(Model model){
        LOG.log(Level.INFO, "CreateEmpresa");

        Empresa empresa = new Empresa();
        model.addAttribute("empresa", empresa);
        return"Empresas/Editar";
    }
    @PostMapping("/GuardarEmpresa")
    public String GuardarEmpresa(@Valid Empresa empresa, BindingResult errores, Model modelo){
        LOG.log(Level.INFO, "GuardarEmpresa");
        if(errores.hasErrors()){
            return "Empresas/Editar";
        }
        empresa = empresaService.createdEmpresa(empresa);
        return"redirect:/Empresas/List";
    }
    @RequestMapping(value = "/EditarEmpresa/{id}", method = RequestMethod.GET)
    public String EditarEmpresa(@PathVariable("id") int id, Model model){
        LOG.log(Level.INFO, "EditarEmpresa");
        Empresa empresa = empresaService.FindById(id);
        model.addAttribute("empresa", empresa);
        return "Empresas/Editar";
    }
    @GetMapping("/TransaccionesEmpresa/{id}")
    public String TransaccionesEmpresa (@PathVariable("id") int id, Model model){
        LOG.log(Level.INFO, "TransaccionesEmpresa");
        List<MovimientoDinero> transacciones = TransaccionesEmpresa.findByempresa(id);
        model.addAttribute("transacciones", transacciones);
        return "Empresas/Transacciones";
    }
}
