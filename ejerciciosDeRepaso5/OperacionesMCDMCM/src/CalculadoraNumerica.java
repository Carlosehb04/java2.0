import java.util.Scanner;

public class CalculadoraNumerica {
	
	public int calcularMCD(int num1, int num2) {

	    int mcd = 1;

	    for(int i = 1; i <= num1 && i <= num2; i++) {

	        if(num1 % i == 0 && num2 % i == 0) {

	            mcd = i;

	        }

	    }

	    return mcd;

	}
	
	public int calcularMCM(int num1, int num2) {

	    int mcd = calcularMCD(num1, num2);

	    int mcm = (num1 * num2) / mcd;

	    return mcm;

	}
	public void mostrarResultados() {

	   Scanner teclado = new Scanner(System.in);

	    System.out.println("Ingrese el primer numero");
	    int num1 = teclado.nextInt();

	    System.out.println("Ingrese el segundo numero");
	    int num2 = teclado.nextInt();

	    int mcd = calcularMCD(num1, num2);

	    int mcm = calcularMCM(num1, num2);

	    System.out.println("MCD: " + mcd);

	    System.out.println("MCM: " + mcm);

	}

	public static void main(String[] args) {
		CalculadoraNumerica calculadora = new CalculadoraNumerica();
		calculadora.mostrarResultados();
	}

}
