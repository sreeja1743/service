package com.cg.eis.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.cg.eis.bean.*;


public class EmployeeService implements IEmployeeInterface, Comparator<Employee>{
	
    public  List<Employee> empList = new ArrayList<Employee>();
    
	public void insertEmployee(Employee e) {
		if(e.getSalary() > 5000 && e.getSalary() < 20000 && e.getDesignation().equalsIgnoreCase("System Associate"))
			e.setScheme("Scheme C");
		else if(e.getSalary() >= 20000 && e.getSalary() < 40000 && e.getDesignation().equalsIgnoreCase("Programmer"))
			e.setScheme("Scheme B");
		else if(e.getSalary() >= 40000 && e.getDesignation().equalsIgnoreCase("Manager"))
			e.setScheme("Scheme A");
		else if(e.getSalary() <= 5000 && e.getDesignation().equalsIgnoreCase("Clerk"))
			e.setScheme("None");
		
		
	      empList.add(e);
	}
	
    public List<Employee> getAllEmployees() {
		
		return empList;  
	   }

	public List<Employee> getAllEmployeesBySalary(int range1,int range2) {
		
		List<Employee> tempList = new ArrayList<Employee>();
		tempList.clear();	
		
		for (Employee employee : empList) {
			
			if(employee.getSalary()>=range1 && employee.getSalary() <= range2)
			{
				tempList.add(employee);
			}
			
		}
		
		return tempList;
	}

	public Employee getEmployeeById(int id) {
		
		
		for (Employee employee : empList) {
			if(employee.getId() == id)
			{
				return employee;
			}
		}
		return null;
	}
	
   public List<Employee> lowToHighSalary() {
	   Collections.sort(empList,new EmployeeService());
	   return empList;
   }
 
   public int compare(Employee e1, Employee e2) {
	   return e1.getSalary()-e2.getSalary();
   }
   
	
}
