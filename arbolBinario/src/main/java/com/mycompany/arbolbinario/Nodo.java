
package com.mycompany.arbolbinario;

public class Nodo {
    String autor;
    private String titulo;
    private String tema;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(String autor, String titulo, String tema) {
        this.autor = autor;
        this.titulo = titulo;
        this.tema = tema;
        this.izquierda = null;
        this.derecha = null;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    
}
