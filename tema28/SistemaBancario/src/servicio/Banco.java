package servicio;

import modelo.Cliente;

public class Banco {

    private Cliente cliente1;
    private Cliente cliente2;

    public Banco() {

        cliente1 = new Cliente(
                "Carlos",
                "001",
                20,
                1000
        );

        cliente2 = new Cliente(
                "Ana",
                "002",
                25,
                2000
        );

    }

    public void operar() {

        cliente1.depositar(500);

        cliente2.retirar(300);

    }

    public void mostrarClientes() {

        cliente1.mostrarInformacion();

        System.out.println("----------------");

        cliente2.mostrarInformacion();

    }

}