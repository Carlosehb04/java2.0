package cuantosDigitosTienenUnNumero;

import java.util.Scanner;

public class SumaAcumulada {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int suma = 0 ;
		int numero;
		
		
		do {
			
			System.out.println("Ingresa el numero");
			numero = teclado.nextInt();
			
			if(numero != 9999) {
				suma += numero;
			}
			
		}while(numero != 9999);
		
		
		if(suma > 0) {
			System.out.println("Mayor a cero " + suma);
			
		}else if(suma < 0) {
			System.out.println("Menor a cero: " + suma);
			
		}else {
			System.out.println("La suma es cero: " + suma);
		}
		

	}

}
