package entrada;
import clases.conexionbases;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class salida extends javax.swing.JFrame {
    static void setVisibile(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public salida() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LISTADOFINAL = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtdino = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 400));
        getContentPane().setLayout(null);

        LISTADOFINAL.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        LISTADOFINAL.setText("Mostrar Registros");
        LISTADOFINAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LISTADOFINALActionPerformed(evt);
            }
        });
        getContentPane().add(LISTADOFINAL);
        LISTADOFINAL.setBounds(300, 310, 268, 35);

        jScrollPane1.setBackground(new java.awt.Color(255, 204, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 51, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 0, 255), new java.awt.Color(153, 51, 255)));
        jScrollPane1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N

        tbtdino.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 102, 255), null, null));
        tbtdino.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        tbtdino.setForeground(new java.awt.Color(102, 102, 255));
        tbtdino.setModel(new javax.swing.table.DefaultTableModel(
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
        tbtdino.setGridColor(new java.awt.Color(204, 255, 255));
        jScrollPane1.setViewportView(tbtdino);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 850, 252);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 930, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LISTADOFINALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LISTADOFINALActionPerformed
    Connection conexion = conexionbases.getConexion();
     DefaultTableModel modelo= new DefaultTableModel();
     modelo.addColumn("codigo");
     modelo.addColumn("nombre");
     modelo.addColumn("descripcion");
     modelo.addColumn("cantidad");
     tbtdino.setModel(modelo);
     String []datos=new String[4];
     try{
      Statement comando =conexion.createStatement();
      ResultSet registro = comando.executeQuery("SELECT * FROM dinoregistro");
      while(registro.next()){
        datos[0]=registro.getString(1);
        datos[1]=registro.getString(2);
        datos[2]=registro.getString(3);
        datos[3]=registro.getString(4);
        modelo.addRow(datos);
    }
} catch(SQLException e){
    JOptionPane.showMessageDialog(null,"Error no se encontraron registros"+e);
     }
    }//GEN-LAST:event_LISTADOFINALActionPerformed

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
            java.util.logging.Logger.getLogger(salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LISTADOFINAL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbtdino;
    // End of variables declaration//GEN-END:variables
}
