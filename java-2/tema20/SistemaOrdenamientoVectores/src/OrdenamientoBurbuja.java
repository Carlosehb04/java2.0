import java.util.Scanner;

public class OrdenamientoBurbuja {

	private int[] sueldos;

	// CARGAR LOS SUELDOS EN EL VECTOR

	public void cargar() {
		Scanner teclado = new Scanner(System.in);
		sueldos = new int[5];

		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Ingrese el sueldo: " + (i + 1));
			sueldos[i] = teclado.nextInt();
		}
	}

	// ORDENAR DE MENOR A MAYOR

	public void ordenar() {

		// FOR EXTERNO
		// REPITE EL PROCESO VARIAS VECES
		for(int i = 0; i < sueldos.length - 1; i++) {
			
			//FOR INTERNO
			// COMPARA POSICIONES VECINAS
			for(int f = 0; f < sueldos.length - 1 - i; f++) {
				
				// SI EL ELEMENTO ACTUAL ES MAYOR AL SIGUIENTES 
				if(sueldos[f] > sueldos[f + 1]) {
					//INTERCAMBIO USANDO VARIABLE AUXILIAR
					
					int aux = sueldos[f];
					sueldos[f] = sueldos[f + 1];
					sueldos[f + 1] = aux;
					
					
				}
			}
			
		}
		
	}
	
	// MOSTRAR EL VECTOR ORDENADO
	
	public void imprimir() {
		System.out.println("\n Sueldos ordenados de menor a mayor: \n");
		
		for(int i = 0; i < sueldos.length; i++) {
			System.out.println(sueldos[i]);
			
		}
		
	}
	
	

	public static void main(String[] args) {
		
		OrdenamientoBurbuja vs = new OrdenamientoBurbuja();
		
		vs.cargar();
		vs.ordenar();
		vs.imprimir();

	}

}
