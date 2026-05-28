import javax.swing.*;

public class Formulario extends JFrame {

	private JLabel label1, label2, label3;

	public Formulario() {

		setLayout(null);
		label1 = new JLabel("Rojo");

		label1.setBounds(10, 20, 100, 30);
		add(label1);

		label2 = new JLabel("Azul");
		// CREA EL SEGUNDO JLabel.

		label2.setBounds(10, 60, 100, 30);
		// OBSERVA QUE CAMBIA LA POSICIÓN Y.
		// ASÍ QUEDA DEBAJO DEL PRIMERO.

		add(label2);
		// AGREGA label2 AL JFrame.

		label3 = new JLabel("Verde");
		// CREA EL TERCER JLabel.

		label3.setBounds(10, 100, 100, 30);
		// NUEVAMENTE CAMBIA Y
		// PARA UBICARLO MÁS ABAJO.

		add(label3);
		// AGREGA label3 AL JFrame.

	}

	public static void main(String[] args) {

		Formulario formulario1 = new Formulario();
		// CREA EL OBJETO VENTANA.

		formulario1.setBounds(0, 0, 300, 200);
		// DEFINE POSICIÓN Y TAMAÑO
		// DE LA VENTANA.

		formulario1.setResizable(false);
		// IMPIDE CAMBIAR EL TAMAÑO.

		formulario1.setVisible(true);
		// HACE VISIBLE LA VENTANA.

		formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// CIERRA COMPLETAMENTE EL PROGRAMA.

	}

}
