package com.MVC.Ciclo3.repository;
import com.MVC.Ciclo3.entity.MovimientoDinero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface IMovimientoDineroRepository extends CrudRepository<MovimientoDinero, Long> {
    @Query(value = "select * from Movientos where empresa_id = :id", nativeQuery = true )
    public abstract ArrayList<MovimientoDinero> findByempresa(@Param("id") long id);
}
