package com.jbk;

public class Employe {
	// Instance Variable 
	int employeId;
	String employeName;
	int age;
	String adress;
	String email;
	long phoneNo;
	char gender;
	String department;
	double salary;
	
	public void employeDetails() {
		System.out.println("Employe ID            : " + employeId );
		System.out.println("Name of Employe       : " + employeName );
		System.out.println("Age of Employe        : " + age );
		System.out.println("Adress of Employe     : " + adress );
		System.out.println("Email of Employe      : " + email );
		System.out.println("Phone No of Employe   : " + phoneNo );
		System.out.println("Gender of Employe     : " + gender );
		System.out.println("Department of Employe : " + department );
		System.out.println("Salary of Employe     : " + salary + "LPA" );
		System.out.println();
	}
	
	
	
}
