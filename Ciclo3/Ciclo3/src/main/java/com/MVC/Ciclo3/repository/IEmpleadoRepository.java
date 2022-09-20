package com.MVC.Ciclo3.repository;

import com.MVC.Ciclo3.entity.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoRepository extends CrudRepository<Empleado, Long> {
}
