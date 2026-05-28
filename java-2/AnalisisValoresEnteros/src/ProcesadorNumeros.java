import java.util.Scanner;

public class ProcesadorNumeros {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		int negativos = 0;
		int positivos = 0;
		int multiplos15 = 0;
		int sumarPares = 0;
		int i;
		int numero;
		
		

		System.out.println("Ingresa un numero");
		n = teclado.nextInt();
		
		
		for(i = 1; i < n; i++) {
			
			System.out.println("Ingresa el numero a validar " + i);
			numero = teclado.nextInt();
			
			if(numero < 0) {
				negativos++;
				
			}
			if(numero > 0) {
				positivos++;
				
			}
			if(numero % 15 == 0) {
				multiplos15++;
				
			}
			
			if(numero % 2 == 0) {
				sumarPares += numero;
				
			}
		}
		
		System.out.println("Total de negativos: " + negativos);
		System.out.println("Total de positivos: " + positivos);
		System.out.println("Total de multiplos de 15: " + multiplos15);
		System.out.println("Suma Total de imapres: " + sumarPares);

	}

}
