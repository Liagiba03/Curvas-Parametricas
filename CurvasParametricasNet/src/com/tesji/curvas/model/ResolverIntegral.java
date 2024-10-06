
package com.tesji.curvas.model;

import com.singularsys.jep.JepException;

public class ResolverIntegral {
    double a;
    double b;
    int n=1000;
    String funcion;
    Double result;
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public void setN(int n){
        this.n = n;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public Double getResult() {
        return result;
    }
    
    
    public double Resolver() throws JepException{
        ParsearEcuacion parseo= new ParsearEcuacion();
        parseo.setFuncion(funcion);
        Double areaT =0.0;
        double u = (Math.abs(a)+Math.abs(b))/n;
        for(double i = a; i<=b; i=i+u){
            parseo.setValorT(i);
            parseo.evaluar();
            Double area =parseo.getResult() *u;
            areaT += area;
            
        }
        return areaT;
    }
}
