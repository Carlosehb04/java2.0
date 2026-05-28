import java.util.Scanner;

public class VentasProductos {

	private String productos[];
	private int cantidadVendida[];
	private double precioUnitario[];
	private int n;
	private Scanner teclado;

	public void cargarDatos() {
		teclado = new Scanner(System.in);
		System.out.println("¿Cuantos prodcutos deseas ingresar?");
		n = teclado.nextInt();

		productos = new String[n];
		cantidadVendida = new int[n];
		precioUnitario = new double[n];

		for (int i = 0; i < productos.length; i++) {
			System.out.println("Ingresa el nombre del producto " + (i + 1));
			productos[i] = teclado.next();

			System.out.println("Ingresa el cantidad vendida " + (i + 1));
			cantidadVendida[i] = teclado.nextInt();

			System.out.println("Ingresa el precio unitario " + (i + 1));
			precioUnitario[i] = teclado.nextDouble();
		}

	}

	public void mostrarProductoMayorFacturacion() {

		double mayorFacturacion = cantidadVendida[0] * precioUnitario[0];
		String productoMayor = productos[0];

		for (int i = 0; i < productos.length; i++) {

			double facturacion = cantidadVendida[i] * precioUnitario[i];

			if (facturacion > mayorFacturacion) {
				mayorFacturacion = facturacion;

				productoMayor = productos[i];
			}

		}

		System.out.println("Producto con mayor facturacion: " + productoMayor);

	}

	public void calcularRecaudacionTotal() {

		double total = 0;

		for (int i = 0; i < productos.length; i++) {
			double facturacion = cantidadVendida[i] * precioUnitario[i];
			total += facturacion;
		}

		System.out.println("Recaudacion total: " + total);
	}

	public void mostrarProductosSobreMedia() {

		double total = 0;

		for (int i = 0; i < productos.length; i++) {
			double facturacion = cantidadVendida[i] * precioUnitario[i];
			total += facturacion;
		}

		double media = total / productos.length;

		for (int i = 0; i < productos.length; i++) {

			double facturacion = cantidadVendida[i] * precioUnitario[i];

			if (facturacion > media) {

				System.out.println(productos[i]);

			}
		}

	}

	public void mostrarResumen() {

		mostrarProductoMayorFacturacion();

		calcularRecaudacionTotal();

		mostrarProductosSobreMedia();

	}

	public static void main(String[] args) {

		VentasProductos vs = new VentasProductos();

		vs.cargarDatos();

		vs.mostrarResumen();

	}

}
