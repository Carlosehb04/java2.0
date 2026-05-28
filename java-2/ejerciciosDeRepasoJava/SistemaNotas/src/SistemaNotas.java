import java.util.Scanner;

public class SistemaNotas {
	
	private int notas [];
	private double media;
	private int sumaTotal;
	private int cantidadNotas;
	
	public void cargarNotas() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa el numero de notas a evaluar");
		cantidadNotas = teclado.nextInt();
		
		notas = new int[cantidadNotas];
		
		for(int i = 0; i < notas.length; i++) {
			do {
				System.out.println("Ingresar nota " + (i + 1));
				notas[i] = teclado.nextInt();
			}while(notas[i] < 0 || notas[i] > 10);
			
		}
	
	}
	
	public void calcularMedia(){
		
		for(int i = 0; i <notas.length; i++ ) {
			
			sumaTotal = sumaTotal + notas[i];
		}
		
		media = (double) sumaTotal / cantidadNotas ; 
		
	}
	
	public void evaluarRendimiento() {
		
		String promedioMostrado;
		
		if(media % 1 == 0) {
			promedioMostrado = String.valueOf((int) media);
		}else {
			promedioMostrado = String.valueOf(media);
		}
		
		
		if(media >= 9) {
			System.out.println("Excelente con un promedio de " + promedioMostrado);
			
		}else if(media >= 5 && media < 9) {
			System.out.println("Aprobado con un promedio de " + promedioMostrado);
		}else {
			System.out.println("Suspenso con un promedio de " + promedioMostrado);
		}
		
		
	}

	public static void main(String[] args) {

		SistemaNotas sistema = new SistemaNotas();
		sistema.cargarNotas();
		sistema.calcularMedia();
		sistema.evaluarRendimiento();
		

	}

}
