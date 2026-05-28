   import java.util.Scanner;



 public class Persona {
	
    // ATRIBUTOS
   private Scanner teclado;
   private String nombre;
   private int edad;


// METODO PARA CARGAR LOS DATOS
     public void inicializar() {
    	 teclado = new Scanner(System.in);
    	 
    	System.out.println("Ingresa tu nombre: ");
    	nombre = teclado.next();
    	
    	System.out.println("Ingresa tu edad: ");
    	edad = teclado.nextInt();
	
     }
     
     // METODO PARA MOSTRAR DATOS
     public void imprimir() {
    	 
    	 System.out.println("Nombre: " + nombre);
    	 System.out.println("Edad: " + edad);
    	 
     }

     
     // METODO PARA MOSTAR SI ES MAYOR DE EDAD
     
     public void esMayorEdad() {
    	 
    	 if(edad >= 18) {
    		 System.out.println(nombre + " Es mayor de edad");
    	 }else {
    		 System.out.println(nombre + " Es menor de edad");
    	 }
     }
	public static void main(String[] args) {
		
		Persona persona1;
		
		persona1 = new Persona();
		persona1.inicializar();
		persona1.imprimir();
		persona1.esMayorEdad();
		
	
	}

}
