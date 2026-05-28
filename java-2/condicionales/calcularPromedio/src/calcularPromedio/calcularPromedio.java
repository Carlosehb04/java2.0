package calcularPromedio;

import java.util.Scanner;

public class calcularPromedio {

	public static void main(String[] args) {
		
	
		Scanner teclado = new Scanner(System.in);
		
		int nota1,nota2,nota3;
		System.out.println("Ingrese tu primer nota");
		nota1 = teclado.nextInt();
		
		System.out.println("Ingrese tu segundo nota");
		nota2 = teclado.nextInt();
		
		System.out.println("Ingrese tu tercer nota");
		nota3 = teclado.nextInt();
		
		int promedio = (nota1 + nota2 + nota3) / 3;
		
		if(promedio >=7) {
			System.out.println("Promocionado");
		}else {
			if(promedio >= 4) {
				System.out.println("regular");
			}else {
				System.out.println("Reprobado");
			}
		}
		
		
		
		
		

	}

}
