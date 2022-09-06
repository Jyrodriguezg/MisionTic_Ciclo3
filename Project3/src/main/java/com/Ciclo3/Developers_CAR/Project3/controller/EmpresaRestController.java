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

    @GetMapping("/enterprises/{id}")
    public Empresa FindById(@PathVariable int id) {
        return empresaService.FindById(id);
    }
    @GetMapping("/enterprises")
    public List<Empresa> FindAll(){
        return empresaService.FindAll();
    }
    @PostMapping("/enterprises")
    public Empresa createdEmpresa(@RequestBody Empresa empresa){
        return empresaService.createdEmpresa(empresa);
    }
    @PutMapping("/enterprises/{id}")
    public Empresa UpdateEmpresa(@PathVariable int id , @RequestBody Empresa empresa){
        return empresaService.UpdateEmpresa(id,empresa);
    }
    @DeleteMapping("/enterprises/{id}")
    public void deleteEmpresa(@PathVariable int id){
        empresaService.deleteEmpresa(id);
    }
}
