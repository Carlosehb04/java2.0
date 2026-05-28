import java.util.Scanner;

public class OrdenamientoPaises1 {
	
	private String[] paises;
	
	// CARGAR LOS PAÍSES EN EL VECTOR
	
	public void cargar(){
		Scanner teclado  = new Scanner(System.in);
		
		paises = new String[5];
		
		for(int i = 0; i < paises.length; i++) {
			System.out.println("Ingrese el nombre del pais: ");
			paises[i] = teclado.next();
			
		}
		
		
	}
	
	
	
	
	// ORDENAR ALFABÉTICAMENTE
	public void ordenar() {
		
		
		// FOR EXTERNO
        // REPITE EL PROCESO VARIAS VECES
		
		for(int i = 0; i < paises.length - 1; i++) {
			
			 // FOR INTERNO
            // COMPARA POSICIONES VECINAS
			for(int f = 0; f < paises.length -1 -i; f++) {
				
				if(paises[f].compareTo(paises[f + 1]) > 0){
					
					// INTERCAMBIO USANDO VARIABLE AUXILIAR
					String aux = paises[f];
					paises[f] = paises[f + 1];
					paises[f + 1] = aux;
				}
				
				
			}
			
		}
	}
	
	public void imprimir() {
		 System.out.println("\n Países ordenados alfabéticamente");
		 
		 for(int i = 0; i < paises.length; i++) {
			 
			   System.out.println(paises[i]);
		 }
	}

	public static void main(String[] args) {
		
		OrdenamientoPaises1 vs = new OrdenamientoPaises1();
		vs.cargar();
		vs.ordenar();
		vs.imprimir();

	}

}
