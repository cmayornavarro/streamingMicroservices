package com.streaming.micostreaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.streaming.micostreaming.dao.ClientDAO;
import com.streaming.micostreaming.model.Client;

@RestController
public class ClientController {
    @Autowired
    private ClientDAO client;

    /*
     * @RequestMapping does the link between "/Films", invoked by GET and the
     * function filmList .
     */
    @RequestMapping(value = "/Clients", method = RequestMethod.GET)
    public List<Client> filmList() {
        return client.findAll();
    }

    @GetMapping(value = "/Client/{id}")
    public Client afficherUnProduit(@PathVariable int id) {

        return client.findById(id);
    }
    /*
     * Vous avez indiqué au début que cette classe est un contrôleur REST grâce
     * à l'annotation @RestController. Spring sait alors que les réponses aux
     * requêtes qu'il vous passe devront être très probablement en format JSON.
     */
}
