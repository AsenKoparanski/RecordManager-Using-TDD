package com.example.tddCoursework;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/** Author: Asen Koparanski - 160244340
 * Purpose: Use Test Driven Development and a JUnit provided framework to 
 * test whether adding Records to Employees can be done successful using the
 * RecordManager class.
 * Date: 20.11.2017 - 30.11.2017 */

/* Wasn't sure if it was better practice for this particular method to use @before and setUp method because the 
 * initialisation took more space than the code itself so I just initialised every object in the methods. */

public class Task3Feature8Test extends AbstractLoggingJUnitTest {
	
	// Test whether it's possible for the Record Manager to add a new Record to an Employee using TDD.
	@Test
	public void canAddNewRecordUsingRecordManager() {
		RecordManager rm = new RecordManager();
		Employee e = new Employee("Asen", "7 Glenthorn", "07589234523" , "CSC2021", "20.09.2016");
		rm.addEmployee(e);
        
		Records r = new Records("Senior","First","18.04.2017");
		rm.addEmployeeRecord(r, e.getId());
		
		assertEquals("Failed to add Record to Employee using RecordManager", r , e.getRecords().get(0)); 
		
	}
	// Test whether it's possible for the Record Manager to add multiple Records to an Employee using TDD.
	@Test
	public void canAddMultipleRecordsUsingRecordManager() {
		RecordManager rm = new RecordManager();
		Employee e1 = new Employee("Frank Lampard","8 Glenthorn","08278489423","CSC2022","20.06.2014");
		rm.addEmployee(e1);
		Records r1 = new Records ("Tester","Pass","21.08.2015");
		Records r2 = new Records ("MegaTester","First","15.10.2015");
		Records r3 = new Records ("Senior Tester","First","03.03.2016");		
		rm.addEmployeeRecord(r1, e1.getId());
		rm.addEmployeeRecord(r2, e1.getId());
		rm.addEmployeeRecord(r3, e1.getId());
		
		
		
		Employee e2 = new Employee("Eden Hazard","10 Glenthorn","088282289498","CSC2023","01.06.2012");
		Records r4 = new Records ("Footballer","First","21.08.2013");
		Records r5 = new Records ("World Class","First","05.02.2015");	
		rm.addEmployee(e2);
		rm.addEmployeeRecord(r4, e2.getId());
		rm.addEmployeeRecord(r5, e2.getId());
		
		
		assertEquals("RecordManager couldn't add all the records correctly",3,e1.getRecords().size());
		assertEquals("RecordManager couldn't add all the records correctly",2,e2.getRecords().size());
		
	}

}
