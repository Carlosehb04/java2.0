import java.util.Scanner;

public class Oracion {

	private String oracion;
	private Scanner teclado;

	
	public void cargarOracion() {
		teclado = new Scanner(System.in);

		System.out.println("Ingresa una oracion");
		oracion = teclado.nextLine();
	}
	
	public void mostrarPalabras() {
		
		String[] palabras = oracion.split(" ");
		
		
		for(int i = 0; i < palabras.length; i++) {
			System.out.println("Palabra " + (i + 1) +": " +  palabras[i]);
		}
		
	}
	public static void main(String[] args) {
		Oracion vs =  new Oracion();
		vs.cargarOracion();
		vs.mostrarPalabras();

	}

}
