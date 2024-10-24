package com.mycompany.arbolbinario;

import javax.swing.JOptionPane;

public class Arbol {

    Nodo inicial;

    // Constructor correcto
    public Arbol() {
        this.inicial = null;
    }

    public void insertar() {
        String valor = JOptionPane.showInputDialog(null, "Ingrese el valor que va a ingresar");
        try {
            int numero = Integer.parseInt(valor);
            if (this.inicial == null) {
                this.inicial = new Nodo(numero);
            } else {
                this.inicial.insertar(numero);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El dato que ingreso no es valido, por favor solamente ingrese numeros enteros");
        }
    }

    // Preorden: raíz -> izquierda -> derecha
    public String dispararPreorden() {
        return preorden(this.inicial).trim(); // Trim para evitar espacios o comas extra al final
    }

    public String preorden(Nodo nodo) {
        if (nodo == null) {
            return "";
        } else {
            String resultado = nodo.getValor() + ", ";
            resultado += preorden(nodo.getNodoIzq());
            resultado += preorden(nodo.getNodoDerecho());
            return resultado;
        }
    }

    // Inorden: izquierda -> raíz -> derecha
    public String dispararInorden() {
        return inorden(this.inicial).trim();
    }

    public String inorden(Nodo nodo) {
        if (nodo == null) {
            return "";
        } else {
            String resultado = inorden(nodo.getNodoIzq());
            resultado += nodo.getValor() + ", ";
            resultado += inorden(nodo.getNodoDerecho());
            return resultado;
        }
    }

    public String dispararPostorden() {
        return postorden(this.inicial);
    }

    private String postorden(Nodo nodo) {
        if (nodo == null) {
            return ""; // Caso base
        } else {
            String resultado = postorden(nodo.getNodoIzq());
            resultado += postorden(nodo.getNodoDerecho());
            resultado += nodo.getValor() + ", ";
            return resultado;
        }
    }
}
