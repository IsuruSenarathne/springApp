package com.cordova.cordapp.service;

import com.cordova.cordapp.dao.PersonDao;
import com.cordova.cordapp.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonDao personDao;
    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao){
        this.personDao  = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }

    public List<Person> getPersons() {
        return personDao.getPersons();
    }

    public Optional getPerson(UUID id) {
        return personDao.getPerson(id);
    }

    public int deletePerson(UUID id) {
        return personDao.deletePerson(id);
    }
}

