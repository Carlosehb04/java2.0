import java.util.Scanner;

public class OperacionVectores {
	
	private int vector1[];
	private int vector2[];
	private int vectorResultados[];
	
	public void cargarDatos() {
		
		Scanner teclado = new Scanner(System.in);
		
		vector1 = new int[4];
		vector2 = new int[4];
		vectorResultados = new int[4];
		
		for(int i = 0; i < vector1.length; i++) {
			System.out.println("Ingresa valor de vector 1 " + "indice " +(i + 1));
			vector1[i] = teclado.nextInt();
		}
		
		for(int i = 0; i < vector2.length; i++) {
			System.out.println("Ingresa valor de vector 2 " + (i + 1));
			vector2[i] = teclado.nextInt();
		}
		
	}
	
	public void sumarVectores() {
		
		for(int i = 0; i < vector1.length ;i++) {
			
			vectorResultados[i] = vector1[i] + vector2[i];
			
		}
		
	}
	
	public void imprimirResultados(){
		
		for (int i = 0; i < vectorResultados.length; i++) {
			System.out.println("Resultado de la posicion "+ (i + 1)+  " es " + vectorResultados[i]);
			
		}
		
	}

	public static void main(String[] args) {
		
		OperacionVectores vector = new OperacionVectores();
		
		vector.cargarDatos();
		vector.sumarVectores();
		vector.imprimirResultados();
		

	}

}
