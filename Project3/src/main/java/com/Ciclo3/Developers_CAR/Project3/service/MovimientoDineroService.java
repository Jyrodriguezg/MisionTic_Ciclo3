package com.Ciclo3.Developers_CAR.Project3.service;

import com.Ciclo3.Developers_CAR.Project3.entity.MovimientoDinero;
import com.Ciclo3.Developers_CAR.Project3.repository.IMovimientoDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovimientoDineroService implements IMovimientoDineroService{
    @Autowired
    public IMovimientoDineroRepository movimientoRepository;

    @Override
    public MovimientoDinero FindById(int id) {
        Optional<MovimientoDinero> movimiento = movimientoRepository.findById((long)id);
        return movimiento.get();
    }

    @Override
    public List<MovimientoDinero> FindAll() {
        List<MovimientoDinero> movimientos = (List<MovimientoDinero>)movimientoRepository.findAll();
        return movimientos;
    }

    @Override
    public MovimientoDinero createdMovimientoDinero(MovimientoDinero movimiento) {
        MovimientoDinero newmovimiento = movimientoRepository.save(movimiento);
        return newmovimiento;
    }

    @Override
    public MovimientoDinero UpdateMovimientoDinero(int id, MovimientoDinero movimiento) {
        MovimientoDinero putmovimiento= movimientoRepository.save(movimiento);
        return putmovimiento;
    }

    @Override
    public void deleteMovimientoDinero(int id) {
        movimientoRepository.deleteById((long)id);
    }

    @Override
    public ArrayList<MovimientoDinero> findByempresa(long id) {
        return movimientoRepository.findByempresa(id);
    }

}
