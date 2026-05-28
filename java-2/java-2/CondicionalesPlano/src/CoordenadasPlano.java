import java.util.Scanner;

public class CoordenadasPlano {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.println("Ingrese el coordenadas X");
		x = teclado.nextInt();
		
		System.out.println("Ingrese el coordenadas Y");
		y = teclado.nextInt();
		
		
	  if(x == 0 || y == 0) {
		  System.out.println("El punto no pertenece a ningún cuadrante");
		  
	  }else {
			if(x > 0 && y > 0) {
				System.out.println("Es cuadrante I");
			}else if(x < 0 && y > 0) {
				System.out.println("Es cuadrante II");
				
			}else if(x < 0 && y < 0) {
				System.out.println("Es cuadrante III");
			}else {
				System.out.println("Es cuadrante IV");
			}
	  }

	}

}
