import java.util.Scanner;

public class MatrizUltimaFila {

    private Scanner teclado;

    private int[][] matriz;

    /*
     * METODO PARA CARGAR
     * LA MATRIZ DINAMICAMENTE
     */
    public void cargarMatriz() {

        teclado = new Scanner(System.in);

        /*
         * PEDIMOS LA CANTIDAD
         * DE FILAS
         */
        System.out.print("INGRESE LA CANTIDAD DE FILAS: ");

        int filas = teclado.nextInt();

        /*
         * PEDIMOS LA CANTIDAD
         * DE COLUMNAS
         */
        System.out.print("INGRESE LA CANTIDAD DE COLUMNAS: ");

        int columnas = teclado.nextInt();

        /*
         * CREAMOS LA MATRIZ
         * USANDO LOS DATOS
         * INGRESADOS
         */
        matriz = new int[filas][columnas];

        /*
         * RECORREMOS LAS FILAS
         */
        for (int fila = 0; fila < matriz.length; fila++) {

            /*
             * RECORREMOS LAS COLUMNAS
             * DE LA FILA ACTUAL
             */
            for (int columna = 0; columna < matriz[fila].length; columna++) {

                System.out.print("INGRESE UN NUMERO: ");

                /*
                 * GUARDAMOS EL VALOR
                 * EN LA POSICION
                 * ACTUAL
                 */
                matriz[fila][columna] = teclado.nextInt();
            }
        }
    }

    /*
     * METODO PARA MOSTRAR
     * TODA LA MATRIZ
     */
    public void mostrarMatriz() {

        System.out.println("\nMATRIZ COMPLETA:");

        /*
         * RECORREMOS FILAS
         */
        for (int fila = 0; fila < matriz.length; fila++) {

            /*
             * RECORREMOS COLUMNAS
             */
            for (int columna = 0; columna < matriz[fila].length; columna++) {

                /*
                 * IMPRIMIMOS EN LA
                 * MISMA LINEA
                 */
                System.out.print(matriz[fila][columna] + " ");
            }

            /*
             * CUANDO TERMINA
             * UNA FILA
             * BAJAMOS DE LINEA
             */
            System.out.println();
        }
    }

    /*
     * METODO PARA MOSTRAR
     * SOLO LA ULTIMA FILA
     */
    public void mostrarUltimaFila() {

        System.out.println("\nULTIMA FILA:");

        /*
         * matriz.length
         * DEVUELVE LA CANTIDAD
         * TOTAL DE FILAS
         * 
         * PERO:
         * 
         * LOS INDICES COMIENZAN
         * EN 0
         * 
         * POR ESO:
         * 
         * length - 1
         * ES LA ULTIMA FILA
         */

        for (int columna = 0; columna < matriz[matriz.length - 1].length; columna++) {

            /*
             * matriz.length - 1
             * ACCEDE A LA ULTIMA FILA
             * 
             * COLUMNA
             * RECORRE TODAS LAS
             * COLUMNAS DE ESA FILA
             */

            System.out.print(matriz[matriz.length - 1][columna] + " ");
        }
    }

    public static void main(String[] args) {

        /*
         * CREAMOS EL OBJETO
         * DE LA CLASE
         */
        MatrizUltimaFila matriz = new MatrizUltimaFila();

        /*
         * LLAMAMOS LOS METODOS
         */
        matriz.cargarMatriz();

        matriz.mostrarMatriz();

        matriz.mostrarUltimaFila();
    }
}