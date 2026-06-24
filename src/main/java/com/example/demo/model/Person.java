package com.example.demo.model;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    private final UUID id;
    private final String firstName;
    private final String lastName;

    public Person(
        @JsonProperty("id") UUID id, 
        @JsonProperty("firstName") String firstName, 
        @JsonProperty ("lastName") String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UUID getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
