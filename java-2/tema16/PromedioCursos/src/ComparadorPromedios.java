import java.util.Scanner;

public class ComparadorPromedios {
	
	private int cursoA [];
	private int cursoB [];
	private int numeroVector;
    private int sumaA;
    private int sumaB;
    private double promedioA;
    private double promedioB;
	
	
	public void cargarDatos() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresa tamaño del CursoA ");
		numeroVector = teclado.nextInt();
		
		cursoA = new int[numeroVector];
		cursoB = new int[numeroVector];
		
		for(int i = 0; i < cursoA.length; i++) {
			System.out.println("Ingresar nota del CursoA " + (i + 1));
			cursoA[i] = teclado.nextInt();   
			
		}
		
		for(int i = 0; i < cursoB.length; i++) {
			System.out.println("Ingresar nota del CursoB" + (i + 1));
			cursoB[i] = teclado.nextInt();   
			
		}
		
		
	}
	
	public void ComparadorPromedios() {
		
		for(int i = 0; i < cursoA.length; i++) {
			sumaA = sumaA + cursoA[i];
		}
		
		
		
		for(int i = 0; i < cursoB.length; i++) {
			sumaB = sumaB + cursoB[i];
		}
		
		promedioA = (double) sumaA / cursoA.length;
		promedioB = (double) sumaB / cursoB.length;
		
		System.out.println("Promedio de CursoA " + promedioA);
		System.out.println("Promedio de CursoB " + promedioB);
	}
	
	

	public static void main(String[] args) {
		
		ComparadorPromedios vector = new ComparadorPromedios();
		
		vector.cargarDatos();
		vector.ComparadorPromedios();
		

	}

}
