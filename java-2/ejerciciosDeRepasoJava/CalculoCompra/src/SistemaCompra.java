import java.util.Scanner;

public class SistemaCompra {
	
      private double precio1, precio2, precio3;
      private double totalFinal = 0 ;
      private double subtotal = 0;

     
      
      public void cargarPrecios(){
    	  
    	  Scanner teclado = new Scanner(System.in);
    	  
    	  
    	  System.out.println("Ingresa el precio 1 ");
    	  precio1 = teclado.nextDouble();
    	  
    	  System.out.println("Ingresa el precio 2 ");
    	  precio2 = teclado.nextDouble();
    	  
    	  System.out.println("Ingresa el precio 3");
    	  precio3 = teclado.nextDouble();
    	  
    	 
    	  
      }
      public void calcularCompra() {
    	  
    	  subtotal = precio1 + precio2 + precio3;
    	
    	  totalFinal = subtotal * 1.21;
    	  
      }
      public void mostrarResultado() {
    	  if(totalFinal % 1 == 0) {
    		  System.out.println("Total: " + (int) totalFinal);
    	  }else {
    		  System.out.println("Total: " + totalFinal);
    	  }
    	  
      }
	

	public static void main(String[] args) {
		
		SistemaCompra vs = new SistemaCompra();
		
		vs.cargarPrecios();
		vs.calcularCompra();
		vs.mostrarResultado();

	}

}
