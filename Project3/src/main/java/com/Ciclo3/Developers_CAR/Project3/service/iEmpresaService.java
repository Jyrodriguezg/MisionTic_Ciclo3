package com.Ciclo3.Developers_CAR.Project3.service;

import com.Ciclo3.Developers_CAR.Project3.entity.Empresa;

import java.util.List;

public interface iEmpresaService{
    public Empresa FindById(int id);

    public List<Empresa> FindAll();


    public  Empresa createdEmpresa(Empresa empresa);


    public Empresa UpdateEmpresa(int id, Empresa empresa);

    public void deleteEmpresa(int id);
}
