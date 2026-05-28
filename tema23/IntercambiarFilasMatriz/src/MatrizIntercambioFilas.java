import java.util.Scanner;

public class MatrizIntercambioFilas {

	private int[][] matriz;
	private int aux[];
	private int fila, columna;
	private Scanner teclado;

	public void cargarMatriz() {

		teclado = new Scanner(System.in);

		System.out.println("Ingresar numero de filas");
		fila = teclado.nextInt();
		columna = teclado.nextInt();

		matriz = new int[fila][columna];

		for (int fila = 0; fila < matriz.length; fila++) {

			for (int columna = 0; columna < matriz[fila].length; columna++) {

				System.out.println("Ingresar numero ");
				matriz[fila][columna] = teclado.nextInt();
			}

		}

	}

	public void mostrarMatriz() {

		System.out.println("==== Resultados ====");

		for (int fila = 0; fila < matriz.length; fila++) {

			for (int columna = 0; columna < matriz[fila].length; columna++) {

				System.out.print(matriz[fila][columna]+ " ");

			}
			System.out.println();
		}

	}

	public void intercambiarFilas() {

		if (matriz.length < 2) {
			System.out.println("No se pueden intercambiar filas porque la matriz tiene menos de 2 filas.");
			return;
		}

		aux = matriz[0];
		matriz[0] = matriz[1];
		matriz[1] = aux;

		System.out.println("Matriz intercambiada");
		
		for (int fila = 0; fila < matriz.length; fila++) {

			for (int columna = 0; columna < matriz[fila].length; columna++) {

				System.out.print(matriz[fila][columna] + " ");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		MatrizIntercambioFilas vs = new MatrizIntercambioFilas();

		vs.cargarMatriz();
		vs.mostrarMatriz();
		vs.intercambiarFilas();

	}

}