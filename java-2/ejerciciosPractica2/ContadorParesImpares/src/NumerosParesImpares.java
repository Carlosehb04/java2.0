import java.util.Scanner;

public class NumerosParesImpares {

	private int n;
	private int impares;
	private int pares;
	private int numero;
	private Scanner teclado;

	public void solicitarCantidad() {

	    teclado = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de numero que quieres validar");
		n = teclado.nextInt();

	}

	public void cargarNumeros() {

		for (int i = 0; i < n; i++) {

			System.out.println("Ingresa el numero " + (i + 1));
			numero = teclado.nextInt();

			if (numero % 2 == 0) {
				pares++;

			}else {
				impares++;
			}
		}


	}

	public void mostrarResultado() {
		
		System.out.println("== Resultados ==");
		System.out.println("Total pares: " + pares);
		System.out.println("Total impares: " + impares);
	}

	public static void main(String[] args) {
		
		NumerosParesImpares vs = new NumerosParesImpares();
		vs.solicitarCantidad();
		vs.cargarNumeros();
		vs.mostrarResultado();

	}

}
