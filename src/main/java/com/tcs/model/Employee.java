/**
 * 
 */
package com.tcs.model;

import java.io.Serializable;

/**
 * @author springuser05
 *
 */
public class Employee implements Serializable{

	private String employeeFirstName;
	private String employeeLastName;
	private String employeeAddress;
	private String employeeEmailAddress;
	private String empId;

	
	
	public Employee(String employeeFirstName, String employeeLastName, String employeeAddress,
			String employeeEmailAddress, String empId) {
		super();
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeAddress = employeeAddress;
		this.employeeEmailAddress = employeeEmailAddress;
		this.empId = empId;
	}
	/**
	 * @return the employeeFirstName
	 */
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	/**
	 * @param employeeFirstName the employeeFirstName to set
	 */
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	/**
	 * @return the employeeLastName
	 */
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	/**
	 * @param employeeLastName the employeeLastName to set
	 */
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	/**
	 * @return the employeeAddress
	 */
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	/**
	 * @param employeeAddress the employeeAddress to set
	 */
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	/**
	 * @return the employeeEmailAddress
	 */
	public String getEmployeeEmailAddress() {
		return employeeEmailAddress;
	}
	/**
	 * @param employeeEmailAddress the employeeEmailAddress to set
	 */
	public void setEmployeeEmailAddress(String employeeEmailAddress) {
		this.employeeEmailAddress = employeeEmailAddress;
	}
	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	
	
	
}
