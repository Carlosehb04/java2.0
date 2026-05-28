import java.util.Scanner;

public class PromedioAlturas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int contador = 1;
		double suma = 0;
		double altura;
		int n;
	 
		
		System.out.println("Ingrese Cantidad");
		n = teclado.nextInt();
		
		if(n <= 0) {
			 System.out.println("Cantidad Inválida");
		     return;
 		}
		
		while(contador <= n) {
			
		   System.out.println("Ingresa la altura de la persona " + contador);
		   altura = teclado.nextDouble();
		   
		   suma = suma + altura;
		   
		   contador++;
			
		}
		double promedio = suma / n;
		
		System.out.printf("El promedio de alturas es: %.2f", promedio);

	}

}
