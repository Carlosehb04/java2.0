import java.util.Scanner;

public class Hotel {
	private int numeroHabitacion[];
	private double precioNoche[];
	private boolean ocupada[];
	private Scanner teclado;
	private int n;

	public void cargarHabitaciones() {

		teclado = new Scanner(System.in);

		System.out.println("¿Cuantas habitaciones tienes?");
		n = teclado.nextInt();

		numeroHabitacion = new int[n];
		precioNoche = new double[n];
		ocupada = new boolean[n];

		for (int i = 0; i < numeroHabitacion.length; i++) {

			System.out.println("Ingresa el numero de habitacion " + (i + 1));
			numeroHabitacion[i] = teclado.nextInt();

			System.out.println("Ingresar el precio de la habitacion " + (i + 1));
			precioNoche[i] = teclado.nextDouble();

			System.out.println("¿ La habitacion está ocupada ?");
			ocupada[i] = teclado.nextBoolean();
		}

	}

	public void registrarReserva() {

		System.out.println("Ingresa el numero de habitacion ");
		int numero = teclado.nextInt();
		boolean encontrada = false;

		for (int i = 0; i < numeroHabitacion.length; i++) {

			if (numeroHabitacion[i] == numero) {
				encontrada = true;
				if (!ocupada[i]) {
					System.out.println("Habitacion reservada correctamente");
					ocupada[i] = true;
				} else {
					System.out.println("Habitacion ya se encuentra reservada si desea puede elegir otra habitacion");
				}
			}
		}
		if (!encontrada) {

			System.out.println("La habitacion no existe");

		}

	}

	public void liberarHabitacion() {

		System.out.println("Ingresa el numero de habitacion ");
		int numero = teclado.nextInt();
		boolean encontrada = false;

		for (int i = 0; i < numeroHabitacion.length; i++) {

			if (numeroHabitacion[i] == numero) {
				encontrada = true;

				if (ocupada[i]) {
					System.out.println("Habitacion liberada");
					ocupada[i] = false;
				} else {
					System.out.println("Habitacion ya se encuentra liberada");
				}
			}
		}
		if (!encontrada) {

			System.out.println("La habitacion no existe");

		}

	}

	public void mostrarHabitacionesDisponibles() {

		for (int i = 0; i < numeroHabitacion.length; i++) {

			if (!ocupada[i]) {
				System.out.println("Habitacion " + numeroHabitacion[i] + " disponible | Precio: " + precioNoche[i]);
			}

		}

	}

	public void calcularRecaudacionTotal() {
		double total = 0;
		for (int i = 0; i < numeroHabitacion.length; i++) {

			if (ocupada[i]) {

				total = total + precioNoche[i];

			}
		}

		System.out.println("Recaudacion total: " + total);

	}

	public void mostrarResumenHotel() {

		mostrarHabitacionesDisponibles();

		calcularRecaudacionTotal();

	}

	public static void main(String[] args) {

		Hotel ht = new Hotel();

		ht.cargarHabitaciones();

		ht.registrarReserva();

		ht.liberarHabitacion();

		ht.mostrarResumenHotel();

	}

}
