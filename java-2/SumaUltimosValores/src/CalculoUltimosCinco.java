import java.util.Scanner;

public class CalculoUltimosCinco {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
	
		int numero;
		int suma = 0;
		int i;
		int valor;
		
		
		
		do {

			System.out.println("Ingresa numeros");
			numero = teclado.nextInt();
		}while(numero < 5);
		
		
		for(i = 1; i <= numero; i++) {
			
			 System.out.println("Ingresar valor "+ i );
			 valor = teclado.nextInt();
			
			if(i > numero - 5) {
				suma = suma + valor;
			}
		}
		
		System.out.println("Suma de los ultimos 5 numeros " + suma);

	}

}
