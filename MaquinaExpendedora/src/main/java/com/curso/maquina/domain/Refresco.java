package com.curso.maquina.domain;

import java.io.Serializable;

public class Refresco implements Serializable {
	
	private String sabor;
	private double cl; 
    private double precio;
    private boolean agotado;
    private int stock;
    
    //Constructor
    public Refresco(double precio, String sabor, int stock, double cl) {
        this.precio = precio;
        this.sabor = sabor;
        this.stock = stock;
        this.cl = cl;
        if(stock <= 0 ){
            this.agotado = true;
        }
    }
 
    //Get,Set
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public int getStock() {
        return stock;
    }

    public boolean isAgotado() {
        return agotado;
    }

    public double getCl() {
        return cl;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Refresco{" + "precio=" + precio + ", sabor=" + sabor + ", stock=" + stock + ", agotado=" + agotado + ", cl=" + cl + '}';
    }
    
}
