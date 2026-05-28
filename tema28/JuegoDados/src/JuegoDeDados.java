public class JuegoDeDados {

    // =====================================================
    // ATRIBUTOS
    // =====================================================

    // VARIABLES QUE GUARDAN EL VALOR
    // DE CADA DADO

    private int dado1;
    private int dado2;
    private int dado3;

    // =====================================================
    // METODO TIRAR DADOS
    // =====================================================

    public void tirarDados() {

        // Math.random() GENERA UN NUMERO
        // ENTRE 0 Y 1

        // SE MULTIPLICA POR 6
        // PARA OBTENER VALORES
        // ENTRE 0 Y 5.9999

        // (INT) ELIMINA LOS DECIMALES

        // SE SUMA 1
        // PARA OBTENER NUMEROS
        // ENTRE 1 Y 6

        dado1 = 1 + (int)(Math.random() * 6);

        // SE GENERA EL VALOR
        // DEL SEGUNDO DADO

        dado2 = 1 + (int)(Math.random() * 6);

        // SE GENERA EL VALOR
        // DEL TERCER DADO

        dado3 = 1 + (int)(Math.random() * 6);

    }

    // =====================================================
    // METODO MOSTRAR DADOS
    // =====================================================

    public void mostrarDados() {

        // MUESTRA EL VALOR
        // DEL PRIMER DADO

        System.out.println("Dado 1: " + dado1);

        // MUESTRA EL VALOR
        // DEL SEGUNDO DADO

        System.out.println("Dado 2: " + dado2);

        // MUESTRA EL VALOR
        // DEL TERCER DADO

        System.out.println("Dado 3: " + dado3);

    }

    // =====================================================
    // METODO VERIFICAR GANADOR
    // =====================================================

    public void verificarGanador() {

        // == COMPARA VALORES

        // && SIGNIFICA:
        // "Y"

        // LA CONDICION SOLO SERA VERDADERA
        // SI LOS 3 DADOS SON IGUALES

        if (dado1 == dado2 && dado1 == dado3) {

            // SI LOS 3 DADOS SON IGUALES
            // EL JUGADOR GANA

            System.out.println("Ganó");

        } else {

            // SI ALGUN DADO ES DIFERENTE
            // EL JUGADOR PIERDE

            System.out.println("Perdió");

        }

    }

    // =====================================================
    // METODO JUGAR
    // =====================================================

    public void jugar() {

        // ESTE METODO LLAMA
        // A OTROS METODOS

        // PRIMERO:
        // GENERA LOS DADOS

        tirarDados();

        // DESPUES:
        // MUESTRA LOS RESULTADOS

        mostrarDados();

        // FINALMENTE:
        // VERIFICA SI GANO O PERDIO

        verificarGanador();

    }

    // =====================================================
    // METODO PRINCIPAL MAIN
    // =====================================================

    public static void main(String[] args) {

        // SE CREA EL OBJETO PRINCIPAL

        JuegoDeDados juego = new JuegoDeDados();

        // SE LLAMA AL METODO jugar()

        // ESTE METODO CONTROLA
        // TODO EL FLUJO DEL PROGRAMA

        juego.jugar();

    }

}