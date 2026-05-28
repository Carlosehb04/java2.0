package numeroMayor;

import java.util.Scanner;

public class numeroMayor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int num1, num2, num3;
		
	   System.out.println("Escribe tu primer numero");
	   num1 = teclado.nextInt();
	   
	   System.out.println("Escribe tu segundo numero");
	   num2 = teclado.nextInt();
	   
	   System.out.println("Escribe tu tercer numero");
	   num3 = teclado.nextInt();

	   
	   if(num1 >= num2 && num1 >= num3){
		   System.out.println("El numero mayor es " + num1);
		   
	   }else {
		   if(num2 >= num1 && num2 >= num3) {
		   System.out.println("En numero mayor es " + num2);
	   }else{
		   System.out.println("El numero mayor es " + num3);
	   }
	   }
	}

}
