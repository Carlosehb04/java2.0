import java.util.Scanner;

public class VectorSueldos {
	
	private int[] sueldos;
	
	public void cargar() {
		Scanner teclado = new Scanner(System.in);
		
		sueldos = new int[5];
		
		for(int i = 0; i < sueldos.length; i++) {
			System.out.println("Ingrese sueldo del operario: " + (i + 1));
			sueldos[i] = teclado.nextInt();
		}
	}
	
	public void imprimir() {
		System.out.println("\n Lista de sueldos: ");
		
		for(int f = 0; f < sueldos.length; f++) {
			System.out.println("Sueldo posicion [" + (f + 1) +"]: " + sueldos[f]);
		}
	}

	public static void main(String[] args) {
		
		VectorSueldos vs = new VectorSueldos();
		
		vs.cargar();
		vs.imprimir();
	

	}

}
