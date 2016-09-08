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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("OPERACIONES CON FRACCIONARIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        txtNumerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 50, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 50, 10));
        jPanel1.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 50, 30));

        cmbOperaciones.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suma", "Resta", "Multiplicación", "División", "Convertir fracción a no. mixto" }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 100, 30));
        jPanel1.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 50, 30));
        jPanel1.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 50, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 50, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        txtNumerador3.setEditable(false);
        jPanel1.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 50, 30));

        txtDenominador3.setEditable(false);
        jPanel1.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 50, 30));

        txtNumeroMixto.setEditable(false);
        jPanel1.add(txtNumeroMixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 40, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 50, 10));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 80, 30));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );

        setBounds(0, 0, 553, 274);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
       int op,n1,n2,d1,d2,sw=1;
       Fraccionario f1,f2,f3=null;
       
       if (txtNumerador1.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "Digite el numerador 1", "Error",JOptionPane.ERROR_MESSAGE);
           txtNumerador1.requestFocusInWindow();
           sw=0;
       }else if (txtNumerador2.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this, "Digite el numerador 2", "Error",JOptionPane.ERROR_MESSAGE);
           txtNumerador2.requestFocusInWindow();
          sw=0;
       }else if (txtDenominador1.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "Digite el denominador 1", "Error",JOptionPane.ERROR_MESSAGE);
           txtDenominador1.requestFocusInWindow();
         sw=0;  
       }else if (txtDenominador2.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(this, "Digite el denominador 2", "Error",JOptionPane.ERROR_MESSAGE);
           txtDenominador2.requestFocusInWindow(); 
        sw=0;   
       }else{
          try{
            Integer.parseInt(txtNumerador1.getText());
           }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this,"El primer numerador debe ser un numero valido","Error",JOptionPane.ERROR_MESSAGE);
            txtNumerador1.requestFocusInWindow();
            txtNumerador1.selectAll();
            sw=0;
           }
           try{
               Integer.parseInt(txtNumerador2.getText());
           }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this,"El segundo numerador debe ser un numero valido","Error",JOptionPane.ERROR_MESSAGE);
            txtNumerador2.requestFocusInWindow();
            txtNumerador2.selectAll(); 
            sw=0;
           }
           try{
              Integer.parseInt(txtDenominador1.getText());
           }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this,"El primer denominador debe ser un numero valido","Error",JOptionPane.ERROR_MESSAGE);
            txtDenominador1.requestFocusInWindow();
            txtDenominador1.selectAll();  
            sw=0;
           }
           try{
             Integer.parseInt(txtDenominador2.getText());
           }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this,"El segundo denominador debe ser un numero valido","Error",JOptionPane.ERROR_MESSAGE);
            txtDenominador2.requestFocusInWindow();
            txtDenominador2.selectAll();  
            sw=0;  
           }
       }
           if (sw==1){
           
          n1= Integer.parseInt (txtNumerador1.getText());
          d1= Integer.parseInt(txtDenominador1.getText());
          n2= Integer.parseInt(txtNumerador2.getText());
          d2= Integer.parseInt (txtDenominador2.getText());
          op = cmbOperaciones.getSelectedIndex();
          
        if(n1==0 && n2 ==0 ){
        JOptionPane.showMessageDialog(this,"No digite cero", "Error", JOptionPane.ERROR_MESSAGE);
        txtNumerador1.requestFocusInWindow();
        txtNumerador1.selectAll();
        txtNumerador2.requestFocusInWindow();
        txtNumerador2.selectAll();
        } 
        else {
           try{
    
            f1 = new Fraccionario (n1,d1);
            f2 = new Fraccionario (n2,d2);
                   
            switch (op){
                case 0:
                    f3 = f1.sumar (f2);
                    
                    break;
                    
                case 1:
                    f3 = f1.restar (f2);
                    
                    break;
                    
                case 2:
                    f3 = f1.multiplicacion(f2);
                    break;
                case 3:
                    f3=f1.division (f2); 
                case 4:
                 
                 
            }
            txtNumerador3.setText(""+f3.getNumerador());
              txtDenominador3.setText(""+f3.getDenominador());
              
          }catch (DenominadorCeroException e){
          JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); 
          }
        }
       }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNumerador1.setText("");
        txtNumerador2.setText("");
        txtNumerador3.setText("");
        txtDenominador1.setText("");
        txtDenominador2.setText("");
        txtDenominador3.setText("");
        
        txtNumerador1.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void txtNumerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador1KeyTyped
        
          
    }//GEN-LAST:event_txtNumerador1KeyTyped

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    private javax.swing.JTextField txtNumeroMixto;
    // End of variables declaration//GEN-END:variables
}
