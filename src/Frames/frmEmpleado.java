/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;
import dao.daoDePrDis;
import dao.daoEmpleado;

/**
 *
 * @author Luigi
 */
public class frmEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form frmTrabajador
     */
    dao.daoDePrDis dpd=new daoDePrDis();
    dao.daoEmpleado daoEmp=new daoEmpleado();
    public frmEmpleado() {
        initComponents();
        dpd.cargarDepartame(cboDepartamentoEmpleado);
        daoEmp.cargarTipoDeCargo(cboTipoEmpleado);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        cboDepartamentoEmpleado = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cboProvinciaEmpleado = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cboDistritoEmpleado = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cboTipoEmpleado = new javax.swing.JComboBox<>();
        btnBorrarEmpleado = new javax.swing.JButton();
        btnNuevoEmpleado = new javax.swing.JButton();
        btnCerrarEmpleado = new javax.swing.JButton();
        btnActualizarEmpleado = new javax.swing.JButton();
        btnAgregarEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Empleado");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, -1, -1));

        jLabel2.setText("Id_Trabajador:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 47, -1, -1));

        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 45, 100, -1));

        jLabel3.setText("Nombre :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 77, -1, -1));

        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 75, 200, -1));

        jLabel4.setText("Apellido Paterno :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 113, -1, -1));

        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 111, 151, -1));

        jLabel5.setText("Apellido Materno :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 113, -1, -1));

        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 111, 165, -1));

        jLabel6.setText("Correo :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 149, -1, -1));

        jTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 147, 200, -1));

        jLabel8.setText("Dni :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 77, -1, -1));

        jLabel7.setText("Telefono :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 185, -1, -1));

        jTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 183, 149, -1));

        jTextField7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 75, 164, -1));

        jLabel10.setText("Fecha de Nacimiento");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 185, -1, -1));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 183, 180, -1));

        jLabel11.setText("Departamento :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 225, -1, -1));

        cboDepartamentoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboDepartamentoEmpleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cboDepartamentoEmpleado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDepartamentoEmpleadoItemStateChanged(evt);
            }
        });
        jPanel2.add(cboDepartamentoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 221, 175, -1));

        jLabel12.setText("Provincia :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 225, -1, -1));

        cboProvinciaEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selec. Provincia" }));
        cboProvinciaEmpleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cboProvinciaEmpleado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProvinciaEmpleadoItemStateChanged(evt);
            }
        });
        jPanel2.add(cboProvinciaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 221, 181, -1));

        jLabel13.setText("Distrito :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 265, -1, -1));

        cboDistritoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selec. Distrito" }));
        cboDistritoEmpleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(cboDistritoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 261, 175, -1));

        jLabel14.setText("Direccion :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 265, -1, -1));

        jTextField8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 263, 226, -1));

        jLabel15.setText("Tipo :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 47, -1, -1));

        cboTipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cboTipoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 44, 182, -1));

        btnBorrarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/borrar.png"))); // NOI18N
        btnBorrarEmpleado.setText("Borrar");
        jPanel2.add(btnBorrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 313, 100, -1));

        btnNuevoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/new.png"))); // NOI18N
        btnNuevoEmpleado.setText("Nuevo");
        btnNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 311, 100, -1));

        btnCerrarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/cerrar.png"))); // NOI18N
        btnCerrarEmpleado.setText("Cerrar");
        btnCerrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 358, 150, -1));

        btnActualizarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/actualizar.png"))); // NOI18N
        btnActualizarEmpleado.setText("Actualizar");
        jPanel2.add(btnActualizarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 313, 100, -1));

        btnAgregarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/agregar.png"))); // NOI18N
        btnAgregarEmpleado.setText("Agregar");
        jPanel2.add(btnAgregarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 311, 100, -1));

        jTabbedPane1.addTab("Mantenimiento Empleado", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 610, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoEmpleadoActionPerformed

    private void btnCerrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarEmpleadoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarEmpleadoActionPerformed

    private void cboDepartamentoEmpleadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDepartamentoEmpleadoItemStateChanged
        // TODO add your handling code here:
        dpd.cargarProvi(cboProvinciaEmpleado, cboDepartamentoEmpleado.getSelectedItem().toString());
        cboDistritoEmpleado.removeAllItems();
        cboDistritoEmpleado.addItem("Selec. Distrito");
    }//GEN-LAST:event_cboDepartamentoEmpleadoItemStateChanged

    private void cboProvinciaEmpleadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProvinciaEmpleadoItemStateChanged
        // TODO add your handling code here:
        dpd.cargarDistri(cboDistritoEmpleado, cboProvinciaEmpleado.getSelectedItem().toString());
    }//GEN-LAST:event_cboProvinciaEmpleadoItemStateChanged

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
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEmpleado().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarEmpleado;
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnBorrarEmpleado;
    private javax.swing.JButton btnCerrarEmpleado;
    private javax.swing.JButton btnNuevoEmpleado;
    private javax.swing.JComboBox<String> cboDepartamentoEmpleado;
    private javax.swing.JComboBox<String> cboDistritoEmpleado;
    private javax.swing.JComboBox<String> cboProvinciaEmpleado;
    private javax.swing.JComboBox<String> cboTipoEmpleado;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
