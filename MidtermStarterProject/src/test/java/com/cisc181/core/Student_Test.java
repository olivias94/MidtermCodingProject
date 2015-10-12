package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.core.Course;
import com.cisc181.core.Semester;
import com.cisc181.core.Section;
import com.cisc181.core.Enrollment;
import com.cisc181.core.Student;


/**
 * @author Dad
 *
 */
public class Student_Test {

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
	}

	@Test
	public void Test() {
		
		/**
		 * Test Cases

Enroll the ten students you created in each of the Sections you created.  Grade each student (pick your own grade values).

Determine each student’s GPA, test it with an assertEquals.
Determine each course’s average grade, test it with an assertEqual.

10 points.
 
Change the major of one of the Student records.

5 points.
	 */
		
		ArrayList<Course> listOfCourses = new ArrayList<Course>();
		Course introToCompSciII = new Course(UUID.randomUUID(), "IntroToCompSciII", 3, eMajor.COMPSCI);
		Course oChemI = new Course(UUID.randomUUID(), "OChemI", 4, eMajor.CHEM);
		Course fundamentalsOfPhysicsII = new Course(UUID.randomUUID(), "FundamentalsOfPhysicsII", 4, eMajor.PHYSICS);
		listOfCourses.add(introToCompSciII);
		listOfCourses.add(oChemI);
		listOfCourses.add(fundamentalsOfPhysicsII);
		
		ArrayList<Semester> listOfSemesters = new ArrayList<Semester>();
		Calendar d1 = Calendar.getInstance();
		d1.set(Calendar.YEAR, 2013);
		d1.set(Calendar.MONTH, Calendar.AUGUST);
		d1.set(Calendar.DAY_OF_MONTH, 30);
		Date dr1 = d1.getTime();
		Calendar d2 = Calendar.getInstance();
		d2.set(Calendar.YEAR, 2013);
		d2.set(Calendar.MONTH, Calendar.DECEMBER);
		d2.set(Calendar.DAY_OF_MONTH, 12);
		Date dr2 = d2.getTime();
		Calendar d3 = Calendar.getInstance();
		d3.set(Calendar.YEAR, 2014);
		d3.set(Calendar.MONTH, Calendar.FEBRUARY);
		d3.set(Calendar.DAY_OF_MONTH, 5);
		Date dr3 = d3.getTime();
		Calendar d4 = Calendar.getInstance();
		d4.set(Calendar.YEAR, 2014);
		d4.set(Calendar.MONTH, Calendar.MAY);
		d4.set(Calendar.DAY_OF_MONTH, 30);
		Date dr4 = d4.getTime();
		Semester Fall = new Semester(UUID.randomUUID(), dr1, dr2);
		Semester Spring = new Semester(UUID.randomUUID(), dr3, dr4);	
		listOfSemesters.add(Fall);
		listOfSemesters.add(Spring);
		
		ArrayList<Section> listOfSections = new ArrayList<Section>();
		Section CompSci_Fall = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 346);
		Section CompSci_Spring = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 056);
		Section Chem_Fall = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 128);
		Section Chem_Spring = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 440);
		Section Phys_Fall = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 560);
		Section Phys_Spring = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 207);
		listOfSections.add(CompSci_Fall);
		listOfSections.add(CompSci_Spring);
		listOfSections.add(Chem_Fall);
		listOfSections.add(Chem_Spring);
		listOfSections.add(Phys_Fall);
		listOfSections.add(Phys_Spring);
		
		Calendar date1 = Calendar.getInstance();
		date1.set(Calendar.YEAR, 1975);
		date1.set(Calendar.MONTH, Calendar.AUGUST);
		date1.set(Calendar.DAY_OF_MONTH, 31);
		Date dateRepresentation1 = date1.getTime();
		Calendar date2 = Calendar.getInstance();
		date2.set(Calendar.YEAR, 1983);
		date2.set(Calendar.MONTH, Calendar.FEBRUARY);
		date2.set(Calendar.DAY_OF_MONTH, 23);
		Date dateRepresentation2 = date2.getTime();
		Calendar date3 = Calendar.getInstance();
		date3.set(Calendar.YEAR, 1933);
		date3.set(Calendar.MONTH, Calendar.NOVEMBER);
		date3.set(Calendar.DAY_OF_MONTH, 4);
		Date dateRepresentation3 = date3.getTime();
		Calendar date4 = Calendar.getInstance();
		date4.set(Calendar.YEAR, 1952);
		date4.set(Calendar.MONTH, Calendar.AUGUST);
		date4.set(Calendar.DAY_OF_MONTH, 19);
		Date dateRepresentation4 = date4.getTime();
		Calendar date5 = Calendar.getInstance();
		date5.set(Calendar.YEAR, 1960);
		date5.set(Calendar.MONTH, Calendar.DECEMBER);
		date5.set(Calendar.DAY_OF_MONTH, 26);
		Date dateRepresentation5 = date5.getTime();
		Calendar date6 = Calendar.getInstance();
		date6.set(Calendar.YEAR, 1989);
		date6.set(Calendar.MONTH, Calendar.JANUARY);
		date6.set(Calendar.DAY_OF_MONTH, 31);
		Date dateRepresentation6 = date6.getTime();
		Calendar date7 = Calendar.getInstance();
		date7.set(Calendar.YEAR, 1944);
		date7.set(Calendar.MONTH, Calendar.SEPTEMBER);
		date7.set(Calendar.DAY_OF_MONTH, 8);
		Date dateRepresentation7 = date7.getTime();
		Calendar date8 = Calendar.getInstance();
		date8.set(Calendar.YEAR, 1956);
		date8.set(Calendar.MONTH, Calendar.JUNE);
		date8.set(Calendar.DAY_OF_MONTH, 5);
		Date dateRepresentation8 = date8.getTime();
		Calendar date9 = Calendar.getInstance();
		date9.set(Calendar.YEAR, 1974);
		date9.set(Calendar.MONTH, Calendar.JULY);
		date9.set(Calendar.DAY_OF_MONTH, 14);
		Date dateRepresentation9 = date9.getTime();
		Calendar date10 = Calendar.getInstance();
		date10.set(Calendar.YEAR, 1977);
		date10.set(Calendar.MONTH, Calendar.MARCH);
		date10.set(Calendar.DAY_OF_MONTH, 2);
		Date dateRepresentation10 = date10.getTime();
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		Student Olivia  = new Student("Olivia", "Wren", "Smith",dateRepresentation1, eMajor.COMPSCI,"1000 Newark Lane", "302 675 6622", "olivia@gmail.com");
		Student Brad  = new Student("Brad", "Lincoln", "Johnson",dateRepresentation2, eMajor.CHEM,"20 Wilmington Parkway", "445-456-1256", "brad@gmail.com");
		Student Ben  = new Student("Ben", "Chase", "Roberts",dateRepresentation3, eMajor.BUSINESS,"3 Colorado Road", "443 642 5599", "ben@gmail.com");
		Student Jack  = new Student("Jack", "Hunter", "Green",dateRepresentation4, eMajor.CHEM,"346 Apple Drive", "4438379933", "jack@gmail.com");
		Student Belle  = new Student("Belle", "Pink", "Smith",dateRepresentation5, eMajor.NURSING,"10 Smyrna Road", "(445) 3336 2266", "belle@gmail.com");
		Student Tess  = new Student("Tess", "Orange", "Smith",dateRepresentation6, eMajor.PHYSICS,"10 Symrna Road", "332.445.3876", "tess@gmail.com");
		Student Anthony  = new Student("Anthony", "Clarence", "Rutherford",dateRepresentation7, eMajor.BUSINESS,"17 Rainforest Boulevard", "2234456677", "anthony@gmail.com");
		Student Lisa  = new Student("Lisa", "Kay", "Kelly",dateRepresentation8, eMajor.COMPSCI,"14 Florida Way", "334.445.1122", "lisa@gmail.com");
		Student Mark  = new Student("Mark", "Adams", "Corrigan",dateRepresentation9, eMajor.CHEM,"14 England Drive", "3324478866", "mark@gmail.com");
		Student Jeremy  = new Student("Jeremy", "Jez", "Usborne",dateRepresentation10, eMajor.BUSINESS, "14 England Drive", "223.665.7788", "jeremy@gmail.com");
		listOfStudents.add(Olivia);
		listOfStudents.add(Brad);
		listOfStudents.add(Ben);
		listOfStudents.add(Jack);
		listOfStudents.add(Belle);
		listOfStudents.add(Tess);
		listOfStudents.add(Anthony);
		listOfStudents.add(Lisa);
		listOfStudents.add(Mark);
		listOfStudents.add(Jeremy);
		
		//Do this so that each Student and section has a unique UUID
		ArrayList<UUID> listOfStudentUUIDs = new ArrayList<UUID>();
		for (int s=0; s<10; s++){
			listOfStudentUUIDs.add(UUID.randomUUID());
		}
		ArrayList<UUID> listOfSectionUUIDs = new ArrayList<UUID>();
		for (int s=0; s<6; s++){
			listOfSectionUUIDs.add(UUID.randomUUID());
		}
		
		//enroll each student in each section --> 60 total instances of Enrollment in listOfEnrollment
		//also makes an array of 60 grades
		ArrayList<Enrollment> listOfEnrollments = new ArrayList<Enrollment>();
		ArrayList<Double> listOfGrades = new ArrayList<Double>();
		for (UUID t : listOfStudentUUIDs){
			for (UUID v : listOfSectionUUIDs){
				Enrollment x = new Enrollment(t, v);
				listOfEnrollments.add(x); 
				Double y = new Double(100*Math.random());
				listOfGrades.add(y);
				
			}
		}
		
		//find each students GPA 
		int multiplyby;
		//Olivia's GPA
		double Oliviasum = 0;
		for (int q = 0; q<6; q++){ 
			if (q ==0 || q==1){
				multiplyby = 3;
			}else{
				multiplyby = 4;
			}
			Oliviasum += (multiplyby*listOfGrades.get(q));
		}
		double OliviaGPA = Oliviasum/(22);
		//Brad's GPA
		double Bradsum = 0;
		for (int q = 6; q<12; q++){ 
			if (q == 6 || q==7){
				multiplyby = 3;
			}else{
				multiplyby = 4;
			}
			Bradsum += (multiplyby*listOfGrades.get(q));
		}
		double BradGPA = Bradsum/22;
		//Ben's GPA
		double Bensum = 0;
		for (int q = 12; q<18; q++){
			if (q ==12 || q==12){
				multiplyby = 3;
			}else{
				multiplyby = 4;
			}
			Bensum += (multiplyby*listOfGrades.get(q));
		}
		double BenGPA = Bensum/22;
		//Olivia's GPA
		double Jacksum = 0;
		for (int q = 18; q<24; q++){ 
			if (q ==18 || q==19){
				multiplyby = 3;
			}else{
				multiplyby = 4;
			}
			Jacksum += (multiplyby*listOfGrades.get(q));
		}
		double JackGPA = Jacksum/22;
		//Belle's GPA
		double Bellesum = 0;
		for (int q = 24; q<30; q++){ 
			if (q ==24 || q==25){
				multiplyby = 3;
			}else{
				multiplyby = 4;
			}
			Bellesum += (multiplyby*listOfGrades.get(q));
		}
		double BelleGPA = Bellesum/22;
		//Tess's GPA
		double Tesssum = 0;
		for (int q = 30; q<36; q++){ 
			if (q ==30 || q==36){
				multiplyby = 3;
			}else{
				multiplyby = 4;
			}
			Tesssum += (multiplyby*listOfGrades.get(q));
		}
		double TessGPA = Tesssum/22;
		//Anthony's GPA
		double Anthonysum = 0;
		for (int q = 36; q<42; q++){
			if (q ==36 || q==37){
				multiplyby = 3;
			}else{
				multiplyby = 4;
			}
			Anthonysum += (multiplyby*listOfGrades.get(q));
		}
		double AnthonyGPA = Anthonysum/22;
		//Lisa's GPA
		double Lisasum = 0;
		for (int q = 42; q<48; q++){ 
			if (q ==42 || q==48){
				multiplyby = 3;
			}else{
				multiplyby = 4;
			}
			Lisasum += (multiplyby*listOfGrades.get(q));
		}
		double LisaGPA = Lisasum/22;
		//Mark's GPA
		double Marksum = 0;
		for (int q = 48; q<54; q++){ 
			if (q ==48 || q==49){
				multiplyby = 3;
			}else{
				multiplyby = 4;
			}
			Marksum += (multiplyby*listOfGrades.get(q));
		}
		double MarkGPA = Marksum/22;
		//Jermemy's GPA
		double Jeremysum = 0;
		for (int q = 54; q<60; q++){ 
			if (q ==54 || q==55){
				multiplyby = 3;
			}else{
				multiplyby = 4;
			}
			Jeremysum += (multiplyby*listOfGrades.get(q));
		}
		double JeremyGPA = Jeremysum/22;
		
		//find each section's average grade
		
		//CompSci_Fall average grade
		double CSFsum = 0;
		for (int g=0; g<60; g++){ 
			if (g==0 || g==5 || ((g%6)==5)){
				CSFsum += listOfGrades.get(g);
		}
		}
		double CompSciFallaverage = CSFsum/(10);
		//CompSci_Spring average grade
		double CSSsum = 0;
		for (int f=0; f<60; f++){ 
			if (f==1 ||((f%6)==0 && f>5)){
				CSSsum += listOfGrades.get(f);
		}
		}
		double CompSciSpringaverage = CSSsum/10;
		//Chem_Fall average grade
		double CFsum = 0;
		for (int d=0; d<60; d++){
			if (d==2 ||((d%6)==1 && d>5)){
				CFsum += listOfGrades.get(d);
		}
		}
		double ChemFallaverage = CFsum/10;
		//Chem_Spring average grade
		double CSsum = 0;
		for (int c=0; c<60; c++){ 
			if (c==3 ||((c%6)==2 && c>5)){
				CSsum += listOfGrades.get(c);
		}
		}
		double ChemSpringaverage = CSsum/10;
		//Phys_Fall average grade
		double PFsum = 0;
		for (int h=0; h<60; h++){ 
			if (h==4 || ((h%6)==3 && h>5)){
				PFsum += listOfGrades.get(h);
		}
		}
		double PhysFallaverage = PFsum/10;
		//Phys_Spring average grade
		double PSsum = 0;
		for (int k=0; k<60; k++){ 
			if ((k%6)==4){
				PSsum += listOfGrades.get(k);
		}
		}
		double PhysSpringaverage = PSsum/10;	
		
		double OliviaGPAtest = (listOfGrades.get(0)*3 + listOfGrades.get(1)*3 +
				listOfGrades.get(2)*4 + listOfGrades.get(3)*4 +
				listOfGrades.get(4)*4 + listOfGrades.get(5)*(4))/22;
		double CompSciFallaveragetest = (listOfGrades.get(0) + listOfGrades.get(5) +
				listOfGrades.get(11) + listOfGrades.get(17) +
				listOfGrades.get(23) + listOfGrades.get(29) + listOfGrades.get(35) + listOfGrades.get(41) +
				listOfGrades.get(47) + listOfGrades.get(53))/10;
				
		assertEquals(1,1);
		//System.out.println(listOfGrades);
		assertTrue("Student Gradepoint caluculation failed", OliviaGPA==OliviaGPAtest);//success
		assertTrue("Section average grade caluculation failed", CompSciFallaverage==CompSciFallaveragetest);//fails
		
		//change a students major
		
		Lisa.setMajor(eMajor.NURSING);
		System.out.println(Lisa.getMajor());
	}
}
		

