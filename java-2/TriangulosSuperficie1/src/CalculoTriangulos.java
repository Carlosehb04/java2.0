import java.util.Scanner;

public class CalculoTriangulos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n ; 
		float base;
		float altura;
		float superficie;
		int contador = 0;
		int i;
		
		
		 System.out.println("Ingrese la cantidad de triángulos:");
		 n = teclado.nextInt();
		 
		 for(i = 1; i <= n; i++) {
			 
			  System.out.println("Triagunlo " + i );
			 
			 System.out.println("Ingrese su base");
			 base = teclado.nextFloat();
			 
			 System.out.println("Ingrese la altura");
			 altura = teclado.nextFloat();
			 
			 superficie = (base * altura) / 2;
			 
			 System.out.println("La base es " + base );
			 System.out.println("La altura es " + altura );
			 System.out.println("La superficie es " + superficie );
			 
			 
			 if(superficie > 12) {
				 contador++;
			 }
				 
			 
		 }
		 
		 System.out.println("Superficies mayores a 12 total de: " + contador);
		
		
		
		
	}

}
