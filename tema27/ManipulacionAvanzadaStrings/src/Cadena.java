import java.util.Scanner;

public class Cadena {

	private String texto;
	private Scanner teclado;

	public Cadena() {

		teclado = new Scanner(System.in);

		System.out.println("Ingresa el texto ");
		texto = teclado.next();

	}

	public void mostrarPrimeraMitad() {

		int mitad = texto.length() / 2;

		String resultado = texto.substring(0, mitad);
		System.out.println("Primera mitad: " + resultado);

	}

	public void mostrarUltimoCaracter() {

		char ultimo = texto.charAt(texto.length() - 1);

		System.out.println("El ultimo es " + ultimo);

	}

	public void mostrarInversa() {

		for (int i = texto.length() - 1; i >= 0; i--) {
			System.out.print(texto.charAt(i));

		}
		System.out.println();
	}

	public void mostrarConGuiones() {

		for (int i = 0; i < texto.length(); i++) {
			System.out.print(texto.charAt(i));

			if (i < texto.length() - 1) {
				System.out.print("-");
			}
		}
		System.out.println();
	}

	public void contarVocales() {

		int contador = 0;

		String textoMinuscula = texto.toLowerCase();

		for (int i = 0; i < textoMinuscula.length(); i++) {

			char letra = textoMinuscula.charAt(i);

			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				contador++;

			}
		}
		System.out.println("El total de vocales es: " + contador);

	}

	public void verificarPalindromo() {

		String palabra = "radar";
		String invertida = "";

		for (int i = palabra.length() - 1; i >= 0; i--) {
			invertida += palabra.charAt(i);
		}

		if (palabra.equals(invertida)) {
			System.out.println("La palabra ingresada es palindromo");
		} else {
			System.out.println("No son palindromo");
		}

	}

	public static void main(String[] args) {

		Cadena vs = new Cadena();

		vs.mostrarPrimeraMitad();

		vs.mostrarUltimoCaracter();

		vs.mostrarInversa();

		vs.mostrarConGuiones();

		vs.contarVocales();

		vs.verificarPalindromo();

	}

}
