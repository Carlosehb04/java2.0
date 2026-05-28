import java.util.Scanner;

public class ProductoMasCaro {
	
	private String producto1;
	private double precio1;
	private String producto2;
	private double precio2;
	private String producto3;
	private double precio3;
	private String productoMasCaro;
	private Scanner teclado;
	private String resultado;
	
	public void cargarDatos() {

	    teclado = new Scanner(System.in);

	    System.out.println("Ingrese el nombre del producto 1:");
	    producto1 = teclado.nextLine();

	    System.out.println("Ingrese el precio del producto 1:");
	    precio1 = teclado.nextDouble();

	    teclado.nextLine();


	    System.out.println("Ingrese el nombre del producto 2:");
	    producto2 = teclado.nextLine();

	    System.out.println("Ingrese el precio del producto 2:");
	    precio2 = teclado.nextDouble();

	    teclado.nextLine();


	    System.out.println("Ingrese el nombre del producto 3:");
	    producto3 = teclado.nextLine();

	    System.out.println("Ingrese el precio del producto 3:");
	    precio3 = teclado.nextDouble();

	}
	
	public void buscarProductoMasCaro() {

	    double precioMayor = precio1;

	    productoMasCaro = producto1;


	    if(precio2 > precioMayor) {

	        precioMayor = precio2;

	        productoMasCaro = producto2;

	    } else if(precio2 == precioMayor) {

	        productoMasCaro = productoMasCaro + " y " + producto2;

	    }


	    if(precio3 > precioMayor) {

	        precioMayor = precio3;

	        productoMasCaro = producto3;

	    } else if(precio3 == precioMayor) {

	        productoMasCaro = productoMasCaro + " y " + producto3;

	    }

	}
	public void mostrarResultados() {

	    System.out.println("=== Producto(s) más caro(s) ===");

	    System.out.println("Producto: " + productoMasCaro);

	}

	public static void main(String[] args) {
		ProductoMasCaro vs = new ProductoMasCaro();
		
		vs.cargarDatos();
		vs.buscarProductoMasCaro();
		vs.mostrarResultados();

	}

}
