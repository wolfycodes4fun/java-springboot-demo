package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository("fakePersonDao")
public class FakePersonDataAccessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();
    private static final Logger logger = LoggerFactory.getLogger(FakePersonDataAccessService.class);

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getFirstName(), person.getLastName(), person.getJobTitle()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        Optional<Person> persona = DB.stream().filter(person -> person.getId().equals(id)).findFirst();
        return persona;
    }

    @Override
    public int deletePersonById(UUID id) {
        boolean wasDeleted = DB.removeIf(person -> person.getId().equals(id));
        return wasDeleted ? 1 : 0;
    }

    @Override
    public int updatePersonById(UUID id, String newJobTitle, Person person) {
        Optional<Person> persona = selectPersonById(id);
        persona.ifPresent(p -> p.setJobTitle(newJobTitle));
        return 0;
    }

}
