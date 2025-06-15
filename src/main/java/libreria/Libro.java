package libreria;

public class Libro {

    private static double porcIVA = 10.0;
    private String autor;
    private String titulo;
    private double precioBase;

    // CONSTRUCTOR
    public Libro(String autor, String titulo, double precioBase){
        this.autor = autor;
        this.titulo = titulo;
        this.precioBase = precioBase;
    }

    // GETTERS
    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    protected double getBaseImponible() {
        return precioBase;
    }

    public static double getIVA(){
        return porcIVA;
    }

    public double getPrecioFinal() {
        return getBaseImponible()+((getBaseImponible()*porcIVA)/100);
    }

    public String toString(){
        return "("+getAutor()+"; "+getTitulo()+"; "+getPrecioBase()+"; "+getIVA()+"%; "+getPrecioFinal()+")";
    }

    public static void setPorcIVA(double porcIVA) {
        Libro.porcIVA = porcIVA;
    }
}
