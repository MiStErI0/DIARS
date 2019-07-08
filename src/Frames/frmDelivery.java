/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import ConexionBD.Conexion;
import clases.cliente;
import clases.empleado;
import clases.pedido;
import dao.daoCategoriaPlato;
import dao.daoComTip;
import dao.daoPlato;
import dao.daoMesa;
import dao.daoPedido;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Colorear_filas;

/**
 *
 * @author Luigi ga
 */
public class frmDelivery extends javax.swing.JFrame {

    /**
     * Creates new form frmRegistrarPedido
     */
    Conexion conexion;
    daoPlato daoPla = new daoPlato();
    daoCategoriaPlato dcp = new daoCategoriaPlato();
    daoMesa daoMes = new daoMesa();
    Colorear_filas color_fila = new Colorear_filas();
    int filaseleccionada;
    int cantidad;
    DefaultTableModel dtmPlato = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int i, int i1) { 
            return false; //To change body of generated methods, choose Tools | Templates.
        }
    };
    DefaultTableModel dtmPedido = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false; //To change body of generated methods, choose Tools | Templates.
        }
    };
    daoPedido dp = new daoPedido();
    public static cliente cl =new cliente();
    public static empleado em ;
    daoComTip comb = new daoComTip();

    public frmDelivery() {
        initComponents();
        cargarCabeceraTablePedido();
        dcp.cargarCategoriaPlato(cboCategoriaPlato);
        cargarCabeceraTablePlato();
        Ocultar_plato();
        comb.cargarCompro(cboComprobanteDePago);
        this.setLocationRelativeTo(null);
    }

    public void Ocultar_plato() {
        jtPlato.getColumnModel().getColumn(0).setMaxWidth(0);
        jtPlato.getColumnModel().getColumn(0).setMinWidth(0);
        jtPlato.getColumnModel().getColumn(0).setPreferredWidth(0);
        jtPlato.getColumnModel().getColumn(3).setMaxWidth(0);
        jtPlato.getColumnModel().getColumn(3).setMinWidth(0);
        jtPlato.getColumnModel().getColumn(3).setPreferredWidth(0);
        jtPlato.getColumnModel().getColumn(4).setMaxWidth(0);
        jtPlato.getColumnModel().getColumn(4).setMinWidth(0);
        jtPlato.getColumnModel().getColumn(4).setPreferredWidth(0);

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
        jLabel2 = new javax.swing.JLabel();
        cboCategoriaPlato = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPlato = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtPedido = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        btnEliminarPedido = new javax.swing.JButton();
        btnAgregarPedido = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBus = new javax.swing.JButton();
        btnAgre = new javax.swing.JButton();
        btnEnvi = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        cboComprobanteDePago = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Delivery");

        jLabel2.setText("Categoria de Plato :");

        cboCategoriaPlato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCategoriaPlato.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboCategoriaPlatoItemStateChanged(evt);
            }
        });

        jLabel5.setText("Cajero: ");

        jtPlato.setModel(new javax.swing.table.DefaultTableModel(
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
        jtPlato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPlatoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtPlato);

        jtPedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtPedido);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Pedido");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/cerrar.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEliminarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/remove.png"))); // NOI18N
        btnEliminarPedido.setText("Remover");
        btnEliminarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPedidoActionPerformed(evt);
            }
        });

        btnAgregarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/add.png"))); // NOI18N
        btnAgregarPedido.setText("Agregar");
        btnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoActionPerformed(evt);
            }
        });

        jLabel7.setText("Cantidad :");

        jLabel4.setText("Cliente:");

        btnBus.setText("buscar");
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });

        btnAgre.setText("agregar");

        btnEnvi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/enviar.png"))); // NOI18N
        btnEnvi.setText("Enviar pedido");
        btnEnvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviActionPerformed(evt);
            }
        });

        jLabel8.setText("Comprobante de Pago");

        jLabel3.setText("TOTAL:");

        txtTotal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(cboCategoriaPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnBus)
                        .addGap(5, 5, 5)
                        .addComponent(btnAgre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel8)
                        .addGap(23, 23, 23)
                        .addComponent(cboComprobanteDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(0, 87, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEnvi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotal)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cboCategoriaPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBus)
                    .addComponent(btnAgre))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboComprobanteDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarPedido)
                            .addComponent(jButton1))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarPedido)
                            .addComponent(btnEnvi)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtPlatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPlatoMouseClicked
        // TODO add your handling code here:

