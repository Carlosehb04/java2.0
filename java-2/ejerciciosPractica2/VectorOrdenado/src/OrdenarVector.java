import java.util.Scanner;

public class OrdenarVector {

	private int n;
	private int numeros[];
	private boolean ordenado = true;

	public void cargarVector() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingresar el numero del vector ");
		n = teclado.nextInt();

		numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Ingresar el numero " + (i + 1));
			numeros[i] = teclado.nextInt();
		}

	}

	public void verificarOrden() {

		for (int i = 1; i < numeros.length; i++) {

			if (numeros[i] < numeros[i - 1]) {

				ordenado = false;

			}

		}

	}

	public void mostrarResultado() {

		System.out.println("=== Resultado ===");

		if (ordenado) {

			System.out.println("El vector esta ordenado de menor a mayor");

		} else {

			System.out.println("El vector NO esta ordenado de menor a mayor");

		}

	}

	public static void main(String[] args) {
		OrdenarVector vs = new OrdenarVector();

		vs.cargarVector();
		vs.verificarOrden();
		vs.mostrarResultado();

	}

}
