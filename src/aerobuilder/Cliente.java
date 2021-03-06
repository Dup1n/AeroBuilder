/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerobuilder;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author elian
 */
public class Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public Cliente() {
        initComponents();
        grupo_botones.add(avion1);
        grupo_botones.add(avion2);
        grupo_botones.add(avion3);
        grupo_botones.add(avion4);
        grupo_botones.add(avion5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_botones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        avion1 = new javax.swing.JRadioButton();
        avion2 = new javax.swing.JRadioButton();
        avion3 = new javax.swing.JRadioButton();
        avion4 = new javax.swing.JRadioButton();
        avion5 = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AeronaveBuilder");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Compañia \"A.F.N.D.\"");
        jLabel1.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nuestro Catalogo");

        avion1.setText("Aerolinea");
        avion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avion1ActionPerformed(evt);
            }
        });

        avion2.setText("Avioneta de Cultivo");
        avion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avion2ActionPerformed(evt);
            }
        });

        avion3.setText("Jet de Combate");
        avion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avion3ActionPerformed(evt);
            }
        });

        avion4.setText("Planeador");
        avion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avion4ActionPerformed(evt);
            }
        });

        avion5.setText("Dron");
        avion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avion5ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Enviar Peticion");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        jLabel4.setText("Nombre de la Empresa:");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(avion2)
                                .addComponent(avion1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(avion3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(avion4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(avion5, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(avion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(avion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(avion3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(avion4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(avion5)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avion2ActionPerformed
        // TODO add your handling code here:
       ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("../imagenes/avion2.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
       jLabel2.setIcon(imageIcon); // NOI18N
    }//GEN-LAST:event_avion2ActionPerformed

    private void avion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avion3ActionPerformed
        // TODO add your handling code here:
       ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("../imagenes/avion3.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
       jLabel2.setIcon(imageIcon); // NOI18N
    }//GEN-LAST:event_avion3ActionPerformed

    private void avion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avion4ActionPerformed
        // TODO add your handling code here:
       ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("../imagenes/avion4.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
       jLabel2.setIcon(imageIcon); // NOI18N
    }//GEN-LAST:event_avion4ActionPerformed

    private void avion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avion5ActionPerformed
        // TODO add your handling code here:
       ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("../imagenes/avion5.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
       jLabel2.setIcon(imageIcon); // NOI18N
    }//GEN-LAST:event_avion5ActionPerformed

    private void avion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avion1ActionPerformed
        // TODO add your handling code here:
       ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("../imagenes/avion1.jpg")).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
       jLabel2.setIcon(imageIcon); // NOI18N
    }//GEN-LAST:event_avion1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        IngenieroAeronautico ingeniero = new IngenieroAeronautico();
        
        if(avion1.isSelected()){
            AeroBuilder aeroComercial = new Aerolinea(nombre.getText());
            ingeniero.setAeronaveBuilder(aeroComercial);
        }
        else if(avion2.isSelected()){
            AeroBuilder aeroCultivo = new AvionetaCultivo(nombre.getText());
            ingeniero.setAeronaveBuilder(aeroCultivo);            
        }
        else if(avion3.isSelected()){
            AeroBuilder aeroJet = new JetCombate(nombre.getText());
            ingeniero.setAeronaveBuilder(aeroJet);            
        }
        else if(avion4.isSelected()){
            AeroBuilder aeroPlaneador = new Planeador(nombre.getText());
            ingeniero.setAeronaveBuilder(aeroPlaneador);            
        }
        else if(avion5.isSelected()){
            AeroBuilder dron = new Dron(nombre.getText());
            ingeniero.setAeronaveBuilder(dron);            
        }
        else{
            
        }
        
        ingeniero.construirAeronave();
        Aeronave aeronave = ingeniero.getAeronave();
        
        texto.setText(aeronave.toString());
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton avion1;
    private javax.swing.JRadioButton avion2;
    private javax.swing.JRadioButton avion3;
    private javax.swing.JRadioButton avion4;
    private javax.swing.JRadioButton avion5;
    private javax.swing.ButtonGroup grupo_botones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
