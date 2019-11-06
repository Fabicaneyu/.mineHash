/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prototipo.aplicacao;

import java.awt.Color;

/**
 *
 * @author Lenovo
 */
public class TelaTabela extends javax.swing.JFrame {

    Processos processos = new Processos();

    int idSwing[] = new int[10];
    String nomeSwing[] = new String[10];
    int prioridadeSwing[] = new int[10];

    //    int[] idProcesso = new int[10];
//    String[] nomeProcesso = new String[10];
//    int[] prioridadeProcesso = new int[10];
    /**
     * Creates new form TelaTabela
     */
    public TelaTabela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNome4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PID1 = new javax.swing.JLabel();
        PID2 = new javax.swing.JLabel();
        PID3 = new javax.swing.JLabel();
        PID4 = new javax.swing.JLabel();
        PID5 = new javax.swing.JLabel();
        PID6 = new javax.swing.JLabel();
        lbNome1 = new javax.swing.JLabel();
        lbNome2 = new javax.swing.JLabel();
        lbNome3 = new javax.swing.JLabel();
        lbNome5 = new javax.swing.JLabel();
        lbNome6 = new javax.swing.JLabel();
        lbNome7 = new javax.swing.JLabel();
        lbPrioridade1 = new javax.swing.JLabel();
        lbPrioridade2 = new javax.swing.JLabel();
        lbPrioridade3 = new javax.swing.JLabel();
        lbPrioridade4 = new javax.swing.JLabel();
        lbPrioridade5 = new javax.swing.JLabel();
        lbPrioridade6 = new javax.swing.JLabel();
        btnMonitorar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PID = new javax.swing.JLabel();
        lbPrioridade = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        btMatarProcesso = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(500, 541));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lbNome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 534, 48, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 77));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 60));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 70));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        PID1.setBackground(new java.awt.Color(255, 255, 255));
        PID1.setText("  ");
        PID1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID1.setOpaque(true);

        PID2.setBackground(new java.awt.Color(255, 255, 255));
        PID2.setText("  ");
        PID2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID2.setOpaque(true);

        PID3.setBackground(new java.awt.Color(255, 255, 255));
        PID3.setText("  ");
        PID3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID3.setOpaque(true);

        PID4.setBackground(new java.awt.Color(255, 255, 255));
        PID4.setText("  ");
        PID4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID4.setOpaque(true);

        PID5.setBackground(new java.awt.Color(255, 255, 255));
        PID5.setText("  ");
        PID5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID5.setOpaque(true);

        PID6.setBackground(new java.awt.Color(255, 255, 255));
        PID6.setText("  ");
        PID6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID6.setOpaque(true);

        lbNome1.setBackground(new java.awt.Color(255, 255, 255));
        lbNome1.setText("  ");
        lbNome1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome1.setOpaque(true);

        lbNome2.setBackground(new java.awt.Color(255, 255, 255));
        lbNome2.setText("  ");
        lbNome2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome2.setOpaque(true);

        lbNome3.setBackground(new java.awt.Color(255, 255, 255));
        lbNome3.setText("  ");
        lbNome3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome3.setOpaque(true);

        lbNome5.setBackground(new java.awt.Color(255, 255, 255));
        lbNome5.setText("  ");
        lbNome5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome5.setOpaque(true);

        lbNome6.setBackground(new java.awt.Color(255, 255, 255));
        lbNome6.setText("  ");
        lbNome6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome6.setOpaque(true);

        lbNome7.setBackground(new java.awt.Color(255, 255, 255));
        lbNome7.setText("  ");
        lbNome7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome7.setOpaque(true);

        lbPrioridade1.setBackground(new java.awt.Color(255, 255, 255));
        lbPrioridade1.setText("  ");
        lbPrioridade1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade1.setOpaque(true);

        lbPrioridade2.setBackground(new java.awt.Color(255, 255, 255));
        lbPrioridade2.setText("  ");
        lbPrioridade2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade2.setOpaque(true);

        lbPrioridade3.setBackground(new java.awt.Color(255, 255, 255));
        lbPrioridade3.setText("  ");
        lbPrioridade3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade3.setOpaque(true);

        lbPrioridade4.setBackground(new java.awt.Color(255, 255, 255));
        lbPrioridade4.setText("  ");
        lbPrioridade4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade4.setOpaque(true);

        lbPrioridade5.setBackground(new java.awt.Color(255, 255, 255));
        lbPrioridade5.setText("  ");
        lbPrioridade5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade5.setOpaque(true);

        lbPrioridade6.setBackground(new java.awt.Color(255, 255, 255));
        lbPrioridade6.setText("  ");
        lbPrioridade6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade6.setOpaque(true);

        btnMonitorar.setBackground(new java.awt.Color(10, 13, 14));
        btnMonitorar.setForeground(new java.awt.Color(255, 255, 255));
        btnMonitorar.setText("Monitorar");
        btnMonitorar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMonitorarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMonitorarMouseExited(evt);
            }
        });
        btnMonitorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonitorarActionPerformed(evt);
            }
        });

        jLabel3.setText("PID");

        jLabel4.setText("PRIORIDADE");

        jLabel5.setText("NOME");

        PID.setBackground(new java.awt.Color(255, 255, 255));
        PID.setText("  ");
        PID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PID.setOpaque(true);

        lbPrioridade.setBackground(new java.awt.Color(255, 255, 255));
        lbPrioridade.setText("  ");
        lbPrioridade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbPrioridade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbPrioridade.setOpaque(true);

        lbNome.setBackground(new java.awt.Color(255, 255, 255));
        lbNome.setText("  ");
        lbNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbNome.setOpaque(true);

        btMatarProcesso.setBackground(new java.awt.Color(10, 13, 14));
        btMatarProcesso.setForeground(new java.awt.Color(255, 255, 255));
        btMatarProcesso.setText("encerrar Processo");
        btMatarProcesso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btMatarProcessoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btMatarProcessoMouseExited(evt);
            }
        });
        btMatarProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMatarProcessoActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Digite o nome do processo: ");

        jLabel1.setText(".MineHash - Processos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PID, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PID4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PID5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PID6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel3))
                                    .addComponent(PID1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PID2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PID3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel5))
                                .addComponent(lbNome1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNome3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNome5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNome6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNome7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnMonitorar)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPrioridade5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPrioridade2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPrioridade1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addComponent(lbPrioridade3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPrioridade6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPrioridade4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btMatarProcesso)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PID)
                    .addComponent(lbPrioridade)
                    .addComponent(lbNome))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrioridade1)
                    .addComponent(lbNome1)
                    .addComponent(PID1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome2)
                    .addComponent(PID2)
                    .addComponent(lbPrioridade2))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome3)
                    .addComponent(PID3)
                    .addComponent(lbPrioridade3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PID4)
                    .addComponent(lbNome5)
                    .addComponent(lbPrioridade4))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome6)
                    .addComponent(PID5)
                    .addComponent(lbPrioridade5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PID6)
                    .addComponent(lbNome7)
                    .addComponent(lbPrioridade6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMonitorar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMatarProcesso))
                .addGap(73, 73, 73))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMonitorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonitorarActionPerformed

        processos.enviarProcessosSwing(idSwing, nomeSwing, prioridadeSwing);

        PID.setText(String.valueOf(idSwing[1]));
        lbNome.setText(nomeSwing[1].toString());
        lbPrioridade.setText(String.valueOf(prioridadeSwing[1]));

        PID1.setText(String.valueOf(idSwing[2]));
        lbNome1.setText(nomeSwing[2].toString());
        lbPrioridade1.setText(String.valueOf(prioridadeSwing[2]));

        PID2.setText(String.valueOf(idSwing[3]));
        lbNome2.setText(nomeSwing[3].toString());
        lbPrioridade2.setText(String.valueOf(prioridadeSwing[3]));

        PID3.setText(String.valueOf(idSwing[4]));
        lbNome3.setText(nomeSwing[4].toString());
        lbPrioridade3.setText(String.valueOf(prioridadeSwing[4]));

        PID4.setText(String.valueOf(idSwing[5]));
        lbNome5.setText(nomeSwing[5].toString());
        lbPrioridade4.setText(String.valueOf(prioridadeSwing[5]));

        PID5.setText(String.valueOf(idSwing[6]));
        lbNome6.setText(nomeSwing[6].toString());
        lbPrioridade5.setText(String.valueOf(prioridadeSwing[6]));

        PID6.setText(String.valueOf(idSwing[7]));
        lbNome7.setText(nomeSwing[7].toString());
        lbPrioridade6.setText(String.valueOf(prioridadeSwing[7]));


    }//GEN-LAST:event_btnMonitorarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btMatarProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMatarProcessoActionPerformed
        // TODO add your handling code here:

        String matarProc = jTextField1.getText();
        MatarProcessos.kill(matarProc + ".exe");


    }//GEN-LAST:event_btMatarProcessoActionPerformed

    private void btnMonitorarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMonitorarMouseEntered
  btnMonitorar.setBackground(new Color(216,166,2));
        btnMonitorar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnMonitorarMouseEntered

    private void btnMonitorarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMonitorarMouseExited
          btnMonitorar.setBackground(new Color(10,13,14));
        btnMonitorar.setForeground(Color.white);
    }//GEN-LAST:event_btnMonitorarMouseExited

    private void btMatarProcessoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMatarProcessoMouseEntered
        btMatarProcesso.setBackground(new Color(216,166,2));
        btMatarProcesso.setForeground(Color.WHITE);
    }//GEN-LAST:event_btMatarProcessoMouseEntered

    private void btMatarProcessoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btMatarProcessoMouseExited
  btMatarProcesso.setBackground(new Color(10,13,14));
        btMatarProcesso.setForeground(Color.white);
    }//GEN-LAST:event_btMatarProcessoMouseExited

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
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTabela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PID;
    private javax.swing.JLabel PID1;
    private javax.swing.JLabel PID2;
    private javax.swing.JLabel PID3;
    private javax.swing.JLabel PID4;
    private javax.swing.JLabel PID5;
    private javax.swing.JLabel PID6;
    private javax.swing.JButton btMatarProcesso;
    private javax.swing.JButton btnMonitorar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNome1;
    private javax.swing.JLabel lbNome2;
    private javax.swing.JLabel lbNome3;
    private javax.swing.JLabel lbNome4;
    private javax.swing.JLabel lbNome5;
    private javax.swing.JLabel lbNome6;
    private javax.swing.JLabel lbNome7;
    private javax.swing.JLabel lbPrioridade;
    private javax.swing.JLabel lbPrioridade1;
    private javax.swing.JLabel lbPrioridade2;
    private javax.swing.JLabel lbPrioridade3;
    private javax.swing.JLabel lbPrioridade4;
    private javax.swing.JLabel lbPrioridade5;
    private javax.swing.JLabel lbPrioridade6;
    // End of variables declaration//GEN-END:variables
}
