package com.streaming.micostreaming.dao;

import java.util.List;

import com.streaming.micostreaming.model.Client;

public interface ClientDAO {
    public List<Client>findAll();
    public  Client findById(int id);
    public  Client save(Client film);    
    
}
