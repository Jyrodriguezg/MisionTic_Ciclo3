package com.Ciclo3.Developers_CAR.Project3.repository;

import com.Ciclo3.Developers_CAR.Project3.entity.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends CrudRepository<Empleado, Long> {
}
