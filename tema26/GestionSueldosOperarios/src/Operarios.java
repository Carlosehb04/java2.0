import java.util.Scanner;

public class Operarios {
	// SCANNER PARA LEER DATOS DESDE EL TECLADO
	private Scanner teclado;

	// VECTOR QUE GUARDARA LOS SUELDOS DE LOS OPERARIOS
	private int[] sueldos;

	// CONSTRUCTOR DE LA CLASE
	// SE EJECUTA AUTOMATICAMENTE AL CREAR EL OBJETO

	public Operarios() {

		// INICIALIZAMOS EL SCANNER
		teclado = new Scanner(System.in);

		// CREAMOS EL VECTOR DE 5 POSICIONES
		sueldos = new int[5];

		// RECORREMOS EL VECTOR PARA CARGAR LOS SUELDOS
		for (int i = 0; i < sueldos.length; i++) {
			// PEDIMOS EL SUELDO DEL OPERARIO
			System.out.println("INGRESE EL SUELDO DEL OPERARIO " + (i + 1));

			// GUARDAMOS EL SUELDO EN EL VECTOR
			sueldos[i] = teclado.nextInt();
		}

	}

	// METODO PARA MOSTRAR LOS SUELDOS
	public void imprimir() {

		// RECORREMOS EL VECTOR
		for (int i = 0; i < sueldos.length; i++) {

			// MOSTRAMOS CADA SUELDO
			System.out.println("SUELDO: " + sueldos[i]);

		}

	}

	public static void main(String[] args) {

		// CREAMOS EL OBJETO
		Operarios op = new Operarios();

		// MOSTRAMOS LOS SUELDOS
		op.imprimir();

	}

}
