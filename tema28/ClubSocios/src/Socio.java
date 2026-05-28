public class Socio {

    // ==========================================
    // ATRIBUTOS
    // ==========================================

    private String nombre;

    private int antiguedad;

    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public Socio(String nombre, int antiguedad) {

        this.nombre = nombre;

        this.antiguedad = antiguedad;

    }

    // ==========================================
    // GET NOMBRE
    // ==========================================

    public String getNombre() {

        return nombre;

    }

    // ==========================================
    // GET ANTIGUEDAD
    // ==========================================

    public int getAntiguedad() {

        return antiguedad;

    }

}