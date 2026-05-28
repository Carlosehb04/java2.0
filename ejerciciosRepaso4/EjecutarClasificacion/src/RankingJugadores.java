import java.util.Scanner;

public class RankingJugadores {

	private String nombres[];
	private int goles[];
	private Scanner teclado;
	private int n;

	public void cargarJugadoresYGoles() {
		teclado = new Scanner(System.in);
		System.out.println("Ingresar el tamaño del vector ");
		n = teclado.nextInt();

		nombres = new String[n];
		goles = new int[n];

		for (int i = 0; i < nombres.length; i++) {

			

			System.out.println("Ingresa el nombre del jugador " + (i + 1));
			nombres[i] = teclado.next();

			System.out.println("Ingresa los goles del juagdor ");
			goles[i] = teclado.nextInt();
		}

	}

	public void mostrarClasificacionOriginal() {

		System.out.println("===== CLASIFICACION ORIGINAL =====");

		for (int i = 0; i < nombres.length; i++) {

			System.out.println("Jugador: " + nombres[i] + " | Goles: " + goles[i]);

		}

	}

	public void ordenarJugadoresPorGoles() {

		int auxGoles;
		String auxNombre;
		for (int i = 0; i < goles.length; i++) {
			for (int j = i + 1; j < goles.length; j++) {

				if (goles[j] > goles[i]) {
					auxGoles = goles[i];
					goles[i] = goles[j];
					goles[j] = auxGoles;

					auxNombre = nombres[i];
					nombres[i] = nombres[j];
					nombres[j] = auxNombre;
				}
			}
		}

	}

	public void mostrarClasificacionOrdenada() {

		System.out.println("===== CLASIFICACION ORDENADA =====");

		for (int i = 0; i < nombres.length; i++) {

			System.out.println((i + 1) + ". " + nombres[i] + " | Goles: " + goles[i]);

		}

	}

	public void mostrarMaximoGoleador() {

		System.out.println("===== MAXIMO GOLEADOR =====");

		System.out.println("Jugador: " + nombres[0] + " | Goles: " + goles[0]);

	}

	public void mostrarResumenClasificacion() {

		System.out.println("===== RESUMEN CLASIFICACION =====");

		mostrarClasificacionOriginal();

		ordenarJugadoresPorGoles();

		mostrarClasificacionOrdenada();

		mostrarMaximoGoleador();

	}

	public static void main(String[] args) {

		RankingJugadores vs = new RankingJugadores();

		vs.cargarJugadoresYGoles();

		vs.mostrarResumenClasificacion();

	}

}
