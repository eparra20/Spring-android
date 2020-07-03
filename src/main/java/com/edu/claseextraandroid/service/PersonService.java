package com.edu.claseextraandroid.service;

import com.edu.claseextraandroid.model.Person;
import com.edu.claseextraandroid.repository.DireccionRepository;
import com.edu.claseextraandroid.repository.PersonRepository;
import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // le estamos diciendo al framework , toma este obejto y gestionalo
public class PersonService {

    /**
     * Inyectamente el reposiory de person con
     * Conexion a la base datos.
     */
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private DireccionRepository direccionRepository;

    public PersonService() {

    }


    public Person getPersonById(Integer id){

        Optional<Person> personOptional = personRepository.findById(id);
        return  personOptional.orElseThrow(() ->  new RuntimeException("Persona no encontrada") );

    }


    public List<Person> getPersons(){
        return personRepository.findAll();
    }

    public Page<Person> getPersons(Pageable pageable){
        return personRepository.findAll(pageable);
    }

    public Person savePerson(Person person){

       return  personRepository.save(person);

    }

    public List<Person> getPersonByName(String nombre) {
        return personRepository.findByPepe(nombre);
    }
}
