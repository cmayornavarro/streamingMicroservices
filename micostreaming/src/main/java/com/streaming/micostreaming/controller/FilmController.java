package com.streaming.micostreaming.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * il indique que cette classe va pouvoir traiter les requêtes que nous allons définir.
 * Il indique aussi que chaque méthode va renvoyer directement la réponse JSON à 
 * l'utilisateur, donc pas de vue dans le circuit.
 * */
@RestController 
public class FilmController {

    /*
     * @RequestMapping does the link between "/Films", 
     * invoked by GET and the function filmList .
     * */
	    @RequestMapping(value="/Films", method=RequestMethod.GET)
	    public String filmList() {
	        return "This is my film";
	    }
	    
	    @GetMapping(value = "/Produits/{id}")
	    public String afficherUnProduit(@PathVariable int id) {
	        return "Vous avez demandé un produit avec l'id  " + id;
	    }
	
}
