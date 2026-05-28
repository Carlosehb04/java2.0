import java.util.Scanner;

public class RegistroTemperaturas {

	private Scanner teclado;
	private int n;
	private double temperaturas[];
	private double suma;
	double media;

	public void cargarTemperaturas() {

		teclado = new Scanner(System.in);

		System.out.println("¿Cuantas temperaturas deseas ingresar?");
		n = teclado.nextInt();

		temperaturas = new double[n];

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Ingresa la temperatura " + (i + 1));
			temperaturas[i] = teclado.nextDouble();
			suma += temperaturas[i];
		}
	}

	public void mostrarTemperaturaMedia() {

		media = suma / temperaturas.length;

		System.out.println("La temperatura media es: " + media);
	}

	public void mostrarDiasSobreMedia() {

		int contador = 0;

		for (int i = 0; i < temperaturas.length; i++) {

			if (temperaturas[i] > media) {

				contador++;

			}
		}

		System.out.println("Dias sobre la media: " + contador);

	}

	public void mostrarDiaMayorTemperatura() {

		double Mayor = temperaturas[0];

		for (int i = 0; i < temperaturas.length; i++) {

			if (temperaturas[i] > Mayor) {
				Mayor = temperaturas[i];

			}
		}

	}

	public void mostrarDiasConsecutivosMayores35() {

		int contador = 0;

		for (int i = 0; i < temperaturas.length; i++) {

			if (temperaturas[i] > 35) {

				contador++;

			}

		}

		System.out.println("Dias con temperaturas mayores a 35: " + contador);

	}

	public void mostrarResumen() {

	    mostrarTemperaturaMedia();

	    mostrarDiasSobreMedia();

	    mostrarDiaMayorTemperatura();

	    mostrarDiasConsecutivosMayores35();

	}

	public static void main(String[] args) {
		RegistroTemperaturas vs = new RegistroTemperaturas();
		vs.cargarTemperaturas();
		vs.mostrarResumen();

	}

}
