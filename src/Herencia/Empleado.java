package Herencia;

public class Empleado extends Persona{ /*Empleado "extiende" o "HEREDA" de Persona*/

	int legajo;
	String cargo;
	Double sueldo;
	
	/*Constructor vacio*/
	public Empleado(int legajo, String cargo, Double sueldo) {
		super();
		this.legajo = legajo;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
	/*Constructor con parametros*/

	public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int legajo,
			String cargo, Double sueldo) {
		super(id, dni, nombre, apellido, domicilio, telefono);/*atributos heredados*/
		this.legajo = legajo;
		this.cargo = cargo;
		this.sueldo = sueldo;
	}
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	/*Getters y Setters*/
	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
}
