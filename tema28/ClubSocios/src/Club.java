
public class Club {

	private Socio socio1;
	private Socio socio2;
	private Socio socio3;

	public Club() {

		socio1 = new Socio("Carlos", 5);

		socio2 = new Socio("Ana", 10);

		socio3 = new Socio("Pedro", 3);

	}

	public void socioMayorAntiguedad() {

		if (socio1.getAntiguedad() > socio2.getAntiguedad() && socio1.getAntiguedad() > socio3.getAntiguedad()) {

			System.out.println("Socio con mayor antigüedad: " + socio1.getNombre());

		} else if (socio2.getAntiguedad() > socio3.getAntiguedad()) {

			System.out.println("Socio con mayor antigüedad: " + socio2.getNombre());

		} else {

			System.out.println("Socio con mayor antigüedad: " + socio3.getNombre());

		}

	}

	public static void main(String[] args) {

		Club club = new Club();

		club.socioMayorAntiguedad();

	}
}
