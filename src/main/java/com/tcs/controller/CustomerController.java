/**
 * 
 */
package com.tcs.controller;



import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.model.Customer;

/**
 * @author springuser05
 *
 */



@Controller
@RestController
public class CustomerController {

	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String helloworld()
	{
		return "Hola";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/info", produces = MediaType.APPLICATION_JSON_VALUE)
	
	@ResponseBody
	public  Customer customerInfo()
	{
		Customer c = new Customer();
		c.setCustAddress("*********");
		c.setCustName("Alex");
		c.setCustId("99999");
		
		return c;
	}
}
