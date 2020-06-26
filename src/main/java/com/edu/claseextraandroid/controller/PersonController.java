package com.edu.claseextraandroid.controller;

import com.edu.claseextraandroid.model.Direccion;
import com.edu.claseextraandroid.model.Person;
import com.edu.claseextraandroid.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired //traeme(inyectar) la dependencia PersonService
    private PersonService personService;

    @GetMapping("/person")
    public Person getPerson(){
        return personService.getPerson();
    }

    @PostMapping("/person")
    public Person addPerson(@RequestBody Person person){
        return person;
    }

}
