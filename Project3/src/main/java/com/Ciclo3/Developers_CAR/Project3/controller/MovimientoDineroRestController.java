package com.Ciclo3.Developers_CAR.Project3.controller;
import com.Ciclo3.Developers_CAR.Project3.entity.Empresa;
import com.Ciclo3.Developers_CAR.Project3.entity.MovimientoDinero;
import com.Ciclo3.Developers_CAR.Project3.service.IMovimientoDineroService;
import com.Ciclo3.Developers_CAR.Project3.service.iEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class MovimientoDineroRestController {
    @Autowired

    private IMovimientoDineroService movimientoDineroService;

    @GetMapping("/rol/{id}")
    public MovimientoDinero FindById(@PathVariable int id) {
        return movimientoDineroService.FindById(id);
    }
    @GetMapping("/rol")
    public List<MovimientoDinero> FindAll(){
        return movimientoDineroService.FindAll();
    }
    @PostMapping("/rol")
    public MovimientoDinero createdMovimientoDinero(@RequestBody MovimientoDinero movimiento){
        return movimientoDineroService.createdMovimientoDinero(movimiento);
    }
    @PutMapping("/rol/{id}")
    public MovimientoDinero UpdateMovimientoDinero(@PathVariable int id , @RequestBody MovimientoDinero movimiento){
        return movimientoDineroService.UpdateMovimientoDinero(id,movimiento);
    }
    @DeleteMapping("/rol/{id}")
    public void deleteMovimientoDinero(@PathVariable int id){
        movimientoDineroService.deleteMovimientoDinero(id);
    }
}
