package com.Ciclo3.Developers_CAR.Project3.controller;
import com.Ciclo3.Developers_CAR.Project3.entity.Empresa;
import com.Ciclo3.Developers_CAR.Project3.service.iEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class EmpresaRestController {
    @Autowired

    private iEmpresaService  empresaService;

    @GetMapping("/rol/{id}")
    public Empresa FindById(@PathVariable int id) {
        return empresaService.FindById(id);
    }
    @GetMapping("/rol")
    public List<Empresa> FindAll(){
        return empresaService.FindAll();
    }
    @PostMapping("/rol")
    public Empresa createdEmpresa(@RequestBody Empresa empresa){
        return empresaService.createdEmpresa(empresa);
    }
    @PutMapping("/rol/{id}")
    public Empresa UpdateEmpresa(@PathVariable int id , @RequestBody Empresa empresa){
        return empresaService.UpdateEmpresa(id,empresa);
    }
    @DeleteMapping("/rol/{id}")
    public void deleteEmpresa(@PathVariable int id){
        empresaService.deleteEmpresa(id);
    }
}
