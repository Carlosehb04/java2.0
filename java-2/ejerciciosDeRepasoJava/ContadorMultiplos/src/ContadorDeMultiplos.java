import java.util.Scanner;

public class ContadorDeMultiplos {
	
	private int mutiplo3 = 0;
	private int multiplo5 = 0;
	private int ambos = 0;
	private int numero;
	private int n;
	
	
	public void cargarDatos() {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Ingresas cuantos nuemros vas a ingresar");
		n = teclado.nextInt();
		
		
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Ingresar numero " + (i + 1));
			numero = teclado.nextInt();
			
			
			if(numero % 3 == 0 && numero % 5 == 0) {
				ambos++;
				
			}
			if(numero % 3 == 0) {
				
				mutiplo3++;
				
			}
			if(numero % 5 == 0) {
				multiplo5++;
			}
			
			
		}
			
		
	}
	
	public void mostrarResultado() {
		System.out.println("Mutiplos de ambos un total de " + ambos);
		System.out.println("Mutiplos de 5 un total de " + multiplo5);
		System.out.println("Mutiplos de 3 un total de  " + mutiplo3);
	}
	

	public static void main(String[] args) {
		
		ContadorDeMultiplos vs = new ContadorDeMultiplos();
		
		vs.cargarDatos();
		vs.mostrarResultado();
		
		
		

	}

}
