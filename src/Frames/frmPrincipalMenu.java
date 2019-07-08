/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import clases.empleado;

/**
 *
 * @author Luigi
 */
public class frmPrincipalMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipalMenu
     */
    public empleado emp;
    
    public frmPrincipalMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Cuenta = new javax.swing.JMenuItem();
        Delivery = new javax.swing.JMenuItem();
        PreCuenta = new javax.swing.JMenuItem();
        Pedido = new javax.swing.JMenuItem();
        Mantenimiento = new javax.swing.JMenu();
        CategoriaPlato = new javax.swing.JMenuItem();
        Cliente = new javax.swing.JMenuItem();
        Empleado = new javax.swing.JMenuItem();
        Mesa = new javax.swing.JMenuItem();
        Plato = new javax.swing.JMenuItem();
        Producto = new javax.swing.JMenuItem();
        Usuario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        BuscarCategoriaPlato = new javax.swing.JMenuItem();
        BuscarCliente = new javax.swing.JMenuItem();
        BuscarEmpleado = new javax.swing.JMenuItem();
        BuscarMesa = new javax.swing.JMenuItem();
        BuscarPlato = new javax.swing.JMenuItem();
        BuscarProducto = new javax.swing.JMenuItem();
        BuscarUsuario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        AbrirCaja = new javax.swing.JMenuItem();
        CerrarCaja = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENU PRINCIPAL");
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/Background.png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 204, 204));

        jMenu1.setBackground(java.awt.SystemColor.textHighlight);
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/cash.png"))); // NOI18N
        jMenu1.setText("Venta");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.setMaximumSize(new java.awt.Dimension(90, 70));
        jMenu1.setMinimumSize(new java.awt.Dimension(27, 25));
        jMenu1.setPreferredSize(new java.awt.Dimension(67, 40));

        Cuenta.setText("Cuenta");
        Cuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CuentaMouseClicked(evt);
            }
        });
        Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuentaActionPerformed(evt);
            }
        });
        jMenu1.add(Cuenta);

        Delivery.setText("Delivery");
        Delivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveryActionPerformed(evt);
            }
        });
        jMenu1.add(Delivery);

        PreCuenta.setText("Pre Cuenta");
        PreCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreCuentaActionPerformed(evt);
            }
        });
        jMenu1.add(PreCuenta);

        Pedido.setText("Pedido");
        Pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedidoActionPerformed(evt);
            }
        });
        jMenu1.add(Pedido);

        jMenuBar1.add(jMenu1);

        Mantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/tools.png"))); // NOI18N
        Mantenimiento.setText("Mantenimiento");

        CategoriaPlato.setText("Categoria Plato");
        CategoriaPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaPlatoActionPerformed(evt);
            }
        });
        Mantenimiento.add(CategoriaPlato);

        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        Mantenimiento.add(Cliente);

        Empleado.setText("Empleado");
        Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoActionPerformed(evt);
            }
        });
        Mantenimiento.add(Empleado);

        Mesa.setText("Mesa");
        Mesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesaActionPerformed(evt);
            }
        });
        Mantenimiento.add(Mesa);

        Plato.setText("Plato");
        Plato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlatoActionPerformed(evt);
            }
        });
        Mantenimiento.add(Plato);

        Producto.setText("Producto");
        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });
        Mantenimiento.add(Producto);

        Usuario.setText("Usuario");
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        Mantenimiento.add(Usuario);

        jMenuBar1.add(Mantenimiento);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/loupe.png"))); // NOI18N
        jMenu3.setText("Busquedas");

        BuscarCategoriaPlato.setText("Buscar Categoria Plato");
        BuscarCategoriaPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCategoriaPlatoActionPerformed(evt);
            }
        });
        jMenu3.add(BuscarCategoriaPlato);

        BuscarCliente.setText("Buscar Cliente");
        BuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarClienteActionPerformed(evt);
            }
        });
        jMenu3.add(BuscarCliente);

        BuscarEmpleado.setText("Buscar Empleado");
        BuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEmpleadoActionPerformed(evt);
            }
        });
        jMenu3.add(BuscarEmpleado);

        BuscarMesa.setText("Buscar Mesa");
        BuscarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarMesaActionPerformed(evt);
            }
        });
        jMenu3.add(BuscarMesa);

        BuscarPlato.setText("Buscar Plato");
        jMenu3.add(BuscarPlato);

        BuscarProducto.setText("Buscar Producto");
        BuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarProductoActionPerformed(evt);
            }
        });
        jMenu3.add(BuscarProducto);

        BuscarUsuario.setText("Buscar Usuario");
        jMenu3.add(BuscarUsuario);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/strongbox.png"))); // NOI18N
        jMenu4.setText("Caja");
        jMenu4.setPreferredSize(new java.awt.Dimension(80, 32));

        AbrirCaja.setText("Abrir Caja");
        jMenu4.add(AbrirCaja);

        CerrarCaja.setText("Cerrar Caja");
        jMenu4.add(CerrarCaja);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/exit.png"))); // NOI18N
        jMenu5.setText("Salir");
        jMenu5.setPreferredSize(new java.awt.Dimension(80, 32));
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            dispose();
        }
    }//GEN-LAST:event_jMenu5MouseClicked

    private void BuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarClienteActionPerformed
        // TODO add your handling code here:
        frmProducto frmPro = new frmProducto();
        
        frmPro.setVisible(true);
    }//GEN-LAST:event_BuscarClienteActionPerformed

    private void BuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarProductoActionPerformed

    private void CuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CuentaMouseClicked
        // TODO add your handling code here:   
    }//GEN-LAST:event_CuentaMouseClicked

    private void CuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentaActionPerformed
        // TODO add your handling code here:
        frmCuenta frmCue = new frmCuenta();
        //me habia quedado jato
        frmCue.setVisible(true);
        frmCuenta.em=emp;
        frmCuenta.txtCajero.setText(emp.getNombre()+" "+emp.getApellidop()+" "+emp.getApellidom());
        
    }//GEN-LAST:event_CuentaActionPerformed

    private void DeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliveryActionPerformed
        // TODO add your handling code here:
        frmDelivery frmDel = new frmDelivery();
        
        frmDel.setVisible(true);
        frmDelivery.em=emp;
        frmDelivery.lblnombre.setText(emp.getNombre()+" "+emp.getApellidop()+" "+emp.getApellidom());
    }//GEN-LAST:event_DeliveryActionPerformed

    private void PreCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreCuentaActionPerformed
        // TODO add your handling code here:
        frmPreCuenta frmPreCue = new frmPreCuenta();
        frmPreCue.setVisible(true);
        
    }//GEN-LAST:event_PreCuentaActionPerformed

    private void PedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedidoActionPerformed
        // TODO add your handling code here:
        frmRegistrarPedido frmPed = new frmRegistrarPedido();       
        frmPed.setVisible(true);
        frmRegistrarPedido.empl=emp;
        
        
    }//GEN-LAST:event_PedidoActionPerformed

    private void CategoriaPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaPlatoActionPerformed
        // TODO add your handling code here:
        frmCategoriaPlato frmCatPla = new frmCategoriaPlato();
        
        frmCatPla.setVisible(true);
    }//GEN-LAST:event_CategoriaPlatoActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        // TODO add your handling code here:
        frmCliente frmCli = new frmCliente();
        frmCli.setVisible(true);
    }//GEN-LAST:event_ClienteActionPerformed

    private void EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoActionPerformed
        // TODO add your handling code here:
        frmEmpleado frmEmp = new frmEmpleado();
        
        frmEmp.setVisible(true);
    }//GEN-LAST:event_EmpleadoActionPerformed

    private void MesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesaActionPerformed
        // TODO add your handling code here:
        frmMesa frmMes = new frmMesa();
        
        frmMes.setVisible(true);
    }//GEN-LAST:event_MesaActionPerformed

    private void PlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlatoActionPerformed
        // TODO add your handling code here:
        frmPlato frmPla = new frmPlato();
        
        frmPla.setVisible(true);
    }//GEN-LAST:event_PlatoActionPerformed

    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
        // TODO add your handling code here:
        frmProducto frmPro = new frmProducto();
        
        frmPro.setVisible(true);
    }//GEN-LAST:event_ProductoActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
        frmUsuario frmUsu = new frmUsuario();
        
        frmUsu.setVisible(true);
    }//GEN-LAST:event_UsuarioActionPerformed

    private void BuscarCategoriaPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCategoriaPlatoActionPerformed
        // TODO add your handling code here:
        frmBuscarCategoriaPlato frmBusCatPla = new frmBuscarCategoriaPlato();
        
        frmBusCatPla.setVisible(true);
    }//GEN-LAST:event_BuscarCategoriaPlatoActionPerformed

    private void BuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEmpleadoActionPerformed
        // TODO add your handling code here:
        frmEmpleado frmEmp = new frmEmpleado();
        
        frmEmp.setVisible(true);
    }//GEN-LAST:event_BuscarEmpleadoActionPerformed

    private void BuscarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarMesaActionPerformed
        // TODO add your handling code here:
        frmMesa frmMes= new frmMesa();
        
        frmMes.setVisible(true);
    }//GEN-LAST:event_BuscarMesaActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipalMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AbrirCaja;
    private javax.swing.JMenuItem BuscarCategoriaPlato;
    private javax.swing.JMenuItem BuscarCliente;
    private javax.swing.JMenuItem BuscarEmpleado;
    private javax.swing.JMenuItem BuscarMesa;
    private javax.swing.JMenuItem BuscarPlato;
    private javax.swing.JMenuItem BuscarProducto;
    private javax.swing.JMenuItem BuscarUsuario;
    private javax.swing.JMenuItem CategoriaPlato;
    private javax.swing.JMenuItem CerrarCaja;
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenuItem Cuenta;
    private javax.swing.JMenuItem Delivery;
    private javax.swing.JMenuItem Empleado;
    private javax.swing.JMenu Mantenimiento;
    private javax.swing.JMenuItem Mesa;
    private javax.swing.JMenuItem Pedido;
    private javax.swing.JMenuItem Plato;
    private javax.swing.JMenuItem PreCuenta;
    private javax.swing.JMenuItem Producto;
    private javax.swing.JMenuItem Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
