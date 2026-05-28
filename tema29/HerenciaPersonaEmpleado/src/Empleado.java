
public class Empleado extends Persona {

	private double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {

		super(nombre, edad);
		this.sueldo = sueldo;
		
	}
	
	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Sueldo " + sueldo);
	}

}
