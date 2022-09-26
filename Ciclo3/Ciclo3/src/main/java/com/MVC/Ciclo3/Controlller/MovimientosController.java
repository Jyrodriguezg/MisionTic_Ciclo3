package com.MVC.Ciclo3.Controlller;

import com.MVC.Ciclo3.entity.Empleado;
import com.MVC.Ciclo3.entity.Empresa;
import com.MVC.Ciclo3.entity.MovimientoDinero;
import com.MVC.Ciclo3.service.IEmpleadoService;
import com.MVC.Ciclo3.service.IMovimientoDineroService;
import com.MVC.Ciclo3.service.iEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class MovimientosController {
    @Autowired
    private IMovimientoDineroService transaccionService;
    @Autowired
    private iEmpresaService empresaService;
    @Autowired
    private IEmpleadoService EmpleadoService;
    private final Logger LOG = Logger.getLogger(""+UsuarioController.class );

    @GetMapping("/Movimientos/List")
    public String getListMovimientos(Model model) {
        LOG.log(Level.INFO, "getListMovimientos");
        List<MovimientoDinero> movimientos = transaccionService.FindAll();
        model.addAttribute("transaccion", movimientos);
        return "Movimientos/List";
    }
    @GetMapping("/Movimientos/Editar")
    public String CreateMov(Model model){
        LOG.log(Level.INFO, "CreateMov");
        //Movimiento
        MovimientoDinero Movimiento = new MovimientoDinero();
        model.addAttribute("Transaccion", Movimiento);
        //Empresa
        List<Empleado> usuarioRegistro = EmpleadoService.findAll();
        model.addAttribute("usuarioRegistro", usuarioRegistro);
        //Empresa
        List<Empresa> empresa = empresaService.FindAll();
        model.addAttribute("empresa", empresa);
        //Rol
        return "Movimientos/Editar";
    }
    @PostMapping("/GuardarMov")
    public String guardarMov(@Valid MovimientoDinero Movimiento, Model modelo){
        LOG.log(Level.INFO, "guardarMov");
        Movimiento = transaccionService.createdMovimientoDinero(Movimiento);
        return "redirect:/Movimientos/List";
    }
    @RequestMapping(value = "/EditarMov/{id}", method = RequestMethod.GET)
    public String EdtitarMovimientos(@PathVariable("id") int id, Model model){
        LOG.log(Level.INFO, "EdtitarMovimientos");
        //Empleado
        List<Empleado> usuarioRegistro = EmpleadoService.findAll();
        model.addAttribute("usuarioRegistro", usuarioRegistro);
        //Empresa
        List<Empresa> empresa = empresaService.FindAll();
        model.addAttribute("empresa", empresa);
        //Movimiento
        MovimientoDinero Movimiento = transaccionService.FindById(id);
        model.addAttribute("Transaccion", Movimiento);
        return "Movimientos/Editar";
    }
}
