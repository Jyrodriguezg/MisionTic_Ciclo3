package com.MVC.Ciclo3.service;

import com.MVC.Ciclo3.entity.Empresa;

import java.util.List;

public interface IEmpresaService {
    public Empresa FindById(int id);

    public List<Empresa> FindAll();


    public  Empresa createdEmpresa(Empresa empresa);


    public Empresa UpdateEmpresa(int id, Empresa empresa);

    public void deleteEmpresa(int id);
}
