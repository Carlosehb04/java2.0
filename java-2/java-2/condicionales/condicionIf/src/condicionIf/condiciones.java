package condicionIf;

import java.util.Scanner;

public class condiciones {

	public static void main(String[] args) {
		
	  Scanner teclado = new Scanner(System.in);
	  
	  float sueldo;
	  System.out.print("Ingrese el sueldo ");
	  
	  sueldo = teclado.nextFloat();
	  
	  if(sueldo > 3000) {
		  System.out.print("Esta persona debe abonar impuestos");
	  }else {
		  System.out.print("Esta persona está exenta de impuestos");
	  }
	  teclado.close();

	}

}
