package com.MVC.Ciclo3.Controlller;

import com.MVC.Ciclo3.entity.Empleado;
import com.MVC.Ciclo3.entity.Empresa;
import com.MVC.Ciclo3.service.IEmpleadoService;
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
public class UsuarioController {
    @Autowired
    private IEmpleadoService empleadoservice;
    @Autowired
    private IEmpresaService EmpresaService;

    private final Logger LOG = Logger.getLogger(""+UsuarioController.class );

    @GetMapping("/Usuarios/List")
    public String getListUsuarios (Model model){
        LOG.log(Level.INFO, "getListUsuarios");
        List<Empleado> empleados= empleadoservice.findAll();
        model.addAttribute("empleados", empleados);
     return "Usuarios/List";
    }
    @GetMapping("/Usuarios/crear")
    public String CreateEmpleado(Model model){
        LOG.log(Level.INFO, "NuevoEmpleado");
        //Empleado
        Empleado empleado = new Empleado();
        model.addAttribute("empleado", empleado);
        //Empresa
        List<Empresa> empresas = EmpresaService.FindAll();
        model.addAttribute("empresas", empresas);

        return "Usuarios/Editar";
    }
    @PostMapping("/Guardar")
    public String guardarEmpleado(@Valid Empleado empleado, BindingResult errores, Model modelo){
        LOG.log(Level.INFO, "guardarEmpleado");
       /** if (empleado.getEmpresaEmpleado().getIdEmpresa() == 0) {
            String propertyPath = "violation.getPropertyPath().toString()";
            String message = "No puede ser Null";
            FieldError field = new FieldError();
            errores.addError(field);
        }*/
        if(errores.hasErrors()){
            return "Usuarios/Editar";
        }
        empleado = empleadoservice.createEmpleado(empleado);
        return "redirect:/Usuarios/List";

    }
    @RequestMapping(value = "/EditarUsuario/{id}", method = RequestMethod.GET)
    public String EdtitarEmpleado(@PathVariable("id") int id, Model model){
        LOG.log(Level.INFO, "EdtitarEmpleado");
        List<Empresa> empresas = EmpresaService.FindAll();
        model.addAttribute("empresas", empresas);
        Empleado empleado = empleadoservice.findById(id);
        model.addAttribute("empleado", empleado);
        return "Usuarios/Editar";
    }
}
