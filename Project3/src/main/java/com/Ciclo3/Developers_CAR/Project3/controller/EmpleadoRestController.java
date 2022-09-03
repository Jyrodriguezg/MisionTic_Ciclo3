package com.Ciclo3.Developers_CAR.Project3.controller;
import com.Ciclo3.Developers_CAR.Project3.entity.Empleado;
import com.Ciclo3.Developers_CAR.Project3.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class EmpleadoRestController {
    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping("/rol/{id}")
    public Empleado findById(@PathVariable int id){
        return empleadoService.findById(id);
    }
    @GetMapping("/rol")
    public List<Empleado> findAll() {
        return empleadoService.findAll();
    }
    @PostMapping("/rol")
    public Empleado createEmpleado(@RequestBody Empleado empleado){
        return empleadoService.createEmpleado(empleado);
    }
    @PutMapping("/rol/{id}")
    public Empleado updateEmpleado(@PathVariable int id, @RequestBody Empleado empleado){
        return empleadoService.updateEmpleado(id, empleado);
    }
    @DeleteMapping("/rol/{id}")
    public void deleteEmpleado(@PathVariable int id){
        empleadoService.deleteEmpleado(id);
    }
}
