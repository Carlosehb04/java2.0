package condicionalCompuesta;

import java.util.Scanner;

public class condicionalCompuesta {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		
	    System.out.print("Ingrese primer Valor ");
	    num1 = teclado.nextInt();
	    
	    System.out.print("Ingrese segundo Valor ");
        num2 = teclado.nextInt();
        
        if(num1 > num2) {
        	System.out.print("Este numero es mayor " + num1);
        }else {
        	System.out.print("Este numero es mayor " + num2);
        }
	}

}
