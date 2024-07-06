package com.isr.holamundo.repository;


import com.isr.holamundo.entity.EstudianteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository
extends CrudRepository<EstudianteEntity, Integer> {

}
