package com.tesji.curvas.model;

import com.singularsys.jep.JepException;
import org.nfunk.jep.JEP;

public class ParsearEcuacion {
    private String funcion= "";
    private double result= 0.0;
    private double valorT = 0.0;
    private String error = "";
    JEP jep;

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public void setValorT(double valorT) {
        this.valorT = valorT;
    }

    public double getResult() {
        return result;
    }

    public String getError() {
        return error;
    }
    
    public void evaluar() throws JepException{
        jep = new JEP();
        this.jep.addStandardFunctions();
        this.jep.addStandardConstants();
        this.jep.addVariable("t",this.valorT);
        this.jep.parseExpression(this.funcion);
        this.result = this.jep.getValue();
        
        //Para los errores
        
        this.error = (this.jep.hasError())? "Existe un error.": "No hay error";
    }
}
