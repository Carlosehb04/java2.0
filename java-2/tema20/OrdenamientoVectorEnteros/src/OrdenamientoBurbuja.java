import java.util.Scanner;

public class OrdenamientoBurbuja {
	
	private int n;
	private int numeros [];
	
	
	public void cargarVector() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresas la cantidad de numero que vas a ordenar");
		n = teclado.nextInt();
		
		numeros = new int[n];
		
		for(int i = 0; i < numeros.length; i++) {
			
			System.out.println("Ingresa el numero " +  (i + 1));
			numeros[i] = teclado.nextInt();
			
			
		}
		
		
	}
	
	
	public void ordenarVector(){
		
		for(int i = 0; i < numeros.length - 1; i++) {
			
			for(int f = 0; f < numeros.length - 1 - i; f++) {
				
				if(numeros[f] > numeros[f + 1]) {
					
					int aux = numeros[f];
					numeros[f] = numeros[f + 1];
					numeros[f + 1] = aux;
				}
				
			}
			
		}
		
	}
	
	public void mostrarVector () {
		
		System.out.println("\n Numeros ordenados de menor a mayor: \n");
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
	
	

	public static void main(String[] args) {
		
		OrdenamientoBurbuja vs = new OrdenamientoBurbuja();
		
		vs.cargarVector();
		vs.ordenarVector();
		vs.mostrarVector();
		

	}

}
