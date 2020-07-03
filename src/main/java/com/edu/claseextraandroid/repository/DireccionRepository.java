package com.edu.claseextraandroid.repository;

import com.edu.claseextraandroid.model.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories(value = "direccion")
public interface DireccionRepository extends JpaRepository<Direccion,Integer> {

}
