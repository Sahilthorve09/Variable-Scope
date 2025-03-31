package com.jbk;

public class EmployeDetails {
	public static void main(String[] args) {
		Employe employe1 = new Employe();
		employe1.employeId = 1043;
		employe1.employeName = "Sahil Thorve";
		employe1.age = 22;
		employe1.adress = "Rahatani,Pune-17";
		employe1.email = "sahilthorve09@gmail.com";
		employe1.phoneNo = 9921797745L;
		employe1.gender = 'M';
		employe1.department = "Software Engineer";
		employe1.salary = 12;
		
		Employe employe2 = new Employe();
		employe2.employeId = 1046;
		employe2.employeName = "Adesh Pol";
		employe2.age = 22;
		employe2.adress = "Chinchwad,Pune-33";
		employe2.email = "adya@gmail.com";
		employe2.phoneNo = 7865784784L;
		employe2.gender = 'M';
		employe2.department = "Software Engineer";
		employe2.salary = 12;
		
		employe1.employeDetails();
		employe2.employeDetails();
	}
}
