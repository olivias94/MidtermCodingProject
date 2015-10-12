package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import com.cisc181.eNums.eStaffTitle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.core.Person;

/**
 * @author Dad
 *
 */
public class Staff_Test {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
		Person.setPECDOB(false);
		Person.setPECPHONE(false);

	}

	@Test
	public void test1() throws PersonException {
		
		
		/**Date date2 = new Date(21/07/2001);
		Date date3 = new Date(14/12/1969);
		Date date4 = new Date(04/10/1999);
		Date date5 = new Date(15/01/1586);//over 100 years old --> Belle
		Date date6 = new Date(07/07/2013);
		Date date7 = new Date(30/04/1965);
		Date date8 = new Date(30/03/2002);
		Date date9 = new Date(28/06/1974);
		Date date10 = new Date(17/02/2007); */
		Calendar date1 = Calendar.getInstance();
		date1.set(Calendar.YEAR, 1961);
		date1.set(Calendar.MONTH, Calendar.FEBRUARY);
		date1.set(Calendar.DAY_OF_MONTH, 17);
		Date dateRepresentation1 = date1.getTime();
		Calendar date2 = Calendar.getInstance();
		date2.set(Calendar.YEAR, 2001);
		date2.set(Calendar.MONTH, Calendar.MARCH);
		date2.set(Calendar.DAY_OF_MONTH, 22);
		Date dateRepresentation2 = date2.getTime();
		Calendar date3 = Calendar.getInstance();
		date3.set(Calendar.YEAR, 1969);
		date3.set(Calendar.MONTH, Calendar.APRIL);
		date3.set(Calendar.DAY_OF_MONTH, 13);
		Date dateRepresentation3 = date3.getTime();
		Calendar date4 = Calendar.getInstance();
		date4.set(Calendar.YEAR, 1999);
		date4.set(Calendar.MONTH, Calendar.JULY);
		date4.set(Calendar.DAY_OF_MONTH, 6);
		Date dateRepresentation4 = date4.getTime();
		Calendar date5 = Calendar.getInstance(); // older then 100 years old --> Belle
		date5.set(Calendar.YEAR, 1586);
		date5.set(Calendar.MONTH, Calendar.FEBRUARY);
		date5.set(Calendar.DAY_OF_MONTH, 31);
		Date dateRepresentation5 = date5.getTime();
		Calendar date6 = Calendar.getInstance();
		date6.set(Calendar.YEAR, 2013);
		date6.set(Calendar.MONTH, Calendar.OCTOBER);
		date6.set(Calendar.DAY_OF_MONTH, 33);
		Date dateRepresentation6 = date6.getTime();
		Calendar date7 = Calendar.getInstance();
		date7.set(Calendar.YEAR, 1965);
		date7.set(Calendar.MONTH, Calendar.MAY);
		date7.set(Calendar.DAY_OF_MONTH, 19);
		Date dateRepresentation7 = date7.getTime();
		Calendar date8 = Calendar.getInstance();
		date8.set(Calendar.YEAR, 2002);
		date8.set(Calendar.MONTH, Calendar.DECEMBER);
		date8.set(Calendar.DAY_OF_MONTH, 17);
		Date dateRepresentation8 = date8.getTime();
		Calendar date9 = Calendar.getInstance();
		date9.set(Calendar.YEAR, 1974);
		date9.set(Calendar.MONTH, Calendar.JUNE);
		date9.set(Calendar.DAY_OF_MONTH, 11);
		Date dateRepresentation9 = date9.getTime();
		Calendar date10 = Calendar.getInstance();
		date10.set(Calendar.YEAR, 2007);
		date10.set(Calendar.MONTH, Calendar.NOVEMBER);
		date10.set(Calendar.DAY_OF_MONTH, 19);
		Date dateRepresentation10 = date10.getTime();
		
		ArrayList<Staff> listOfStaff = new ArrayList<Staff>();
		Staff MichaelScott = new Staff("Michael", "Gary", "Scott",
				dateRepresentation1,"3 Scranton Drive","302a7763b3992c",
				"scott@dundermifflin.com", "4:00-5:00", 54, 12000.00,
				dateRepresentation2,eStaffTitle.GROUNDSKEEPER);
		
		Staff KevinMalone = new Staff("Kevin", "Mark", "Malone",
				dateRepresentation3, "4 Beach Boulevard", "(407) 827 2871", "malone@dundermifflin.com",
				"1:20-2:20", 101, 14000.50, dateRepresentation4,
				eStaffTitle.CUSTODIAN);
				
		Staff Belle = new Staff("Belle", "Pink", "Smith",
				dateRepresentation5, "10 Wilmington Drive", "302.443.7812", "Belle@gmail.com",
				"2:00-3:00", 43, 17000.00, dateRepresentation6,
				eStaffTitle.FOODSERVICEWORKER);
		
		Staff Tess = new Staff("Tess", "Orange", "Smith",
				dateRepresentation7, "10 Wilmington Drive", "302 223 1426", "Tess@gmail.com",
				"7:30-8:30", 92, 18000.00, dateRepresentation8,
				eStaffTitle.FOODSERVICEWORKER);
		
		Staff Anthony = new Staff("Anthony", "Clarence", "Rutherford",
				dateRepresentation9, "6053 Delaware Lane", "302-665-8822", "Anthony@gmail.com",
				"12:00-1:00", 10, 100000.00, dateRepresentation10,
				eStaffTitle.GROUNDSKEEPER);
		
		listOfStaff.add(MichaelScott);
		listOfStaff.add(KevinMalone);
		listOfStaff.add(Belle);
		listOfStaff.add(Tess);
		listOfStaff.add(Anthony);
		
		double averageSalary = ((MichaelScott.getSalary() + KevinMalone.getSalary() +
				Belle.getSalary() + Tess.getSalary() + Anthony.getSalary())/5);
		
		assertTrue("averageSalary calculation failed",averageSalary==32200.10);
		
		//causing PersonExceptionCounterDOB/PHONE to change from false to true, watching for if the exception hits
		String testvariable1 = MichaelScott.getPhone();
		assertTrue("PECounterPHONE Failed",Person.getPECPHONE()==true);
		String testvariable2 = KevinMalone.getPhone();
		assertTrue("PECounterPHONE Failed",Person.getPECPHONE()==false);
		Belle.PrintAge();
		assertTrue("PECounterDOB Failed",Person.getPECDOB()==true);  
		Tess.PrintAge();
		assertTrue("PECounterDOB Failed",Person.getPECDOB()==false);
		Anthony.setPhone("302m334ows896");
		assertTrue("PECounterPHONE Failed",Person.getPECPHONE()==true);		
		
	}
}
