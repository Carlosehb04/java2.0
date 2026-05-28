import java.util.ArrayList;
import java.util.Scanner;

public class ValidacionNumero {
private int n;
private int  numeros [];
private int totalValidos;
ArrayList<Integer> numerosValido = new ArrayList <> () ;



public void cargarNumeros() {
	
	Scanner teclado = new Scanner(System.in);
	System.out.println("Ingresa el cantidad de numeros a evaluar");
	n = teclado.nextInt();
	
	numeros = new int[n];
	
	
	for(int i = 0; i < numeros.length; i++ ){
		
	System.out.println("Ingresar numero " +(i + 1));
	numeros[i] = teclado.nextInt();
		
	}
	
}

public void validarNumeros() {
	
	for(int i = 0; i < numeros.length; i++) {
		
		if(numeros[i] >= 10 && numeros[i] <= 50 && numeros[i] % 2 == 0) {
			totalValidos++;
		    numerosValido.add(numeros[i]);
		}
			
		}


}
public void mostrarResultado() {
	System.out.println("Numeros validos: " + numerosValido);
	System.out.println("Con un total de pares: " + totalValidos);
}

	public static void main(String[] args) {
		
		ValidacionNumero sistema = new  ValidacionNumero();
		
		sistema.cargarNumeros();
		sistema.validarNumeros();
		sistema.mostrarResultado();

	}

}
