package com.jbk;

public class Tvshows {
	
	// Executing empty static block 
	
	static{ // static block without name 
		String showName = "Money Heist";
		System.out.println("Name of Show: "+showName);
		String genre = "Heist; Crime drama; Thriller";
		System.out.println("Genere: "+genre);
		String director = "Álex Pina";
		System.out.println("Director"+director);
		int seasons = 5;
		System.out.println("No of seasons: "+seasons);
		float IMDBRating = 8.2F;
		System.out.println("IMBD Rating: "+IMDBRating+"/10");
		int releaseYear = 2017;
		System.out.println("Released Year"+releaseYear);
		System.out.println();
	}
	static{ // static block without name 
		String showName = "Money Heist";
		System.out.println("Name of Show: "+showName);
		String genre = "Heist; Crime drama; Thriller";
		System.out.println("Genere: "+genre);
		String director = "Álex Pina";
		System.out.println("Director"+director);
		int seasons = 5;
		System.out.println("No of seasons: "+seasons);
		float IMDBRating = 8.2F;
		System.out.println("IMBD Rating: "+IMDBRating+"/10");
		int releaseYear = 2017;
		System.out.println("Released Year"+releaseYear);
	}
	
	public static void main(String[] args) {
		// No need pass any attribute to execute static block
	}
}
