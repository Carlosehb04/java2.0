
public class TablaMultiplicar {

	// ATRIBUTO QUE GUARDA EL NUMERO DE LA TABLA
	private int tabla;

	// ATRIBUTO QUE GUARDA LA CANTIDAD DE TERMINOS
	private int terminos;

	// PRIMER CONSTRUCTOR
	// RECIBE LA TABLA Y LA CANTIDAD DE TERMINOS

	public TablaMultiplicar(int ta, int ter) {

		// GUARDAMOS LA TABLA
		tabla = ta;

		// GUARDAMOS LOS TERMINOS
		terminos = ter;

	}

	public TablaMultiplicar(int ta) {

		// GUARDAMOS LA TABLA
		tabla = ta;

		// SI NO LLEGAN TERMINOS
		// POR DEFECTO MOSTRARA 10
		terminos = 10;

	}

	// METODO PARA IMPRIMIR LA TABLA
	public void imprimir() {

		// MOSTRAMOS EL TITULO
		System.out.println("TABLA DE MULTIPLICAR DEL " + tabla);

		// RECORREMOS LOS TERMINOS
		for (int i = 1; i <= terminos; i++) {

			// CALCULAMOS EL RESULTADO
			int resultado = tabla * i;

			// MOSTRAMOS LA OPERACION
			System.out.println(tabla + " * " + i + " = " + resultado);

		}
	}

	public static void main(String[] args) {

		// OBJETO QUE USA EL CONSTRUCTOR
		// DE UN SOLO PARAMETRO
		TablaMultiplicar tabla1 = new TablaMultiplicar(5,5);

		// IMPRIMIMOS LA TABLA
		tabla1.imprimir();

		// OBJETO QUE USA EL CONSTRUCTOR
		// DE DOS PARAMETROS
		TablaMultiplicar tabla2 = new TablaMultiplicar(3, 5);

		// IMPRIMIMOS LA TABLA
		tabla2.imprimir();

	}

}
