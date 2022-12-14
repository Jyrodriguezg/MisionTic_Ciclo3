package com.Ciclo3.Developers_CAR.Project3.service;

import com.Ciclo3.Developers_CAR.Project3.entity.Empresa;
import com.Ciclo3.Developers_CAR.Project3.repository.IEmpresaRep√≥sitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService  implements iEmpresaService{
    @Autowired
    public IEmpresaRep√≥sitory empresaRepository;
    @Override
    public Empresa FindById(int id) {
        Optional<Empresa> empresa = empresaRepository.findById((long)id);
        return empresa.get();
    }

    @Override
    public List<Empresa> FindAll() {
        List<Empresa> empresas = (List<Empresa>)empresaRepository.findAll();
        return empresas;
    }

    @Override
    public Empresa createdEmpresa(Empresa empresa) {
        Empresa newempresa = empresaRepository.save(empresa);
        return newempresa;
    }

    @Override
    public Empresa UpdateEmpresa(int id, Empresa empresa) {
        Empresa putempresa = empresaRepository.save(empresa);
        return putempresa;
    }

    @Override
    public void deleteEmpresa(int id) {
        empresaRepository.deleteById((long)id);
    }
}
