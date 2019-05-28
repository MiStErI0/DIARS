package Frames;
import dao.daoLogin;
import javax.swing.JOptionPane;
import clases.login;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.codec.digest.DigestUtils;
import clases.registro;

public class frmRegistro extends javax.swing.JFrame {
    daoLogin oacc = new daoLogin("login.txt");    
    DefaultTableModel dtmAccesos=new DefaultTableModel();
    public frmRegistro() {
        initComponents();
        llenaCombo();
        llenaColumna();
//        ocultar_columnas();
        oacc.listar(dtmAccesos, tAcceso);
        
    }
    public void ocultar_columnas(){
        tAcceso.getColumnModel().getColumn(2).setMaxWidth(0);
        tAcceso.getColumnModel().getColumn(2).setMinWidth(0);
        tAcceso.getColumnModel().getColumn(2).setPreferredWidth(0);
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo01 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAcceso = new javax.swing.JTable();
        txtTotalRegistros = new javax.swing.JLabel();
        btnEliminar1 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 217, 29));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tipo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Contraseña:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 76, -1));

        txtContra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtContra.setPreferredSize(new java.awt.Dimension(0, 30));
        getContentPane().add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 217, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Usuario:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUsuario.setPreferredSize(new java.awt.Dimension(0, 30));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 217, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Nombres:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txtNombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombres.setPreferredSize(new java.awt.Dimension(0, 30));
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 217, -1));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/button_buscar.jpg"))); // NOI18N
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setPreferredSize(new java.awt.Dimension(87, 25));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 133, 36));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Registro de Cajeros");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        tAcceso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tAcceso.setModel(new javax.swing.table.DefaultTableModel(
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
        tAcceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tAccesoMouseReleased(evt);
            }
        });
        tAcceso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tAccesoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tAcceso);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 530, 190));

        txtTotalRegistros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalRegistros.setText("Total de Registros: ");
        getContentPane().add(txtTotalRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 166, -1));

        btnEliminar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/button_eliminar.jpg"))); // NOI18N
        btnEliminar1.setContentAreaFilled(false);
        btnEliminar1.setPreferredSize(new java.awt.Dimension(87, 25));
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 133, 36));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/button_registrar.jpg"))); // NOI18N
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 133, 36));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/button_nuevo.jpg"))); // NOI18N
        btnNuevo.setContentAreaFilled(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 133, 39));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/button_cerrar.jpg"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tAccesoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tAccesoMouseReleased

    }//GEN-LAST:event_tAccesoMouseReleased

    private void tAccesoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tAccesoKeyReleased
        
    }//GEN-LAST:event_tAccesoKeyReleased

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        
      txtNombres.setText(null);
      txtContra.setText(null);     
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
      int msg = JOptionPane.showConfirmDialog(this,"Deseas Grabar el Usuario","Grabar",JOptionPane.YES_NO_OPTION);
      
      if(msg == JOptionPane.YES_OPTION){
         String pass=DigestUtils.md5Hex(getContra());
         login u =new login(getNombres(),getUsuario(),getContra(),pass,getTipo());  
         oacc.adicionar(u);
         oacc.listar(dtmAccesos, tAcceso);
         oacc.grabar();//Grabar registros en el archivo
         JOptionPane.showMessageDialog(this,"Registro Grabado Satisfactoriamente!");
      }
      else{
          txtNombres.requestFocus();
          oacc.listar(dtmAccesos, tAcceso);
      }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        int msg = JOptionPane.showConfirmDialog(this,"Deseas Eliminar el Usuario","Eliminar",JOptionPane.YES_NO_OPTION);    
        if(msg == JOptionPane.YES_OPTION){
           login a=oacc.buscar(getUsuario());
        if(a!=null){
            oacc.eliminar(a);
            oacc.listar(dtmAccesos, tAcceso);
            oacc.grabar();//Actualizar dato eliminado en el archivo
        }else{JOptionPane.showMessageDialog(this,"No lo encontro!!","Validación",1);}
    }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       txtUsuario.setEnabled(true);
   if(txtUsuario.getText().equals("")){
       JOptionPane.showMessageDialog(this,"No hay algo que buscar", "Sin resultado",2);
   txtUsuario.requestFocus();
    }else{
    int msg = JOptionPane.showConfirmDialog(this,"Deseas Buscar el ADMIN & ESTANDAR ","Buscar",JOptionPane.YES_NO_OPTION);    
    if(msg == JOptionPane.YES_OPTION){
        
        login u = oacc.buscar(getUsuario());
        if(u == null){
            JOptionPane.showMessageDialog(this,"No se encuentro!!!");
            this.txtUsuario.requestFocus();
        }else{
            txtNombres.setText(u.getNombres());
            txtUsuario.setText("" +u.getUsuario());
            txtContra.setText("" +u.getContraseña());
            
        }
    }

   
    }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     dispose();
        frmMenuPrincipal mp = new frmMenuPrincipal();
     mp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistro().setVisible(true);
            }
        });
    }
    
    /*Obtener elementos de los objetos swing*/

    public String getNombreb()   {return txtNombres.getText();}
    public String getUsuario()     {return txtUsuario.getText();}
    public String getContra()     {return txtContra.getText();}
    
    public void llenaCombo(){
      cboTipo.addItem("Administrador");
      cboTipo.addItem("Estandar");     
    }
    /*Agregar las columnas de la tabla*/
    public void llenaColumna(){
      dtmAccesos.addColumn("Nombres y Apellidos");
      dtmAccesos.addColumn("Usuario");
      dtmAccesos.addColumn("Contraseña");
      dtmAccesos.addColumn("Contraseña encriptada");
      dtmAccesos.addColumn("Tipo");
      
      tAcceso.setModel(dtmAccesos);
    }

    
    
    public String getNombres(){return txtNombres.getText();}

    public String getContraseña(){return txtContra.getText();}
    public String getTipo(){return cboTipo.getSelectedItem().toString();}
    
    
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.ButtonGroup grupo01;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tAcceso;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JLabel txtTotalRegistros;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
