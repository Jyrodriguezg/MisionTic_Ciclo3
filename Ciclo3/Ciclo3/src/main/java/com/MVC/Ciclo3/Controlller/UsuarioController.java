package com.MVC.Ciclo3.Controlller;

import com.MVC.Ciclo3.entity.Empleado;
import com.MVC.Ciclo3.entity.Empresa;
import com.MVC.Ciclo3.entity.Rol;
import com.MVC.Ciclo3.service.IEmpleadoService;
import com.MVC.Ciclo3.service.iEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class UsuarioController {
    @Autowired
    private IEmpleadoService empleadoservice;
    @Autowired
    private iEmpresaService EmpresaService;

    private final Logger LOG = Logger.getLogger(""+UsuarioController.class );
    @GetMapping("/Usuarios/List")
    public String getListUsuarios (Model model){
        LOG.log(Level.INFO, "getListUsuarios");
        List<Empleado> empleados= empleadoservice.findAll();
        model.addAttribute("empleados", empleados);
     return "Usuarios/List";
    }
    @GetMapping("/Usuarios/Editar")
    public String CreateEmpleado(Model model){
        LOG.log(Level.INFO, "NuevoEmpleado");
        //Empleado
        Empleado empleado = new Empleado();
        model.addAttribute("empleado", empleado);
        //Empresa
        List <Empresa> empresas = EmpresaService.FindAll();
        model.addAttribute("empresas", empresas);
        //Rol
        return "Usuarios/Editar";
    }
}
