import java.util.Scanner;

public class OrdenamientoVector {
	
	private int n;
	private int numeros[];
	private Scanner teclado;
	
	
	
	public void cargarNumeros() {
		
		System.out.println("Ingresa la cantidad del vector");
		n = teclado.nextInt();
		
		numeros = new int[n];
		
		
		for(int i = 0; i < numeros.length; i++) {
			
			System.out.println("Ingresa el numero " + (i + 1));
			numeros[i] = teclado.nextInt();
		}
		
	}
	public void ordenarMenorAMayor() {
		
		int aux;
		for(int i = 0; i < numeros.length; i++) {
			for(int j = i + 1; j < numeros.length; j++) {
				
				if(numeros[i] > numeros[j]) {
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
				
			}
		}
		
	}
	
	public void mostrarNumerosPrimos() {
		
	}
	public void mostrarNumerosRepetidos() {
		
	}
	public void mostrarPorcentajeParesImpares() {
		
	}
	
	public void mostrarVector() {
		
	}
	public void mostrarResumen() {
		
	}

	
	
	
	
	
	

	public static void main(String[] args) {
	

	}

}
