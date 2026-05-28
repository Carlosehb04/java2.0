import java.util.Scanner;

public class GestionPreciosProductos {

	private double precios[];
	private Scanner teclado;

	public void cargarPreciosProductos() {

		teclado = new Scanner(System.in);

		precios = new double[4];

		for (int i = 0; i < precios.length; i++) {
			System.out.println("Ingresa el precio " + (i + 1));
			precios[i] = teclado.nextDouble();
		}

	}

	public void mostrarListaPrecios() {

		System.out.println("===== Lista de precios ingresado =====");
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i]);
		}

	}

	public void obtenerPrecioMayor() {

		double precioMayor = precios[0];
		int posicionMayor = 0;

		for (int i = 0; i < precios.length; i++) {

			if (precios[i] > precioMayor) {
				precioMayor = precios[i];
				posicionMayor = i;
			}

		}
		


		System.out.println("Precio mayor: " + precioMayor);
		System.out.println("Posicion: " + posicionMayor);
		
		

	}

	public void obtenerPrecioMenor() {

		double precioMenor = precios[0];
		int posicionMenor = 0;

		for (int i = 0; i < precios.length; i++) {

			if (precios[i] < precioMenor) {
				precioMenor = precios[i];
				posicionMenor = i;
			}

		}

		System.out.println("Precio menor: " + precioMenor);
		System.out.println("Posicion: " + posicionMenor);

	}


	public void calcularDiferenciaPrecios() {
		
		
		double mayor = precios[0];
	    double menor = precios[0];

	    for(int i = 0; i < precios.length; i++) {

	        if(precios[i] > mayor) {

	            mayor = precios[i];

	        }

	        if(precios[i] < menor) {

	            menor = precios[i];

	        }

	    }
	    
	   double diferencia = mayor - menor;
		
		System.out.println("Diferencia: " + diferencia);

	}

	public static void main(String[] args) {

		GestionPreciosProductos vs = new GestionPreciosProductos();

		    vs.cargarPreciosProductos();
		    vs.mostrarListaPrecios();
		    vs.obtenerPrecioMayor();
		    vs.obtenerPrecioMenor();
		    vs.calcularDiferenciaPrecios();
	}

}
