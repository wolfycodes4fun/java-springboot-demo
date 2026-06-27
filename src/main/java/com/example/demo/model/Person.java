package com.example.demo.model;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String jobTitle;

    public Person(
        @JsonProperty("id") UUID id, 
        @JsonProperty("firstName") String firstName, 
        @JsonProperty ("lastName") String lastName,
        @JsonProperty ("email") String email,
        @JsonProperty ("jobTitle") String jobTitle) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.jobTitle = jobTitle;
    }

    public Person() {

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

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
