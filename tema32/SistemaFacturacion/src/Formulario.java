import javax.swing.*;
// IMPORTA LAS CLASES DE SWING.
// AQUÍ ESTÁN JFrame Y JLabel.

public class Formulario extends JFrame {
    // LA CLASE HEREDA DE JFrame.
    // AHORA FORMULARIO ES UNA VENTANA.

    private JLabel label1, label2;
    // CREA DOS VARIABLES DE TIPO JLabel.
    // CADA UNA MOSTRARÁ UN TEXTO DIFERENTE.

    public Formulario() {
        // CONSTRUCTOR DE LA CLASE.
        // SE EJECUTA CUANDO HACEMOS:
        // new FORMULARIO()

        setLayout(null);
        // DESACTIVA EL POSICIONAMIENTO AUTOMÁTICO.
        // AHORA UBICAREMOS LOS COMPONENTES
        // MANUALMENTE.

        label1 = new JLabel("Sistema de Facturación.");
        // CREA EL PRIMER JLabel.
        // EL TEXTO ENTRE COMILLAS
        // ES EL TEXTO QUE SE MOSTRARÁ.

        label1.setBounds(10,20,300,30);
        // DEFINE:
        // 10  -> POSICIÓN X
        // 20  -> POSICIÓN Y
        // 300 -> ANCHO
        // 30  -> ALTO

        add(label1);
        // AGREGA label1 AL JFrame.
        // SIN ESTO NO APARECERÍA.

        label2 = new JLabel("Version 1.0");
        // CREA EL SEGUNDO JLabel.
        // MOSTRARÁ LA VERSIÓN DEL SISTEMA.

        label2.setBounds(10,100,100,30);
        // DEFINE LA POSICIÓN Y TAMAÑO
        // DEL SEGUNDO JLabel.

        add(label2);
        // AGREGA label2 AL JFrame.
    }

    public static void main(String[] ar) {
        // MÉTODO PRINCIPAL.

        Formulario formulario1 = new Formulario();
        // CREA EL OBJETO VENTANA.

        formulario1.setBounds(0,0,300,200);
        // DEFINE POSICIÓN Y TAMAÑO
        // DE LA VENTANA.

        formulario1.setResizable(false);
        // IMPIDE CAMBIAR EL TAMAÑO
        // DE LA VENTANA.

        formulario1.setVisible(true);
        // HACE VISIBLE LA VENTANA.

        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // CIERRA COMPLETAMENTE EL PROGRAMA
        // AL CERRAR LA VENTANA.
    }
}