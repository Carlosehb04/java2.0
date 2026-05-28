package modelo;

public class Gerente extends Empleado {

    private double bono;

    public Gerente(String nombre, String documento, int edad,
                    double salario, double bono) {

        super(nombre, documento, edad, salario);

        this.bono = bono;

    }

    public double calcularSalarioTotal() {

        return getSalario() + bono;

    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Bono: " + bono);
        System.out.println("Salario Total: " + calcularSalarioTotal());

    }

}