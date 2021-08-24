package com.curso.maquina;

import com.curso.maquina.domain.Maquina;
import com.curso.maquina.domain.Refresco;

public class Application
{
	public static void main( String[] args )
	{

        Refresco cocaCola = new Refresco(10, "Coca-Cola", 5, 150.0);

        System.out.println("Maquina con 5 latas");
        Maquina maquina = new Maquina(cocaCola);
        
        System.out.println("Vendemos 4 latas");
        maquina.vender();
        maquina.vender();
        maquina.vender();
        maquina.vender();
        System.out.println(maquina);
        
        System.out.println("Reponemos 5 latas mas ");
        
        maquina.reponer(5);
        System.out.println(maquina);
        
	}
}