import java.util.Scanner;

public class NotasAlumnos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		 int nota;
		 int aprobados = 0;
		 int desaprobados = 0;
		 int contar = 1;
		 
		 while(contar <= 10) {
			 System.out.println("Ingrese la nota");
			 nota = teclado.nextInt();
			 
			 if(nota >= 7) {
				 aprobados++;
			 }else {
				 desaprobados++;
			 }
			 contar++;
		 }
		 
		 System.out.println("El total de los aprobado es " + aprobados);
		 System.out.println("El total de los reprobados es " + desaprobados);

	}

}
