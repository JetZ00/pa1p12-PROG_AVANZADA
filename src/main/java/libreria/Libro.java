package libreria;

public class Libro {

    private final double porcIVA = 0.21;
    private String autor;
    private String titulo;
    private double precioBase;

    // CONSTRUCTOR
    public Libro(String autor, String titulo, double precioBase){
        this.autor = autor;
        this.titulo = titulo;
        this.precioBase = precioBase;
    }


}
