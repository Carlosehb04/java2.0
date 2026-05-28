package ejecicio7;

import java.util.Scanner;

public class ejecicio7 {

	public static void main(String[] args) {
		
		try(Scanner teclado = new Scanner(System.in)){
			
			double num1, num2;
			
			System.out.print("Escribe el primer numero ");
			num1 = teclado.nextDouble();
			
			System.out.print("Escribe el segundo numero ");
			num2 = teclado.nextDouble();
			
			if(num1 > num2) {
				double suma = num1 + num2;
				double diferencia = num1 - num2;
				
				System.out.println("Resultado de la suma es " + suma);
				System.out.print("Resultado de la diferencia es " + diferencia);
						
			}else {
				
				double producto = num1 * num2;
				
				System.out.println("Resultado de la multiplicación es " + producto);
				
				if(num2 != 0) {
					double division = num1 / num2;
					
					System.out.println("Resultado de la division es " + division);
				}else {
					System.out.print("No se puede realizar la division");
				}
				
			}
			
		}
	}

}
