package numeroCifras;

import java.util.Scanner;

public class cifras {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Escribe la cifra a comprar");
		num1 = teclado.nextInt();
		
		if(num1 <= 0) {
			System.out.println("Error");
		}else {
			if(num1 < 10 ) {
				System.out.println("El numero " + num1 + " es de 1 cifras");
			}else {
				if(num1 < 100) {
					System.out.println("El numero " + num1 + " es de 2 cifras");
				}else {
					if(num1 < 1000) {
						System.out.println("El numero " + num1 + " es de 3 cifras");
					
					}else {
						System.out.println("Mayor a 3 cifras");
					}
				}
			}
		}
	}

}
