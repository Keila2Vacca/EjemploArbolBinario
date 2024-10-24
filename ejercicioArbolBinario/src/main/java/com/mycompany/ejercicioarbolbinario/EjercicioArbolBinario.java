package com.mycompany.ejercicioarbolbinario;

public class EjercicioArbolBinario {

    private Nodo raiz;

    public EjercicioArbolBinario() {
        raiz = null;
    }

    // Método para insertar un nodo en el árbol
    public void insertar(String caracteristica, String valor, NodoProducto producto) {
        Nodo nuevo = new Nodo(caracteristica, valor);
        nuevo.getProductos().agregar(producto);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            insertarRecursivo(raiz, nuevo);
        }
    }

    // Método recursivo para insertar un nodo en el árbol
    private void insertarRecursivo(Nodo actual, Nodo nuevo) {
        if (nuevo.getValor().compareTo(actual.getValor()) < 0) {
            if (actual.getIzquierda() == null) {
                actual.setIzquierda(nuevo);
            } else {
                insertarRecursivo(actual.getIzquierda(), nuevo);
            }
        } else {
            if (actual.getDerecha() == null) {
                actual.setDerecha(nuevo);
            } else {
                insertarRecursivo(actual.getDerecha(), nuevo);
            }
        }
    }

    // Método para buscar productos similares en el árbol
    public ListaProductos buscarProductosSimilares(String caracteristica, String valor) {
        return buscarRecursivo(raiz, caracteristica, valor);
    }

    // Método recursivo para buscar productos similares en el árbol
    private ListaProductos buscarRecursivo(Nodo actual, String caracteristica, String valor) {
        if (actual == null) {
            return null;
        }
        if (actual.getCaracteristica().equals(caracteristica) && actual.getValor().equals(valor)) {
            return actual.getProductos();
        }
        ListaProductos resultado = buscarRecursivo(actual.getIzquierda(), caracteristica, valor);
        if (resultado != null) {
            return resultado;
        }
        return buscarRecursivo(actual.getDerecha(), caracteristica, valor);
    }
}
