/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;
import dao.daoEmpleado;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Luigi
 */
public class frmBuscarEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form frmBuscarTrabajador
     */
    DefaultTableModel dtmEmpleado = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false; //To change body of generated methods, choose Tools | Templates.
        }
    };
    
    
    daoEmpleado emple=new daoEmpleado();
    public static String estados;
    public frmBuscarEmpleado() {
        initComponents();
        
        emple.cargar_cabecera(tblEmpleado);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBuscarEmpleado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Buscar Empleado");

        txtBuscarEmpleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBuscarEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarEmpleadoKeyTyped(evt);
            }
        });

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/buscar.png"))); // NOI18N
        jButton2.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(572, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
        // TODO add your handling code here:
        
        int fila = tblEmpleado.getSelectedRow();
        if (evt.getClickCount() == 2) {
            if (estados.equals("frmUsu")) {
                frmUsuario.emp.setId(tblEmpleado.getValueAt(fila, 0).toString());
                frmUsuario.emp.setNombre(tblEmpleado.getValueAt(fila, 1).toString());
                frmUsuario.emp.setCorreo(tblEmpleado.getValueAt(fila, 2).toString());
                frmUsuario.emp.setTelefono(Long.parseLong(tblEmpleado.getValueAt(fila, 3).toString()));
                frmUsuario.emp.setDni(Long.parseLong(tblEmpleado.getValueAt(fila, 4).toString()));
                frmUsuario.emp.setFechaNac(tblEmpleado.getValueAt(fila, 5).toString());
                if (tblEmpleado.getValueAt(fila, 6).toString().equals("ACTIVO")) {
                    frmUsuario.emp.setEstado(1);
                } else {
                    frmUsuario.emp.setEstado(0);
                }
                frmUsuario.txtempleado.setText(tblEmpleado.getValueAt(fila, 1).toString());
                frmUsuario.txtIdUsuario.setText(tblEmpleado.getValueAt(fila, 0).toString());
                dispose();
          } //if (estados.equals("frmCuen")){
//                frmCuenta.cl.setId(tblCliente.getValueAt(fila, 0).toString());
//                frmCuenta.cl.setNombre(tblCliente.getValueAt(fila, 1).toString());
//                frmCuenta.cl.setCorreo(tblCliente.getValueAt(fila, 2).toString());
//                frmCuenta.cl.setTelefono(Long.parseLong(tblCliente.getValueAt(fila, 3).toString()));
//                frmCuenta.cl.setDni(Long.parseLong(tblCliente.getValueAt(fila, 4).toString()));
//                frmCuenta.cl.setFechaNac(tblCliente.getValueAt(fila, 5).toString());
//                if (tblCliente.getValueAt(fila, 6).toString().equals("Activo")) {
//                    frmCuenta.cl.setEstado(1);
//                }else {
//                    frmCuenta.cl.setEstado(0);
//                }
//                frmCuenta.txtCliente.setText(tblCliente.getValueAt(fila, 1).toString());
//                dispose();
//            }
        } else {
        }
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    private void txtBuscarEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEmpleadoKeyTyped
        // TODO add your handling code here:
        filtro("(?i)" + txtBuscarEmpleado.getText(), tblEmpleado);
    }//GEN-LAST:event_txtBuscarEmpleadoKeyTyped

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
            java.util.logging.Logger.getLogger(frmBuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBuscarEmpleado().setVisible(true);
            }
        });
    }
    
    public void filtro(String filtro, JTable jtableBuscar){
        dtmEmpleado = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dtmEmpleado);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(filtro));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtBuscarEmpleado;
    // End of variables declaration//GEN-END:variables
}
