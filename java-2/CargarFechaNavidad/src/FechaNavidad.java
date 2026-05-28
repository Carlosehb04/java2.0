import java.util.Scanner;

public class FechaNavidad {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int dia;
		int mes;
		
	    System.out.println("Ingrese el dia");
	    dia = teclado.nextInt()
;
	    System.out.println("Ingrese el mes");
	    mes = teclado.nextInt();
	    
	    
	    if(dia == 25 && mes == 12) {
	    	System.out.println("Es navidad");
	    }else {
	    	System.out.println("No es navidad");
	    }
	}

}
