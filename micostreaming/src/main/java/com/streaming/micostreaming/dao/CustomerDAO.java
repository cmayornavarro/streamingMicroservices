package com.streaming.micostreaming.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.streaming.micostreaming.model.CustomerMongo;

//DAO : data access object
// MongoRepository<T,ID>
public interface CustomerDAO extends MongoRepository<CustomerMongo, String> {

    public CustomerMongo findByFirstName(String firstName);

    public List<CustomerMongo> findByLastName(String lastName);

}
