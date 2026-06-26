package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdatePersonDataPayload {

    private String newJobTitle;

    public UpdatePersonDataPayload(@JsonProperty ("jobTitle") String newJobTitle) {
        this.newJobTitle = newJobTitle;
    }

    public String getNewJobTitle() {
        return this.newJobTitle;
    }
}
