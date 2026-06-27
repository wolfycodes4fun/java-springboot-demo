package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonRepository;
import com.example.demo.model.Person;

@Service
public class ProductionPersonService {
    private final PersonRepository personRepository;

    @Autowired
    public ProductionPersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createNewPerson(Person person) {
        return personRepository.save(person);
    }
}
