import java.util.Scanner;

public class ClasificadorNumeros {
	private Scanner teclado;
	private int numero;
	private int positivos;
	private int negativos;
	private int ceros;
	private int [] numeros;
	
	
	public void cargarDatos() {
		teclado = new Scanner(System.in);
		System.out.println("Ingresar la cantidad de numeros a comparar");
		numero = teclado.nextInt();
		
		numeros = new int[numero];
		
		for(int i = 0; i < numeros.length; i++) {
			
			System.out.println("Ingresa el numero " + (i + 1));
			numeros[i] = teclado.nextInt();
		}

	}
	
	public void clasificarNumeros() {
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > 0) {
				positivos++;
			}else if(numeros[i] < 0 ) {
				 negativos++;
				
			}else {
				ceros++;
			}
		}
		
	}
	
	public void mostrarResultados() {
		
		System.out.println("=== Resultados ===");
		
		System.out.println("Total de numeros positivos: " + positivos);
		System.out.println("Total de numeros negativos: " + negativos);
		System.out.println("Total de numeros ceros: " + ceros);
		
	}

	public static void main(String[] args) {
	
		ClasificadorNumeros vs = new ClasificadorNumeros();
		vs.cargarDatos();
		vs.clasificarNumeros();
		vs.mostrarResultados();
	}

}
