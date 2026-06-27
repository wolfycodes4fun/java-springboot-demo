package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository("SQLMigration")
public class SQLPersonDataAccessService implements PersonDao {
    public int insertPerson(UUID id, Person person) {
        return 0;
    };

    public List<Person> selectAllPeople() {
        return null;
    };

    public Optional<Person> selectPersonById(UUID id) {
        return null;
    };

    public int deletePersonById(UUID id) {
        return 0;
    };

    public boolean updatePersonById(UUID id, String newJobTitle) {
        return false;
    };
}
