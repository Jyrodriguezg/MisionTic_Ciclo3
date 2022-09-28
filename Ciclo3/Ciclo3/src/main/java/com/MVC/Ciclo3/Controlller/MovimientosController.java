package com.MVC.Ciclo3.Controlller;

import com.MVC.Ciclo3.entity.Empleado;
import com.MVC.Ciclo3.entity.Empresa;
import com.MVC.Ciclo3.entity.MovimientoDinero;
import com.MVC.Ciclo3.service.IEmpleadoService;
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
public class MovimientosController {
    @Autowired
    private IMovimientoDineroService transaccionService;
    @Autowired
    private IEmpresaService empresaService;
    @Autowired
    private IEmpleadoService EmpleadoService;
    private final Logger LOG = Logger.getLogger(""+UsuarioController.class );

    @GetMapping("/Movimientos/List")
    public String getListMovimientos(Model model) {
        LOG.log(Level.INFO, "getListMovimientos");
        List<MovimientoDinero> movimientos =  transaccionService.FindAll();
        model.addAttribute("transaccion", movimientos);
        return "Movimientos/List";
    }
    @GetMapping("/Movimientos/crear")
    public String CreateMov(Model model){
        LOG.log(Level.INFO, "CreateMov");
        //Movimiento
        MovimientoDinero movimiento = new MovimientoDinero();
        model.addAttribute("transaccion", movimiento);
        //Empresa
        List<Empleado> empleados = EmpleadoService.findAll();
        model.addAttribute("empleados", empleados);
        //Empresa
        List<Empresa> empresa = empresaService.FindAll();
        model.addAttribute("empresa", empresa);
        return "Movimientos/Editar";
    }
    @PostMapping("/GuardarMov")
    public String guardarMov(@Valid MovimientoDinero movimiento, BindingResult errors, Model model){
        LOG.log(Level.INFO, "guardarMov");
        //if(errors.hasErrors()){
            //return "Movimientos/Editar";
        //}
        movimiento = transaccionService.createdMovimientoDinero(movimiento);
        return "redirect:/Movimientos/List";
    }
    @RequestMapping(value = "/EditarMov/{id}", method = RequestMethod.GET)
    public String EdtitarMovimientos(@PathVariable("id") int id, Model model){
        LOG.log(Level.INFO, "EdtitarMovimientos");
        //Movimiento
        MovimientoDinero Movimiento = transaccionService.FindById(id);
        model.addAttribute("transaccion", Movimiento);
        //Empleado
        List<Empleado> empleados = EmpleadoService.findAll();
        model.addAttribute("empleados", empleados);
        //Empresa
        List<Empresa> empresa = empresaService.FindAll();
        model.addAttribute("empresa", empresa);
        return "Movimientos/Editar";
    }
}
