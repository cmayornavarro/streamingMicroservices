package com.streaming.micostreaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.streaming.micostreaming.dao.FilmDAO;
import com.streaming.micostreaming.model.Film;

@RestController
public class FilmControllerV2 {

	@Autowired
	private FilmDAO film;
    /*
     * @RequestMapping does the link between "/Films", 
     * invoked by GET and the function filmList .
     * */
	    @RequestMapping(value="/FilmsV2", method=RequestMethod.GET)
	    public List<Film> filmList() {
	        return film.findAll();
	    }
	    
	    @GetMapping(value = "/FilmsV2/{id}")
	    public Film afficherUnProduit(@PathVariable int id) {
	    	
	        return film.findById(id);
	    }
	    /*
	     * Vous avez indiqué au début que cette classe est un contrôleur REST grâce 
	     * à l'annotation @RestController. Spring sait alors que les réponses aux 
	     * requêtes qu'il vous passe devront être très probablement en format JSON.
	     * */
	
}