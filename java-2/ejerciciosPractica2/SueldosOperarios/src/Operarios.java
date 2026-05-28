import java.util.Scanner;

public class Operarios {
	private int cantidad;
	private double [] sueldos;
	private Scanner teclado;
	
	
	public void solicitarCantidad(){
		
	     teclado = new Scanner(System.in);
		
		System.out.println("Ingresar la cantidad de sueldos");
		cantidad = teclado.nextInt();

}
	public void cargarSueldos(){
		
		sueldos = new double[cantidad];
		
		for(int i = 0; i < sueldos.length; i++ ) {
			System.out.println("Ingresar sueldo " + (i + 1));
			sueldos[i] = teclado.nextDouble();
		}

}
	public void mostrarSueldos(){
		
		System.out.println("=== Resultado ===");
		for(int i = 0; i < sueldos.length; i++) {
			 
			if(sueldos[i] % 1 == 0) {
				System.out.println( (int) sueldos[i]);
			}else {
				System.out.println(sueldos[i]);
			}
			
		}

}

	public static void main(String[] args) {
		
		Operarios vs = new Operarios();
		vs.solicitarCantidad();
		vs.cargarSueldos();
		vs.mostrarSueldos();
		

	}

}
