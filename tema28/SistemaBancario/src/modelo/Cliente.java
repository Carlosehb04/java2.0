package modelo;

public class Cliente extends Persona {

    private double saldo;

    public Cliente(String nombre, String documento, int edad, double saldo) {

        super(nombre, documento, edad);

        this.saldo = saldo;

    }

    public void depositar(double monto) {

        saldo += monto;

    }

    public void retirar(double monto) {

        saldo -= monto;

    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Saldo: " + saldo);

    }

}