import java.util.Scanner;

public class MayorMenor {
	private int num1;
	private int num2;
	private int num3;
	
	private int numMayor;
	private int numMenor;
	
	public void solicitarDatos(){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresar numero 1 ");
		num1 = teclado.nextInt();
		
		System.out.println("Ingresar numero 2 ");
		num2 = teclado.nextInt();
		
		System.out.println("Ingresar numero 3 ");
		num3 = teclado.nextInt();
		
}
	public void compararNumeros(){
		
		numMayor = num1;
		numMenor = num1;
		
		if(num2 > numMayor) {
			numMayor = num2;
		}
		
		if(num3 > numMayor) {
			numMayor = num3;
		}
		
		
		if(num2 < numMenor) {
			numMenor = num2;
		}
		
		if(num3 < numMenor) {
			numMenor = num3;
		}
}
	public void mostrarResultado() {

		System.out.println("=== Resultado ===");

		System.out.println("Numero mayor: " + numMayor);
		System.out.println("Numero menor: " + numMenor);

	}

	public static void main(String[] args) {
		
		MayorMenor vs = new MayorMenor();
		
		vs.solicitarDatos();
		vs.compararNumeros();
		vs.mostrarResultado();
		
		
		

	}

}
