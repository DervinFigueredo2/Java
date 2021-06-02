package EjercicioMañana;

public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private boolean estaPrestado;

    public Libro() {
        this.estaPrestado = false;
    }

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.estaPrestado = false;
    }

    public void prestamo() {
        if (this.estaPrestado) {
            throw new RuntimeException("Este libro ya esta prestado!");
        }
        this.estaPrestado = true;
    }

    public void devolucion() {
        this.estaPrestado = false;
    }

    @Override
    public String toString() {
        return this.titulo + ", " + this.isbn + ", " + this.autor;
    }

    public boolean getEstaPrestado() {
        return this.estaPrestado;
    }
}