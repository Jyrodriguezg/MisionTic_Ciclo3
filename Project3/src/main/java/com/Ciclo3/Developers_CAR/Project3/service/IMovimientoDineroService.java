package com.Ciclo3.Developers_CAR.Project3.service;

import com.Ciclo3.Developers_CAR.Project3.entity.MovimientoDinero;

import java.util.List;

public interface IMovimientoDineroService {
    public MovimientoDinero FindById(int id);

    public List<MovimientoDinero> FindAll();


    public  MovimientoDinero createdMovimientoDinero(MovimientoDinero movimiento);


    public MovimientoDinero UpdateMovimientoDinero(int id, MovimientoDinero movimiento);

    public void deleteMovimientoDinero(int id);
}
