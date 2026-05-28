import java.util.Scanner;

public class CalculoPromedio {

	public static void main(String[] args) {
	
		
		Scanner teclado = new Scanner(System.in);
		
		
		int suma = 0;
		int cantidad = 0;
		int valor;
		int contador = 1;
		
		do {
			System.out.println("Ingresa valores " + contador );
			valor = teclado.nextInt();
			
			if(valor != 0) {
				suma += valor;
				cantidad = cantidad + 1;
			}
			contador++;
			
		}while(valor != 0);
		
		if(cantidad != 0) {
			double promedio = (double)suma / cantidad;
			System.out.println("Promedio es: " + promedio);
		}else {
			System.out.println("No se ingresaron valores");
		}
		

	}

}
 