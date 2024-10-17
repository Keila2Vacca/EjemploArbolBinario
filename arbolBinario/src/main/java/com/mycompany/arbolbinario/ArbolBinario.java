package com.mycompany.arbolbinario;

public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Método para insertar un nodo en el árbol
    public void insertar(String autor, String titulo, String tema) {
        Nodo nuevo = new Nodo(autor, titulo, tema);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            insertarRecursivo(raiz, nuevo);
        }
    }

    // Método recursivo para insertar un nodo en el árbol
    private void insertarRecursivo(Nodo actual, Nodo nuevo) {
        if (nuevo.getAutor().compareTo(actual.getAutor()) < 0) {
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

    // Método para buscar libros según su título o tema
    public Nodo buscar(String titulo, String tema) {
        return buscarRecursivo(raiz, titulo, tema);
    }

    // Método recursivo para buscar libros según su título o tema
    private Nodo buscarRecursivo(Nodo actual, String titulo, String tema) {
        if (actual == null) {
            return null;
        }
        if (actual.getTitulo().equals(titulo) || actual.getTema().equals(tema)) {
            return actual;
        }
        Nodo resultado = buscarRecursivo(actual.getIzquierda(), titulo, tema);
        if (resultado != null) {
            return resultado;
        }
        return buscarRecursivo(actual.getDerecha(), titulo, tema);
    }

    // Método para eliminar un libro del árbol
    public void eliminar(String autor, String titulo) {
        raiz = eliminarRecursivo(raiz, autor, titulo);
    }

    // Método recursivo para eliminar un libro del árbol
    private Nodo eliminarRecursivo(Nodo actual, String autor, String titulo) {
        if (actual == null) {
            return null;
        }
        if (actual.getAutor().equals(autor) && actual.getTitulo().equals(titulo)) {
            if (actual.getIzquierda() == null && actual.getDerecha() == null) {
                return null;
            } else if (actual.getIzquierda() == null) {
                return actual.getDerecha();
            } else if (actual.getDerecha() == null) {
                return actual.getIzquierda();
            } else {
                Nodo aux = encontrarMinimo(actual.getDerecha());
                actual.setTitulo(aux.getTitulo());
                actual.setAutor(aux.getAutor());
                actual.setTema(aux.getTema());
                actual.setDerecha(eliminarRecursivo(actual.getDerecha(), aux.getAutor(), aux.getTitulo()));
            }
        } else if (autor.compareTo(actual.getAutor()) < 0) {
            actual.setIzquierda(eliminarRecursivo(actual.getIzquierda(), autor, titulo));
        } else {
            actual.setDerecha(eliminarRecursivo(actual.getDerecha(), autor, titulo));
        }
        return actual;
    }
    
    // Método para encontrar el nodo mínimo en un subárbol

    private Nodo encontrarMinimo(Nodo actual) {
        // Se recorre hacia la izquierda hasta encontrar el nodo más pequeño
        while (actual.getIzquierda() != null) {
            actual = actual.getIzquierda();
        }
        return actual;
    }
}
