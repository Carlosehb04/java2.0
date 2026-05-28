package calculadora;

import java.util.Scanner;

public class calculadora {
	
	public static void main(String[] args) {
		
	  
	   
	  try (Scanner teclado = new Scanner(System.in)){
		  
		  
		  double num1, num2;
		  String operacion;
		  
		  System.out.print("Escribe el primer valor ");
		  num1 = teclado.nextDouble();
		  
		  System.out.print("Escribe el Segundo valor ");
		  num2 = teclado.nextDouble();
		  
		  System.out.print("Operación (suma/resta/multi/div): ");
		    operacion = teclado.next();
		    
		    
		    switch(operacion){
		    case "suma" :
		    	System.out.println("La Multiplicacion de " + num1 + " Y " + num2 + " = " + (num1 + num2));
		    case "multiplicacion" :
		    	System.out.println("La Multiplicacion de " + num1 + " Y " + num2 + " = " + (num1 * num2));	
		    	
		    }
		  
	  }
	  
	  
	}

}
