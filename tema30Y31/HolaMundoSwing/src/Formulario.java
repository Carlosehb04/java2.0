
import javax.swing.*;
// IMPORTA TODAS LAS CLASES DEL PAQUETE SWING.
// AQUÍ ESTÁN JFrame Y JLabel.

public class Formulario extends JFrame {
    // LA CLASE HEREDA DE JFrame.
    // GRACIAS A ESTO FORMULARIO
    // SE CONVIERTE EN UNA VENTANA.

    private JLabel label1;
    // CREA UNA VARIABLE DE TIPO JLabel.
    // ESTE OBJETO SERVIRÁ PARA MOSTRAR TEXTO.

    public Formulario() {
        // CONSTRUCTOR DE LA CLASE.
        // SE EJECUTA AUTOMÁTICAMENTE
        // CUANDO HACEMOS:
        // new FORMULARIO()

        setLayout(null);
        // DESACTIVA EL POSICIONAMIENTO AUTOMÁTICO.
        // AHORA UBICAREMOS COMPONENTES
        // MANUALMENTE.

        label1 = new JLabel("Hola Mundo.");
        // CREA EL OBJETO JLabel.
        // EL TEXTO ENTRE COMILLAS
        // ES EL TEXTO QUE SE MOSTRARÁ.

        label1.setBounds(140, 110,200,30);
        // DEFINE:
        // 10  -> POSICIÓN X
        // 20  -> POSICIÓN Y
        // 200 -> ANCHO DEL LABEL
        // 30  -> ALTO DEL LABEL

        add(label1);
        // AGREGA EL JLabel
        // DENTRO DEL JFrame.
        // SIN ESTO EL TEXTO NO APARECE.
    }

    public static void main(String[] ar) {
        // MÉTODO PRINCIPAL DEL PROGRAMA.

        Formulario formulario1 = new Formulario();
        // CREA EL OBJETO VENTANA.

        formulario1.setBounds(10,10,400,300);
        // DEFINE POSICIÓN Y TAMAÑO
        // DE LA VENTANA.

        formulario1.setVisible(true);
        // HACE VISIBLE LA VENTANA.

        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // CIERRA COMPLETAMENTE EL PROGRAMA
        // CUANDO SE CIERRA LA VENTANA.
    }
}