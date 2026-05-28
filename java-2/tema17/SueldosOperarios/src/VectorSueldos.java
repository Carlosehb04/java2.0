import java.util.Scanner;

public class VectorSueldos {
	
	private int[] sueldos;
	
	public void cargar() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuántos sueldos desea ingresar? : ");
		int cantidad = teclado.nextInt();
		
		sueldos = new int[cantidad];
		
		
		for(int i = 0; i < sueldos.length; i++) {
			System.out.println("Ingresa sueldo " + (i + 1) + ": ");
			sueldos[i] = teclado.nextInt();
			
		}
		
		
	}
	
	public void imprimir() {
		System.out.println("\nLista de sueldos: ");
		
		for(int i = 0; i< sueldos.length; i++ ) {
			System.out.println("Sueldo posición "+ (i + 1)+ ":" + sueldos[i]);
		}
		
	}

	public static void main(String[] args) {
		
		VectorSueldos vs = new VectorSueldos();
		
		vs.cargar();
		vs.imprimir();
		
	}

}
