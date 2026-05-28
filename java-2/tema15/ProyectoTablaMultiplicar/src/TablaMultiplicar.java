
import java.util.Scanner; // IMPORTA LA CLASE SCANNER PARA LEER DATOS DESDE TECLADO

// CLASE PRINCIPAL
public class TablaMultiplicar {
	
	// METODO PARA CARGAR VALORES
	public void cargarValor() {
		
		// CREA EL OBJETO SCANNER
		Scanner teclado = new Scanner(System.in);
		
		// VARIABLE PARA GUARDAR EL NUMERO INGRESADO
		int valor;
		
		do {
			// MUESTRA MENSAJE EN PANTALLA
			System.out.println("Ingresa valor: ");
			
			// GUARDA EL NUMERO INGRESADO
			valor = teclado.nextInt();
			
			 // VERIFICA SI EL VALOR ES DISTINTO DE -1
			if(valor != -1) {
				
				// LLAMA EL METODO CALCULAR
				calcular(valor);
			}
		}while(valor != -1); // EL LOOP TERMINA CUANDO EL USUARIO INGRESA -1
	}
	
	
	public void calcular(int v) {
		
		// LOOP QUE GENERA LOS MULTIPLOS
		for(int f = v; f <= v * 10; f = f + v) {
			
			// MUESTRA LOS RESULTADOS
			System.out.println(f +" - ");
		}
		// SALTO DE LINEA
		System.out.println();
	}
	
	
	 // METODO PRINCIPAL

	public static void main(String[] args) {
		
		// CREA LA REFERENCIA
		TablaMultiplicar tabla;
		
		
		// CREA EL OBJETO REAL
		tabla = new TablaMultiplicar();
		
		
		// LLAMA EL METODO PARA INICIAR EL PROGRAMA
		tabla.cargarValor();
		
		
		
	

	}

}
