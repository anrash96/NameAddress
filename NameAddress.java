/*
 * Program:  NameAddress.java
 * Student:  Anita Rashidian
 * Course:   CSC 320 - Programming I
 * Purpose:  Prints a fictional person's first name, last name,
 *           street address, city, and zip code, each on its own line.
 */



public class NameAddress {
	public static void main(String[] args) {
		

		//Store each piece of info in its own string variable
		String firstName = "Eric";
		String lastName = "Cartman";
		String streetAddress = "28201 E. Bonanza St.";
		String city = "Southpark";
		String zipCode = "02345";
		
		//Print each item on its own line
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Street Address: " + streetAddress);
		System.out.println("City: " + city);
		System.out.println("Zip Code: " + zipCode);
	}

}
