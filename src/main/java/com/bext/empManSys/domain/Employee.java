package com.bext.empManSys.domain;

public class Employee {
	private String empId;
	private String nombre;
	private String designacion;
	private double sueldo;

	public Employee( ) {
	}
	
	public Employee(String empId, String nombre, String designacion, double sueldo) {
		super();
		this.empId = empId;
		this.nombre = nombre;
		this.designacion = designacion;
		this.sueldo = sueldo;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDesignacion() {
		return designacion;
	}

	public void setDesignacion(String designacion) {
		this.designacion = designacion;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
