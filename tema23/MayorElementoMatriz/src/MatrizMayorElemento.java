
import java.util.Scanner;

public class MatrizMayorElemento {

    private Scanner teclado;

    private int[][] matriz;

    /*
     * METODO PARA CARGAR
     * LA MATRIZ
     */
    public void cargarMatriz() {

        teclado = new Scanner(System.in);

        /*
         * PEDIMOS FILAS
         */
        System.out.print("INGRESE LA CANTIDAD DE FILAS: ");

        int filas = teclado.nextInt();

        /*
         * PEDIMOS COLUMNAS
         */
        System.out.print("INGRESE LA CANTIDAD DE COLUMNAS: ");

        int columnas = teclado.nextInt();

        /*
         * CREAMOS LA MATRIZ
         */
        matriz = new int[filas][columnas];

        /*
         * RECORREMOS LA MATRIZ
         * PARA CARGAR DATOS
         */
        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                System.out.print("INGRESE UN NUMERO: ");

                matriz[fila][columna] = teclado.nextInt();
            }
        }
    }

    /*
     * METODO PARA BUSCAR
     * EL MAYOR ELEMENTO
     */
    public void mostrarMayor() {

        /*
         * SUPONEMOS QUE EL
         * PRIMER ELEMENTO
         * ES EL MAYOR
         */

        int mayor = matriz[0][0];

        /*
         * GUARDAMOS LA POSICION
         * DEL MAYOR
         */

        int filaMayor = 0;

        int columnaMayor = 0;

        /*
         * RECORREMOS TODA
         * LA MATRIZ
         */

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                /*
                 * SI EL ELEMENTO ACTUAL
                 * ES MAYOR AL MAYOR
                 * GUARDADO
                 */

                if (matriz[fila][columna] > mayor) {

                    /*
                     * ACTUALIZAMOS
                     * EL MAYOR
                     */

                    mayor = matriz[fila][columna];

                    /*
                     * GUARDAMOS
                     * SU POSICION
                     */

                    filaMayor = fila;

                    columnaMayor = columna;
                }
            }
        }

        /*
         * MOSTRAMOS RESULTADOS
         */

        System.out.println("\nEL ELEMENTO MAYOR ES: " + mayor);

        System.out.println("SE ENCUENTRA EN LA FILA: " + filaMayor);

        System.out.println("SE ENCUENTRA EN LA COLUMNA: " + columnaMayor);
    }

    public static void main(String[] args) {

        /*
         * CREAMOS EL OBJETO
         */
        MatrizMayorElemento matriz = new MatrizMayorElemento();

        /*
         * LLAMAMOS LOS METODOS
         */
        matriz.cargarMatriz();

        matriz.mostrarMayor();
    }
}