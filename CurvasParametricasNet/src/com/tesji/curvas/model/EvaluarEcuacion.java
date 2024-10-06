package com.tesji.curvas.model;

import com.singularsys.jep.JepException;
import com.tesji.curvas.view.Grafica2D;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EvaluarEcuacion {
    ParsearEcuacion parsear = new ParsearEcuacion();
    
    public double[] crearArregloX(double inicioT, double finT, String funcionX){
        int rango = (int)(Math.abs((finT-inicioT)/0.4));
        double valoresX[]= new double[rango];
        double t= inicioT;
        parsear.setFuncion(funcionX);
        
        System.out.println("ArregloX");
        
        for(int i=0; i<rango ; t=t+0.4 ,i++){
            try {
                parsear.setValorT(t);
                parsear.evaluar();
                valoresX[i]= parsear.getResult();
                
                System.out.println("index:"+i+" valor: "+valoresX[i]);
                
            } catch (JepException ex) {
                Logger.getLogger(EvaluarEcuacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valoresX;
    }
    public double[] crearArregloY(double inicioT, double finT, String funcionY){
        int rango = (int)(Math.abs(finT-inicioT)/0.4);
        double valoresY[]= new double[rango];
        double t= inicioT;
        parsear.setFuncion(funcionY);
        
        System.out.println("ArregloY");
        
        for(int i=0; i<rango ; t=t+0.4 ,i++){
            try {
                parsear.setValorT(t);
                parsear.evaluar();
                valoresY[i]= parsear.getResult();
                
                 System.out.println("index:"+i+" valor: "+valoresY[i]);
                
            } catch (JepException ex) {
                Logger.getLogger(EvaluarEcuacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valoresY;
    }
    
    //GRAFICAR
    public void Graficar(double []arregloX, double[] arregloY){
        Grafica2D grafica = new Grafica2D();
        grafica.plot.addLegend("SOUTH");
        grafica.plot.addLinePlot("Grafica",arregloX,arregloY);
    }
}
