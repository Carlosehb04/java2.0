import java.util.Scanner;

public class SumaNumeros {

	private int numero;
	private int suma;
	private Scanner teclado;

	public void cargarDatos() {
		teclado = new Scanner(System.in);
		System.out.println("Ingresar la cantidad de numero a sumar");
		numero = teclado.nextInt();

	}

	public void calcularSuma() {

		for (int i = 1; i <= numero; i++) {

			suma = suma + i;

		}

	}

	public void mostrarResultados() {

		System.out.println("=== Resultado ===");
		System.out.println(suma);

	}

	public static void main(String[] args) {

		SumaNumeros vs = new SumaNumeros();
		vs.cargarDatos();
		vs.calcularSuma();
		vs.mostrarResultados();

	}

}
