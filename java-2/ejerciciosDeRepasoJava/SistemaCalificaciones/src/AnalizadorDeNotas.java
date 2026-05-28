import java.util.Scanner;

public class AnalizadorDeNotas {
	
	private int nota;
	private int suma = 0;
	private int aprobados;
	private double media ;
	private int contadorNotas;
	
	
	public void cargarNotas(){
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			
			System.out.println("Ingresar nota");
			nota = teclado.nextInt();
			
			if(nota != -1) {
				suma += nota;
				contadorNotas++;
				
				if(nota >= 5) {
					aprobados++;
					
				}

			}
			
			
			
		}while(nota != -1);
		
	}
	
	public void calcularResultados() {
		

	    if(contadorNotas > 0) {

	        media = (double) suma / contadorNotas;

	    }
		
	}
	public void mostrarResultados() {
		System.out.println("Media de notas "+ media);
		System.out.println("Total aprobados "+ aprobados);
	}
	

	public static void main(String[] args) {
		
		AnalizadorDeNotas vs = new AnalizadorDeNotas();
		
		vs.cargarNotas();
		vs.calcularResultados();
		vs.mostrarResultados();
		

	}

}
