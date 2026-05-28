import java.util.Scanner;

public class EstadisticasPartidos {

	private Scanner teclado;
	private int n;
	private int goles[];
	private int totalGoles;
	private double porcentaje;

	public void cargarGoles() {

		teclado = new Scanner(System.in);

		System.out.println("¿Cuantas partidos deseas ingresar?");
		n = teclado.nextInt();

		goles = new int[n];

		for (int i = 0; i < goles.length; i++) {
			System.out.println("Ingrese los goles del partido " + (i + 1));
			goles[i] = teclado.nextInt();

		}

	}

	public void mostrarTotalGoles() {

		for (int i = 0; i < goles.length; i++) {
			totalGoles += goles[i];
		}

		System.out.println("Total de goles: " + totalGoles);

	}

	public void mostrarPartidoMasGoles() {

		int mayorGoles = goles[0];
		int mayorPartido = 0;

		for (int i = 0; i < goles.length; i++) {
			if (goles[i] > mayorGoles) {
				mayorGoles = goles[i];
				mayorPartido = i;
			}
		}

		System.out.println(
				"El partido con mas goles fue el partido " + (mayorPartido + 1) + " con " + mayorGoles + " goles");

	}

	public void mostrarPartidosMas3Goles() {

		int contador = 0;

		for (int i = 0; i < goles.length; i++) {

			if (goles[i] > 3) {

				contador++;

			}

		}

		System.out.println("Partidos con mas de 3 goles: " + contador);

	}

	public void mostrarPorcentajePartidosConGol() {

		int contador = 0;

		for (int i = 0; i < goles.length; i++) {

			if (goles[i] > 0) {

				contador++;

			}

		}

		porcentaje = (contador * 100.0) / goles.length;

		System.out.println("Porcentaje de partidos con goles: " + porcentaje + "%");

	}

	public void mostrarResumen() {

		mostrarTotalGoles();

		mostrarPartidoMasGoles();

		mostrarPartidosMas3Goles();

		mostrarPorcentajePartidosConGol();

	}

	public static void main(String[] args) {
		EstadisticasPartidos vs = new EstadisticasPartidos();
		
		vs.cargarGoles();
		vs.mostrarResumen();

	}

}
