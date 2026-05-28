import java.util.Scanner;

public class GestionTemperaturas {

	private String[] paises;
	private double[][] temperatura;
	private Scanner teclado;
	private int n;

	public void cargarPaisesYTemperaturas() {

		teclado = new Scanner(System.in);

		System.out.println("¿Cuántos países desea ingresar?");
		n = teclado.nextInt();

		paises = new String[n];

		temperatura = new double[n][3];

		for (int i = 0; i < paises.length; i++) {
			System.out.println("Ingresar el nombre del pais");
			paises[i] = teclado.next();

			for (int c = 0; c < temperatura[i].length; c++) {
				// PEDIMOS EL SUELDO
				System.out.println("INGRESE LA TEMPERATURA " + (c + 1));
				// GUARDAMOS EL SUELDO EN LA MATRIZ
				temperatura[i][c] = teclado.nextDouble();
			}

		}

	}

	public void calcularTemperaturaMediaTrimestral() {

		for (int i = 0; i < temperatura.length; i++) {

			double acumulador = 0;

			for (int c = 0; c < temperatura[i].length; c++) {

				acumulador = acumulador + temperatura[i][c];
			}

			double media = acumulador / temperatura[i].length;

			System.out.println("Pais: " + paises[i] + " | Media trimestral: " + media);

		}

	}

	public void mostrarResultados() {

		System.out.println("===== RESULTADOS =====");

		calcularTemperaturaMediaTrimestral();

		mostrarPaisMayorTemperatura();

	}

	public void mostrarPaisMayorTemperatura() {

		double mayor = 0;
		String paisMayor = "";

		for (int i = 0; i < temperatura.length; i++) {

			double acumulador = 0;

			for (int c = 0; c < temperatura[i].length; c++) {

				acumulador = acumulador + temperatura[i][c];

			}

			double media = acumulador / temperatura[i].length;

			if (media > mayor) {

				mayor = media;

				paisMayor = paises[i];

			}

		}

		System.out.println("El pais con mayor temperatura media es: " + paisMayor + " con una media de: " + mayor);

	}

	public static void main(String[] args) {

		GestionTemperaturas gt = new GestionTemperaturas();

		gt.cargarPaisesYTemperaturas();

		gt.mostrarResultados();

	}

}
