import java.util.Scanner;

public class vectorEstadisticas {
	
	private int sumaTotal = 0;
	private double promedio = 0;
	private int numerosMayores50 = 0;
	private int mayor; 
	private int pares = 0;
	private int n [];
	private int cantidad;
	
	
	public void cargarDatos() {
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("¿Ingresa el tamaño del elemento? :");
			 cantidad = teclado.nextInt();
		}while(cantidad <= 0);
		
		n = new int[cantidad];
		
		for(int i = 0; i < n.length; i++) {
			
		do {
			System.out.println("Ingresa elemento " + (i + 1) + ":");
			n[i] = teclado.nextInt();
		}while(n[i] <= 0);
			
		}
		
	}
	
	public void procesarDatos() {
		
		mayor = n[0];
		
		for(int i = 0; i < n.length; i++) {
			sumaTotal = sumaTotal + n[i];
	
			
			if(n[i] > 50) {
				numerosMayores50++;
			}
			if(n[i] > mayor) {
				mayor = n[i];
			}
			
			if(n[i] % 2 == 0) {
				pares++;
			}
			
		}
	}
	
	public void mostrarResultados() {
		System.out.println("Numero mayor " + mayor );
		System.out.println("Total numeros pares " + pares);
		System.out.println("Numeros mayores a 50 " + numerosMayores50 );
		System.out.println("Suma Total de todos los elementos " + sumaTotal);
		promedio = sumaTotal / cantidad;
		System.out.println("Promedio general " + promedio);
	}

	public static void main(String[] args) {
		
		 vectorEstadisticas vs = new  vectorEstadisticas();
		 
		 vs.cargarDatos();
		 vs.procesarDatos();
		 vs.mostrarResultados();
		
	}

}
