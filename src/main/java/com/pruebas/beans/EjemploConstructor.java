package com.pruebas.beans;

/**
 * Created by pepesan on 7/5/16.
 */
public class EjemploConstructor {
    private Pedido pedido;
    private String lema;

    public EjemploConstructor(Pedido pedido, String lema) {
        this.pedido = pedido;
        this.lema = lema;
    }
}
