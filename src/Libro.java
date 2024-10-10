
public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int paginaCount;

    // Constructor
    public Libro(String titulo, String autor, int paginaCount) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginaCount = paginaCount;
    }

    // Método
    public String infoLibro() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginaCount;
    }
}

