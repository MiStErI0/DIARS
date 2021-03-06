/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;
import clases.cliente;
import clases.distrito;
import dao.daoCliente;
import dao.daoDePrDis;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import modelo.Validar_todo;
/**
 *
 * @author Estudiante
 */
public class frmCliente extends javax.swing.JFrame {

    /**
     * Creates new form frmCliente
     */
    dao.daoDePrDis dpd=new daoDePrDis();
    daoCliente daoCli = new daoCliente();
    Validar_todo val = new Validar_todo();
    public static cliente cl =new cliente();
    public frmCliente() {
        initComponents();
        dpd.cargarDepartame(cmbdepar);
        LlenaComboEstadoCliente();
        txtIdCliente.setVisible(false);
       val.SDNI(txtDniCliente);
       val.SLetras(txtNombreCliente);
       val.SLetras(txtApellidoMatCliente);
       val.SLetras(txtApellidoPatCliente);
       val.SNumeros(txtTelefonoCliente);
       val.Email(txtCorreoCliente);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoPatCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidoMatCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCorreoCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboEstadoCliente = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jdFechaCliente = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        cmbdepar = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cmbprovin = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cmbdis = new javax.swing.JComboBox<>();
        txtNombreCliente = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDniCliente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        btnNuevoCliente = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();
        btnActualizarCliente = new javax.swing.JButton();
        btnBorrarCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mantener Cliente");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cliente");

        jLabel3.setText("Nombre :");

        jLabel4.setText("Apellido Paterno :");

        jLabel5.setText("Apellido Materno :");

        jLabel6.setText("Correo :");

        jLabel7.setText("Estado :");

        jLabel8.setText("Telefono :");

        jLabel9.setText("Fecha de Nacimiento :");

        jLabel10.setText("Departamento :");

        cmbdepar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbdepar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbdeparItemStateChanged(evt);
            }
        });

        jLabel11.setText("Provincia :");

        cmbprovin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selec. Provincia" }));
        cmbprovin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbprovinItemStateChanged(evt);
            }
        });

        jLabel12.setText("Distrito :");

        cmbdis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selec. Distrito" }));

        jLabel13.setText("Dni :");

        jLabel14.setText("Direccion :");

        btnNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/new.png"))); // NOI18N
        btnNuevoCliente.setText("Nuevo");

        btnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/agregar.png"))); // NOI18N
        btnAgregarCliente.setText("Agregar");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        btnActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/actualizar.png"))); // NOI18N
        btnActualizarCliente.setText("Actualizar");
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });

        btnBorrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/borrar.png"))); // NOI18N
        btnBorrarCliente.setText("Borrar");
        btnBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarClienteActionPerformed(evt);
            }
        });

        btnCancelarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/cerrar.png"))); // NOI18N
        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtApellidoPatCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtApellidoMatCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jdFechaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtDniCliente))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cboEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbdepar, 0, 180, Short.MAX_VALUE)
                                            .addComponent(cmbdis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbprovin, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(btnCancelarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidoPatCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtApellidoMatCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cboEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(jdFechaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbdepar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cmbprovin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbdis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoCliente)
                    .addComponent(btnAgregarCliente)
                    .addComponent(btnActualizarCliente)
                    .addComponent(btnBorrarCliente))
                .addGap(18, 18, 18)
                .addComponent(btnCancelarCliente)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

    private void cmbdeparItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbdeparItemStateChanged
        // TODO add your handling code here:
        dpd.cargarProvi(cmbprovin, cmbdepar.getSelectedItem().toString());
        cmbdis.removeAllItems();
        cmbdis.addItem("Selec. Distrito");
    }//GEN-LAST:event_cmbdeparItemStateChanged

    private void cmbprovinItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbprovinItemStateChanged
        // TODO add your handling code here:
        dpd.cargarDistri(cmbdis, cmbprovin.getSelectedItem().toString());
        
    }//GEN-LAST:event_cmbprovinItemStateChanged

    private void btnBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarClienteActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        // TODO add your handling code here:
        String respuestaRegistro = daoCli.insertCliente(getNombreCliente(),getApellidoPatCliente(),getApellidoMatCliente(),getcorreoCliente(),getTelefonoCliente(),getDniCliente(),getFechaCliente(),getEstadoCliente(),getDireccion(),getIdDistrito());
        if(respuestaRegistro != null){
            JOptionPane.showMessageDialog(null, respuestaRegistro);
        }
        else{
            JOptionPane.showMessageDialog(null, "REGISTRO ERRONEO.");
        }
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }
    
//    private void carProvincia()
//    {
//        if(cmbdepar.is==true){
//        
//        }
//    }
    public void LlenaComboEstadoCliente(){
        cboEstadoCliente.addItem("Desactivo");
        cboEstadoCliente.addItem("Activo");
        
    }

    public String getIdCliente(){
        System.out.println(txtIdCliente.getText());
        return txtIdCliente.getText();
    }
    
    public String getNombreCliente(){
        System.out.println(txtNombreCliente.getText());
        return txtNombreCliente.getText();
    }
    
    public String getApellidoPatCliente(){
        System.out.println(txtApellidoPatCliente.getText());
        return txtApellidoPatCliente.getText();
    }
    
    public String getApellidoMatCliente(){
        System.out.println(txtApellidoMatCliente.getText());
        return txtApellidoMatCliente.getText();
    }
    
    public String getcorreoCliente(){
        System.out.println(txtCorreoCliente.getText());
        return txtCorreoCliente.getText();
    }
    
    public int getDniCliente(){
        System.out.println(txtDniCliente.getText());
        return Integer.parseInt(txtDniCliente.getText());
    }
    
    public int getTelefonoCliente(){
        System.out.println(txtTelefonoCliente.getText());
        return Integer.parseInt(txtTelefonoCliente.getText());
    }
    
    public int getEstadoCliente(){
        //return (int)cboEstadoPlato.getSelectedItem();
        System.out.println(cboEstadoCliente.getSelectedIndex());
        System.out.println(cboEstadoCliente.getSelectedIndex());
        return cboEstadoCliente.getSelectedIndex();
    }
    
    public String getFechaCliente(){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formatoFecha.format(jdFechaCliente.getDate());
        System.out.println(fecha);
        return fecha;
        
    }
    
    public String getIdDistrito(){
        
        String Buscar = cmbdis.getSelectedItem().toString();
        for(distrito dis:dpd.getdistri())
        {
            if(dis.getDistrito().equals(Buscar))
            {
                System.out.println(Buscar);
                Buscar=dis.getIddistrito();
                System.out.println(Buscar);

                break;
                
            }
        }
        
        return Buscar;
    }
    
    public String getDireccion(){
        return txtDireccionCliente.getText();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnBorrarCliente;
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnNuevoCliente;
    public static javax.swing.JComboBox<String> cboEstadoCliente;
    public static javax.swing.JComboBox<String> cmbdepar;
    public static javax.swing.JComboBox<String> cmbdis;
    public static javax.swing.JComboBox<String> cmbprovin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static com.toedter.calendar.JDateChooser jdFechaCliente;
    public static javax.swing.JTextField txtApellidoMatCliente;
    public static javax.swing.JTextField txtApellidoPatCliente;
    public static javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtDireccionCliente;
    public static javax.swing.JTextField txtDniCliente;
    public static javax.swing.JTextField txtIdCliente;
    public static javax.swing.JTextField txtNombreCliente;
    public static javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
