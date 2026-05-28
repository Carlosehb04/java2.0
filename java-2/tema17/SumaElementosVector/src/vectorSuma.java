import java.util.Scanner;

public class vectorSuma {
	
	private int[] n;
	private int sumaTotal  = 0;
	
	public void cargar() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuántos elementos deseas ingresar? : ");
		int cantidad = teclado.nextInt();
		
		n = new int[cantidad];
		
		
		for(int i = 0; i < n.length; i++) {
			System.out.println("Ingresa elemento " + (i + 1) + ": ");
			n[i] = teclado.nextInt();
			
		}
		
		
	}
	
	public void sumarVector() {
		
		for(int i = 0 ; i < n.length; i++) {
			 sumaTotal = sumaTotal + n[i];
		}
	    System.out.println("==== Suma total del elemento ====");
	    System.out.println(sumaTotal);
	    
	   
	
	}
	

	public static void main(String[] args) {
		
		vectorSuma vs = new vectorSuma();
		
		vs.cargar();
		vs.sumarVector();
		
	}

}
