package com.mycompany.ejercicioarbolbinario;

public class ListaProductos {

    private NodoProducto[] productos;
    private int tamaño;

    public ListaProductos() {
        productos = new NodoProducto[10];
        tamaño = 0;
    }

    public void agregar(NodoProducto producto) {
        if (tamaño < productos.length) {
            productos[tamaño] = producto;
            tamaño++;
        }
    }

    public int getTamaño() {
        return tamaño;
    }

    public NodoProducto[] getProductos() {
        return productos;
    }
}
