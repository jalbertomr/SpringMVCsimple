package com.bext.empManSys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
		return new ModelAndView("altaEmpleado", "emp", new Employee());
	}
	
	@RequestMapping(value = "/altaEmpleado", method = RequestMethod.POST)
	public ModelAndView addEmployee(
			@RequestParam("empId")String empId,
			@RequestParam("nombre")String nombre,
			@RequestParam("designacion")String designacion,
			@RequestParam("sueldo")String sueldo) {
		double sueldoDouble = new Double(sueldo);
		Employee empleado = new Employee(empId, nombre, designacion, sueldoDouble);
		employeeService.addNewEmployee(empleado);
		return new ModelAndView("/altaEmpleadoOK","empleado", empleado);
	}
}
