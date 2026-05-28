import java.util.Scanner;

public class MatrizVertices {
	
	private int fila, columna;
	private Scanner teclado;
	private int[][] matriz;
	
	public void cargarMatriz() {

		teclado = new Scanner(System.in);

		System.out.println("Ingresar numero de filas");
		fila = teclado.nextInt();
		
		System.out.println("Ingresar numero de columnas");
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

	public void mostrarVertices(){
		
		System.out.println("=== Los vertices son ===");
		
		System.out.print(matriz[0][0] + " ");
		System.out.println(matriz[0][matriz[0].length - 1]);
		System.out.print(matriz[matriz.length - 1][0] + " ");
		System.out.print(matriz[matriz.length - 1][matriz[0].length - 1]);
		
		
}
	
	

	public static void main(String[] args) {
	
		MatrizVertices vs = new MatrizVertices();
		
		vs.cargarMatriz();
		vs.mostrarMatriz();
		vs.mostrarVertices();
	}

}
