package com.curso.maquina.domain;

import java.io.Serializable;

public class Maquina implements Serializable {

	private int vendido;
	private Refresco refresco;
	
	
	public Maquina( Refresco refresco) {
		super();
		this.vendido = vendido;
		this.refresco = refresco;
	}
	
	
	public int getVendido() {
		return vendido;
	}
	public void setVendido(int vendido) {
		this.vendido = vendido;
	}
	public Refresco getRefresco() {
		return refresco;
	}
	public void setRefresco(Refresco refresco) {
		this.refresco = refresco;
	}
	
	public void vender(){
       
        if( this.refresco.getStock() > 0){
            System.out.println("Lata vendida");
            
           
            this.refresco.setStock( this.refresco.getStock() - 1);
            vendido ++;
        }
    }
	
	 public void reponer(int repuesto){
	  
	       int stock = this.refresco.getStock();
	       stock = stock + repuesto;
	       this.refresco.setStock(stock);
	       
	        System.out.println("Has añadido " + repuesto + "latas");   
	    }
	 
	 @Override
	    public String toString() {
	        return "Maquina expendedora " + "latas disponibles= " + this.refresco.getStock() +" refrescosVendidos= " + vendido ;
	    }
	 
}
