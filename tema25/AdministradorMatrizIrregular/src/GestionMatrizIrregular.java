import java.util.Scanner;

public class GestionMatrizIrregular {
	
	private Scanner teclado;
	private int[][] mat;
	
	public void cargarMatriz() {
		
		   teclado = new Scanner(System.in);
		   
		   // PEDIMOS LA CANTIDAD DE FILAS
	        System.out.print("CUANTAS FILAS TIENE LA MATRIZ: ");

	        int filas = teclado.nextInt();

	        mat = new int[filas][];
	        
	        
	        for(int i = 0; i < mat.length; i++) {
	        	
	        	 
	        	 mat[i] = new int[i + 1];
	        	 
	        	 for(int j = 0; j < mat[i].length; j++) {
	        		 
	        		 System.out.println("Ingrese componente: " + (i + 1));

	        		 mat[i][j] = teclado.nextInt();
	        		 
	        	 }
	        }
		
	}
	
	public void mostrarMatriz() {

	    System.out.println("===== MATRIZ IRREGULAR =====");

	    for(int i = 0; i < mat.length; i++) {

	        for(int j = 0; j < mat[i].length; j++) {

	            System.out.print(mat[i][j] + " ");

	        }

	        System.out.println();

	    }

	}
	
	public void mostrarResumen() {
		
		  mostrarMatriz();
		
	}

	public static void main(String[] args) {
		
		GestionMatrizIrregular vs = new GestionMatrizIrregular();
		
	vs.cargarMatriz();
	vs.mostrarMatriz();
	
		
		
	}

}
