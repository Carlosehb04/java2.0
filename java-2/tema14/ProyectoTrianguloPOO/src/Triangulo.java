
import java.util.Scanner;


// CLASE PRINCIPAL LLAMADA TRIANGULO
public class Triangulo {
	
	//ATIBUTOS DEL OBJETO
	
	private Scanner teclado; // VARIABLE REFERNCIA PARA LEER DATOS
	private int lado1, lado2, lado3; // VARIABLE PARA GUARDAR LOS LADOS DEL TRIANGULO

  
	// METODO PARA CARGAR LOS DATOS DEL TRIANGULO
	
	 public void inicializar() {
		 
		 // SE CREA EL OBJETO SCANNER
		 teclado = new Scanner(System.in);
		 
		 // PEDIR LADO 1
		 System.out.println("Medida lado 1:  ");
		 
		 // GUARDAMOS EL LADO 1
		 lado1 = teclado.nextInt();
		 
		 
		 // PEDIR LADO 2
		 System.out.println("Medida lado 2:  ");
		 
		 // GUARDAMOS LADO 2
		 lado2 = teclado.nextInt();
		 
		 // PEDIR LADO 3
		 System.out.println("Medida lado 3:  ");
		 
		 // GUARDAMOS LADO 3
		 lado3 = teclado.nextInt();
		 
	 
	 }
	 
	 // METODO PARA MOSTRAR EL LADO MAYOR
	 
	 public void ladoMayor() {
		 // MOSTAR MENSAJE
		 
		 System.out.println("Lado mayor: ");
		 
		 //VERIFICAMOS SI LADO 1 ES MAYOR
		 
		 if(lado1 > lado2 && lado1 > lado3) {
			 System.out.println("El lado mayor es el 1 con: " + lado1);
		 }else {
			 if( lado2 > lado3) {
				 System.out.println("El lado mayor es el 2 con: " +  lado2);
			 }else {
				 System.out.println("El lado mayor es el 3 con: " + lado3);
			 }
		 }
	 }
	 
	 // METODO PARA VERIFCAR SI EL TRIANGULO ES EQUILATERO
	 
	 public  void esEquilatero() {
		 
		 //VERIFICAMOS SI LOS LADOS SON IGUALES
		 if(lado1 == lado2 && lado1 == lado3) {
			 System.err.println("Es una triángulo equilátero");
		 }else {
			 System.out.println("No es un triángulo equilátero");
		 }
	 }

	 //METODO PRINCIPAL DONDE INICIA EL PROGRAMA
public static void main(String[] args) {
		
	//CREAR OBJETO TRIANGULO
	
	Triangulo triangulo1 = new Triangulo();
	
	triangulo1.inicializar();
	triangulo1.ladoMayor();
	triangulo1.esEquilatero();

	}

}
