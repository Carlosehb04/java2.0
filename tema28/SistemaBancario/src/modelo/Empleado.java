package modelo;

public class Empleado extends Persona {

    private double salario;

    public Empleado(String nombre, String documento, int edad, double salario) {

        super(nombre, documento, edad);

        this.salario = salario;

    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Salario: " + salario);

    }

}