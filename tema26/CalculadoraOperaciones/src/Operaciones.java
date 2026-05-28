import java.util.Locale;
import java.util.Scanner;

public class Operaciones {

	private int valor1;
	private int valor2;
	private Scanner teclado;

	public Operaciones() {
		teclado = new Scanner(System.in);

		System.out.println("Ingresar el valor 1");
		valor1 = teclado.nextInt();
		System.out.println("Ingresar el valor 2");
		valor2 = teclado.nextInt();

	}

	public void sumar() {

		int resultado = valor1 + valor2;

		System.out.println("La suma es: " + resultado);
	}

	public void restar() {

		int resultado = valor1 - valor2;
		System.out.println("La resta es: " + resultado);
	}

	public void multiplicar() {
		int resultado = valor1 * valor2;
		System.out.println("La multiplicacion es: " + resultado);
	}

	public void dividir() {

		double resultado = (double) valor1 / valor2;
		System.out.printf(Locale.US, "La division es: %.2f", resultado);
	}

	public void mostrarResultados() {

		sumar();

		restar();

		multiplicar();

		dividir();

	}

	public static void main(String[] args) {

		Operaciones op = new Operaciones();

		op.mostrarResultados();

	}

}
