package com.cisc181.core;

import com.cisc181.core.Person;

@SuppressWarnings("serial")
public class PersonException extends Exception{
	
	//should be thrown if:
	//-age is over 100 years
	//-phone number isnt formatted
	
	
	@SuppressWarnings("unused")
	private Person ExPerson;
	
	//constructor for exception
	public PersonException(Person ExPerson){
		super("PersonException");	
	}
	
	/**
	 * //constructor for age exception
	public PersonException(Date dob){
		this.DOB = dob;
		//if (ExPerson.PrintAge() > 100){
		//System.out.println("Error: age is over 100 years.");
		//}
	}
	
	//constructor for phone number exception
	public PersonException(String phoneNumber){
		this.PhoneNumber = phoneNumber;
		//System.out.println("Error: phone number is not in the correct format.");
	} 
	*/
}
