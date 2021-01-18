package com.streaming.micostreaming.dao;

import com.streaming.micostreaming.model.Film;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
/*
 * @Repository : cette annotation est appliquée à la classe afin d'indiquer à
 *  Spring qu'il s'agit d'une classe qui gère les données, ce qui nous
 *   permettra de profiter de certaines fonctionnalités comme les translations
 *    des erreurs
 * */
@Repository
public class FilmDAOImpl implements FilmDAO {   
    public static List<Film> films =new ArrayList<>();
    
    static  {
    	films.add(new Film(1, new String("Ordinateur portable"), 350));
    	films.add(new Film(2, new String("Aspirateur Robot"), 500)); 
    	films.add(new Film(3, new String("Table de Ping Pong"), 750));
	}
   

    
	@Override
	public List<Film> findAll() {
		
		return films;
	}

	@Override
	public Film findById(int id) {
	       for (Film film : films) {  
	            if(film.getId() ==id){
	                return film;
	            }
	        }
	        return null;
		
	}

	@Override
	public Film save(Film film) {
		films.add(film);
		return film;
		
	}
}