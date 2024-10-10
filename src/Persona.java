
public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private String genero;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Método para presentarse
    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }
}


