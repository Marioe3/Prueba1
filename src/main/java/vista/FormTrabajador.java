/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class FormTrabajador extends javax.swing.JFrame {

    /**
     * Creates new form Trabajador
     */
    public FormTrabajador() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        txtidTrabajador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreTrabajador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxCargo = new javax.swing.JComboBox<>();
        btnAgregarTrabajador = new javax.swing.JButton();
        btnModificarTrabajador = new javax.swing.JButton();
        btnEliminarTrabajador = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTbTrabajador = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("N?? Folio ");

        jLabel2.setText("RUT");

        txtNombreTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreTrabajadorActionPerformed(evt);
            }
        });
        txtNombreTrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreTrabajadorKeyTyped(evt);
            }
        });

        jLabel3.setText("NOMBRE");

        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyTyped(evt);
            }
        });

        jLabel4.setText("APELLIDO PATERNO");

        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyTyped(evt);
            }
        });

        jLabel5.setText("APELLIDO MATERNO");

        cbxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCargoActionPerformed(evt);
            }
        });

        btnAgregarTrabajador.setText("AGREGAR");

        btnModificarTrabajador.setText("MODIFICAR");

        btnEliminarTrabajador.setText("ELIMINAR");

        jTbTrabajador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTbTrabajador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidoMaterno)
                    .addComponent(cbxCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreTrabajador)
                    .addComponent(txtApellidoPaterno)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtidTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(235, 235, 235)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btnEliminarTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(161, 161, 161))
            .addComponent(jScrollPane5)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2))
                    .addComponent(btnAgregarTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(btnEliminarTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCargoActionPerformed

    private void txtNombreTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreTrabajadorActionPerformed

    private void txtNombreTrabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreTrabajadorKeyTyped
//        char C = evt.getKeyChar();
//
//        if (Character.isDigit(C)) {
//
//            getToolkit().beep();
//            evt.consume();
//            JOptionPane.showMessageDialog(this, "Ingrese solo Letras");
//            txtNombreTrabajador.setCursor(null); // nombre del campo
//
//        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
//                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
//                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
//                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
//
//            getToolkit().beep();
//            evt.consume();
//            JOptionPane.showMessageDialog(this, "Ingrese solo Letras");
//            txtNombreTrabajador.setCursor(null); // nombre del campo
//
//        }
    }//GEN-LAST:event_txtNombreTrabajadorKeyTyped

    private void txtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyTyped
//        char C = evt.getKeyChar();
//
//        if (Character.isDigit(C)) {
//
//            getToolkit().beep();
//            evt.consume();
//            JOptionPane.showMessageDialog(this, "Ingrese solo Letras");
//            txtApellidoPaterno.setCursor(null); // nombre del campo
//
//        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
//                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
//                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
//                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
//
//            getToolkit().beep();
//            evt.consume();
//            JOptionPane.showMessageDialog(this, "Ingrese solo Letras");
//            txtApellidoPaterno.setCursor(null); // nombre del campo
//
//        }
    }//GEN-LAST:event_txtApellidoPaternoKeyTyped

    private void txtApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyTyped
//        char C = evt.getKeyChar();
//
//        if (Character.isDigit(C)) {
//
//            getToolkit().beep();
//            evt.consume();
//            JOptionPane.showMessageDialog(this, "Ingrese solo Letras");
//            txtApellidoMaterno.setCursor(null); // nombre del campo
//
//        } else if ((int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
//                || (int) evt.getKeyChar() >= 58 && (int) evt.getKeyChar() <= 64
//                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
//                || (int) evt.getKeyChar() >= 123 && (int) evt.getKeyChar() <= 255) {
//
//            getToolkit().beep();
//            evt.consume();
//            JOptionPane.showMessageDialog(this, "Ingrese solo Letras");
//            txtApellidoMaterno.setCursor(null); // nombre del campo
//
//        }
    }//GEN-LAST:event_txtApellidoMaternoKeyTyped

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
            java.util.logging.Logger.getLogger(FormTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarTrabajador;
    public javax.swing.JButton btnEliminarTrabajador;
    public javax.swing.JButton btnModificarTrabajador;
    public javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    public javax.swing.JTable jTbTrabajador;
    public javax.swing.JTextField txtApellidoMaterno;
    public javax.swing.JTextField txtApellidoPaterno;
    public javax.swing.JTextField txtNombreTrabajador;
    public javax.swing.JTextField txtRut;
    public javax.swing.JTextField txtidTrabajador;
    // End of variables declaration//GEN-END:variables
}
