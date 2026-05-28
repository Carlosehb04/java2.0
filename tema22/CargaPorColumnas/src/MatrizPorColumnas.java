import java.util.Scanner;

public class MatrizPorColumnas {
	
    private int[][] matriz;
    private Scanner teclado;
    private int filas;
    private int columnas;
    
    public void cargarPorColumnas() {
    	teclado = new Scanner(System.in);
    	
    	System.out.println("Ingresa la cantidad de fila de la matriz");
    	filas = teclado.nextInt();
    	
    	System.out.println("Ingresa la cantidad de columnas de la matriz");
    	columnas = teclado.nextInt();
    	
    	matriz = new int[filas][columnas];
    	
    	
    	for(int columna = 0; columna < matriz[0].length; columna++) {
    		
    		for(int fila = 0; fila < matriz.length; fila++) {
    			
    			System.out.println("Ingrese un numero " + (fila + 1));
        		matriz[fila][columna] = teclado.nextInt();
    			
    		}
    		
    		
    	}
    	
    }
    
    public void mostrarMatriz() {
    	
    	System.out.println("\nMatriz completa");
    	
    	for(int fila = 0; fila < matriz.length; fila++ ) {
    		
    		for(int columna = 0; columna < matriz[fila].length; columna++) {
    			
    			System.out.print(matriz[fila][columna] + " ");
    		}
    		
    		System.out.println();
    	}
    	
    }

	public static void main(String[] args) {
		
		 MatrizPorColumnas matriz = new  MatrizPorColumnas();
		 
		 matriz.cargarPorColumnas();
		 matriz.mostrarMatriz();
	
	}

}
