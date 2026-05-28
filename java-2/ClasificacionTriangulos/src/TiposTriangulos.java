import java.util.Scanner;

public class TiposTriangulos {

	public static void main(String[] args) {
	
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		int lado1;
		int lado2;
		int lado3;
		int equilatero = 0;
		int isosceles = 0;
		int escaleno = 0;
		int i;
		
		do {

		    System.out.println("Ingrese un número entero");

		    while(!teclado.hasNextInt()) {

		        System.out.println("Error, ingrese un entero válido");
		        teclado.next();

		    }

		    n = teclado.nextInt();

		} while(n <= 0);
		
		
		
		for(i = 1; i <= n; i++) {
			
			System.out.println("Triangulo " + i);
			
			System.out.println("Ingresar lado 1");
			lado1 = teclado.nextInt();
			
			System.out.println("Ingresar lado 2");
			lado2 = teclado.nextInt();

			System.out.println("Ingresar lado 3");
			lado3 = teclado.nextInt();
			
			if(lado1 == lado2 && lado2 == lado3) {
				equilatero++;
			}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
				isosceles++;
			}else {
				escaleno++;
			}
		}
		
		System.out.println("Equilatero total: " + equilatero);
		System.out.println("Isosceles total: " + isosceles);
		System.out.println("Escaleno total: " + escaleno);
		

		
		int menor = Math.min(equilatero, Math.min(isosceles, escaleno));
		int cantidadMenor = 0;
		
		if(equilatero == menor) cantidadMenor++;
		if(escaleno == menor) cantidadMenor++;
		if(isosceles == menor) cantidadMenor++;
		
		if(cantidadMenor == 1) {
			
			if(equilatero == menor) {
				System.out.println("Equilatero es el menor con: " + menor);
			}else if(escaleno == menor) {
				System.out.println("Escaleno es el menor con: " + menor);
			}else{
				System.out.println("Isoseles es el menor con: " + menor);
				}
			
		}else {
			System.out.println("No existe un menor único");
		}
		
	
	}
		

}
