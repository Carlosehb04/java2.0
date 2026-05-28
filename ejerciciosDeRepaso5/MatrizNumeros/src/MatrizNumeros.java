import java.util.Scanner;

public class MatrizNumeros {

	private int matriz[][];
	private Scanner teclado;
	private int fila;
	private int columna;

	public void cargarMatriz() {

		teclado = new Scanner(System.in);

		System.out.println("¿Tamaño de la filas?");
		fila = teclado.nextInt();

		System.out.println("¿Tamaño de la columas?");
		columna = teclado.nextInt();

		matriz = new int[fila][columna];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Ingresa el numero de la posicion " + (j + 1));
				matriz[i][j] = teclado.nextInt();
			}
		}

	}

	public void mostrarSumaFilasColumnas() {

		for (int i = 0; i < matriz.length; i++) {

			int sumaFila = 0;

			for (int j = 0; j < matriz[i].length; j++) {

				sumaFila += matriz[i][j];

			}

			System.out.println("Suma fila " + i + ": " + sumaFila);

		}

		for (int j = 0; j < matriz[0].length; j++) {

			int sumaColumna = 0;

			for (int i = 0; i < matriz.length; i++) {

				sumaColumna += matriz[i][j];

			}

			System.out.println("Suma columna " + j + ": " + sumaColumna);

		}

	}

	public void mostrarMayorCadaFila() {

		for (int i = 0; i < matriz.length; i++) {

			int mayorFila = matriz[i][0];
			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] > mayorFila) {
					mayorFila = matriz[i][j];

				}

			}

			System.out.println("Mayor fila " + i + ": " + mayorFila);
		}

	}

	public void mostrarSumaDiagonales() {

		int sumaDiagonal = 0;

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				if (i == j) {
					sumaDiagonal += matriz[i][j];

				}

			}

		}
		System.out.println("Suma diagonal " + sumaDiagonal);

	}

	public void mostrarMatriz() {

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				System.out.print(matriz[i][j] + " ");

			}

			System.out.println();

		}

	}

	public void mostrarResumen() {

		mostrarMatriz();

		mostrarSumaFilasColumnas();

		mostrarMayorCadaFila();

		mostrarSumaDiagonales();

	}

	public static void main(String[] args) {

	    MatrizNumeros vs = new MatrizNumeros();

	    vs.cargarMatriz();

	    vs.mostrarResumen();

	}
}
