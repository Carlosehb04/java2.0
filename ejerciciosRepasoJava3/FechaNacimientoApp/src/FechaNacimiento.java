import java.util.Scanner;

public class FechaNacimiento {
	
	private String resultadoSemestre;
	private String resultadoDia;
	private int dia;
	private int mes;
	private Scanner teclado;
	
	public void cargarDatos() {
		
		teclado = new Scanner(System.in);
		 
		System.out.println("Ingresar dia");
		dia = teclado.nextInt();
		
		System.out.println("Ingresar mes");
		mes = teclado.nextInt();
		
	}
	public void evaluarSemestre() {
		
		if(mes >= 1 &&  mes <= 6) {
			resultadoSemestre = "Estas en el primer semestre";
			
		}else {
			resultadoSemestre = "No estas en el primer semestre";
		}
		
	}
	public void evaluarDia() {
		
		if(dia >= 1 && dia <= 15) {
			resultadoDia = "El día pertenece a la primera quincena";
			
		}else{
			resultadoDia = "El día no pertenece a la primera quincena";
			
		}
		
	}
	
	public void mostrarResultados() {
		
		System.out.println("=== Resultado ===");
		System.out.println(resultadoDia);
		System.out.println(resultadoSemestre);
		
	}

	public static void main(String[] args) {
		FechaNacimiento vs = new FechaNacimiento();
		vs.cargarDatos();
		vs.evaluarSemestre();
		vs.evaluarDia();
		vs.mostrarResultados();

	}

}
