import java.util.Scanner;

public class Alumno {

	// SCANNER PARA LEER DATOS DESDE EL TECLADO
	private Scanner teclado;

	// VARIABLE PARA GUARDAR EL NOMBRE DEL ALUMNO
	private String nombre;

	// VARIABLE PARA GUARDAR LA EDAD
	private int edad;

	// CONSTRUCTOR DE LA CLASE
	// SE EJECUTA AUTOMATICAMENTE AL CREAR EL OBJETO

	public Alumno() {

		// INICIALIZAMOS EL SCANNER
		teclado = new Scanner(System.in);

		boolean nombreValido = false;

		// VALIDAMOS EL NOMBRE
		while (!nombreValido) {

			System.out.println("INGRESE EL NOMBRE DEL ALUMNO");

			nombre = teclado.next();

			// SOLO PERMITE LETRAS
			if (nombre.matches("[a-zA-Z]+")) {

				nombreValido = true;

			} else {

				System.out.println("ERROR, SOLO SE PERMITEN LETRAS");

			}

		}

		boolean edadValida = false;

		// VALIDAMOS LA EDAD
		while (!edadValida) {

			try {

				System.out.println("INGRESE LA EDAD DEL ALUMNO");

				edad = teclado.nextInt();

				edadValida = true;

			} catch (Exception e) {

				System.out.println("ERROR, DEBE INGRESAR UN NUMERO");

				teclado.nextLine();

			}

		}

	}

	// METODO PARA MOSTRAR LOS DATOS DEL ALUMNO
	public void imprimir() {

		// MOSTRAMOS EL NOMBRE
		System.out.println("NOMBRE: " + nombre);

		// MOSTRAMOS LA EDAD
		System.out.println("EDAD: " + edad);

	}

	// METODO PARA VERIFICAR SI ES MAYOR DE EDAD
	public void esMayorEdad() {

		// PREGUNTAMOS SI LA EDAD ES MAYOR O IGUAL A 18
		if (edad >= 18) {

			// SI SE CUMPLE LA CONDICION
			System.out.println(nombre + " ES MAYOR DE EDAD");

		} else {

			// SI NO SE CUMPLE LA CONDICION
			System.out.println(nombre + " NO ES MAYOR DE EDAD");

		}

	}

	public static void main(String[] args) {
		// CREAMOS EL OBJETO
		Alumno alumno1 = new Alumno();

		// MOSTRAMOS LOS DATOS
		alumno1.imprimir();

		// VERIFICAMOS SI ES MAYOR DE EDAD
		alumno1.esMayorEdad();

	}

}
