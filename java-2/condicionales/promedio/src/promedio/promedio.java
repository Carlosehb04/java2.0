package promedio;

import java.util.Scanner;

public class promedio {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double nota1, nota2, nota3, promedio;
		
		System.out.print("Ingresa la primera nota ");
		nota1 = teclado.nextDouble();
		
		System.out.print("Ingresa la segunda nota ");
		nota2 = teclado.nextDouble();
		
		System.out.print("Ingresa la tercera nota ");
		nota3 = teclado.nextDouble();
		
		
	promedio = (nota1 + nota2 + nota3) / 3;
	
	long resultado = Math.round(promedio);
	
	if(promedio >= 7) {
		 System.out.println("Promocionado " + promedio);
	}else {
		System.out.print("No promocionado");
	}
		
	}
}
