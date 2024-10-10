public class Main {
    public static void main(String[] args) {
        // Creación de objetos Persona
        Persona persona1 = new Persona("Juan", 25, "Masculino");
        Persona persona2 = new Persona("Ana", 30, "Femenino");

        // Llamada al método presentarse
        persona1.presentarse();
        persona2.presentarse();



        // Creación de objetos Libro
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 417);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);

        // Mostrar la información de los libros usando el método infoLibro
        System.out.println(libro1.infoLibro());
        System.out.println(libro2.infoLibro());


    }
}

