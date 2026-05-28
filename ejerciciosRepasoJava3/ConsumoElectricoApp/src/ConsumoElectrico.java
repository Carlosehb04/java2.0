import java.util.Scanner;

public class ConsumoElectrico {

	private Scanner teclado;
	private double consumo;
	private String resultado;

	public void cargarDatos() {

		teclado = new Scanner(System.in);

		System.out.println("Ingrese el consumo mensual en kWh:");
		consumo = teclado.nextDouble();

	}

	public void evaluarConsumo() {
		
		if(consumo > 300) {
			resultado = "Consumo elevado";
		}else {
			resultado = "Consumo normal";
		}
		
	}

	public void mostrarResultados() {
		
		 System.out.println("==== RESULTADO ====");

	        System.out.println(resultado);

	}

	public static void main(String[] args) {
		
		ConsumoElectrico  vs = new ConsumoElectrico ();
		
		vs.cargarDatos();
		vs.evaluarConsumo();
		vs.mostrarResultados();

	}

}
