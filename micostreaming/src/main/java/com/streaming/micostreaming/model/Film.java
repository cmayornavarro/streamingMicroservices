package com.streaming.micostreaming.model;

public class Film {
	
	private int id;
	private String nom;
	private int prix;
	
	public Film(int id, String nom, int prix) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
			
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}

    @Override
    public String toString(){  
        return "Film{"+
        "id=" + id + 
        ", nom='"+ nom + '\'' + 
        ", prix=" + prix+ '}';
    }
}
