package com.pruebas.beans;

/**
 * Created by pepesan on 7/5/16.
 */
public class Pedido {

    private String pedido;

    public Pedido() {
        this.pedido = "";
    }

    public Pedido(String pedido) {
        this.pedido = pedido;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
}
