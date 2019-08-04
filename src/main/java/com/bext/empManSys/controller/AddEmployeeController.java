package com.bext.empManSys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bext.empManSys.domain.Employee;
import com.bext.empManSys.service.EmployeeService;

@Controller
public class AddEmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/altaEmpleado", method = RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("altaEmpleado", "empleado", new Employee());
	}
	
	@RequestMapping(value = "/altaEmpleado", method = RequestMethod.POST)
	public ModelAndView processRequest( Employee empleado, Errors result) { 
		if (result.hasErrors()) {
			return new ModelAndView("/altaEmpleado", "empleado", empleado);
		}
		employeeService.addNewEmployee(empleado);
		return new ModelAndView("/altaEmpleadoOK","empleado", empleado);
	}
}
