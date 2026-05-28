import java.util.Scanner;

public class GestionInasistencias {

	private String empleados[];
	private Scanner teclado;
	private int faltas[][];

	public void cargarEmpleadosEInasistencias() {

		teclado = new Scanner(System.in);

		System.out.println("¿Cuantos empleados desea ingresar?");
		int filas = teclado.nextInt();

		empleados = new String[filas];
		faltas = new int[filas][];

		for (int i = 0; i < empleados.length; i++) {

			System.out.println("Ingrese el nombre del empleado");

			empleados[i] = teclado.next();

			System.out.println("Cuantos dias falto el empleado");

			int cantidad = teclado.nextInt();

			faltas[i] = new int[cantidad];

			for (int j = 0; j < faltas[i].length; j++) {

				System.out.println("Ingrese el dia faltado");

				faltas[i][j] = teclado.nextInt();

			}

		}

	}

	public void mostrarInasistencias() {

		for (int i = 0; i < faltas.length; i++) {

			System.out.println(empleados[i] + " tuvo " + faltas[i].length + " inasistencias");
		}

	}

	public void mostrarEmpleadoMenosFaltas() {

		int menorFalta = faltas[0].length;
		String empleadoMenor = empleados[0];

		for (int i = 0; i < empleados.length; i++) {

			if (faltas[i].length < menorFalta) {
				menorFalta = faltas[i].length;
				empleadoMenor = empleados[i];
			}

		
		}

		System.out.println(
				"El empleado con menos faltas es: " + empleadoMenor + " con " + menorFalta + " inasistencias");
	}

	public static void main(String[] args) {

		GestionInasistencias vs = new GestionInasistencias();

		vs.cargarEmpleadosEInasistencias();
		vs.mostrarInasistencias();
		vs.mostrarEmpleadoMenosFaltas();

	}

}
