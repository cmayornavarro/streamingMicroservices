package com.streaming.micostreaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.streaming.micostreaming.dao.CustomerDAO;
import com.streaming.micostreaming.model.CustomerMongo;

/*
  implements CommandLineRunner, the run method is automatically invoked when Spring Boot starts. *  
 *  CommandLineRunner can be used to run code at application startup, provided it should be contained within SpringApplication
 * */
@SpringBootApplication
public class MicostreamingApplication implements CommandLineRunner {
    /* spring Data MongoDB dynamically creates a proxy and injects it there */
    @Autowired
    private CustomerDAO repository;

    public static void main(String[] args) {
        SpringApplication.run(MicostreamingApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("deleteAll");
        repository.deleteAll();

        // save a couple of customers
        repository.save(new CustomerMongo("Alice", "Smith"));
        repository.save(new CustomerMongo("Bob", "Smith"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (CustomerMongo customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (CustomerMongo customer : repository.findByLastName("Smith")) {
            System.out.println(customer);
        }

    }

}
