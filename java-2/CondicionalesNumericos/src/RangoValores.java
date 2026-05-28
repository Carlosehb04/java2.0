import java.util.Scanner;

public class RangoValores {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		int num1,num2,num3;
		int mayor;
		int menor;
		
		System.out.println("Ingresa el numero 1");
		num1 = teclado.nextInt();

		System.out.println("Ingresa el numero 2");
		num2 = teclado.nextInt();
		
		System.out.println("Ingresa el numero 3");
		num3 = teclado.nextInt();
		
		mayor = num1;
		menor = num1;
		
		
		if(num2 > mayor) {
			mayor = num2;
		}if(num2 < mayor) {
			menor = num2;
			
		}if(num3 > mayor) {
			mayor = num3;
		}if(num3 < menor) {
			menor = num3;
		}
		
		System.out.println("Mayor: " + mayor);
		System.out.println("Menor: " + menor);
		
	}

}