//        try {
//            filaseleccionada = jtPlato.getSelectedRow();
//            if(filaseleccionada == -1){
//                JOptionPane.showMessageDialog(this,"No se ha seleccionado ninguna fila","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
//            }
//            else{
//                //dtmPedido.setRowCount(0);
//                dtmPedido = (DefaultTableModel) jtPedido.getModel();
//                String filaelemento[] = {
//                    jtPlato.getValueAt(filaseleccionada, 0).toString(),
//                    jtPlato.getValueAt(filaseleccionada, 0).toString(),
//                    jtPlato.getValueAt(filaseleccionada, 0).toString()
//                };
//                dtmPedido.addRow(filaelemento);
//                System.out.println(jtPlato.getValueAt(filaseleccionada, 0).toString());
//            }
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_jtPlatoMouseClicked

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed
        // TODO add your handling code here:
        try {
            filaseleccionada = jtPlato.getSelectedRow();
            double importe;
            String descripcion;
            if (filaseleccionada == -1) {
                JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna fila", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                //dtmPedido.setRowCount(0);
                if (txtcantidad.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "No se ha introducido una cantidad", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    descripcion = JOptionPane.showInputDialog(null, "Descripcion", "Descripcion", NORMAL);
                    cantidad = Integer.parseInt(txtcantidad.getText());            
                    importe = (cantidad * Double.parseDouble(jtPlato.getValueAt(filaseleccionada, 2).toString()));
                    pedido p = new pedido(jtPlato.getValueAt(filaseleccionada, 1).toString(), cantidad, descripcion, Double.parseDouble(jtPlato.getValueAt(filaseleccionada, 2).toString()), importe);

                    dp.adicionar(p);
                    
                    txtTotal.setText(String.valueOf(dp.suma_platos()));

                    dp.cargar_tabla_pedido(dtmPedido, jtPedido);
                    System.out.println(jtPlato.getValueAt(filaseleccionada, 0).toString());
                }

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

    private void btnEliminarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPedidoActionPerformed
        // TODO add your handling code here:
        int respuesta;
        int fila;
        try {
            filaseleccionada = jtPlato.getSelectedRow();
            double importe;
            if (filaseleccionada == -1) {
                JOptionPane.showMessageDialog(this, "No se ha seleccionado ninguna fila a eliminar", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);
            } else {
                //dtmPedido.setRowCount(0);
                respuesta = JOptionPane.showConfirmDialog(null, "¿ Estas seguro de eliminar este plato del pedido ?", "Eliminar", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    dtmPedido = (DefaultTableModel) jtPedido.getModel();
                    dtmPedido.removeRow(filaseleccionada);
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se realizo la eliminacion del plato, verifique.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarPedidoActionPerformed

    private void cboCategoriaPlatoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboCategoriaPlatoItemStateChanged
        // TODO add your handling code here:
        daoPla.cargar_tabla_plato(dtmPlato, jtPlato, cboCategoriaPlato.getSelectedItem().toString());
    }//GEN-LAST:event_cboCategoriaPlatoItemStateChanged

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
        // TODO add your handling code here:
        frmBuscarCliente bc = new frmBuscarCliente();
        bc.setVisible(true);
        frmBuscarCliente.estados="frmDeli";
    }//GEN-LAST:event_btnBusActionPerformed

    private void btnEnviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviActionPerformed
        // TODO add your handling code here:
        String comprobante=cboComprobanteDePago.getSelectedItem().toString();
        dp.delibery(em, cl,comprobante, "DELIVERY", "EFECTIVO");
        JOptionPane.showConfirmDialog(this,"Registro Exitoso", "Delivery",NORMAL);
    }//GEN-LAST:event_btnEnviActionPerformed

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
            java.util.logging.Logger.getLogger(frmDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDelivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new frmDelivery().setVisible(true);
            }
        });
    }

    public void cargarCabeceraTablePedido() {
        dtmPedido.addColumn("Plato");
        dtmPedido.addColumn("Cantidad");
        dtmPedido.addColumn("Descripcion");
        dtmPedido.addColumn("Precio");
        dtmPedido.addColumn("Importe");

        jtPedido.setModel(dtmPedido);
    }

    public void cargarCabeceraTablePlato() {
        dtmPlato.addColumn("ID Plato");
        dtmPlato.addColumn("Nombre de Plato");
        dtmPlato.addColumn("Precio");
        dtmPlato.addColumn("Estado");
        dtmPlato.addColumn("Categoria de Plato");
        jtPlato.setModel(dtmPlato);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgre;
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnEliminarPedido;
    private javax.swing.JButton btnEnvi;
    private javax.swing.JComboBox<String> cboCategoriaPlato;
    private javax.swing.JComboBox<String> cboComprobanteDePago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtPedido;
    private javax.swing.JTable jtPlato;
    public static javax.swing.JLabel lblnombre;
    public static javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtcantidad;
    // End of variables declaration//GEN-END:variables
}
