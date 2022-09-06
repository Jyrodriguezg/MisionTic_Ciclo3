package com.Ciclo3.Developers_CAR.Project3.service;
import com.Ciclo3.Developers_CAR.Project3.entity.Empleado;

import java.util.List;

public interface IEmpleadoService {

    public Empleado findById(int id);

    public List<Empleado> findAll();

    public Empleado createEmpleado(Empleado empleado);

    public Empleado updateEmpleado(int id, Empleado empleado);

    public void deleteEmpleado(int id);
}

