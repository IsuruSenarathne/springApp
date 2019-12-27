package com.cordova.cordapp.api;

import com.cordova.cordapp.model.Person;
import com.cordova.cordapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController (PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping
    public List getPersons() {
        return personService.getPersons();
    }

    @GetMapping(path = "/{id}")
    public Optional getPerson(@PathVariable("id") UUID id) {
        return personService.getPerson(id);
    }

    @DeleteMapping(path = "/{id}")
    public int deletePerson(@PathVariable("id") UUID id) {
        return personService.deletePerson(id);
    }
}
