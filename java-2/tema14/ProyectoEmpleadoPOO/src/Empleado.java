import java.util.Scanner;

public class Empleado {
	
	private Scanner teclado;
	private double sueldo;
	private String nombre;
	
	
	public void cargarDatos() {
		
	   teclado = new Scanner(System.in);
	   
	   
	   System.out.println("Ingresa tu nombre " );
	    nombre = teclado.next();
	   
	   do {
		
		    System.out.println("Ingresa tu sueldo ");
		    sueldo = teclado.nextInt();
		    
		    if(sueldo < 0) {
		    	System.out.println("El sueldo debe ser mayor a 0");
		    }
	   }while(sueldo < 0);
	    
	}
	
	public void imprimirDatos() {
		
		System.out.println("==== Datos Ingresado ====");
		System.out.println("Nombre: " + nombre);
		System.out.println("Sueldo: "+ sueldo);
	}
	
	public void pagarImpuestos() {
		if(sueldo > 3000) {
			System.out.println("Debes pagar Impuestos");
		}else {
			System.out.println("No debes pagar impuestos");
		}
	}

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado();
		
		empleado1.cargarDatos();
		empleado1.imprimirDatos();
		empleado1.pagarImpuestos();
	}

}
