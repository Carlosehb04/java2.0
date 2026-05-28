import java.util.Scanner;

public class SistemaDeEdades {
	
	private String nombre1;
	private int edad1;
	private int edad2;
	private String nombre2;
	
	
	public void cargarPersonas() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre persona 1");
		nombre1 = teclado.next();
		
		System.out.println("Ingresa tu edad persona 1");
		edad1 = teclado.nextInt();
		
		
		System.out.println("Ingresa tu nombre persona 2");
		nombre2 = teclado.next();
		
		System.out.println("Ingresa tu edad persona 2");
		edad2 = teclado.nextInt();
		
		
		
	}
	
	public void compararEdades() {
		
		if(edad1 == edad2) {
			System.out.println("=== Ambos tiene la misma edad ===");
			System.out.println(nombre1 + " con edad de " + edad1);
			System.out.println(nombre2 + " con edad de " + edad2);
		} else if(edad1 > edad2) {
			System.out.println(nombre1 + " con edad de " + edad1 + " es el mayor");
			
		}else {
			
			System.out.println(nombre2 + " con edad de " + edad2 + " es el mayor");
			
		}
		
		
	}
	

	
	

	public static void main(String[] args) {
		SistemaDeEdades vs = new SistemaDeEdades();
		
		vs.cargarPersonas();
		vs.compararEdades();

	}

}
