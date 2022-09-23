package com.Ciclo3.Developers_CAR.Project3.controller;
import com.Ciclo3.Developers_CAR.Project3.entity.Empresa;
import com.Ciclo3.Developers_CAR.Project3.entity.MovimientoDinero;
import com.Ciclo3.Developers_CAR.Project3.service.IMovimientoDineroService;
import com.Ciclo3.Developers_CAR.Project3.service.iEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class MovimientoDineroRestController {
    @Autowired
    private IMovimientoDineroService movimientoDineroService;


    @GetMapping("/movements/{id}")
     public MovimientoDinero FindById(@PathVariable int id) {
       return movimientoDineroService.FindById(id);
    }
    @GetMapping("/enterprises/{id}/movements")
    public List<MovimientoDinero>  FindByEmpresa(@PathVariable int id){
        return movimientoDineroService.findByempresa(id);
    }
    @GetMapping("/movements")
    public List<MovimientoDinero>  FindAll(){
         List<MovimientoDinero> movimientos = movimientoDineroService.FindAll();
        return movimientos;
    }

    @PostMapping("/movements/{id}")
    public MovimientoDinero createdMovimientoDinero(@RequestBody MovimientoDinero movimiento){
        return movimientoDineroService.createdMovimientoDinero(movimiento);
    }
    @PutMapping("/movements/{id}")
    public MovimientoDinero UpdateMovimientoDinero(@PathVariable int id , @RequestBody MovimientoDinero movimiento){
        return movimientoDineroService.UpdateMovimientoDinero(id,movimiento);
    }
    @DeleteMapping("/movements/{id}")
    public void deleteMovimientoDinero(@PathVariable int id){
        movimientoDineroService.deleteMovimientoDinero(id);
    }
}
