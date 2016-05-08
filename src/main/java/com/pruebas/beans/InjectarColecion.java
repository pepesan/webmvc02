package com.pruebas.beans;

import java.util.List;
import java.util.Set;

/**
 * Created by pepesan on 7/5/16.
 */
public class InjectarColecion {
    private List ciudades;
    private Set otrasCiudades;
    public InjectarColecion() {
        this.ciudades = null;
        this.otrasCiudades = null;
    }

    public InjectarColecion(List ciudades, Set otrasCiudades) {
        this.ciudades = ciudades;
        this.otrasCiudades = otrasCiudades;
    }

    public List getCiudades() {
        return ciudades;
    }

    public void setCiudades(List ciudades) {
        this.ciudades = ciudades;
    }

    public Set getOtrasCiudades() {
        return otrasCiudades;
    }

    public void setOtrasCiudades(Set otrasCiudades) {
        this.otrasCiudades = otrasCiudades;
    }
}
