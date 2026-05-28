import java.util.Scanner;

public class MatrizDinamica {

	private int matriz[][];
	private int filas;
	private int columnas;
	private Scanner teclado;

	public void cargarMatriz() {
		teclado = new Scanner(System.in);

		System.out.println("¿Cuantas filas quieres?");
		filas = teclado.nextInt();

		System.out.println("¿Cuantas columnas quieres?");
		columnas = teclado.nextInt();

		matriz = new int[filas][columnas];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Ingresa el numero de la posicion " + i + "," + j) ;
				matriz[i][j] = teclado.nextInt();
			}
		}

	}

	public void mostrarFilaMayorSuma() {

		int mayorSuma =  matriz[0][0];
		int filaMayor = 0;

		for (int i = 0; i < matriz.length; i++) {

			int sumaFila = 0;

			for (int j = 0; j < matriz[i].length; j++) {

				sumaFila += matriz[i][j];

			}

			if (sumaFila > mayorSuma) {

				mayorSuma = sumaFila;
				filaMayor = i;
			}
		}

		System.out.println("Fila con mayor suma: " + (filaMayor + 1));

		System.out.println("Mayor suma: " + mayorSuma);

	}

	public void mostrarColumnaMenorMedia() {

		double mediaMenor = 0;

		int columnaMenor = 0;

		for (int i = 0; i < matriz[0].length; i++) {

			int sumaTotalColumna = 0;

			for (int j = 0; j < matriz.length; j++) {

				sumaTotalColumna += matriz[j][i];

			}

			double mediaActual = (double) sumaTotalColumna / matriz.length;

			if (i == 0 || mediaActual < mediaMenor) {

				mediaMenor = mediaActual;

				columnaMenor = i;

			}

		}

		System.out.println("Columna con menor media: " + (columnaMenor + 1));

		System.out.println("Media menor: " + mediaMenor);

	}

	public void mostrarMultiplos3y5() {
		int contador = 0;

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] % 3 == 0 && matriz[i][j] % 5 == 0) {

					contador++;
				}

			}
		}

		System.out.println("La cantidad de numero multiplos de 3 y 5 es: " + contador);

	}

	public void mostrarMayorYMenor() {

		int mayor = matriz[0][0];
		int menor = matriz[0][0];

		int filaMayor = 0;
		int columnaMayor = 0;

		int filaMenor = 0;
		int columnaMenor = 0;

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				if (matriz[i][j] > mayor) {

					mayor = matriz[i][j];

					filaMayor = i;
					columnaMayor = j;

				}

				if (matriz[i][j] < menor) {

					menor = matriz[i][j];
					filaMenor = i;
					columnaMenor = j;
				}

			}
		}

		System.out.println("El numero mayor es: " + mayor);
		System.out.println("Posicion mayor: " + (filaMayor + 1) + "," + (columnaMayor + 1));
		System.out.println("================");
		System.out.println("El numero menor es: " + menor);
		System.out.println("Posicion mayor: " + (filaMenor + 1) + "," + (columnaMenor + 1));

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

		mostrarFilaMayorSuma();

		mostrarColumnaMenorMedia();

		mostrarMultiplos3y5();

		mostrarMayorYMenor();

	}

	public static void main(String[] args) {

		MatrizDinamica vs = new MatrizDinamica();

		vs.cargarMatriz();

		vs.mostrarResumen();

	}

}
