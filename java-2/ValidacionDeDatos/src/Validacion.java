import java.util.Scanner;

public class Validacion {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String usuario, contraseña;
		
		System.out.println("Ingresa usuario");
		usuario = teclado.next();
		
		System.out.println("Ingrese contraseña");
		contraseña = teclado.next();
		
		
		if(usuario.equals("admin")) {
			if(contraseña.equals("1234")) {
				System.out.println("Acceso concedido");
				
			}else {
				System.out.println("contraseña incorrecta");
			}
		}else {
			System.out.println("Usuario incorecto");
		}
		
	}

}
