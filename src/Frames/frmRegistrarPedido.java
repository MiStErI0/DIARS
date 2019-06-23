/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import ConexionBD.Conexion;
import dao.daoCategoriaPlato;
import dao.daoPlato;
import dao.daoMesa;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.Colorear_filas;

/**
 *
 * @author Luigi ga
 */
public class frmRegistrarPedido extends javax.swing.JFrame {

    /**
     * Creates new form frmRegistrarPedido
     */
    Conexion conexion;
    daoPlato daoPla = new daoPlato();
    daoCategoriaPlato dcp = new daoCategoriaPlato();
    daoMesa daoMes = new daoMesa();
    Colorear_filas color_fila = new Colorear_filas();
    int filaseleccionada;
    String cantidad;
    DefaultTableModel dtmPlato = new DefaultTableModel();
    DefaultTableModel dtmPedido = new DefaultTableModel();
    
    public frmRegistrarPedido() {
        initComponents();
        cargarCabeceraTablePedido();
        daoMes.cargar_cabecera(jtMesa);
        conexion = new Conexion();
        CargarComboMesero();
        llenacomboPersonas();
        dcp.cargarCategoriaPlato(cboCategoriaPlato);
        jtMesa.setDefaultRenderer(jtMesa.getColumnClass(1),color_fila );
        cargarCabeceraTablePlato();
        //daoPla.cargar_cabeceraTablaPlato(jtPlato);
        ocultar_Co();
        //ocultar_ColPla();
        
        this.setLocationRelativeTo(null);
    }
    
