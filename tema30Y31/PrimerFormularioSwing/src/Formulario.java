import javax.swing.*;
// IMPORTA TODAS LAS CLASES DEL PAQUETE javax.swing.
// AQUÍ SE ENCUENTRA JFrame.

public class Formulario extends JFrame {
    // CREACIÓN DE TU CLASE.
    // HEREDA DE JFrame.
    // GRACIAS A ESTO FORMULARIO SE CONVIERTE
    // EN UNA VENTANA.

    public Formulario() {
        // CONSTRUCTOR DE LA CLASE.
        // SE EJECUTA CUANDO HACEMOS:
        // new FROMULARIO()

        setLayout(null);
        // DESACTIVA EL POSICIONAMIENTO AUTOMÁTICO.
        // AHORA LOS COMPONENTES SE UBICAN
        // MANUALMENTE CON COORDENADAS.
    }

    public static void main(String[] args) {
        // MÉTODO PRINCIPAL.
        // AQUÍ COMIENZA EL PROGRAMA.

        Formulario formulario1 = new Formulario();
        // CREA UN OBJETO DE LA CLASE FORMULARIO.
        // ESTE OBJETO SERÁ LA VENTANA.

        formulario1.setBounds(20,30,400,300);
        // DEFINE:
        // 10  -> POSICIÓN X
        // 20  -> POSICIÓN Y
        // 400 -> ANCHO
        // 300 -> ALTO

        formulario1.setVisible(true);
        // HACE VISIBLE LA VENTANA.

        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // CIERRA COMPLETAMENTE EL PROGRAMA
        // AL CERRAR LA VENTANA.
    }
}