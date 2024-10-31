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
    public ListaProductos buscarProductosSimilares(String caracteristica) {
        return buscarRecursivo(raiz, caracteristica);
    }

    // Método recursivo para buscar productos similares en el árbol
    private ListaProductos buscarRecursivo(Nodo actual, String caracteristica) {
        if (actual == null) {
            return null;
        }
        if (actual.getCaracteristica().equals(caracteristica)) {
            return actual.getProductos();
        }
        ListaProductos resultado = buscarRecursivo(actual.getIzquierda(), caracteristica);
        if (resultado != null) {
            return resultado;
        }
        return buscarRecursivo(actual.getDerecha(), caracteristica);
    }

    public void recorrerInOrden() {
        System.out.println("Recorrido en orden:");
        recorrerInOrdenRecursivo(raiz);
    }

    private void recorrerInOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            recorrerInOrdenRecursivo(nodo.getIzquierda());
            System.out.println(nodo.getProductos());
            recorrerInOrdenRecursivo(nodo.getDerecha());
        }
    }

    public void recorrerPreOrden() {
        System.out.println("Recorrido en preorden:");
        recorrerPreOrdenRecursivo(raiz);
    }

    private void recorrerPreOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo.getProductos());
            recorrerPreOrdenRecursivo(nodo.getIzquierda());
            recorrerPreOrdenRecursivo(nodo.getDerecha());
        }
    }

    public void recorrerPostOrden() {
        System.out.println("Recorrido en postorden:");
        recorrerPostOrdenRecursivo(raiz);
    }

    private void recorrerPostOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            recorrerPostOrdenRecursivo(nodo.getIzquierda());
            recorrerPostOrdenRecursivo(nodo.getDerecha());
            System.out.println(nodo.getProductos());
        }
    }
}
