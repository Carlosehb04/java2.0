package numeroEntero;

import java.util.Scanner;

public class numeroEntero {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int entero;
		
	    System.out.println("Escribe el numero a comprobar");
	    entero = teclado.nextInt();
	    
	    if(entero > 0) {
	    	System.out.println("El numero es positivo ");
	    }else {
	    	if(entero == 0) {
	    		System.out.println("El numero es nulo");
	    		
	    	}else {
	    		System.out.println("El numero es negativo");
	    	}
	    }

	}

}
