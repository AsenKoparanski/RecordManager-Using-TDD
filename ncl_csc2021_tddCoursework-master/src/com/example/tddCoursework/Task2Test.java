package com.example.tddCoursework;
import java.util.List;

/** Author: Asen Koparanski - 160244340
 * Purpose: Create a Test class that is supposed to test Task 2 of the 
 * assignment by testing the functionality of every method in the RecordManager,
 * Employee and Records classes.
 * Date: 20.11.2017 - 30.11.2017 */

public class Task2Test {

	public static void main(String[] args) {
		  
       
		System.out.println("-----------------------------\nTESTING RECORDS CLASS");
		// Create Records and test all the class methods. 	 
		Records r = new Records("Tester","First","20.10.2015");		
		System.out.println(r.getRecordName());
		System.out.println(r.getLevel());
		System.out.println(r.getDate());
		
		Records r1 = new Records("MegaTester","First","20.11.2016");		
		System.out.println("\n" + r1.getRecordName());
		System.out.println(r1.getLevel());
		System.out.println(r1.getDate());
		
		System.out.println("-----------------------------\nTESTING EMPLOYEE CLASS");
		// Create Employees and test all the class methods.
		Employee e = new Employee("Asen", "7 Glenthorn", "07589234523" , "CSC2021", "20.09.2016");
		System.out.println("\n" + e.getName());
		System.out.println(e.getAddress());
		System.out.println(e.getPhoneNumber());
		System.out.println(e.getDepartment());
		System.out.println(e.getJoinDate());
		System.out.println("Employee 0 ID: " + e.getId());
		e.addRecord(r);
		e.addRecord(r1);
		System.out.println(e.getRecords());
		
		
		e.setName("Ivan");
		System.out.println("\nNew Name: " + e.getName());
		e.setAddress("7 Ivan Street");
		System.out.println("New Address: " + e.getAddress());
		
		System.out.println("-----------------------------\nTESTING RECORDMANAGER CLASS");
		// Create multiple Record Managers and test all the methods in the class.
		RecordManager rm = new RecordManager();
		RecordManager rm1 = new RecordManager();
		Employee e1 = new Employee("Frank Lampard","8 Glenthorn","08278489423","CSC2022","20.06.2014");
		System.out.println("\nEmployee 1 ID: " + e1.getId());
		Employee e2 = new Employee("Eden Hazard","10 Glenthorn","088282289498","CSC2023","01.06.2012");
		System.out.println("Employee 2 ID: " + e2.getId());
		Employee e3 = new Employee("Antonio Conte","123 Glenthorn","08292945882","Manager","01.07.2017");
		System.out.println("Employee 3 ID: " + e3.getId());
		rm.addEmployee(e);
		rm.addEmployee(e1); 
		rm1.addEmployee(e2);
		rm1.addEmployee(e3);
		Records r2 = new Records("Tester","First","08.10.2016");
		Records r3 = new Records("MegaTester","First","02.02.2015");
		e1.addRecord(r2);
		e2.addRecord(r3);
		// Call the getEmployees method which prints all of the Employees with any Records they might have for RecordManager 1.
		System.out.println("RecordManager 1:\n");
        List<Employee> rm1Employees = rm.getEmployees();
        for (Employee p : rm1Employees){
            System.out.println(p);  
        }
        // Call the getEmployees method which prints all of the Employees with any Records they might have for RecordManager 2.
        System.out.println("\nRecordManager 2:\n");
        List<Employee> rm2Employees = rm1.getEmployees();
        for (Employee p : rm2Employees) {
            System.out.println(p);  
        }
        
    }
}
