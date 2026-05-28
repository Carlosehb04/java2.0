import java.util.Scanner;

public class VectorNumerosEnteros {

	private int numeros[];
	private Scanner teclado;

	public void cargarNumerosEnteros() {

		teclado = new Scanner(System.in);

		numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Ingresa el numero " + (i + 1));

			numeros[i] = teclado.nextInt();

		}

	}

	public void mostrarVectorOriginal() {

		System.out.println("===== VECTOR ORIGINAL =====");

		for (int i = 0; i < numeros.length; i++) {

			System.out.println(numeros[i]);

		}

	}

	public void ordenarNumerosMayorAMenor() {
		int aux;
		for (int i = 0; i < numeros.length; i++) {

			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] > numeros[i]) {
					aux = numeros[i];

					numeros[i] = numeros[j];

					numeros[j] = aux;
				}

			}

		}

	}

	public void mostrarVectorOrdenado() {

		System.out.println("===== VECTOR ORDENADO =====");

		for (int i = 0; i < numeros.length; i++) {

			System.out.println(numeros[i]);

		}

	}

	public void calcularMedianaValores() {

		double mediana;

		int mitad = numeros.length / 2;

		mediana = (numeros[mitad - 1] + numeros[mitad]) / 2.0;

		System.out.println("La mediana de los valores es: " + mediana);

	}

	public void mostrarResumenVectores() {

		System.out.println("===== RESUMEN DEL VECTOR =====");

		mostrarVectorOriginal();

		ordenarNumerosMayorAMenor();

		mostrarVectorOrdenado();

		calcularMedianaValores();

	}

	public static void main(String[] args) {

	    VectorNumerosEnteros vs = new VectorNumerosEnteros();

	    vs.cargarNumerosEnteros();

	    vs.mostrarResumenVectores();

	}

}
