import java.util.ArrayList;
import java.util.Scanner;

public class SistemaImpares {
	private int TotalImpares;
	private int n;
	private int numeros [];
	private ArrayList<Integer> numerosPares = new ArrayList <>();
	
	
	
	public void cargarNumero() {
	 Scanner teclado = new Scanner(System.in);
	 
	 System.out.println("Cuantos numeros quieres ingresar");
	 n = teclado.nextInt();
	 
	 numeros = new int[n];
	 
	 for(int i = 0; i < numeros.length; i++) {
		do {
			 System.out.println("Ingresar numero " + (i + 1));
			 numeros[i] = teclado.nextInt();
			
		}while(numeros[i] < 0);
	 }
	}
	
	public void ContarImpares() {
		for(int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] % 2 != 0) {
				numerosPares.add(numeros[i]); 
				TotalImpares++;
				
			}
		}
		
	}
	
	public void mostarResultados() {
		
		
		for(int i = 0; i < numerosPares.size(); i++) {
			System.out.println("Imapar encontrado " + numerosPares.get(i));
			
		}
		System.out.println("Total imapres " + TotalImpares);
		
	}

	public static void main(String[] args) {
	
		SistemaImpares vs = new SistemaImpares();
		
		vs.cargarNumero();
		vs.ContarImpares();
		vs.mostarResultados();

	}

}
