package Logica;

public class POO {
    public static void main(String[] args) {
       
        /*Creamos un objeto alumno */
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Ayrton", "MiÃ±o");
    
    System.out.println("La id del alumno 2 es: " + alu2.getId());
    System.out.println("El nombre del alumno 2 es: " + alu2.getNombre());
    System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());
    
    /*Utilizamos metodo SET para agregar valores al objeto vacio alu1*/
    alu1.setId(8);
    alu1.setNombre("Benja");
    alu1.setApellido("Miño");
    
    System.out.println("--------------------------");
    System.out.println("La id del alumno 1 es: " + alu1.getId());
    System.out.println("El nombre del alumno 1 es: " + alu1.getNombre());
    System.out.println("El apellido del alumno 1 es: " + alu1.getApellido());
    
   
    
    alu2.setId(33);/*sobreescribimos el valor id del alu2 con set*/
    System.out.println("--------------------------");
    System.out.println("La id del alumno 2 es: " + alu2.getId());
    System.out.println("El nombre del alumno 2 es: " + alu2.getNombre());
    System.out.println("El apellido del alumno 2 es: " + alu2.getApellido());
    
    
    
    
    
    }
    
    
}
