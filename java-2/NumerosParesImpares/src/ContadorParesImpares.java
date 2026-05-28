import java.util.Scanner;

public class ContadorParesImpares {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		int pares = 0;
		int impares = 0;
		int contador = 1;
		int valor;
		
		
	   System.out.println("Ingres la cantidad de numeros a introducir");
		n = teclado.nextInt();
		
		while(contador <= n ) {
			
			System.out.println("Ingresa el numero " + contador);
			valor = teclado.nextInt();
			if(valor % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
			contador++;
		}
		
		System.out.println("Total numero Pares: " + pares);
		System.out.println("Total numero impares: " + impares);
	}

}
