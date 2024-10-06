package com.tesji.curvas.model;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.math.plot.Plot3DPanel;

public class Grafica3D implements ActionListener{
	public double []x = {0.0,0.0};
    public double []y = {0.0,0.0};
    public double []z = {0.0,0.0};
    Plot3DPanel grafica3D= new Plot3DPanel("SOUTH");
    JButton btnRegresar = new JButton("Regresar");
    JFrame espaGrafica;
    //Interfaz inter = new Interfaz();
    
    public Grafica3D(){
        espaGrafica=new JFrame();
        espaGrafica.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        espaGrafica.setSize(600,600);
        espaGrafica.add(panelGrafica());
        espaGrafica.setVisible(true);
        //grafica3D.addLinePlot("Vector", Color.BLUE, x, y, z);
    }
    
    public void actionPerformed(ActionEvent evt){
	
        espaGrafica.dispose();
    }
    //MÉTODO CREAR LA GRÁFICA PARA CURVA
    
    public JPanel panelGrafica(){
        JPanel principal= new JPanel();
        principal.setLayout(new BorderLayout());
        principal.add(grafica3D,BorderLayout.CENTER);
        principal.add(btnRegresar,BorderLayout.SOUTH);
        btnRegresar.addActionListener((ActionListener) this);
        return principal;
    }
    //MÉTODO HACER EL ARREGLO
    public double[] hacerArreglo(double[]arr, double valor){
        double []newA = new double[arr.length];
        
        for(int i=0; i<arr.length;i++){
            newA[i]=arr[i];
        }
        newA[newA.length-1] = valor;
        
        return newA;
    }
    
    public static void main (String[]ar){
        new Grafica3D();
    }
}