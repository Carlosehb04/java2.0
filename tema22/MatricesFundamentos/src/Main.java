
public class Main {

	public static void main(String[] args) {

		/*
		 * MATRIZ BIDIMENSIONAL
		 * 
		 * INT [][] SIGNIFICA: UN ARREGLO QUE CONTIENE OTROS ARREGLOS DE ENTEROS
		 * 
		 * TENEMOS: 3FILAS 5COLUMNAS
		 * 
		 * 
		 */

		int[][] matriz = {

				{ 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 }, { 110, 120, 130, 140, 150 }

		};

		/*
		 * ================= CANTIDAD DE FILAS =================
		 * 
		 * MATRIZ.LENGTH DEVUELVE CUANTAS FILAS EXISTEN
		 * 
		 */

		System.out.println("Cantidad de filas:");

		System.out.println(matriz.length);

		/*
		 * ================ CANTIDAD DE COLUMNAS ================
		 * 
		 * 
		 * MATRIZ[0].length
		 * 
		 * MATRIZ[0] SIGNIFICA: "PRIMERA FILA"
		 * 
		 * .length DEVUELVE CUANTAS COLUMAS TIENE ESA FILA.
		 */

		System.out.println("\nCantidad de columnas:");

		System.out.println(matriz[0].length);

		/*
		 * 
		 * ================ ACCEDER A UN ELEMENTO ================
		 * 
		 * 
		 * SINTAXIS: MATRIZ[FILA][COLUMNA]
		 * 
		 * IMPORTANTE:
		 * 
		 * LOS INDICES EMPIEZAN EN 0
		 */

		System.out.println("\nElemento fila 1 columna 3:");

		System.out.println(matriz[1][3]);
		
		
		/*
         * MATRIZ[1][3]
         * 
         * FILA 1 → {60, 70, 80, 90, 100}
         * COLUMNA 3 → 90
         */

        /*
         * =========================
         * RECORRIDO CLÁSICO
         * =========================
         * 
         * SE USA CUANDO NECESITAS:
         * - ÍNDICES
         * - MODIFICAR DATOS
         * - ALGORITMOS
         * - BÚSQUEDAS
         */
		
		
		System.out.println("\nRecorrido clásico:");

        for (int fila = 0; fila < matriz.length; fila++) {

            /*
             * MATRIZ.LENGTH
             * 
             * CANTIDAD TOTAL DE FILAS.
             */

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                /*
                 * MATRIZ[FILA].LENGTH
                 * 
                 * CANTIDAD DE COLUMNAS
                 * DE ESA FILA.
                 */

                System.out.print(matriz[fila][columna] + " ");
            }

            System.out.println();
        }
        
        /*
         * =========================
         * RECORRIDO FOR-EACH
         * =========================
         * 
         * MÁS LIMPIO.
         * 
         * PERO NO TIENES ACCESO
         * DIRECTO A LOS ÍNDICES.
         */

        System.out.println("\nRecorrido con for-each:");

        for (int[] fila : matriz) {

            /*
             * FILA REPRESENTA
             * CADA ARREGLO INTERNO.
             */

            for (int valor : fila) {

                /*
                 * VALOR REPRESENTA
                 * CADA ELEMENTO DE LA FILA.
                 */

                System.out.print(valor + " ");
            }

            System.out.println();
        }

		
	}

}
