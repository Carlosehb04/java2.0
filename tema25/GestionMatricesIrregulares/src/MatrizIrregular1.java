
import java.util.Scanner;

public class MatrizIrregular1 {

    // SCANNER PARA LEER DATOS
    private Scanner teclado;

    // MATRIZ IRREGULAR
    private int[][] mat;

    // METODO PARA CARGAR LA MATRIZ
    public void cargar() {

        // INICIALIZAMOS EL SCANNER
        teclado = new Scanner(System.in);

        // PEDIMOS LA CANTIDAD DE FILAS
        System.out.print("CUANTAS FILAS TIENE LA MATRIZ: ");

        int filas = teclado.nextInt();

        // CREAMOS LA MATRIZ SOLO CON FILAS
        mat = new int[filas][];

        // RECORREMOS LAS FILAS
        for(int f = 0; f < mat.length; f++) {

            // PEDIMOS CUANTOS ELEMENTOS TENDRA LA FILA
            System.out.print("CUANTOS ELEMENTOS TIENE LA FILA " + f + ": ");

            int elementos = teclado.nextInt();

            // CREAMOS LA FILA ACTUAL
            mat[f] = new int[elementos];

            // RECORREMOS LAS COLUMNAS DE LA FILA
            for(int c = 0; c < mat[f].length; c++) {

                // PEDIMOS EL VALOR
                System.out.print("INGRESE COMPONENTE: ");

                // GUARDAMOS EL VALOR
                mat[f][c] = teclado.nextInt();

            }

        }

    }

    // METODO PARA MOSTRAR LA MATRIZ
    public void imprimir() {

        System.out.println("===== MATRIZ IRREGULAR =====");

        // RECORREMOS LAS FILAS
        for(int f = 0; f < mat.length; f++) {

            // RECORREMOS LAS COLUMNAS
            for(int c = 0; c < mat[f].length; c++) {

                // MOSTRAMOS EL VALOR
                System.out.print(mat[f][c] + " ");

            }

            // SALTO DE LINEA
            System.out.println();

        }

    }

    // METODO PRINCIPAL
    public static void main(String[] ar) {

        // CREAMOS EL OBJETO
        MatrizIrregular1 ma = new MatrizIrregular1();

        // CARGAMOS LA MATRIZ
        ma.cargar();

        // MOSTRAMOS LA MATRIZ
        ma.imprimir();

    }

}