package com.Ciclo3.Developers_CAR.Project3.repository;
import com.Ciclo3.Developers_CAR.Project3.entity.MovimientoDinero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public interface IMovimientoDineroRepository extends CrudRepository<MovimientoDinero, Long> {
    @Query(value = "select * from Movientos where empresa_id = :id", nativeQuery = true )
    public abstract ArrayList<MovimientoDinero> findByempresa(@Param("id") long id);
}
