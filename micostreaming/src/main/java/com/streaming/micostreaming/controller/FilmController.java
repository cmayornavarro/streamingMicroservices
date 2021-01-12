package com.streaming.micostreaming.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.streaming.micostreaming.model.Film;

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
	    
	    @GetMapping(value = "/Films/{id}")
	    public String afficherUnProduit(@PathVariable int id) {
	    	Film film = new Film(id, new String("My First Film"),100);
	        return film.toString();
	    }
	
}
