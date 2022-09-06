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

   // @GetMapping("/enterprises/{id}/movements")
    // public MovimientoDinero FindById(@PathVariable int id) {
     //   return movimientoDineroService.FindById(id);
    //}
    @GetMapping("/enterprises/{id}/movements")
    public List<MovimientoDinero> FindAll(){
        return movimientoDineroService.FindAll();
    }
    @PostMapping("/enterprises/{id}/movements")
    public MovimientoDinero createdMovimientoDinero(@RequestBody MovimientoDinero movimiento){
        return movimientoDineroService.createdMovimientoDinero(movimiento);
    }
    @PutMapping("/enterprises/{id}/movements")
    public MovimientoDinero UpdateMovimientoDinero(@PathVariable int id , @RequestBody MovimientoDinero movimiento){
        return movimientoDineroService.UpdateMovimientoDinero(id,movimiento);
    }
    @DeleteMapping("/enterprises/{id}/movements")
    public void deleteMovimientoDinero(@PathVariable int id){
        movimientoDineroService.deleteMovimientoDinero(id);
    }
}
