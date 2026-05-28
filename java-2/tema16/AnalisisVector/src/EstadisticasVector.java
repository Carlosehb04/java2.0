import java.util.Scanner;

public class EstadisticasVector {
	
	private int sumaTotal = 0;
	private int sumaMayores36 = 0;
	private int sumaMayores50 = 0;
	private int numeros[];
	
	public void cargarVector() {
		
		Scanner teclado = new Scanner(System.in);
		
		 numeros = new int[8];
		 
		 for(int i = 0; i < numeros.length; i++) {
			 
			  System.out.println("Ingresar el numero " + (i + 1));
			  numeros[i] = teclado.nextInt();
		 }
		
	}
	
	public void procesarDatos() {
		
		for(int i = 0; i< numeros.length; i++ ) {
			sumaTotal +=numeros[i];
			
			if(numeros[i] > 36) {
				sumaMayores36  +=numeros[i];
				
			}
			
			if(numeros[i]> 50){
				sumaMayores50 += numeros[i];
			}
		}
		
		System.out.println("Total Suma general: " + sumaTotal);
		System.out.println("Total Suma Mayores a 36: " + sumaMayores36);
		System.out.println("Total Suma Mayores a 50: " + sumaMayores50);
		
	}


	public static void main(String[] args) {
		
		EstadisticasVector vector = new EstadisticasVector();
		
		vector.cargarVector();
		vector.procesarDatos();

	}

}
