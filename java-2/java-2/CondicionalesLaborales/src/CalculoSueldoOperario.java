import java.util.Scanner;

public class CalculoSueldoOperario {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double sueldo;
		int antiguedad;
		
		System.out.println("Ingresa el sueldo");
		sueldo = teclado.nextDouble();
		
		System.out.println("Ingresa el la antiguedad");
		antiguedad = teclado.nextInt();
		
		
		
		if(sueldo < 500 && antiguedad >= 10) {
			 double nuevo1 = sueldo + (sueldo * 0.20);
			 
			 System.out.println("El sueldo es de " + nuevo1);
			
		}else if(sueldo < 500 && antiguedad < 10) {
			
		 double	nuevo1 = sueldo + (sueldo * 0.05);
		 System.out.println("El sueldo es de  " + nuevo1);

		}else {
			System.out.println("No cambia el sueldo " + sueldo);
		}
	}

}
