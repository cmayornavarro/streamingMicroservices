package com.streaming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
/*
 * il indique que cette classe va pouvoir traiter les requêtes que nous allons définir.
 * Il indique aussi que chaque méthode va renvoyer directement la réponse JSON à 
 * l'utilisateur, donc pas de vue dans le circuit.
 * */
public class FilmController {

	@RestController
	public class ProductController {
	    @RequestMapping(value="/Films", method=RequestMethod.GET)
	    /*
	     * @RequestMapping does the link between "/Films", 
	     * invoked by GET and the function filmList .
	     * */
	    public String filmList() {
	        return "This is my film";
	    }
	}
}
