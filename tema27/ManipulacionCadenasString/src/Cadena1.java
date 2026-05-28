import java.util.Scanner;

public class Cadena1 {

	public static void main(String[] args) {

		// CREAMOS EL SCANNER
		Scanner teclado = new Scanner(System.in);

		// VARIABLES STRING
		String cad1;
		String cad2;

		// PEDIMOS LA PRIMER CADENA
		System.out.println("Ingrese la primera cadena: ");

		// nextLine() PERMITE LEER ESPACIOS
		cad1 = teclado.nextLine();

		// PEDIMOS LA SEGUNDA CADENA
		System.out.println("Ingrese la segunda cadena: ");

		// GUARDAMOS LA SEGUNDA CADENA
		cad2 = teclado.nextLine();

		// COMPARA SI SON EXACTAMENTE IGUALES
		if (cad1.equals(cad2) == true) {

			System.out.println(cad1 + " es exactamente igual a " + cad2);

		} else {

			System.out.println(cad1 + " no es exactamente igual a " + cad2);

		}

		// COMPARA IGNORANDO MAYUSCULAS Y MINUSCULAS

		if (cad1.equalsIgnoreCase(cad2) == true) {

			System.out.println(cad1 + " es igual a " + cad2 + " sin importar mayusculas/minusculas");

		} else {

			System.out.println(cad1 + " no es igual a " + cad2 + " sin importar mayusculas/minusculas");

		}

		// COMPARACION ALFABETICA

		if (cad1.compareTo(cad2) == 0) {
			System.out.println(cad1 + " es exactamente igual a " + cad2);
		} else {
			if (cad1.compareTo(cad2) > 0) {
				System.out.println(cad1 + " es mayor alfabeticamente que " + cad2);
			} else {
				System.out.println(cad2 + " es mayor alfabeticamente que " + cad1);
			}
		}

		// OBTENEMOS EL PRIMER CARACTER

		char carac1 = cad1.charAt(0);
		System.out.println("El primer caracter de " + cad1 + " es " + carac1);

		// OBTENEMOS EL LARGO DEL STRING
		int largo = cad1.length();
		System.out.println("El largo de " + cad1 + " es " + largo);

		// EXTRAEMOS LOS 3 PRIMEROS CARACTERES
		String cad3 = cad1.substring(0, 3);
		System.out.println("Los primeros tres caracteres de " + cad1 + " son " + cad3);

		// BUSCAMOS SI cad2 ESTA DENTRO DE cad1
		int posi = cad1.indexOf(cad2);

		// SI NO SE ENCUENTRA
		if (posi == -1) {
			System.out.println(cad2 + " no esta contenido en " + cad1);
		} else {
			System.out.println(cad2 + " esta contenido en " + cad1 + " desde la posicion " + posi);
		}

		// CONVERTIMOS A MAYUSCULAS
		System.out.println(cad1 + " convertido a mayusculas es " + cad1.toUpperCase());

		// CONVERTIMOS A MINUSCULAS
		System.out.println(cad1 + " convertido a minusculas es " + cad1.toLowerCase());

	}

}
