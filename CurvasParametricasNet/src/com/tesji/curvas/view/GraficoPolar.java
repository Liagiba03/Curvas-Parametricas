
package com.tesji.curvas.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class GraficoPolar implements ActionListener{
    
    String titulo = "GRAFICO POLAR";
    XYSeriesCollection datos = new XYSeriesCollection();
    private int polar;
     JButton btnRegresar = new JButton("Regresar");
    JFrame espaGrafica;
    JFreeChart grafica = ChartFactory.createPolarChart(titulo, datos, true, true, true); 
    
    
    public void setDatos(XYSeriesCollection datos) {
        this.datos = datos;
    }
    
    public GraficoPolar(){
         espaGrafica=new JFrame();
        espaGrafica.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        espaGrafica.setSize(600,600);
        espaGrafica.add(panelGrafica());
        espaGrafica.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent evt){
        espaGrafica.dispose();
    }
    
    public JPanel panelGrafica(){
        JPanel principal= new ChartPanel(grafica);
        principal.setLayout(new BorderLayout());
        principal.add(btnRegresar,BorderLayout.SOUTH);
        btnRegresar.addActionListener((ActionListener) this);
        return principal;
    }
    
    public void agregarGrafica(double[]x, double[]y){
        int n= x.length;
        XYSeries s = new XYSeries("Polar");
        for(int i=0; i<n;i++){
            s.add(x[i],y[i]);
        }
        datos.addSeries(s);
    }
    
    public static void main (String[]ar){
        new Grafica2D();
    }
}
