import java.util.Scanner;

public class TablaMultiplicarUsuario {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		int numero;
		int i;
		int resultado;
		
		do {
			System.out.println("Ingresa el numero");
			numero = teclado.nextInt();
		}while(numero < 1 || numero > 10);
		
		for(i = 1; i <= 12; i++) {
			resultado = numero * i;
			System.out.println(numero + " x " + i +" = "+ resultado);
		}
		
	}

}
