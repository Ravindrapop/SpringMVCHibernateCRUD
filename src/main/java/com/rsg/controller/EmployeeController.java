package com.rsg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//http://localhost:8080/SpringMVCHibernateCRUD/

@Controller
public class EmployeeController {
	
	//http://localhost:8080/SpringMVCHibernateCRUD/employees
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public void listEmployees() {
		
		System.out.println("EmployeeController : listEmployees started....");
		
	}

}
