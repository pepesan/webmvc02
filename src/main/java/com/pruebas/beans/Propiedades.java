package com.pruebas.beans;

import java.io.Serializable;

/**
 * Created by pepesan on 7/5/16.
 */
public class Propiedades implements Serializable {
    private String nombre;

    public Propiedades() {
        this.nombre = "";
    }

    public Propiedades(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Propiedades{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
