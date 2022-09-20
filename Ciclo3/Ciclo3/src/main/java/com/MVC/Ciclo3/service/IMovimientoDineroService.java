package com.MVC.Ciclo3.service;

import com.MVC.Ciclo3.entity.MovimientoDinero;

import java.util.List;

public interface IMovimientoDineroService {
    public MovimientoDinero FindById(int id);

    public List<MovimientoDinero> FindAll();


    public  MovimientoDinero createdMovimientoDinero(MovimientoDinero movimiento);


    public MovimientoDinero UpdateMovimientoDinero(int id, MovimientoDinero movimiento);

    public void deleteMovimientoDinero(int id);
}
