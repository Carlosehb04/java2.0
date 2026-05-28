import java.util.Scanner;

public class CompraArticulo {

	private int precio;
	private int cantidad;
	private int total;

	public void solicitarDatos() {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa el precio");
		precio = teclado.nextInt();
		
		System.out.println("Ingresa el cantidad");
		cantidad = teclado.nextInt();


	}

	public void calcularTotal() {
		
		 total = precio * cantidad;

	}

	public void mostrarResultado() {
		
		System.out.println("=== Resultado ===");
		System.out.println("Precio Total:" + total);

	}

	public static void main(String[] args) {
		
		CompraArticulo vs = new CompraArticulo();
		vs.solicitarDatos();
		vs.calcularTotal();
		vs.mostrarResultado();

	}

}
