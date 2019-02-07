package com.example.tddCoursework;
import java.util.ArrayList;
import java.util.List;

/** Author: Asen Koparanski - 160244340
 * Purpose: Create a record manager class that can be used to add Employees and Records to 
 * those Employees using the respective classses. It can also get a list of all the added 
 * employees and all their details and records.
 * Date: 20.11.2017 - 30.11.2017 */

public class RecordManager {
	// Declare list of Employee objects.
	private List<Employee> employees;	
	// RecordManager constructor declares a new list of Employee objects for every instance of RecordManager created.
	public RecordManager() { 
		employees = new ArrayList<Employee>();
	}
	// Get a list of Employee objects.
	public List<Employee> getEmployees() {
			return this.employees; 				
	}
	// Add an Employee object to the list of Employees.
	public void addEmployee(Employee emp) { 		
			this.employees.add(emp);
	}
	// Goes through the Employee list and checks for matching names. Returns list with matching names or error message if no matches are found.
	public List<Employee> findEmployee(String name)	{
		
		List<Employee> emps = new ArrayList<Employee>();
   		for( Employee e : employees) {
   			if( e.getName().equals( name ) ) emps.add( e );
   		}
   		if(emps.size()==0) System.out.println("No matching names found.");
   			
   		return emps;
   }
	/* Changes the Name of an Employee when given the employee ID and new name as parameters using the helper function. 
	 * Implemented after the UML diagram.  Did not pay attention that RecordManager had to change name. */
	public void setName(int id, String name) { 
		Employee e = getEmployeeById(id);	
		e.setName(name);
	}
	/* Changes the Address of an Employee when given the employee ID and new name as parameters using the helper function.
	 * Implemented after the UML diagram. Did not pay attention that RecordManager had to change address. */
	public void setAddress(int id, String address) {
		Employee e = getEmployeeById(id);	
		e.setAddress(address);
	} 
	/* Helper function for task 7, added after the UML Diagram.
	 * Goes through the Employee list and compares the given ID with the ID's in the list. */
	public Employee getEmployeeById(int empId) {
    
        for (Employee e : employees) {
            if (e.getId() == empId) return e;   
        }
        return null;
    }
	// Add a Record to an Employee using the record to be added and the Employee ID as parameters.
	public void addEmployeeRecord( Records r, int id ) {
		// Goes through the Employee list and compares the ID's, when it finds the correct one it adds the record.
		for( Employee e : employees ) {
			if( e.getId() == id ) e.addRecord( r );
		}
	}
		
}
