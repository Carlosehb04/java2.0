import javax.swing.*;

public class Formulario extends JFrame {

	public Formulario() {
		setLayout(null);

	}

	public static void main(String[] args) {

		Formulario formulario1 = new Formulario();

		formulario1.setBounds(20, 30, 1024, 800);

		formulario1.setVisible(true);
		// HACE VISIBLE LA VENTANA.

		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// CIERRA COMPLETAMENTE EL PROGRAMA
		// AL CERRAR LA VENTANA.
		
		formulario1.setResizable(false);

	}

}
