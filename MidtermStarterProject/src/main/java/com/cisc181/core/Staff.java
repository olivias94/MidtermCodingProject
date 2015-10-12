package com.cisc181.core;

import java.util.Date;

import com.cisc181.eNums.eStaffTitle;

public class Staff extends Employee {

	 private eStaffTitle Title;

	   public Staff(eStaffTitle title){
	        this.Title = title;
	    }

	    public void setTitle(eStaffTitle title){
	        this.Title = title;
	    }
	    public eStaffTitle getTitle(){
	        return this.Title;
	    }

    

    
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			eStaffTitle Title) 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.Title = Title;
	}

}