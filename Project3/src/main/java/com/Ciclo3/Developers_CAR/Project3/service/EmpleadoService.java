package com.Ciclo3.Developers_CAR.Project3.service;
import com.Ciclo3.Developers_CAR.Project3.entity.Empleado;
import com.Ciclo3.Developers_CAR.Project3.repository.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService implements IEmpleadoService{
    @Autowired
    private IEmpleadoRepository empleadoRepository;
    @Override
    public Empleado findById(int id) {
        Optional<Empleado> empleado = empleadoRepository.findById((long) id);
        return empleado.get();
    }

    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = (List<Empleado>) empleadoRepository.findAll();
        return empleados;
    }

    @Override
    public Empleado createEmpleado(Empleado empleado) {
        Empleado newempleado = empleadoRepository.save(empleado);
        return newempleado;
    }

    @Override
    public Empleado updateEmpleado(int id, Empleado empleado) {
        Empleado putempleado = empleadoRepository.save(empleado);
        return putempleado;
    }

    @Override
    public void deleteEmpleado(int id) {
        empleadoRepository.deleteById((long) id);
    }
}
