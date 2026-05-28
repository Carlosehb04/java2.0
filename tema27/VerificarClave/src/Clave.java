import java.util.Scanner;

public class Clave {

    private String clave;

    private Scanner teclado;

    public Clave() {

        teclado = new Scanner(System.in);

    }

    public void cargarClave() {

        System.out.println("Ingresa la clave:");

        clave = teclado.next();

    }

    public void verificarClave() {

        if("123abc".equals(clave)) {

            System.out.println(
                "Clave correcta. Acceso concedido."
            );

        } else {

            System.out.println(
                "Clave incorrecta. Acceso denegado."
            );

        }

    }

    public static void main(String[] args) {

        Clave vs = new Clave();

        vs.cargarClave();

        vs.verificarClave();

    }

}
