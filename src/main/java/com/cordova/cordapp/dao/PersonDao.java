package com.cordova.cordapp.dao;

import com.cordova.cordapp.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> getPersons();

    Optional getPerson(UUID id);

    int deletePerson(UUID id);

    int updatePerson(UUID id);
}
