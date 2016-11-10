/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package localbank;

/**
 * Customer class.
 */

public class Customer {
	private String firstName, lastName;
	private String street, city, state, zip;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String str, String c, String s, String z) {
		firstName = fName;
		lastName = lName;
		street = str;
		city = c;
		state = s;
		zip = z;
	}

	

	/**
	 * Changes the street address of customer
	 * pre: none
	 * post: The street address of customer has been changed.
	 */
	 public void changeStreet(String newStr) {
	 	street = newStr;
	 }


	/**
	 * Changes the city of customer
	 * pre: none
	 * post: The city of customer has been changed.
	 */
	 public void changeCity(String newCity) {
	 	city = newCity;
	 }


	/**
	 * Changes the state of customer
	 * pre: none
	 * post: The state of customer has been changed.
	 */
	 public void changeState(String newState) {
	 	state = newState;
	 }


	/**
	 * Changes the zip of customer
	 * pre: none
	 * post: The zip of customer has been changed.
	 */
	 public void changeZip(String newZip) {
	 	zip = newZip;
	 }


	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	public String toString() {
		String custString;

		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + state + " " + zip + "\n";
	 	return(custString);
	}

}
