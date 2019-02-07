package com.example.tddCoursework;

import java.util.ArrayList;
import java.util.List;

/** Author: Asen Koparanski - 160244340
 * Purpose: Create an Employee class that holds all the details about
 * a single employee, uses the Records class to retrieve employee records
 * and gets called by the RecordManager
 * Date: 20.11.2017 - 30.11.2017 */

public class Employee {
	// Declare variables.
	private static int nextId=1000;
	// Declare as final so it can't be changed.
	private final int ID;
	private String name;
	private String address;
	private String phoneNum;
	private String department;
	private String joinDate;
	private List<Records> records;
	// Initialise variables in constructor.
	public Employee(String name, String address, String phoneNum, String department, String joinDate) { 
		// Initialise ID after creating each new Employee.
		ID = nextId;
		// Increment after every Employee creation.
		nextId++;	
		this.name = name;		
		this.address = address;		
		this.phoneNum = phoneNum;		
		this.department = department;		
		this.joinDate = joinDate;	
		// Every Employee gets their own list of records.
		records = new ArrayList<Records>();
			
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) { 
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) { 
		this.address = address;
	}
	// Implemented after UML diagram because I wasn't sure if needed.
	public String getPhoneNumber() {
		return phoneNum;
	}
	// Implemented after UML diagram because I wasn't sure if needed.
	public String getDepartment() { 
		
		return department;
	}
	// Implemented after UML diagram because I wasn't sure if needed.
	public String getJoinDate() {
		return joinDate;
	}
    // Adds a record to an Employee.
	public void addRecord(Records r) {
		records.add( r );
	
	}
	// Gets the list of records available.
	public List<Records> getRecords() {
		return records;
	}
	// Gets the ID of an Employee.
	public int getId() {
		return ID;
	}
	// Implemented after UML Diagram to override the toString method to format the text output. 
	@Override
	public String toString()
    {
        
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s\nAddress: %s\nPhone Number: %s\nDepartment: %s\nJoin Date: %s\n ",
                 name, address, phoneNum, department, joinDate));

        for (Records r: records)
        {
            sb.append("\t" + r);
        }
        return sb.toString();
    }
	
}
