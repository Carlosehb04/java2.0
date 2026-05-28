import java.util.Scanner;

public class Operaciones {

	private int numero1, numero2;
	private Scanner teclado = new Scanner(System.in);

	private int suma;
	private int resta;
	private int multiplicacion;
	private double division;
	private boolean divisionValida;

	public void solicitarDatos() {

		System.out.println("Ingresa el valor del numero 1 ");
		numero1 = teclado.nextInt();

		System.out.println("Ingresa el valor del numero 2 ");
		numero2 = teclado.nextInt();
	}

	public void sumar() {

		suma = numero1 + numero2;

	}

	public void restar() {
		resta = numero1 - numero2;
	}

	public void multiplicar() {
		multiplicacion = numero1 * numero2;
	}

	public void dividir() {
		if (numero2 != 0) {
			division = (double) numero1 / numero2;
			divisionValida = true;
		} else {
			divisionValida = false;
		}
	}

	public void mostrarResultados() {

		System.out.println("=== Resultados ===");
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Multiplicacion: " + multiplicacion);

		if (divisionValida) {
			if (division % 1 == 0) {
				System.out.println("Division: " + (int) division);
			} else {
				System.out.println("Division: " + division);
			}
		}else {
			 System.out.println("No se puede divir entre cero");
			
		}

	}

	public static void main(String[] args) {

		Operaciones vs = new Operaciones();

		vs.solicitarDatos();
		vs.sumar();
		vs.restar();
		vs.multiplicar();
		vs.dividir();
		vs.mostrarResultados();

	}

}
