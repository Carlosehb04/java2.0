package modelo;

public class CuentaBancaria {

    private String numeroCuenta;

    protected double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {

        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;

    }

    public void depositar(double monto) {

        saldo += monto;

    }

    public void retirar(double monto) {

        saldo -= monto;

    }

    public void mostrarCuenta() {

        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);

    }

}