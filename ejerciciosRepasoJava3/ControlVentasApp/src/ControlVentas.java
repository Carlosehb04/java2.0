import java.util.Scanner;

public class ControlVentas {
	private double importe;
	private double totalRecaudado;
	private int ventasMayores100;

	private Scanner teclado;
	
	public void gestionarVentas() {
		teclado = new Scanner(System.in);
		do {
			System.out.println("Ingresar el numero a comprar");
			 importe = teclado.nextInt();
			 
			 if(importe != 0) {
				 totalRecaudado += importe;
				 if(importe > 100) {
					 ventasMayores100++;
				 }
			 }
		}while(importe != 0);
		
		
		
	}
	

	public void mostrarResultados() {
		
		System.out.println("=== Resultado ===");
		
		 if(totalRecaudado % 1 == 0) {
			 System.out.println("Total: " +  (int) totalRecaudado);
			 
		 }else {
			 System.out.println("Total: " +  totalRecaudado);
		 }
		
		 System.out.println("Total Montos mayores a 100: " + ventasMayores100);
		
	}

	public static void main(String[] args) {
		
		ControlVentas vs = new ControlVentas();
		
		vs.gestionarVentas();
		vs.mostrarResultados();
	

	}

}
