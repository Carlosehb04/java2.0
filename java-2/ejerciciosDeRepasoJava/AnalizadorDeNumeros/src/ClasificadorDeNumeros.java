import java.util.Scanner;

public class ClasificadorDeNumeros {
	
	private int numero;
	
	
	public void cargarNumeros() {
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese numero");
			numero = teclado.nextInt();
			
			analizarNumero(numero);
			
		}while(numero != 0);
		
	}
	public void analizarNumero(int numero) {
		
		
		if(numero > 0) {
			System.out.println("El numero " + numero +  " es positivo");
		}else if(numero < 0) {
			System.out.println("El numero " + numero +  " es negativo");
		}else {
			System.out.println("El numero " + numero );
		}
		
	}

	public static void main(String[] args) {
		
		ClasificadorDeNumeros vs = new ClasificadorDeNumeros();
		vs.cargarNumeros();
	

	}

}
