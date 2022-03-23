/**
 * 
 */
package com.tcs.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcs.model.Employee;

/**
 * @author springuser05
 *
 */
@Repository
public class EmployeeDAO {
	
	private static List<Employee> employee;
	{
		employee = new ArrayList();
		employee.add(new Employee("Ranam","Roudram","Rudiram","rrr@25.com","1000"));
		employee.add(new Employee("Ranam","Roudram","Rudiram","rrr@25.com","1001"));
		employee.add(new Employee("Ranam","Roudram","Rudiram","rrr@25.com","1002"));
		employee.add(new Employee("Ranam","Roudram","Rudiram","rrr@25.com","1003"));
		employee.add(new Employee("Ranam","Roudram","Rudiram","rrr@25.com","1004"));
		employee.add(new Employee("Ranam","Roudram","Rudiram","rrr@25.com","1005"));
	}
	
	public List Data()
	{
		return employee;
	}

	public Employee get(String id) {
		
		for (Employee e : employee) {
			if (e.getEmpId()== id) {
				return e;
			}
		}
		return null;
	}

	public void create(Employee emp) {
		
		employee.add(emp);
		
	}

}
