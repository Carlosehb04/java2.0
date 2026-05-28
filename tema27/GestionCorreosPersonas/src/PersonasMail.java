import java.util.Scanner;

public class PersonasMail {

	private String nombres[];
	private String correos[];
	private Scanner teclado;
	private int n;

	public void cargarDatos() {
		teclado = new Scanner(System.in);

		System.out.println("¿Cuantos correos deseas ingresar?");
		n = teclado.nextInt();

		nombres = new String[n];
		correos = new String[n];

		for (int i = 0; i < nombres.length; i++) {

			System.out.println("Ingresa el nombre " + (i + 1));
			nombres[i] = teclado.next();

			System.out.println("Ingresa el correo ");
			correos[i] = teclado.next();
		}

	}

	public void mostrarDatos() {

		for (int i = 0; i < nombres.length; i++) {

			System.out.println("Nombre: " + nombres[i]);

			System.out.println("Correo: " + correos[i]);

			System.out.println();

		}

	}

	public void consultarMailPorNombre() {

		System.out.println("Ingresa el nombre a buscar");
		String nombre = teclado.next();

		for (int i = 0; i < nombres.length; i++) {

			if (nombre.equals(nombres[i])) {
				System.out.println(correos[i]);
			}
		}

	}

	public void mostrarCorreosInvalidos() {

		for (int i = 0; i < correos.length; i++) {

			if (!correos[i].contains("@")) {
				System.out.println("Este correo " + correos[i] + " no contiene el @" );
			}
		}

	}

	public static void main(String[] args) {

		PersonasMail vs = new PersonasMail();

		vs.cargarDatos();

		vs.mostrarDatos();

		vs.consultarMailPorNombre();

		vs.mostrarCorreosInvalidos();

	}

}
