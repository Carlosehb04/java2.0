import java.util.Scanner;

public class RankingEstudiantes {

	private String estudiantes[];
	private double notaTeoria[];
	private double notaPractica[];
	private double notaFinal[];
	private Scanner teclado;
	private int n;

	public void cargarDatos() {
		teclado = new Scanner(System.in);

		System.out.println("¿Cuantos estudiantes deseas ingresar?");
		n = teclado.nextInt();

		estudiantes = new String[n];
		notaTeoria = new double[n];
		notaPractica = new double[n];
		notaFinal = new double[n];

		for (int i = 0; i < estudiantes.length; i++) {

			System.out.println("Ingresa el nombre del estudiante " + (i + 1));
			estudiantes[i] = teclado.next();

			System.out.println("Ingresa el nota del estudiante " + (i + 1));
			notaTeoria[i] = teclado.nextDouble();

			System.out.println("Ingresa la nota de practica del estudiante " + (i + 1));
			notaPractica[i] = teclado.nextDouble();

		}

	}

	public void calcularNotasFinales() {

		for (int i = 0; i < notaTeoria.length; i++) {

			notaFinal[i] = (notaTeoria[i] * 0.4) + (notaPractica[i] * 0.6);

		}
	}

	public void ordenarRanking() {

		for (int i = 0; i < notaFinal.length; i++) {

			for (int j = i + 1; j < notaFinal.length; j++) {

				if (notaFinal[i] < notaFinal[j]) {

					double auxFinal = notaFinal[i];

					notaFinal[i] = notaFinal[j];

					notaFinal[j] = auxFinal;

					String auxNombre = estudiantes[i];

					estudiantes[i] = estudiantes[j];

					estudiantes[j] = auxNombre;

					double auxTeoria = notaTeoria[i];

					notaTeoria[i] = notaTeoria[j];

					notaTeoria[j] = auxTeoria;

					double auxPractica = notaPractica[i];

					notaPractica[i] = notaPractica[j];

					notaPractica[j] = auxPractica;

				}

			}

		}

	}

	public void mostrarRanking() {

		for (int i = 0; i < estudiantes.length; i++) {

			System.out.println("Posicion " + (i + 1));

			System.out.println("Estudiante: " + estudiantes[i]);

			System.out.println("Nota teoria: " + notaTeoria[i]);

			System.out.println("Nota practica: " + notaPractica[i]);

			System.out.println("Nota final: " + notaFinal[i]);

			System.out.println();

		}

	}

	public void mostrarMejorNotaPractica() {

		String estudianteMayor = estudiantes[0];
		double notaMayor = notaPractica[0];

		for (int i = 0; i < notaPractica.length; i++) {

			if (notaPractica[i] > notaMayor) {
				notaMayor = notaPractica[i];
				estudianteMayor = estudiantes[i];
			}
		}

		System.out.println("Mejor estudiante en practica: " + estudianteMayor);

		System.out.println("Nota practica: " + notaMayor);

	}

	public void mostrarPorcentajeAprobados() {

		int contador = 0;

		for (int i = 0; i < notaFinal.length; i++) {

			if (notaFinal[i] >= 70) {
				contador++;

			}

		}
		if(contador == 0) {
            System.out.println("No hay estudiantes aprobados");
		}else {
			double porcentaje = ((double) contador / estudiantes.length) * 100;

			System.out.println("Porcentaje de aprobados: " + porcentaje + "%");
		}

		
	}

	public void mostrarResumen() {

		calcularNotasFinales();

		ordenarRanking();

		mostrarRanking();

		mostrarMejorNotaPractica();

		mostrarPorcentajeAprobados();

	}

	public static void main(String[] args) {

		RankingEstudiantes vs = new RankingEstudiantes();

		vs.cargarDatos();

		vs.mostrarResumen();

	}

}
