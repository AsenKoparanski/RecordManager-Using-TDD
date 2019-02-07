package com.example.tddCoursework;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/** Author: Asen Koparanski - 160244340
 * Purpose: Use Test Driven Development and a JUnit provided framework to 
 * test whether the RecordManager class can change the name and address of an Employee.
 * Date: 20.11.2017 - 30.11.2017 */

/* I thought the usage of @before and a setUp method here would be most convenient as I only
 * had 2 object to make. */

public class Task3Feature7Test extends AbstractLoggingJUnitTest {
		// Declare objects
	    private RecordManager rm;
	    private Employee e;
	    // Initialise objects in the setUp method.
	    @Before
	    public void setUp() {
	        rm = new RecordManager();	        
	        e = new Employee("Asen", "7 Glenthorn", "07589234523" , "CSC2021", "20.09.2016");
	        rm.addEmployee(e);
	    }
	    // Check whether the Record Manager can find and Employee by Id /changed name of method after successful log.
	    @Test 
	    public void canFindEmployeeByIdUsingRecordManager() { 
	    	assertEquals("RecordManager failed to find Employee with this ID",e,rm.getEmployeeById(0));	
	    }
	    // Check whether the Record Manager can change Employee name using the helper function that gets the ID.
	    @Test
	    public void canChangeEmployeeNameUsingRecordManager() {
	        rm.setName(e.getId(), "Asen Koparanski");
	        assertEquals("RecordManager failed to change name", "Asen Koparanski", e.getName());
	    }
	    // Check whether the Record Manager can change Employee address using the helper function that gets the ID.
	    @Test
	    public void canChangeEmployeeAddressUsingRecordManager() {
	        rm.setAddress(e.getId(), "8 Glenthorn");
	        assertEquals("RecordManager failed to change address", "8 Glenthorn", e.getAddress());
	    }

	  
	    
}
