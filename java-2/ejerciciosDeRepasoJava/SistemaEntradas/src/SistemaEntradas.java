import java.util.Scanner;

public class SistemaEntradas {
	
	private int edad;
	private double precioEntrada;
	private double precioFinal;
	
	public void cargarDatos() {
		
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingresa la edad: ");
	edad = teclado.nextInt();
	
	System.out.println("Ingrese el precio de la entrada ");
	precioEntrada = teclado.nextDouble()
;	
	}
	public void calcularPrecioFinal() {
		
		if(edad < 18) {
			 precioFinal = precioEntrada * 0.70;
		}else {
			precioFinal = precioEntrada;
		}
	}
	public void mostrarPrecioFinal() {
		
		if(edad < 18) {
			System.out.println("Has recibido un descuento del %30 por ser menor de edad ");
			
		}
		
		if(precioFinal % 1 == 0) {
			System.out.println("Precio final: " + (int) precioFinal);
		}else {
			System.out.println("Precio Final: " + precioFinal);
		}
	}

	public static void main(String[] args) {
		
		SistemaEntradas sistema = new SistemaEntradas();
		
		sistema.cargarDatos();
		sistema.calcularPrecioFinal();
		sistema.mostrarPrecioFinal();
		
	}

}
