import java.util.Scanner;

public class PuntosPlano {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
	 int n = 0;
	 int x;
	 int y;
	 int primer = 0;
	 int segundo = 0;
	 int tercero = 0;
	 int cuarto = 0;
	 int i;
	 
     boolean valido = false;
     
     do {
    		try {
    			 System.out.println("Ingrese cantidad");
    			 n = teclado.nextInt();
    			 valido = true;
    		}catch(Exception e){
    			System.out.println("Error: debes ingresar un numero");
    			teclado.nextLine();
    			
    		}
     }while(!valido);
    
	 
	 
	 for(i = 1; i < n; i++) {
		 
		 System.out.println("Ingresa cordenada de X " + i);
		 x = teclado.nextInt();
		 
		 System.out.println("ingresa cordenadas de Y " + i);
		 y = teclado.nextInt();
		 
		 
		 if(x > 0 && y > 0) {
			 primer++;
		 }
		 
		 if(x < 0 && y > 0) {
			 segundo++;
		 }
		 if(x < 0 && y < 0) {
			 tercero++;
		 }
		 
		 if(x > 0 && y < 0) {
			 cuarto++;
		 }
		 
		 
	 }
	 
	 System.out.println("El Cuadrante 1 tiene: " + primer);
	 System.out.println("El Cuadrante 2 tiene: " + segundo);
	 System.out.println("El Cuadrante 3 tiene: " + tercero);
	 System.out.println("El Cuadrante 4 tiene: " + cuarto);
		
		

	}

}
