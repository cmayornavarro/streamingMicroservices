package com.streaming.micostreaming.model;

public class Client {

    private int id;
    private String name;
    private String lastName;
    private String telephone;

    public Client(int id, String name, String lastName, String telephone) {
        this.id = id;
        this.name = name;

        this.telephone = telephone;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
