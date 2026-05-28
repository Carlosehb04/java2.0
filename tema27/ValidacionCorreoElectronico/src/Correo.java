import java.util.Scanner;

public class Correo {

	private String email;
	private Scanner teclado;

	public Correo() {
		teclado = new Scanner(System.in);
		System.out.println("Ingresa tu email");
		email = teclado.next();

	}

	public void verificarCorreo() {

		if (email.indexOf("@") != -1) {

			System.out.println("El correo contiene @");
		}else {

	        System.out.println(
	            "El correo no contiene @"
	        );
		}

	}

	public static void main(String[] args) {
		Correo  vs = new Correo();
		
		vs.verificarCorreo();

	}

}
