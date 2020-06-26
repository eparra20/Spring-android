package com.edu.claseextraandroid.service;

import com.edu.claseextraandroid.model.Direccion;
import com.edu.claseextraandroid.model.Person;
import org.springframework.stereotype.Service;

@Service // le estamos diciendo al framework , toma este obejto y gestionalo
public class PersonService {

    public PersonService() {
        System.out.println("Hola creee el personService");
    }

    public Person getPerson(){
        Direccion dir = new Direccion("pepito dir");
        Person person = Person.builder().nombre("Eduardo").apellido("Parra").apodo("Paenza").edad(26)
                .direccion(dir).build();

        return person;
    }
}
