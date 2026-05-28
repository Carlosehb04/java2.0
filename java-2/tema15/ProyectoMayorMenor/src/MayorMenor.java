import java.util.Scanner;

public class MayorMenor {
	
	private int num1, num2, num3;
	
	
	public void cargarDatos() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa numero 1");
		num1 = teclado.nextInt();
		
		System.out.println("Ingresa numero 2");
		num2 = teclado.nextInt();
		
		System.out.println("Ingresa numero 3");
		num3 = teclado.nextInt();
	}
	
	public void  mostrarMayorMenor() {
		
		int menor = Math.min(num1,  Math.min(num2, num3));
		int mayor = Math.max(num1, Math.max(num2, num3));
		
		System.out.println("El mayor es. " + mayor);
		System.out.println("EL menor es. " + menor);
		
	}

	public static void main(String[] args) {
		
		MayorMenor MayorMenor1 = new MayorMenor();
		
		 
		
		MayorMenor1.cargarDatos();
		MayorMenor1.mostrarMayorMenor();
		
		

	}

}
