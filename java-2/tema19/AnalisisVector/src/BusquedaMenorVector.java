import java.util.Scanner;

public class BusquedaMenorVector {
	
	private int n [];
	private int menor ;
	private int menorTotal = 0;
	
	
	public void cargarDatos() {
		Scanner teclado = new Scanner(System.in);
		
		
		int cantidad;
		
		do {
			System.out.println("Ingresa el tamaño del vector");
			 cantidad = teclado.nextInt();
		}while(cantidad <= 0);
		
		
		n = new int[cantidad];
	
		for(int i = 0; i < n.length; i ++) {
			
			System.out.println("Ingresa el elemento " + (i + 1));
			n[i] = teclado.nextInt();
			
		}
		
		
	}
	
	public void buscarMenor() {
		menor = n[0];
		
		for(int i = 0; i < n.length; i++) {
			
			if(n[i] < menor) {
				menor = n[i];
			}
		}
	}
	
	public void verificarRepeticion() {
		
		for(int i = 0; i < n.length; i++) {
			
			if(menor == n[i]) {
				menorTotal++;
				
			}
		}
		
	}
	public void mostrarIndicesMenor() {
		for(int i = 0;  i < n.length; i++) {
			
			if(menor == n[i]) {
				System.out.println("El menor aparece en la posición: " + i);
				
			}
		}
		
	}
	
	public void mostrarResultados() {
		
		System.out.println("\n Resultado");
		
		System.out.println("El menor es: " + menor + " y se repite " + menorTotal);
	}

	public static void main(String[] args) {
		
		BusquedaMenorVector vs = new BusquedaMenorVector();
		vs.cargarDatos();
		vs.buscarMenor();
		vs.verificarRepeticion();
		vs.mostrarResultados();
		vs.mostrarIndicesMenor();
	
	}

}
