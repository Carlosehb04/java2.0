import java.util.Scanner;

public class GestionSueldos {

	// SCANNER PARA LEER DATOS DEL TECLADO
	private Scanner teclado;

	// VECTOR QUE GUARDA LOS NOMBRES DE LOS EMPLEADOS
	private String[] empleados;

	// MATRIZ QUE GUARDA LOS SUELDOS DE CADA EMPLEADO
	// FILAS = EMPLEADOS
	// COLUMNAS = MESES
	private int[][] sueldos;

	// VECTOR PARA GUARDAR LA SUMA TOTAL DE SUELDOS
	// DE CADA EMPLEADO
	private int[] sueldostot;

	public void cargar() {
		// INICIALIZAMOS EL SCANNER
		teclado = new Scanner(System.in);

		// CREAMOS EL VECTOR DE EMPLEADOS
		empleados = new String[4];

		// CREAMOS LA MATRIZ DE SUELDOS
		// 4 EMPLEADOS Y 3 MESES
		sueldos = new int[4][3];

		// RECORREMOS LAS FILAS
		// CADA FILA REPRESENTA UN EMPLEADO

		for (int i = 0; i < empleados.length; i++) {
			// PEDIMOS EL NOMBRE DEL EMPLEADO
			System.out.println("Ingresa el nombre del empleado:");
			// GUARDAMOS EL NOMBRE EN EL VECTOR
			empleados[i] = teclado.next();

			// RECORREMOS LAS COLUMNAS
			// CADA COLUMNA REPRESENTA UN MES
			for (int c = 0; c < sueldos[i].length; c++) {
				// PEDIMOS EL SUELDO
				System.out.println("INGRESE EL SUELDO DEL MES: " + (c + 1));
				// GUARDAMOS EL SUELDO EN LA MATRIZ
				sueldos[i][c] = teclado.nextInt();
			}
		}

	}
	// METODO PARA SUMAR LOS SUELDOS DE CADA EMPLEADO

	public void calcularSumaSueldos() {
		// CREAMOS EL VECTOR DE TOTALES

		sueldostot = new int[4];

		// RECORREMOS LAS FILAS DE LA MATRIZ
		for (int i = 0; i < sueldos.length; i++) {

			// VARIABLE AUXILIAR PARA ACUMULAR LA SUMA
			int suma = 0;

			for (int c = 0; c < sueldos[i].length; c++) {

				suma = suma + sueldos[i][c];

			}

			// GUARDAMOS LA SUMA TOTAL DEL EMPLEADO
			sueldostot[i] = suma;
		}

	}

	public void imprimirTotalPagado() {

		System.out.println("===== TOTAL PAGADO POR EMPLEADO =====");

		// RECORREMOS EL VECTOR DE TOTALES
		for (int f = 0; f < sueldostot.length; f++) {

			// MOSTRAMOS NOMBRE Y TOTAL ACUMULADO
			System.out.println(empleados[f] + " - " + sueldostot[f]);

		}

	}

	// METODO PARA MOSTRAR EL EMPLEADO
	// CON MAYOR SUELDO ACUMULADO

	public void empleadoMayorSueldo() {

		int mayor = sueldostot[0];

		String nom = empleados[0];

		for (int i = 0; i < sueldostot.length; i++) {

			if (sueldostot[i] > mayor) {
				mayor = sueldostot[i];
				nom = empleados[i];

			}
		}

		// MOSTRAMOS EL RESULTADO FINAL
		System.out.println("EL EMPLEADO CON MAYOR INGRESO ES: " + nom + " CON UN TOTAL DE: " + mayor);

	}

	public static void main(String[] args) {
		// CREAMOS EL OBJETO
		 GestionSueldos ma = new  GestionSueldos();

		// CARGAMOS LOS DATOS
		ma.cargar();

		// CALCULAMOS LOS TOTALES
		ma.calcularSumaSueldos();

		// MOSTRAMOS LOS TOTALES
		ma.imprimirTotalPagado();

		// MOSTRAMOS EL EMPLEADO CON MAYOR SUELDO
		ma.empleadoMayorSueldo();

	}

}
