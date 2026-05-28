public class Prueba {

    public static void main(String[] args) {

        // ==========================================
        // OBJETO SUMA
        // ==========================================

        Suma suma1 = new Suma();

        // METODOS HEREDADOS
        // DESDE OPERACIONES

        suma1.cargar1();

        suma1.cargar2();

        // METODO PROPIO
        // DE LA CLASE SUMA

        suma1.operar();

        System.out.print("El resultado de la suma es: ");

        // METODO HEREDADO

        suma1.mostrarResultado();

        // ==========================================
        // OBJETO RESTA
        // ==========================================

        Resta resta1 = new Resta();

        resta1.cargar1();

        resta1.cargar2();

        resta1.operar();

        System.out.print("El resultado de la resta es: ");

        resta1.mostrarResultado();

    }

}