import java.util.Scanner;

public class ClasificacionPiezas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		

        int aptas = 0;
        int superiores = 0;
        int inferiores = 0;
        int total = 0;
		
        double peso;
		
		do {
			
			System.out.println("Ingresa el peso");
			peso = teclado.nextDouble();
			
			if(peso != 0) {
				total++;
				if(peso >= 9.8 && peso <= 10.2) {
					aptas++;
				}else if(peso >= 10.2) {
					superiores++;		
				}
				if(peso < 9.8) {
					inferiores++;
					
				}
			}
			
		}while(peso != 0);
		
		
		System.out.println("Piezas aptas: " + aptas);
		
		System.out.println("Piezas con un peso superior a 10.2: " + superiores);
		
		System.out.println("Piezas con un peso inferior a 9.8: " + inferiores);
		
		System.out.println("Total de piezas procesadas: " + total);
		
	}

}
