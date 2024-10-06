
package com.tesji.curvas.model;

import com.singularsys.jep.JepException;
import com.tesji.curvas.view.GraficoPolar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FuncionesPolares {
    Double x;
    Double y;
    Double r;
    Double angulo;
    ParsearEcuacion parsear = new ParsearEcuacion();
    

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getR() {
        return r;
    }

    public Double getAngulo() {
        return angulo;
    }
    
    public void puntosPolares(){
        double r[]= new double[1];
        double a[]= new double[1];
        GraficoPolar grafico = new GraficoPolar();
        r[0] = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        this.r=r[0];
        a[0] = Math.toDegrees(Math.atan(y/x));
        angulo=a[0];
        grafico.agregarGrafica(a, r);
    }
    
    public void graficoPlano(double inicioT, double finT, String funcion){
        int rango = (int)(Math.abs(finT-inicioT)/0.4);
        GraficoPolar grafico = new GraficoPolar();
        double r[]= new double[rango];
        double a[]= new double[rango];
        double t= inicioT;
        parsear.setFuncion(funcion);
        
        for(int i=0; i<rango ; t=t+0.4 ,i++){
            try {
                parsear.setValorT(t);
                parsear.evaluar();
                r[i]= parsear.getResult();
                a[i]=t;
                //System.out.println("dato : "+r[i]+" t :"+t);
                
            } catch (JepException ex) {
                Logger.getLogger(EvaluarEcuacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        grafico.agregarGrafica(a,r);
        
    }
    
    public void graficoParametrizado(double inicioT, double finT, String funcionRadio, String funcionAngulo){
        int rango = (int)(Math.abs(finT-inicioT)/1);
        GraficoPolar grafico = new GraficoPolar();
        double r[]= new double[rango];
        double a[]= new double[rango];
        double t= inicioT;
        parsear.setFuncion(funcionRadio);
        for(int i=0; i<rango ; t=t+1 ,i++){
            try {
                parsear.setValorT(t);
                parsear.evaluar();
                r[i]= Math.toDegrees(parsear.getResult());
                //a[i]=t;
                System.out.println("cos : "+r[i]);
                
            } catch (JepException ex) {
                Logger.getLogger(EvaluarEcuacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        parsear.setFuncion(funcionAngulo);
        for(int i=0; i<rango ; t=t+1 ,i++){
            try {
                parsear.setValorT(t);
                parsear.evaluar();
                a[i]=Math.toDegrees(parsear.getResult());
                System.out.println("sen : "+a[i]+" t :"+t);
                
            } catch (JepException ex) {
                Logger.getLogger(EvaluarEcuacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        grafico.agregarGrafica(r, a);
    }
}
