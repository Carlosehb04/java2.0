package modelo;

public class Persona {

    private String nombre;
    private String documento;
    private int edad;

    public Persona(String nombre, String documento, int edad) {

        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Edad: " + edad);

    }

}