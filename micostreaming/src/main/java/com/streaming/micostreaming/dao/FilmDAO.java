package com.streaming.micostreaming.dao;

import java.util.List;

import com.streaming.micostreaming.model.Film;

//conventions for DAO 
//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
public interface FilmDAO {
    public List<Film>findAll();
    public  Film findById(int id);
    public  Film save(Film film);
    
    
    
}
