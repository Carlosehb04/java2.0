import java.util.Scanner;

public class NotasAlumnos {

	private double notas[];
	private Scanner teclado;
	private int n;

	public void cargarNotas() {
		teclado = new Scanner(System.in);
		System.out.println("¿Cuantas notas quieres ingresar?");
		n = teclado.nextInt();

		notas = new double[n];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Ingresar la nota " + (i + 1));
			notas[i] = teclado.nextDouble();
		}
	}

	public void mostrarNotaMayorYPosicion() {
		double notaMayor = notas[0];
		int posicionMayor = 0;

		for (int i = 0; i < notas.length; i++) {

			if (notas[i] > notaMayor) {
				notaMayor = notas[i];
				posicionMayor = i;
			}
		}

		System.out.println("Nota mayor: " + notaMayor);

		System.out.println("Posicion: " + (posicionMayor + 1));

	}

	public void mostrarNotaMenorYPosicion() {

		double notaMenor = notas[0];

		int posicionMenor = 0;

		for (int i = 0; i < notas.length; i++) {

			if (notas[i] < notaMenor) {

				notaMenor = notas[i];

				posicionMenor = i;

			}

		}

		System.out.println("Nota menor: " + notaMenor);

		System.out.println("Posicion: " + (posicionMenor + 1));

	}

	public void mostrarCantidadNotasMaximas() {

		double notaMayor = notas[0];

		int contador = 0;

		for (int i = 0; i < notas.length; i++) {

			if (notas[i] > notaMayor) {

				notaMayor = notas[i];

			}

		}

		for (int i = 0; i < notas.length; i++) {

			if (notas[i] == notaMayor) {

				contador++;

			}

		}

		System.out.println("Cantidad de alumnos con nota maxima: " + contador);

	}

	public void mostrarAlumnosEntreMinimoYMaximo() {

		double notaMayor = notas[0];

		double notaMenor = notas[0];

		int contador = 0;

		for (int i = 0; i < notas.length; i++) {

			if (notas[i] > notaMayor) {

				notaMayor = notas[i];

			}

			if (notas[i] < notaMenor) {

				notaMenor = notas[i];

			}

		}

		for (int i = 0; i < notas.length; i++) {

			if (notas[i] > notaMenor && notas[i] < notaMayor) {

				contador++;

			}

		}

		System.out.println("Alumnos entre la nota minima y maxima: " + contador);

	}

	public void mostrarResumen() {

		mostrarNotaMayorYPosicion();

		mostrarNotaMenorYPosicion();

		mostrarCantidadNotasMaximas();

		mostrarAlumnosEntreMinimoYMaximo();

	}

	public static void main(String[] args) {

	    NotasAlumnos vs = new NotasAlumnos();

	    vs.cargarNotas();

	    vs.mostrarResumen();

	}

}
