import java.util.Scanner;

public class ValoresIgualesOperacion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		int num1, num2, num3;
		
		System.out.println("Ingrese el numero 1");
		num1 = teclado.nextInt();
		
		System.out.println("Ingrese el numero 2");
		num2 = teclado.nextInt();
		
		System.out.println("Ingrese el numero 3");
		num3 = teclado.nextInt();
		
		if(num1 == num2 && num2 == num3) {
			int suma = num1 + num2;
		    int resultado = suma * num3;
		    
		    System.out.println("El resusltado es " + resultado);
			
		}else {
			System.out.println("Lo valores no son iguales");
		}

	}

}
