import java.util.Scanner;

public class Main {

    private Scanner teclado;

    private int[][] matriz;

    /*
     * METODO PARA CARGAR LA MATRIZ
     */
    public void cargarMatriz() {

        /*
         * CREAMOS EL OBJETO SCANNER
         * PARA LEER DATOS DEL TECLADO
         */
        teclado = new Scanner(System.in);

        /*
         * CREAMOS UNA MATRIZ
         * DE 4 FILAS Y 4 COLUMNAS
         */
        matriz = new int[4][4];

        /*
         * RECORREMOS LAS FILAS
         */
        for (int fila = 0; fila < matriz.length; fila++) {

            /*
             * RECORREMOS LAS COLUMNAS
             */
            for (int columna = 0; columna < matriz[fila].length; columna++) {

                System.out.print("INGRESE UN NUMERO: ");

                /*
                 * GUARDAMOS EL VALOR
                 * EN LA POSICION ACTUAL
                 */
                matriz[fila][columna] = teclado.nextInt();
            }
        }
    }

    /*
     * METODO PARA MOSTRAR
     * LA MATRIZ COMPLETA
     */
    public void mostrarMatriz() {

        System.out.println("\nMATRIZ COMPLETA:");

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                System.out.print(matriz[fila][columna] + " ");
            }

            System.out.println();
        }
    }

    /*
     * METODO PARA IMPRIMIR
     * LA DIAGONAL PRINCIPAL
     */
    public void imprimirDiagonalPrincipal() {

        System.out.println("\nDIAGONAL PRINCIPAL:");

        /*
         * USAMOS UNA SOLA VARIABLE
         * PORQUE:
         * 
         * FILA Y COLUMNA
         * SON IGUALES EN LA
         * DIAGONAL PRINCIPAL
         */

        for (int indice = 0; indice < matriz.length; indice++) {

            System.out.print(matriz[indice][indice] + " ");
        }
    }

    public static void main(String[] args) {

        /*
         * CREAMOS EL OBJETO
         * DE LA CLASE
         */
        Main matriz = new Main();

        /*
         * LLAMAMOS LOS METODOS
         */
        matriz.cargarMatriz();

        matriz.mostrarMatriz();

        matriz.imprimirDiagonalPrincipal();
    }
}