import java.util.Scanner;

public class Operaciones {

    // =====================================================
    // ATRIBUTOS HEREDADOS
    // =====================================================

    // protected PERMITE QUE LAS CLASES HIJAS
    // PUEDAN ACCEDER A ESTOS ATRIBUTOS

    protected Scanner teclado;

    protected int valor1;

    protected int valor2;

    protected int resultado;

    // =====================================================
    // CONSTRUCTOR
    // =====================================================

    public Operaciones() {

        // SE CREA EL OBJETO Scanner
        // PARA LEER DATOS DEL TECLADO

        teclado = new Scanner(System.in);

    }

    // =====================================================
    // METODO CARGAR PRIMER VALOR
    // =====================================================

    public void cargar1() {

        System.out.print("Ingrese el primer valor: ");

        valor1 = teclado.nextInt();

    }

    // =====================================================
    // METODO CARGAR SEGUNDO VALOR
    // =====================================================

    public void cargar2() {

        System.out.print("Ingrese el segundo valor: ");

        valor2 = teclado.nextInt();

    }

    // =====================================================
    // MOSTRAR RESULTADO
    // =====================================================

    public void mostrarResultado() {

        System.out.println(resultado);

    }

}