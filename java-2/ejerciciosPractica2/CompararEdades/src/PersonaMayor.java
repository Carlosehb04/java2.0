import java.util.Scanner;

public class PersonaMayor {

	private String nombre1;
	private String apellido1;
	private int edad1;

	private String nombre2;
	private String apellido2;
	private int edad2;

	private boolean persona1Mayor;
	private boolean empate;

	public void solicitarDatos() {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingresa Nombre persona 1");
		nombre1 = teclado.next();

		System.out.println("Ingresar apellido persona 1");
		apellido1 = teclado.next();

		System.out.println("Ingresa la edad persona 1");
		edad1 = teclado.nextInt();

		System.out.println("Ingresa Nombre persona 2");
		nombre2 = teclado.next();

		System.out.println("Ingresar apellido persona 2");
		apellido2 = teclado.next();

		System.out.println("Ingresa la edad persona 2");
		edad2 = teclado.nextInt();

	}

	public void compararEdades() {

		if (edad1 > edad2) {
			persona1Mayor = true;

		} else if (edad2 > edad1) {
			persona1Mayor = false;
		} else {
			empate = true;
		}
	}

	public void mostrarResultado() {


		if(empate) {
			System.out.println("== Resultado ==");
			System.out.println("Es empate");
			
		}else {
			if(persona1Mayor) {
				System.out.println("== Resultado ==");
				System.out.println("La persona 1 con nombre " + nombre1 + " apellido "+ apellido1 + "con edad de " + edad1 + " años es la mayor");
				
			}else {
				System.out.println("== Resultado ==");
				System.out.println("La persona 2 con nombre " + nombre2 + " apellido "+ apellido2 + " con edad de " + edad2 + " años es la mayor");
			}
		}
	}

	public static void main(String[] args) {

		PersonaMayor vs = new PersonaMayor();
		vs.solicitarDatos();
		vs.compararEdades();
		vs.mostrarResultado();

	}

}
