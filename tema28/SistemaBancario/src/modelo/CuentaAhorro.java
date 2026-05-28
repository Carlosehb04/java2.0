package modelo;

public class CuentaAhorro extends CuentaBancaria {

    private double interes;

    public CuentaAhorro(String numeroCuenta,
                        double saldo,
                        double interes) {

        super(numeroCuenta, saldo);

        this.interes = interes;

    }

    public void generarInteres() {

        saldo += saldo * interes;

    }

    @Override
    public void mostrarCuenta() {

        super.mostrarCuenta();

        System.out.println("Interés: " + interes);

    }

}