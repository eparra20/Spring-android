package com.edu.claseextraandroid.controller;

import com.edu.claseextraandroid.model.Person;
import com.edu.claseextraandroid.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired //traeme(inyectar) la dependencia PersonService
    private PersonService personService;

    @GetMapping("/person")
    public List<Person> getPerson(){
        return personService.getPersons();
    }

    @GetMapping("/person-page")
    public Page<Person> getPerson(Pageable pageable){
        return personService.getPersons(pageable);
    }


    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable("id") Integer id){
        return personService.getPersonById(id);
    }

    @GetMapping("/person/query")
    public List<Person> getPerson(@RequestParam("nombre") String nombre){
        return personService.getPersonByName(nombre);
    }

    @PostMapping("/person")
    public Person addPerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

}
