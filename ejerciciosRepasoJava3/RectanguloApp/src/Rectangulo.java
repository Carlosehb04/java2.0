import java.util.Scanner;

public class Rectangulo {

	private Scanner teclado;
	private double altura;
	private double base;
	private double area;
	private double perimetro;
	private double dobleArea;

	public void cargarDatos() {
		teclado = new Scanner(System.in);

		System.out.println("Ingresar la altura");
		altura = teclado.nextDouble();

		System.out.println("Ingresar la base");
		base = teclado.nextDouble();

	}

	public void calcularArea() {

		 area = base * altura;
		 perimetro = 2 * (base + altura);
		 dobleArea = area * 2;

	}

	public void mostrarResultados() {

		System.out.println("==== El area calculada ====");
		
		if(area % 1 == 0) {
			 System.out.println("El area es: " + (int) area);
			
		}else {
			System.out.println("El area es: " + area);
		}
		
		System.out.println("==== El perimetro calculado ====");
		
		
		if(perimetro % 1 == 0) {
			 System.out.println("El perimetro es: " + (int) perimetro);
			
		}else {
			System.out.println("El perimetro es: " + perimetro);
		}
		
	
		
		
		
		System.out.println("==== El doble area calculada ====");
		
		if(dobleArea % 1 == 0) {
			 System.out.println("El doble area es: " + (int) dobleArea);
			
		}else {
			System.out.println("El doble area es: " + dobleArea);
		}
		
	

	}

	public static void main(String[] args) {
		
		
		Rectangulo vs = new Rectangulo();
		
		vs.cargarDatos();
		vs.calcularArea();
		vs.mostrarResultados();

	}

}
