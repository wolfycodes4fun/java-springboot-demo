package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakePersonDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        if (person.getId() == null)
            return personDao.insertPerson(person);
        return personDao.insertPerson(person.getId(), person);
    }

    public List<Person> getAllPeople() {
        return personDao.selectAllPeople();
    }
}
