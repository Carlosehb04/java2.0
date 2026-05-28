import java.util.Scanner;

public class ClasificacionEdad {
	
	private String clasificacion;
	private int edad;
	private Scanner teclado;
	
	public void cargarDatos() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresar edad");
		edad = teclado.nextInt();
		
	}
	
	public void clasificarEdad() {
		
		if(edad <= 12) {
			clasificacion = "niño";
		}else {
			if(edad > 12 && edad <= 17 ) {
				clasificacion = "adolescente";
			}else {
				if(edad > 17 && edad <= 59) {
					clasificacion = "Adulto";
				}else {
					clasificacion = "Mayor";
				}
			}
		}
		
	}
	
	public void mostrarResultados() {
		
		System.out.println("==== Resultado ====");
		System.out.println(clasificacion);
		
	}

	public static void main(String[] args) {
		
		ClasificacionEdad vs = new ClasificacionEdad();
		vs.cargarDatos();
		vs.clasificarEdad();
		vs.mostrarResultados();

	}

}
