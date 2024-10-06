package com.tesji.curvas.model;

import java.awt.Color;

public class Espiral {
    double[][] valores = new double[11][3];
    public double []x = {0.0};
    public double []y = {0.0};
    public double []z = {0.0};
    //private double valores
	
    public void hacerArregloEspiral() {
    	Grafica3D graf = new Grafica3D();
    	Double nuevoX;
        Double nuevoY;
        Double nuevoZ;
        for(double i=0; i<11;i++) {
        	nuevoX= Math.cos(i); //Para X
        	nuevoY = Math.sin(i);//Para Y
        	nuevoZ= i; //Para Z
        	
            double arrayX[] = agregarValor(x,nuevoX);
            double arrayY[] = agregarValor(y,nuevoY);
            double arrayZ[] = agregarValor(z,nuevoZ);
            
            x= null;
            y=null;
            z=null;
            
            x=arrayX;
            y=arrayY;
            z= arrayZ;
        }
        graf.grafica3D.addLinePlot("Espiral", Color.red, x, y, z);
        /*for(int i=0; i<x.length;i++) {
        	System.out.print("valor x: "+i+" es: "+x[i]);
        	System.out.print("valor y: "+i+" es: "+y[i]);
        	System.out.print("valor z: "+i+" es: "+z[i]);
        	System.out.println();
        }*/
    }
	//Agregar valores de matriz para graficar
    public double[] agregarValor(double[]arr, double valor){
    	
        double []newA = new double[arr.length+1];
        
        for(int i=0; i<arr.length;i++){
            newA[i]=arr[i];
        }
        newA[newA.length-1] = valor;
        
        return newA;
    }
}