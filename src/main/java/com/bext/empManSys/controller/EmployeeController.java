package com.bext.empManSys.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bext.empManSys.domain.Employee;
import com.bext.empManSys.service.EmployeeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class EmployeeController {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/")
	public ModelAndView viewAllItems() {
		logger.info("listando items...");
		
		List<Employee> listaEmpleados = employeeService.getAllEmployees();
		return new ModelAndView("/listaEmpleados","listaEmpleados", listaEmpleados);
	}
}
