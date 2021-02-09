package com.streaming.micostreaming.model;

import org.springframework.data.annotation.Id;

public class CustomerMongo {

    // @Id marks a field in a model class as the primary key:
    @Id
    public String id;

    public String firstName;
    public String lastName;

    public CustomerMongo() {
    }

    public CustomerMongo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%s, firstName='%s', lastName='%s']", id, firstName, lastName);
    }

}
