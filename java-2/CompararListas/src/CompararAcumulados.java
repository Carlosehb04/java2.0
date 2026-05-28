import java.util.Scanner;

public class CompararAcumulados {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int sumaLista1 = 0;
		int sumaLista2 = 0;
		int contador = 1;
		int numero;
		
		while(contador <= 5) {
			System.out.println("Ingrese el numero " + contador + " de la lista 1");
			numero = teclado.nextInt();
			sumaLista1 = sumaLista1 + numero;
			
			contador++;
		}
		
		contador = 1;
		
		
		while(contador <= 5) {
			System.out.println("Ingrese el numero " + contador + " de la lista 2");
			numero = teclado.nextInt();
			sumaLista2 = sumaLista2 + numero;
			contador++;
		}
		
		
		if(sumaLista1 > sumaLista2) {
			System.out.println("Lista 1 es mayor");
		}else if(sumaLista2 > sumaLista1) {
			System.out.println("Lista 2 es mayor");
		}else {
			System.out.println("Las listas son iguales");
		}

	}

}
