import java.util.Scanner;

public class SistemaDeProductos {

	private String nombre;
	private double precio;
	private int unidades;
	private double importe;

	public void cargarDatos() {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingresa el nombre del producto");
		nombre = teclado.next();

		System.out.println("Ingresa el precio del producto");
		precio = teclado.nextDouble();

		System.out.println("Ingresar las unidades");
		unidades = teclado.nextInt();
	}

	public void calcularImporteTotal() {

		if (precio > 0 && unidades > 0) {

			importe = precio * unidades;

		} else {

			System.out.println("Datos invalidos");

		}

	}

	public void mostrarDatos() {

		System.out.println("== Importe del Producto ==");

		System.out.println("Precio: " + precio);
		System.out.println("Unidades: " + unidades);

		if (importe % 1 == 0) {
			System.out.println("Importe total: " + (int) importe);
		} else {
			System.out.println("Importe total: " + importe);
		}

	}

	public static void main(String[] args) {

		SistemaDeProductos producto = new SistemaDeProductos();
		producto.cargarDatos();
		producto.calcularImporteTotal();
		producto.mostrarDatos();

	}

}
