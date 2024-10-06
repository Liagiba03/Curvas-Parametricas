package com.tesji.curvas.view;

import com.singularsys.jep.JepException;
import com.tesji.curvas.model.EvaluarEcuacion;
import com.tesji.curvas.model.FuncionesPolares;
import com.tesji.curvas.model.ResolverIntegral;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEcuacionX = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEcuacionY = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtInicioT = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtFinT = new javax.swing.JTextPane();
        btnBorrar = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtEcuacion = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtIntervaloA = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtIntervaloB = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtCuadros = new javax.swing.JTextPane();
        jLabel14 = new javax.swing.JLabel();
        btnBorrar1 = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtIntegral = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtPuntoX = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtPuntoY = new javax.swing.JTextPane();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtR = new javax.swing.JTextPane();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtTeta = new javax.swing.JTextPane();
        btnGraficarPP = new javax.swing.JButton();
        btnBorrar2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtRAngulo = new javax.swing.JTextPane();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtInicioAngulo = new javax.swing.JTextPane();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtFinAngulo = new javax.swing.JTextPane();
        jLabel28 = new javax.swing.JLabel();
        btnGraficarFuncionesP = new javax.swing.JButton();
        btnBorrar3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtFuncionT = new javax.swing.JTextPane();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        txtFuncionA = new javax.swing.JTextPane();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtRInicioT = new javax.swing.JTextPane();
        jScrollPane20 = new javax.swing.JScrollPane();
        txtRFinT = new javax.swing.JTextPane();
        jLabel34 = new javax.swing.JLabel();
        btnGraficarFP = new javax.swing.JButton();
        btnBorrar4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(29, 41, 72));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(61, 116, 136));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ECUACIONES PARÁMETRICAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(93, 93, 93))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 6, 360, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ECUACIONES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 52, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X =");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 80, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Y =");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 122, -1, -1));

        txtEcuacionX.setBackground(java.awt.SystemColor.textInactiveText);
        txtEcuacionX.setForeground(new java.awt.Color(255, 255, 255));
        txtEcuacionX.setToolTipText("Solo variable t en función");
        jScrollPane1.setViewportView(txtEcuacionX);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 80, 81, -1));

        txtEcuacionY.setBackground(java.awt.SystemColor.textInactiveText);
        txtEcuacionY.setForeground(new java.awt.Color(255, 255, 255));
        txtEcuacionY.setToolTipText("Solo variable t en función");
        jScrollPane2.setViewportView(txtEcuacionY);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 122, 81, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>Intervalo<p> de t</html>");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 168, 60, -1));

        txtInicioT.setBackground(java.awt.SystemColor.textInactiveText);
        txtInicioT.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(txtInicioT);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 168, 81, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Inicio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 168, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fin");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 211, -1, -1));

        txtFinT.setBackground(java.awt.SystemColor.textInactiveText);
        txtFinT.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(txtFinT);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 211, 81, -1));

        btnBorrar.setBackground(new java.awt.Color(240, 146, 154));
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 130, 88, -1));

        btnGraficar.setBackground(new java.awt.Color(240, 146, 154));
        btnGraficar.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGraficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 80, 88, -1));

        jPanel3.setBackground(new java.awt.Color(61, 116, 136));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LONGITUD DE UNA CURVA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(105, 105, 105))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 265, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ECUACIÓN");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 311, -1, -1));

        txtEcuacion.setBackground(java.awt.SystemColor.textInactiveText);
        txtEcuacion.setForeground(new java.awt.Color(255, 255, 255));
        txtEcuacion.setToolTipText("<html>Solo variable t en función<p>Sustituye x por t en las funciones</html>");
        jScrollPane5.setViewportView(txtEcuacion);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 311, 117, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("INTERVALOS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 354, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("a =");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 379, -1, -1));

        txtIntervaloA.setBackground(java.awt.SystemColor.textInactiveText);
        txtIntervaloA.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setViewportView(txtIntervaloA);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 379, 56, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("b =");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 421, -1, -1));

        txtIntervaloB.setBackground(java.awt.SystemColor.textInactiveText);
        txtIntervaloB.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(txtIntervaloB);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 421, 56, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("<html>Número de<p>cuadros</html>");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 379, 60, -1));

        txtCuadros.setBackground(java.awt.SystemColor.textInactiveText);
        txtCuadros.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setViewportView(txtCuadros);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 379, 56, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("<html>Longitud<p>(Integral)</html>");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 64, -1));

        btnBorrar1.setBackground(new java.awt.Color(240, 146, 154));
        btnBorrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar1.setText("Borrar");
        btnBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 475, -1, -1));

        btnCalcular.setBackground(new java.awt.Color(240, 146, 154));
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 475, -1, -1));

        txtIntegral.setBackground(java.awt.SystemColor.textInactiveText);
        txtIntegral.setColumns(20);
        txtIntegral.setForeground(new java.awt.Color(255, 255, 255));
        txtIntegral.setRows(5);
        jScrollPane9.setViewportView(txtIntegral);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 417, 119, 46));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel4.setBackground(new java.awt.Color(29, 41, 72));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(61, 116, 136));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("GRAFICAR PUNTOS POLARES");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 380, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("<html>Coordenadas<p>polares<html>");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 30));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("<html>Coordenadas<p>rectangulares<html>");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("X =");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtPuntoX.setBackground(java.awt.SystemColor.textInactiveText);
        txtPuntoX.setForeground(new java.awt.Color(255, 255, 255));
        txtPuntoX.setToolTipText("Solo variable t en función");
        jScrollPane10.setViewportView(txtPuntoX);

        jPanel4.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 81, -1));

        txtPuntoY.setBackground(java.awt.SystemColor.textInactiveText);
        txtPuntoY.setForeground(new java.awt.Color(255, 255, 255));
        txtPuntoY.setToolTipText("Solo variable t en función");
        jScrollPane11.setViewportView(txtPuntoY);

        jPanel4.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 81, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Y =");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("r =");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        txtR.setEditable(false);
        txtR.setBackground(java.awt.SystemColor.textInactiveText);
        txtR.setForeground(new java.awt.Color(255, 255, 255));
        txtR.setToolTipText("Solo variable t en función");
        jScrollPane12.setViewportView(txtR);

        jPanel4.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 85, 81, 40));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("angulo =");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        txtTeta.setEditable(false);
        txtTeta.setBackground(java.awt.SystemColor.textInactiveText);
        txtTeta.setForeground(new java.awt.Color(255, 255, 255));
        txtTeta.setToolTipText("Solo variable t en función");
        jScrollPane13.setViewportView(txtTeta);

        jPanel4.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 81, 40));

        btnGraficarPP.setBackground(new java.awt.Color(240, 146, 154));
        btnGraficarPP.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficarPP.setText("<html>CALCULAR<p>Y GRAFICAR<html>");
        btnGraficarPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarPPActionPerformed(evt);
            }
        });
        jPanel4.add(btnGraficarPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 88, -1));

        btnBorrar2.setBackground(new java.awt.Color(240, 146, 154));
        btnBorrar2.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar2.setText("Borrar");
        btnBorrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar2ActionPerformed(evt);
            }
        });
        jPanel4.add(btnBorrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 88, -1));

        jPanel9.setBackground(new java.awt.Color(61, 116, 136));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("FUNCIONES POLARES");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(105, 105, 105))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addContainerGap())
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 248, 370, 30));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("<html>Sustituir tetha por<p>t al escribir<html>");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        txtRAngulo.setBackground(java.awt.SystemColor.textInactiveText);
        txtRAngulo.setForeground(new java.awt.Color(255, 255, 255));
        txtRAngulo.setToolTipText("Solo variable t en función");
        jScrollPane14.setViewportView(txtRAngulo);

        jPanel4.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 81, -1));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("<html>Intervalo<p> de angulo</html>");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 60, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Inicio");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        txtInicioAngulo.setBackground(java.awt.SystemColor.textInactiveText);
        txtInicioAngulo.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane15.setViewportView(txtInicioAngulo);

        jPanel4.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 81, -1));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Fin");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        txtFinAngulo.setBackground(java.awt.SystemColor.textInactiveText);
        txtFinAngulo.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane16.setViewportView(txtFinAngulo);

        jPanel4.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 81, -1));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("r(angulo) =");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        btnGraficarFuncionesP.setBackground(new java.awt.Color(240, 146, 154));
        btnGraficarFuncionesP.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficarFuncionesP.setText("Graficar");
        btnGraficarFuncionesP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarFuncionesPActionPerformed(evt);
            }
        });
        jPanel4.add(btnGraficarFuncionesP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 88, -1));

        btnBorrar3.setBackground(new java.awt.Color(240, 146, 154));
        btnBorrar3.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar3.setText("Borrar");
        btnBorrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar3ActionPerformed(evt);
            }
        });
        jPanel4.add(btnBorrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 88, -1));

        jPanel10.setBackground(new java.awt.Color(61, 116, 136));

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("FUNCIONES POLARES");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(105, 105, 105))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addContainerGap())
        );

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 370, -1));

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("r(t) =");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        txtFuncionT.setBackground(java.awt.SystemColor.textInactiveText);
        txtFuncionT.setForeground(new java.awt.Color(255, 255, 255));
        txtFuncionT.setToolTipText("Solo variable t en función");
        jScrollPane17.setViewportView(txtFuncionT);

        jPanel4.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 81, -1));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("<html>angulo =<p>funcion<html>");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        txtFuncionA.setBackground(java.awt.SystemColor.textInactiveText);
        txtFuncionA.setForeground(new java.awt.Color(255, 255, 255));
        txtFuncionA.setToolTipText("Solo variable t en función");
        jScrollPane18.setViewportView(txtFuncionA);

        jPanel4.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 81, -1));

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("<html>Rango<p> de t</html>");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 60, -1));

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Inicio");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        txtRInicioT.setBackground(java.awt.SystemColor.textInactiveText);
        txtRInicioT.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane19.setViewportView(txtRInicioT);

        jPanel4.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 81, -1));

        txtRFinT.setBackground(java.awt.SystemColor.textInactiveText);
        txtRFinT.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane20.setViewportView(txtRFinT);

        jPanel4.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 81, -1));

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Fin");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));

        btnGraficarFP.setBackground(new java.awt.Color(240, 146, 154));
        btnGraficarFP.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficarFP.setText("Graficar");
        btnGraficarFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarFPActionPerformed(evt);
            }
        });
        jPanel4.add(btnGraficarFP, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 88, -1));

        btnBorrar4.setBackground(new java.awt.Color(240, 146, 154));
        btnBorrar4.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar4.setText("Borrar");
        btnBorrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrar4ActionPerformed(evt);
            }
        });
        jPanel4.add(btnBorrar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 88, -1));

        jTabbedPane1.addTab("tab2", jPanel4);

        jPanel7.setBackground(new java.awt.Color(29, 41, 72));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));

        btnSalir.setBackground(new java.awt.Color(240, 146, 154));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtEcuacionX.setText(null);
        txtEcuacionY.setText(null);
        txtInicioT.setText(null);
        txtFinT.setText(null);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar1ActionPerformed
        txtEcuacion.setText(null);
        txtIntervaloA.setText(null);
        txtIntervaloB.setText(null);
        txtCuadros.setText(null);
        txtIntegral.setText(null);
    }//GEN-LAST:event_btnBorrar1ActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        EvaluarEcuacion eval = new EvaluarEcuacion();
        String ecuacionX = txtEcuacionX.getText().trim();
        String ecuacionY = txtEcuacionY.getText().trim();
        String inT = txtInicioT.getText().trim();
        String finT = txtFinT.getText().trim();
        
        eval.Graficar(
                eval.crearArregloX(Double.parseDouble(inT), Double.parseDouble(finT), ecuacionX), 
                eval.crearArregloY(Double.parseDouble(inT), Double.parseDouble(finT), ecuacionY));
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        ResolverIntegral integral = new ResolverIntegral();
        String integrando = txtEcuacion.getText().trim();
        String a = txtIntervaloA.getText().trim();
        String b = txtIntervaloB.getText().trim();
        String cuadros = txtCuadros.getText().trim();
        
        integral.setA(Double.parseDouble(a));
        integral.setB(Double.parseDouble(b));
        integral.setFuncion(integrando);
        integral.setN(Integer.parseInt(cuadros));
        
        
        try {
            txtIntegral.setText(String.valueOf(integral.Resolver()));
        } catch (JepException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnGraficarPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarPPActionPerformed
        FuncionesPolares fun = new FuncionesPolares();
        String x =txtPuntoX.getText().trim();
        String y = txtPuntoY.getText().trim();
        
        fun.setX(Double.parseDouble(x));
        fun.setY(Double.parseDouble(y));
        fun.puntosPolares();
        txtR.setText(String.valueOf(fun.getR()));
        txtTeta.setText(String.valueOf(fun.getAngulo()));
    }//GEN-LAST:event_btnGraficarPPActionPerformed

    private void btnBorrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar2ActionPerformed
        txtPuntoX.setText(null);
        txtPuntoY.setText(null);
        txtR.setText(null);
        txtTeta.setText(null);
    }//GEN-LAST:event_btnBorrar2ActionPerformed

    private void btnGraficarFuncionesPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarFuncionesPActionPerformed
        FuncionesPolares fun = new FuncionesPolares();
        String funcionR = txtFuncionT.getText().trim();
        String funcionA = txtFuncionA.getText().trim();
        String inicio= txtRInicioT.getText().trim();
        String fin = txtRFinT.getText().trim();
        fun.graficoParametrizado(Double.parseDouble(inicio), 
                Double.parseDouble(fin), funcionR, funcionA);
        
    }//GEN-LAST:event_btnGraficarFuncionesPActionPerformed

    private void btnBorrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar3ActionPerformed
        txtFuncionT.setText(null);
        txtFuncionA.setText(null);
        txtRInicioT.setText(null);
        txtFinT.setText(null);
    }//GEN-LAST:event_btnBorrar3ActionPerformed

    private void btnGraficarFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarFPActionPerformed
       FuncionesPolares fun = new FuncionesPolares();
        String funcion = txtRAngulo.getText().trim();
       String inicio = txtInicioAngulo.getText().trim();
       String fin = txtFinAngulo.getText().trim();
       
       fun.graficoPlano(Double.parseDouble(inicio),
               Double.parseDouble(fin), funcion);
    }//GEN-LAST:event_btnGraficarFPActionPerformed

    private void btnBorrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrar4ActionPerformed
        txtRAngulo.setText(null);
        txtInicioAngulo.setText(null);
        txtFinAngulo.setText(null);
    }//GEN-LAST:event_btnBorrar4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrar1;
    private javax.swing.JButton btnBorrar2;
    private javax.swing.JButton btnBorrar3;
    private javax.swing.JButton btnBorrar4;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnGraficarFP;
    private javax.swing.JButton btnGraficarFuncionesP;
    private javax.swing.JButton btnGraficarPP;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane txtCuadros;
    private javax.swing.JTextPane txtEcuacion;
    private javax.swing.JTextPane txtEcuacionX;
    private javax.swing.JTextPane txtEcuacionY;
    private javax.swing.JTextPane txtFinAngulo;
    private javax.swing.JTextPane txtFinT;
    private javax.swing.JTextPane txtFuncionA;
    private javax.swing.JTextPane txtFuncionT;
    private javax.swing.JTextPane txtInicioAngulo;
    private javax.swing.JTextPane txtInicioT;
    private javax.swing.JTextArea txtIntegral;
    private javax.swing.JTextPane txtIntervaloA;
    private javax.swing.JTextPane txtIntervaloB;
    private javax.swing.JTextPane txtPuntoX;
    private javax.swing.JTextPane txtPuntoY;
    private javax.swing.JTextPane txtR;
    private javax.swing.JTextPane txtRAngulo;
    private javax.swing.JTextPane txtRFinT;
    private javax.swing.JTextPane txtRInicioT;
    private javax.swing.JTextPane txtTeta;
    // End of variables declaration//GEN-END:variables
}
