package com.bext.empManSys.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bext.empManSys.domain.Employee;

@Component
public class EmployeeServiceMockImpl implements EmployeeService {

	private List<Employee> mockEmployees = new ArrayList<Employee>();
	
	public EmployeeServiceMockImpl() {
		mockEmployees.add(new Employee("1","emp1","funciones1",10000));
		mockEmployees.add(new Employee("2","emp2","funciones2",20000));
		mockEmployees.add(new Employee("3","emp3","funciones3",30000));
		mockEmployees.add(new Employee("4","emp4","funciones4",40000));
		mockEmployees.add(new Employee("5","emp5","funciones5",50000));
		mockEmployees.add(new Employee("6","emp6","funciones6",60000));
	}

	@Override
	public List<Employee> getAllEmployees() {
		return mockEmployees;
	}

	@Override
	public void addNewEmployee(Employee employee) {
		mockEmployees.add(employee);
	}

}
