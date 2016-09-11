/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clase.Fraccionario;

import javax.swing.JOptionPane;
import clase.DenominadorCeroException;

/**
 *
 * @author SERVIDOR
 */
public class Principal1 extends javax.swing.JFrame {

    /**
     * Creates new form Principal1
     */
    public Principal1() {
        initComponents();
        cmdCalcular.setEnabled(true);
        cmdNumixto.setEnabled (false);
        cmdLimpiar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumerador1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtDenominador1 = new javax.swing.JTextField();
        cmbOperaciones = new javax.swing.JComboBox();
        txtNumerador2 = new javax.swing.JTextField();
        txtDenominador2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtNumerador3 = new javax.swing.JTextField();
        txtDenominador3 = new javax.swing.JTextField();
        txtNumeroMixto = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        cmdCalcular = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdNumixto = new javax.swing.JButton();
        txtNumerador4 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtDenominador4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 204));
        jLabel1.setText("OPERACIONES CON FRACCIONARIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        txtNumerador1.setBackground(new java.awt.Color(255, 204, 153));
        txtNumerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 50, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 50, 10));

        txtDenominador1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 50, 30));

        cmbOperaciones.setBackground(new java.awt.Color(255, 255, 153));
        cmbOperaciones.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suma", "Resta", "Multiplicación", "División", "Convertir a numero mixto", " " }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 120, 30));

        txtNumerador2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 50, 30));

        txtDenominador2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 50, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 50, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 20, 30));

        txtNumerador3.setEditable(false);
        txtNumerador3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 50, 30));

        txtDenominador3.setEditable(false);
        txtDenominador3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 50, 30));

        txtNumeroMixto.setEditable(false);
        txtNumeroMixto.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.add(txtNumeroMixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 40, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 50, 10));

        cmdCalcular.setBackground(new java.awt.Color(204, 153, 255));
        cmdCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, 40));

        cmdLimpiar.setBackground(new java.awt.Color(204, 153, 255));
        cmdLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 80, 40));

        cmdNumixto.setBackground(new java.awt.Color(204, 153, 255));
        cmdNumixto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdNumixto.setText("Convertir a numero mixto ");
        cmdNumixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNumixtoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdNumixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, 30));

        txtNumerador4.setEditable(false);
        txtNumerador4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.add(txtNumerador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 50, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 50, 10));

        txtDenominador4.setEditable(false);
        txtDenominador4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.add(txtDenominador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 50, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("=");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(602, 341));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int op, n1, n2, d1, d2, sw = 1;
        Fraccionario f1, f2, f3 = null;

        if (txtNumerador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el numerador 1", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumerador1.requestFocusInWindow();
            sw = 0;

        } else if (txtNumerador2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el numerador 2", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumerador2.requestFocusInWindow();
            sw = 0;
        } else if (txtDenominador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el denominador 1", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador1.requestFocusInWindow();
            sw = 0;

        } else if (txtDenominador2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el denominador 2", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador2.requestFocusInWindow();
            sw = 0;

        } else {
            try {
                Integer.parseInt(txtNumerador1.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El primer numerador debe ser un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtNumerador1.requestFocusInWindow();
                txtNumerador1.selectAll();
                sw = 0;
            }
            try {
                Integer.parseInt(txtNumerador2.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El segundo numerador debe ser un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtNumerador2.requestFocusInWindow();
                txtNumerador2.selectAll();
                sw = 0;
            }
            try {
                Integer.parseInt(txtDenominador1.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El primer denominador debe ser un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtDenominador1.requestFocusInWindow();
                txtDenominador1.selectAll();
                sw = 0;
            }
            try {
                Integer.parseInt(txtDenominador2.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El segundo denominador debe ser un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
                txtDenominador2.requestFocusInWindow();
                txtDenominador2.selectAll();
                sw = 0;
            }
        }
        if (sw == 1) {

            n1 = Integer.parseInt(txtNumerador1.getText());
            d1 = Integer.parseInt(txtDenominador1.getText());
            n2 = Integer.parseInt(txtNumerador2.getText());
            d2 = Integer.parseInt(txtDenominador2.getText());
            op = cmbOperaciones.getSelectedIndex();

            if (n1 == 0 && n2 == 0) {
                JOptionPane.showMessageDialog(this, "No digite cero", "Error", JOptionPane.ERROR_MESSAGE);
                txtNumerador1.requestFocusInWindow();
                txtNumerador1.selectAll();
                txtDenominador2.requestFocusInWindow();
                txtDenominador2.selectAll();
            } else {
                try {
                    f1 = new Fraccionario(n1, d1);
                    f2 = new Fraccionario(n2, d2);

                    switch (op) {
                        case 0:
                            f3 = f1.sumar(f2);
                       
                            break;
                      

                        case 1:
                            f3 = f1.restar(f2);
                             
                           break;

                        case 2:
                            f3 = f1.multiplicacion(f2);
                            
                            break;
                            
                        case 3:
                            f3 = f1.division(f2);
                          
                            break;
                    }
                    txtNumerador3.setText("" + f3.getNumerador());
                    txtDenominador3.setText("" + f3.getDenominador()); 
                    
                    cmdCalcular.setEnabled(false);
                    cmdNumixto.setEnabled(true);
                    cmdLimpiar.setEnabled(true);

                } catch (DenominadorCeroException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNumerador1.setText("");
        txtNumerador2.setText("");
        txtNumerador3.setText("");
        txtNumerador4.setText("");
        txtDenominador1.setText("");
        txtDenominador2.setText("");
        txtDenominador3.setText("");
        txtDenominador4.setText("");
        txtNumeroMixto.setText("");
        
        txtNumerador1.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);
        
        cmdCalcular.setEnabled(true);
        cmdNumixto.setEnabled(false);
        cmdLimpiar.setEnabled(false);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void txtNumerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador1KeyTyped
        
          
    }//GEN-LAST:event_txtNumerador1KeyTyped

    private void cmdNumixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNumixtoActionPerformed
        int nmf, nf,nn,df;
        String nm,n,d; 
        nf=Integer.parseInt(txtNumerador3.getText());
        df=Integer.parseInt (txtDenominador3.getText());
          if (nf<df){
              JOptionPane.showMessageDialog(this,"El numerador final no debe ser menor que el donominador final","Error",JOptionPane.ERROR_MESSAGE);
              txtNumerador1.requestFocusInWindow();
              txtNumerador1.selectAll();
          } else {
            nmf=nf/df;
            nn=nf%df;
           nm = String.valueOf(nmf);
           txtNumeroMixto.setText(nm);
           n=String.valueOf(nn);
           txtNumerador4.setText(n);
           d=String.valueOf(df);
           txtDenominador4.setText(d);
          }
         cmdCalcular.setEnabled(false);
         cmdLimpiar.setEnabled(true); 
         cmdNumixto.setEnabled(false);
        
       
    }//GEN-LAST:event_cmdNumixtoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdNumixto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtDenominador4;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    private javax.swing.JTextField txtNumerador4;
    private javax.swing.JTextField txtNumeroMixto;
    // End of variables declaration//GEN-END:variables
}
