import java.util.Scanner;

public class MenorADiez {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Ingresa numero 1");
		num1 = teclado.nextInt();

		System.out.println("Ingresa numero 2");
		num2 = teclado.nextInt();
		
		System.out.println("Ingresa numero 3");
		num3 = teclado.nextInt();
		
		if(num1 < 10 || num2 < 10 || num3 < 10) {
			System.out.println("Alguno de los numeros es menor a Diez");
			
		}else {
			System.out.println("Todos son mayores a Diez");
		}


	}

}
