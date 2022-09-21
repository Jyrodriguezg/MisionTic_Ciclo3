package com.Ciclo3.Developers_CAR.Project3.repository;
import com.Ciclo3.Developers_CAR.Project3.entity.MovimientoDinero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IMovimientoDineroRepository extends CrudRepository<MovimientoDinero, Long> {
    List<MovimientoDinero> findByMovimientosId(int Id);
}
