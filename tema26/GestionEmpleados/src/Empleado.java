import java.util.Scanner;

public class Empleado {

	private Scanner teclado;
	private String nombre;
	private double sueldo;

	public Empleado() {
		teclado = new Scanner(System.in);

		System.out.println("Ingresa tu nombre ");
		nombre = teclado.next();

		System.out.println("Ingresar tu sueldo");
		sueldo = teclado.nextDouble();

	}

	public void pagarImpuestos() {
		
		if(sueldo > 3000) {
			System.out.println("Debes pagar impuestos");
		}else {
			System.out.println("No debe pagar impuestos");
		}

	}

	public void imprimir() {

		System.out.println("Nombre: " + nombre);

		if(sueldo % 1 == 0) {
			System.out.println("Sueldo: " + (int) + sueldo);
		}else {
			System.out.println("Sueldo: " + sueldo);
		}

	}

	public static void main(String[] args) {

		Empleado vs = new Empleado();
		vs.imprimir();
		vs.pagarImpuestos();

	}

}
