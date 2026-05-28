import java.util.Scanner;

public class NumerosMenores {
	
	private int numero1;
	private int numero2;
	private int numero3;
	private boolean resultado;
	
	
	public void solicitarDatos() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa numero 1");
		numero1 = teclado.nextInt();		
		System.out.println("Ingresa numero 2");
		numero2 = teclado.nextInt();
		System.out.println("Ingresa numero 3");
		numero3 = teclado.nextInt();
		
	}
	
	public void verificarNumeros() {
		
		if(numero1 < 10 && numero2 < 10 && numero3 < 10) {
			resultado = true;
		}else {
			resultado = false;
		}
	}
	
	public void mostrarResultado() {
		
		System.out.println("== Resutado == ");
		
		
		if (resultado) {

			System.out.println("Todos los numeros son menores a diez");

		} else {

			System.out.println("No todos los numeros son menores a diez");

		}
	
		
	}

	public static void main(String[] args) {
		
		
		NumerosMenores vs = new NumerosMenores();
		
		vs.solicitarDatos();
		vs.verificarNumeros();
		vs.mostrarResultado();

	}

}
