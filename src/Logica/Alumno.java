package Logica;

public class Alumno {
    /*estas son variable o atributos globales */
    int id;
    String nombre;
    String apellido;

    /*Metodos CONSTRUCTORES de objetos */
    public Alumno(){ /*Constructor vacio */

    }

    public Alumno(int id, String nombre, String apellido){ /*Constructor con parametros */
        /*las variables de los parametros son locales al constructor */
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido; 
        /*con la palabra reservada 'this' indicamos al constructor
         * que a cada atributo le asigne el valor del parametro que recibe
         */
    }
    
    /*Getters y Setters*/
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/*Metodos */
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y puedo decir mi nombre");
    }

    public void saberNota(double calificacion){
        if (calificacion>6){
            System.out.println("Aprobado");

        }
        else {
            System.out.println("No aprobado");
        }
    }
}