    private void ocultar_Co()
    {
//        TableColumn columna = jtMesa.getColumnModel().getColumn(1);
//        columna.setMaxWidth(0);
//        columna.setMinWidth(0);
//        columna.setPreferredWidth(0);
//        jtMesa.doLayout();
        jtMesa.getColumnModel().getColumn(1).setMaxWidth(0);
        jtMesa.getColumnModel().getColumn(1).setMinWidth(0);
        jtMesa.getColumnModel().getColumn(1).setPreferredWidth(0);

    }
    private void ocultar_ColPla()
    {
        TableColumn columna = jtPlato.getColumnModel().getColumn(1);
        columna.setMaxWidth(0);
        columna.setMinWidth(0);
        columna.setPreferredWidth(0);
        jtMesa.doLayout();
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
        jLabel3 = new javax.swing.JLabel();
        cboPersonas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboMeseroPedido = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMesa = new javax.swing.JTable();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Registrar Pedido");

        jLabel2.setText("Categoria de Plato :");

        cboCategoriaPlato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCategoriaPlato.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cboCategoriaPlatoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cboCategoriaPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriaPlatoActionPerformed(evt);
            }
        });

        jLabel3.setText("Numero de Mesa :");

        cboPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Personas");

        cboMeseroPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Mesero :");

        jtMesa.setModel(new javax.swing.table.DefaultTableModel(
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
        jtMesa.setColumnSelectionAllowed(true);
        jtMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMesaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtMesa);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cboMeseroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addComponent(cboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cboCategoriaPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnEliminarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cboMeseroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(cboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(cboCategoriaPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(btnEliminarPedido)
                                    .addComponent(btnAgregarPedido))
                                .addGap(19, 19, 19))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMesaMouseClicked
        // TODO add your handling code here:
        try{
            filaseleccionada = jtMesa.getSelectedRow();        
            if(filaseleccionada == -1){
                JOptionPane.showMessageDialog(this,"No se ha seleccionado ninguna fila","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                String colormesa = "";
                colormesa = jtMesa.getValueAt(filaseleccionada,1).toString();
                System.out.println(colormesa);
                if(colormesa.equals("0")){
                    
                    JOptionPane.showMessageDialog(this,"Se ha seleccionado \n"+ jtMesa.getValueAt(filaseleccionada,0).toString(),"Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(colormesa.equals("1")){
                    
                    JOptionPane.showMessageDialog(this,"La mesa seleccionada ya cuenta con un registro\n" + "Por favor procesa a seleccionar otra mesa","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(colormesa.equals("2")){
                    
                    JOptionPane.showMessageDialog(this,"La mesa seleccionada ya cuenta con un registro\n" + "Por favor procesa a seleccionar otra mesa","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                }
                
                                            
            }
        }catch (HeadlessException ex){
            JOptionPane.showMessageDialog(this,"Error" + ex + "\nPor favor inténtelo nuevamente","Mensaje del Sistema",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtMesaMouseClicked

    private void cboCategoriaPlatoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cboCategoriaPlatoPopupMenuWillBecomeInvisible
   
    }//GEN-LAST:event_cboCategoriaPlatoPopupMenuWillBecomeInvisible

    private void cboCategoriaPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaPlatoActionPerformed
        // TODO add your handling code here:
        
        dtmPlato.setRowCount(0);
        String tmp = (String)cboCategoriaPlato.getSelectedItem();
        try {
            Connection accesoDB = conexion.getMysql();
            PreparedStatement ps = accesoDB.prepareStatement("select p.PLATO, p.PRECIO from plato as p inner join categoria_plato as c on p.IDCATEGORIA_PLATO = c.IDCATEGORIA_PLATO where c.CATEGORIA = ?");
            ps.setString(1,tmp);
            
            ResultSet rs = ps.executeQuery();
            System.out.println(tmp);
            while(rs.next()){
                System.out.println(rs.getString(1)+" " +rs.getString(2));
                dtmPlato.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2)
                });
                //System.out.println(add);
            }
            jtPlato.setModel(dtmPlato);
            rs.close();
            
        } catch (Exception e) {
        }
        //daoPla.cargar_cabeceraTablaPlato(jtPlato);
    }//GEN-LAST:event_cboCategoriaPlatoActionPerformed

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
            if(filaseleccionada == -1){
                JOptionPane.showMessageDialog(this,"No se ha seleccionado ninguna fila","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                //dtmPedido.setRowCount(0);
                cantidad = txtcantidad.getText();
                if(cantidad.length()==0){
                    JOptionPane.showMessageDialog(this,"No se ha introducido una cantidad","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    importe = (Integer.parseInt(cantidad) * Double.parseDouble(jtPlato.getValueAt(filaseleccionada, 1).toString()));
                    dtmPedido = (DefaultTableModel) jtPedido.getModel();
                    String filaelemento[] = {
                        cantidad,
                        jtPlato.getValueAt(filaseleccionada, 0).toString(),
                        jtPlato.getValueAt(filaseleccionada, 1).toString(),
                        String.valueOf(importe)
                    };
                    dtmPedido.addRow(filaelemento);
                    System.out.println(jtPlato.getValueAt(filaseleccionada, 0).toString());
                }
                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

    private void btnEliminarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPedidoActionPerformed
        // TODO add your handling code here:
        int respuesta ;
        int fila;
        try {
            filaseleccionada = jtPlato.getSelectedRow();
            double importe;
            if(filaseleccionada == -1){
                JOptionPane.showMessageDialog(this,"No se ha seleccionado ninguna fila a eliminar","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                //dtmPedido.setRowCount(0);
                respuesta = JOptionPane.showConfirmDialog(null, "¿ Estas seguro de eliminar este plato del pedido ?","Eliminar",JOptionPane.YES_NO_OPTION); 
                if (respuesta==JOptionPane.YES_OPTION) {
                    dtmPedido = (DefaultTableModel) jtPedido.getModel();
                    dtmPedido.removeRow(filaseleccionada);
                }
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se realizo la eliminacion del plato, verifique.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrarPedido().setVisible(true);
            }
        });
    }

    public void CargarComboMesero(){
       Connection con = null;
       try {
           con = conexion.getMysql();
           String sql = "select p.NOMBRE_RS from persona as p inner join empleado as e inner join cargo as c on e.idpersona=p.idpersona and e.IDCARGO=c.IDCARGO where e.IDCARGO='CA00003';";
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = null;
            rs = ps.executeQuery();
            cboMeseroPedido.removeAllItems();
            while(rs.next()) {
                cboMeseroPedido.addItem(rs.getString(1));
            }
            rs.close();
       } catch (Exception e) {
       }
   }
    public void llenacomboPersonas(){
        cboPersonas.removeAllItems();
        for(int i =0 ;i<=20;i++){
            cboPersonas.addItem(""+i+"");
        }
    }
    
    
    public void cargarCabeceraTablePlato(){ 
        dtmPlato.addColumn("Nombre de Plato"); 
        dtmPlato.addColumn("Precio"); 
        jtPlato.setModel(dtmPlato);
    }
    
    public void cargarCabeceraTablePedido(){ 
        dtmPedido.addColumn("Cantidad"); 
        dtmPedido.addColumn("Plato"); 
        dtmPedido.addColumn("Precio");
        dtmPedido.addColumn("Importe"); 
        jtPedido.setModel(dtmPedido);
    }
   
       
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnEliminarPedido;
    private javax.swing.JComboBox<String> cboCategoriaPlato;
    private javax.swing.JComboBox<String> cboMeseroPedido;
    private javax.swing.JComboBox<String> cboPersonas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtMesa;
    private javax.swing.JTable jtPedido;
    private javax.swing.JTable jtPlato;
    private javax.swing.JTextField txtcantidad;
    // End of variables declaration//GEN-END:variables
}
