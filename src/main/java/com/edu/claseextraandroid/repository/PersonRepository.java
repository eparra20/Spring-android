package com.edu.claseextraandroid.repository;

import com.edu.claseextraandroid.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

    List<Person> findByNombre(String nombre);


    @Query(value = "SELECT * from person where name = :name",nativeQuery = true)
    List<Person> findByPepe(@Param("name") String nombre);
}
