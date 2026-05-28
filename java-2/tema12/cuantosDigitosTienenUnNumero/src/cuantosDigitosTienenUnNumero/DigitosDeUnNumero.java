package cuantosDigitosTienenUnNumero;

import java.util.Scanner;

public class DigitosDeUnNumero {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("Ingresa el valor");
			n = teclado.nextInt();
			
		  if(n != 0) {
			
			  if(n > 999) {
				  System.out.println("El numero es mayor a 3 digitos");
			  }else if(n >= 100) {
				  System.out.println("El numero tiene 3 digitos");
			  }else if(n >= 10){
				  System.out.println("El numero es de 2 digitos");
			  }else {
				  System.out.println("El numero es de 1 digito");
			  }
		  }
						
			
		}while(n != 0);

	}

}
