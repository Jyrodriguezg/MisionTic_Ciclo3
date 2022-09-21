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


   // @GetMapping("/enterprises/{id}/movements")
    // public MovimientoDinero FindById(@PathVariable int id) {
     //   return movimientoDineroService.FindById(id);
    //}
    @GetMapping("/enterprises/{id}/movements")
    public List<MovimientoDinero>  FindById(@PathVariable int id){
        List<MovimientoDinero> movimientos = movimientoDineroService.findByMovimientosId(id);
        return movimientos;
    }

 /**   @GetMapping("/tutorials/{tutorialId}/comments")
    public ResponseEntity<List<Comment>> getAllCommentsByTutorialId(@PathVariable(value = "tutorialId") Long tutorialId) {
        if (!tutorialRepository.existsById(tutorialId)) {
            throw new ResourceNotFoundException("Not found Tutorial with id = " + tutorialId);
        }

        List<Comment> comments = commentRepository.findByTutorialId(tutorialId);
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }*/

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
