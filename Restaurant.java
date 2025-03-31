package com.jbk;

public class Restaurant {
    // Instance variables
    String restaurantName;
    String location;
    String cuisineType;
    double rating;
    int numTables;
    String ownerName;
    double onlineRating;

    public static void main(String[] args) {
        // Creating first restaurant object
        Restaurant restaurant1 = new Restaurant();
        restaurant1.restaurantName = "Dream Restaurant";
        restaurant1.location = "Chinchwad, Pune";
        restaurant1.cuisineType = "Indian";
        restaurant1.rating = 4.5;
        restaurant1.numTables = 20;
        restaurant1.ownerName = "Sahil";
        restaurant1.onlineRating = 4.3;

        // Creating second restaurant object
        Restaurant restaurant2 = new Restaurant();
        restaurant2.restaurantName = "Dream Chinees center";
        restaurant2.location = "Hinjawadi, Pune";
        restaurant2.cuisineType = "Chinees";
        restaurant2.rating = 4.7;
        restaurant2.numTables = 30;
        restaurant2.ownerName = "Adesh";
        restaurant2.onlineRating = 4.6;

        // Printing details using syso (System.out.println)
        System.out.println("Restaurant Name: " + restaurant1.restaurantName);
        System.out.println("Location: " + restaurant1.location);
        System.out.println("Cuisine Type: " + restaurant1.cuisineType);
        System.out.println("Restaurant Rating: " + restaurant1.rating);
        System.out.println("Number of Tables: " + restaurant1.numTables);
        System.out.println("Owner: " + restaurant1.ownerName);
        System.out.println("Online Rating: " + restaurant1.onlineRating);
        System.out.println();
        System.out.println("Restaurant Name: " + restaurant2.restaurantName);
        System.out.println("Location: " + restaurant2.location);
        System.out.println("Cuisine Type: " + restaurant2.cuisineType);
        System.out.println("Restaurant Rating: " + restaurant2.rating);
        System.out.println("Number of Tables: " + restaurant2.numTables);
        System.out.println("Owner: " + restaurant2.ownerName);
        System.out.println("Online Rating: " + restaurant2.onlineRating);
        
    }
}
