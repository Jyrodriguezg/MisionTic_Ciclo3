package com.Ciclo3.Developers_CAR.Project3.repository;
import com.Ciclo3.Developers_CAR.Project3.entity.Empresa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpresaRepósitory extends CrudRepository<Empresa, Long> {
}
