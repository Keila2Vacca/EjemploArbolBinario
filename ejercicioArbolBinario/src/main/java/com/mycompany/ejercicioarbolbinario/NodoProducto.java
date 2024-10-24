package com.mycompany.ejercicioarbolbinario;

public class NodoProducto {

    private String nombre;
    private String descripcion;

    public NodoProducto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
