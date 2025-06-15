package libreria;

import java.util.ArrayList;

public class Libreria {

    private ArrayList<Libro> libs;

    public Libreria() {
        this.libs = new ArrayList<Libro>();
    }

    private int buscarLibro(String titulo, String autor){

        Libro buscado = new Libro( titulo, autor, 1);
        int valor = -1;

        for (int i = 0; i < libs.size(); i++) {
            if (((libs.get(i).getTitulo().toUpperCase()).equals(buscado.getTitulo().toUpperCase()))&&
                    ((libs.get(i).getAutor().toUpperCase()).equals(buscado.getAutor().toUpperCase()))){
                valor = i;
            }
        }
        return valor;
    }

    protected void anyadirLibro (Libro libro){
        for (int i = 0; i < libs.size(); i++) {
            if (((libro.getTitulo().toUpperCase()).equals(libs.get(i).getTitulo().toUpperCase()))&&
                    ((libro.getAutor().toUpperCase()).equals(libs.get(i).getAutor().toUpperCase()))){
                libs.remove(i);
                libs.add(i,libro);
            } else {
                libs.addLast(libro);
            }
        }
    }

    public void addLibro (String titulo, String autor, double precioBase){
        Libro libro = new Libro(autor,titulo,precioBase);
        anyadirLibro(libro);
    }

    public void remLibro (String titulo, String autor){
        if (buscarLibro(titulo,autor)==-1){
            throw new RuntimeException("Libro no encontrado ("+autor+", "+titulo+")");
        }
        libs.remove(buscarLibro(titulo,autor));
    }

    public double getPrecioFinal(String titulo, String autor){
        if (buscarLibro(titulo,autor)==-1){
            throw new RuntimeException("Libro no encontrado ("+autor+", "+titulo+")");
        }
        return libs.get(buscarLibro(titulo,autor)).getPrecioFinal();
    }

    public String toString(){
        String listado = "[";
        boolean first = true;

        for (Libro libro: libs){
            listado += libro.toString();
            listado += ", "; // En la ultima posicion falla
        }
        listado += "]";
        return listado;
    }
}
