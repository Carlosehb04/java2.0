package main;

import modelo.CuentaAhorro;
import modelo.Gerente;
import servicio.Banco;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        banco.operar();

        banco.mostrarClientes();

        System.out.println("===============");

        Gerente gerente = new Gerente(
                "Pedro",
                "100",
                40,
                5000,
                1000
        );

        gerente.mostrarInformacion();

        System.out.println("===============");

        CuentaAhorro cuenta = new CuentaAhorro(
                "ABC123",
                3000,
                0.10
        );

        cuenta.generarInteres();

        cuenta.mostrarCuenta();

    }

}