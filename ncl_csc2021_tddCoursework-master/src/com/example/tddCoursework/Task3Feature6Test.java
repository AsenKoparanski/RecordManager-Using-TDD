package com.example.tddCoursework;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/** Author: Asen Koparanski - 160244340
 * Purpose: Use Test Driven Development and a JUnit provided framework to 
 * test whether the RecordManager class can find Employees with matching names.
 * Date: 20.11.2017 - 30.11.2017 */

/* Wasn't sure if it was better practice for this particular method to use @before and setUp method because the 
 * initialisation took more space than the code itself so I just initialised every object in the methods. */

public class Task3Feature6Test extends AbstractLoggingJUnitTest {
	// Check if RecordManager can find an Employeer by name. / Method name changed to more appropriateafter being logged.
	@Test
	public void canFindEmployeeNameUsingRecordManager() {
		
		RecordManager rm = new RecordManager();
		Employee e = new Employee("Asen", "7 Glenthorn", "012348572" , "CSC2021", "20.09.2016");
		rm.addEmployee(e);
		
		assertEquals("Employee name not found", e , rm.findEmployee("Asen").get(0));	
	}
	// Check if RecordManager can find Employees with matching names  / Method name changed to more appropriate after being logged.
	@Test
	public void canFindEmployeeMatchingNamesUsingRecordManager() { 
		
		RecordManager rm = new RecordManager();
		Employee e = new Employee("Asen", "7 Glenthorn", "07589234523" , "CSC2021", "20.09.2016");
		rm.addEmployee(e);
		Employee e1 = new Employee("Asen", "2 Glenthorn", "05263528572" , "CSC2024", "02.02.2015");
		rm.addEmployee(e1);
		Employee e2 = new Employee("Asen", "8 Glenthorn", "07325285722" , "CSC2025", "18.04.2010");
		rm.addEmployee(e2);
		Employee e3 = new Employee("Frank Lampard", "10 Glenthorn", "07574285722" , "CSC2026", "05.07.2009");
		rm.addEmployee(e3);
		
		int i = 0;
		for (Employee emp : rm.findEmployee("Asen")) { 
			assertEquals("No Employees with matching names found", "Asen", emp.getName());
			i++;
		}
		assertEquals("No Employees with matching names found",3,i);
	}

}

