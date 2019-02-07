package com.example.tddCoursework;

/** Author: Asen Koparanski - 160244340
 * Purpose: Create a Records class that holds record details of employees.
 * Date: 20.11.2017 - 30.11.2017 */

public class Records {
	// Declare variables
	private String recordName;
	private String recordLevel; 
	private String dateAchieved;

	
	// Changed parameter names from UML diagram to the private declared variables in order to use "this" keyword.
	public Records (String recordName, String recordLevel, String dateAchieved) {
		// Initialise variables in constructor for every ned record being created.
		this.recordName = recordName;
		this.recordLevel = recordLevel;
		this.dateAchieved = dateAchieved;
		
	}
	// Return the Record name.
	public String getRecordName() {
		return recordName;
	}
	// Get the Record level.
	public String getLevel() { 
		return recordLevel;
	}
	// Get the Record achieved date.
	public String getDate() { 
		return dateAchieved;
	}
	// Implemented after UML Diagram to format the text output you get from printing the Records by overriding the toString method.
	@Override
	public String toString()
	    {
	        return String.format("\nRecord Name: %s\nLevel: %s\nDate: %s\n", recordName, recordLevel, dateAchieved);
	    }
}
