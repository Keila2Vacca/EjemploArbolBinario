package com.mycompany.ejercicioarbolbinario;

public class Nodo {

    private String caracteristica;
    private String valor;
    private Nodo izquierda;
    private Nodo derecha;
    private ListaProductos productos;

    public Nodo(String caracteristica, String valor) {
        this.caracteristica = caracteristica;
        this.valor = valor;
        izquierda = null;
        derecha = null;
        productos = new ListaProductos();
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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

    public ListaProductos getProductos() {
        return productos;
    }
}
