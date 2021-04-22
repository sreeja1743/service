package com.cg.eis.service;
import java.util.List;

import com.cg.eis.bean.*;

public interface IEmployeeInterface {
	public void insertEmployee(Employee e);
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployeesBySalary(int range1,int range2);
	public Employee getEmployeeById(int id);
	public List<Employee> lowToHighSalary();
	

}
