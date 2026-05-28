import java.util.Scanner;

public class OrdenamientoVector {

    private int numeros[];

    private Scanner teclado;

    private int n;

    private int intercambios;

    public void cargarNumeros() {

        teclado = new Scanner(System.in);

        System.out.println(
            "Ingresar la cantidad de numeros"
        );

        n = teclado.nextInt();

        numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(
                "Ingresar el numero " + (i + 1)
            );

            numeros[i] = teclado.nextInt();

        }

    }

    public void ordenarMenorAMayor() {

        intercambios = 0;

        for (int i = 0; i < numeros.length; i++) {

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[i] > numeros[j]) {

                    int aux = numeros[i];

                    numeros[i] = numeros[j];

                    numeros[j] = aux;

                    intercambios++;

                }

            }

        }

    }

    public void ordenarMayorAMenor() {

        intercambios = 0;

        for (int i = 0; i < numeros.length; i++) {

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[i] < numeros[j]) {

                    int aux = numeros[i];

                    numeros[i] = numeros[j];

                    numeros[j] = aux;

                    intercambios++;

                }

            }

        }

    }

    public void mostrarValoresRepetidos() {

        for (int i = 0; i < numeros.length; i++) {

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[i] == numeros[j]) {

                    System.out.println(
                        "Este numero se repite: "
                        + numeros[i]
                    );

                }

            }

        }

    }

    public void mostrarVector() {

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(
                numeros[i]
            );

        }

    }

    public void mostrarIntercambios() {

        System.out.println(
            "Cantidad de intercambios: "
            + intercambios
        );

    }

    public void mostrarResumen() {

        System.out.println(
            "Orden menor a mayor"
        );

        ordenarMenorAMayor();

        mostrarVector();

        mostrarIntercambios();

        System.out.println();

        System.out.println(
            "Orden mayor a menor"
        );

        ordenarMayorAMenor();

        mostrarVector();

        mostrarIntercambios();

        System.out.println();

        System.out.println(
            "Valores repetidos"
        );

        mostrarValoresRepetidos();

    }

    public static void main(String[] args) {

        OrdenamientoVector vs =
            new OrdenamientoVector();

        vs.cargarNumeros();

        vs.mostrarResumen();

    }

}