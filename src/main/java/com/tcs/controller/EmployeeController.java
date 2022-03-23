package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.dao.EmployeeDAO;
import com.tcs.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDAO employeedao;

	@RequestMapping(value = "/employee", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List Details()
	{
		return employeedao.Data();
	}
	
	

	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getEmployee (@PathVariable("id") String hint)
	{
		Employee details = employeedao.get(hint);
		
		if (details == null)
				{
					return new ResponseEntity("No Customer found for ID " + hint, HttpStatus.NOT_FOUND);
				}
		else 
			
		return new ResponseEntity(details,HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/post/employee", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity createEmployee(Employee emp)
	{
		employeedao.create(emp);
		return new ResponseEntity(emp,HttpStatus.OK);	
	}
}
