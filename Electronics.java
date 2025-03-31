package com.jbk;

public class Electronics {
	 // Instance variables
    String deviceName;
    String brand;
    double price;
    float batteryLife;
    String processor;
    float warrentyPeriod;

    // Method to display details
    void displayDetails() {
        System.out.println("Device Name     : " + deviceName);
        System.out.println("Brand           : " + brand);
        System.out.println("Device Price    : " + price);
        System.out.println("Bteery Life     : " + batteryLife + " %");
        System.out.println("Processor Name  : " + processor);
        System.out.println("Warrenty Period : " + warrentyPeriod + "years");
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating first restaurant object
        Electronics details1 = new Electronics();
        details1.deviceName = "Iphone 16";
        details1.brand = "Apple";
        details1.price = 70000;
        details1.batteryLife = 95.5f;
        details1.processor = " A16 Bionic";
        details1.warrentyPeriod = 1.5f;

        // Creating second restaurant object
        Electronics details2 = new Electronics();
        details2.deviceName = "S24 Ultra";
        details2.brand = "Samsung";
        details2.price = 120000;
        details2.batteryLife = 99;
        details2.processor = "Qualcomm Snapdragon 8 Gen 3";
        details2.warrentyPeriod = 2.5f;
        
        // Calling displayDetails method to print details
        details1.displayDetails();
        details2.displayDetails();
    }
}
