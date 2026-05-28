import java.util.Scanner;

public class ControlSueldosEmpleados {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int contador = 1;
		int entre100y300 = 0;
		int mayor300 = 0;
		double totalSueldo = 0;
		double sueldo = 0;
		int n;
		
		System.out.println("Ingresa la cantidad de empleados");
		n = teclado.nextInt();
		
		while(contador <= n) {
			
			System.out.println("Ingresa el sueldo del empleado " + contador);
			sueldo = teclado.nextDouble();
			totalSueldo = totalSueldo + sueldo;
		
			if(sueldo < 100) {
				System.out.println("Error: el sueldo no puede ser menor a 100");
				
			}else if(sueldo <= 300) {
				entre100y300++;
				
			}else {
				mayor300++;
			}
			
			
			
			contador++;
		}
		
		System.out.println("Cantidad de entre 100 y 300 es: " + entre100y300);
		System.out.println("Cantidad mayor a 300 es: " + mayor300);
		
		if(totalSueldo % 1 == 0) {
			System.out.println("Total sueldos: " + (int) totalSueldo);
		}else {
			System.out.println("Total sueldos: " + totalSueldo);
		}

	}

}
