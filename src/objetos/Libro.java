package objetos;

public class Libro {

    private String titulo;
    private String autor;
    private int anyopublicacion;
    private String editorial;
    private String isbn;

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public Libro(String titulo, String autor, int anyopublicacion, String editorial, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anyopublicacion = anyopublicacion;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }


    public int getAnyopublicacion() {
        return anyopublicacion;
    }

    public void setAnyopublicacion(int anyopublicacion) {
        this.anyopublicacion = anyopublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        String comprobarAutor = autor != null ? autor : "sin autor";
        return "Libro{ " +
                "titulo= '" + titulo + '\'' +
                ", autor= '" + autor + '\'' +
                ", anyopublicacion= " + anyopublicacion +
                ", editorial= '" + editorial + '\'' +
                ", isbn= '" + isbn + '\'' +
                '}';
    }
}
