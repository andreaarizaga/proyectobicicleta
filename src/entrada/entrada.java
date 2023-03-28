package entrada;
import clases.conexionbases;
import java.sql.Connection;
import java.util.Random;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class entrada extends javax.swing.JFrame {
    public entrada() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnVer = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bcycle = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DinoRent");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(690, 630));
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Nombre(s):");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 140, 160, 30);

        jLabel3.setBackground(new java.awt.Color(255, 153, 255));
        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Correo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 230, 140, 30);

        jLabel4.setBackground(new java.awt.Color(204, 153, 255));
        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Teléfono");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 280, 150, 30);

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtnombre);
        txtnombre.setBounds(210, 140, 260, 30);
        getContentPane().add(txtApellido);
        txtApellido.setBounds(210, 190, 260, 30);
        getContentPane().add(txtTel);
        txtTel.setBounds(210, 280, 260, 30);

        btnGuardar.setBackground(new java.awt.Color(255, 153, 153));
        btnGuardar.setFont(new java.awt.Font("HP Simplified", 3, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 51, 102));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(30, 500, 101, 40);

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar.setFont(new java.awt.Font("HP Simplified", 3, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(51, 51, 51));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(290, 500, 110, 40);

        btnBorrar.setBackground(new java.awt.Color(204, 153, 255));
        btnBorrar.setFont(new java.awt.Font("HP Simplified", 3, 18)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(102, 0, 102));
        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar);
        btnBorrar.setBounds(170, 500, 92, 40);

        jSeparator2.setBackground(new java.awt.Color(204, 204, 255));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 255));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 60, 870, 20);

        btnVer.setBackground(new java.awt.Color(153, 0, 0));
        btnVer.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        btnVer.setForeground(new java.awt.Color(255, 255, 255));
        btnVer.setText("VER REGISTROS");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        getContentPane().add(btnVer);
        btnVer.setBounds(490, 500, 173, 40);

        jLabel8.setFont(new java.awt.Font("HP Simplified", 1, 32)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Registro de bicicletas:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 10, 330, 40);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(730, 0, 70, 70);

        bcycle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "               ", "30 min", "1 hr", "2 hr", "3 hr", " " }));
        bcycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcycleActionPerformed(evt);
            }
        });
        getContentPane().add(bcycle);
        bcycle.setBounds(340, 380, 160, 30);

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setText("Tiempo de uso:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(160, 380, 220, 30);

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(210, 230, 260, 30);

        jLabel12.setBackground(new java.awt.Color(255, 153, 255));
        jLabel12.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setText("Apellidos:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(110, 190, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entrada/bike.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 212));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 170, 400, 450);

        jPanel1.setBackground(new java.awt.Color(255, 203, 229));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    Connection reg = conexionbases.getConexion();
    String sql = "INSERT INTO dinoregistro (nombre, apellido, correo, telefono) VALUES (?, ?, ?, ?)";
    try {
        PreparedStatement pst = reg.prepareStatement(sql);
        pst.setString(1, txtnombre.getText());
        pst.setString(2, txtApellido.getText());
        pst.setString(3, txtCorreo.getText());
        pst.setString(4, txtTel.getText());
        
        int n = pst.executeUpdate();
        if (n>0) {
            JOptionPane.showMessageDialog(null, "Registrado exitosamente el articulo");
           
        }        
    } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error no se grabo el registro - "+e);
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtCorreo.setText(" ");
        txtnombre.setText(" ");
        txtApellido.setText(" ");
        txtTel.setText(" ");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
    salida salida = new salida(); 
    salida.setVisible(true);                                                                                                                
    entrada.this.dispose();

    }//GEN-LAST:event_btnVerActionPerformed

    private void bcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcycleActionPerformed
        // TODO add your handling code here:
        bcycle.addItem("");
    }//GEN-LAST:event_bcycleActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

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
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bcycle;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
