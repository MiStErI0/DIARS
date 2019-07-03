      /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;
import ConexionBD.Conexion;
import clases.CategoriaPlato;
import clases.detalle_plato;
import clases.producto;
import dao.daoCategoriaPlato;
import dao.daoDetalle_plato;
import dao.daoPlato;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudiante
 */
public final class frmPlato extends javax.swing.JFrame {

    /**
     * Creates new form frmPlato
     */
    //Conexion conexion;
    
    daoPlato daoPla = new daoPlato();
    daoDetalle_plato ddp = new daoDetalle_plato();
    daoCategoriaPlato dcp = new daoCategoriaPlato();
    public static DefaultTableModel dtmplato = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; //To change body of generated methods, choose Tools | Templates.
        }

    };
    frmBuscarProducto frBpro;
    frmBuscarPlato frBpla;
    //ArrayList<detalle_plato> dtlp;
    detalle_plato dp;
    public static producto p;
    

    public frmPlato() {
        initComponents();
        LlenaComboEstadoPlato();
        dcp.cargarCategoriaPlato(cboCategoriaPlato);
        ddp.cargar_cabecera(dtmplato, tblprod);
        Ocultar_plato();
        activador(pnlPro, false);
        
        
    }
    
    public static void activador(JPanel panel, Boolean isEnabled) {
    panel.setEnabled(isEnabled);

    Component[] components = panel.getComponents();

    for(int i = 0; i < components.length; i++) {
        if(components[i].getClass().getName() == "javax.swing.JPanel") {
            activador((JPanel) components[i], isEnabled);
        }

        components[i].setEnabled(isEnabled);
    }
}
    public void Ocultar_plato()
    {
        tblprod.getColumnModel().getColumn(0).setMaxWidth(0);
        tblprod.getColumnModel().getColumn(0).setMinWidth(0);
        tblprod.getColumnModel().getColumn(0).setPreferredWidth(0);
//        tblprod.getColumnModel().getColumn(1).setPreferredWidth(120);
        tblprod.getColumnModel().getColumn(2).setMaxWidth(0);
        tblprod.getColumnModel().getColumn(2).setMinWidth(0);
        tblprod.getColumnModel().getColumn(2).setPreferredWidth(0);
//        tblprod.getColumnModel().getColumn(3).setPreferredWidth(120);
//        tblprod.getColumnModel().getColumn(4).setPreferredWidth(120);
        //tblprod.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        //tblprod.doLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblprod = new javax.swing.JTable();
        pnlPro = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtidprod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        txtproducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBusPro = new javax.swing.JButton();
        btnAgregarPlato = new javax.swing.JButton();
        btnBorrarPlato = new javax.swing.JButton();
        btnRegPro = new javax.swing.JButton();
        pnlPlato = new javax.swing.JPanel();
        btnActualizarPlato = new javax.swing.JButton();
        btnNuevoPlato = new javax.swing.JButton();
        cboEstadoPlato = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioPlato = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombrePlato = new javax.swing.JTextField();
        cboCategoriaPlato = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdPlato = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBusPla = new javax.swing.JButton();
        btnCancelarPlato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblprod.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblprod);

        pnlPro.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Id_producto :");

        txtidprod.setEditable(false);

        jLabel8.setText("Producto :");

        txtproducto.setEditable(false);

        jLabel9.setText("cantidad:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("PRODUCTO A USAR");

        btnBusPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/buscar.png"))); // NOI18N
        btnBusPro.setText("Buscar Producto");
        btnBusPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusProActionPerformed(evt);
            }
        });

        btnAgregarPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/add.png"))); // NOI18N
        btnAgregarPlato.setText("Agregar producto");
        btnAgregarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPlatoActionPerformed(evt);
            }
        });

        btnBorrarPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/borrar.png"))); // NOI18N
        btnBorrarPlato.setText("Borrar");
        btnBorrarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPlatoActionPerformed(evt);
            }
        });

        btnRegPro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/nuevo.png"))); // NOI18N
        btnRegPro.setText("Registrar produto");
        btnRegPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProLayout = new javax.swing.GroupLayout(pnlPro);
        pnlPro.setLayout(pnlProLayout);
        pnlProLayout.setHorizontalGroup(
            pnlProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProLayout.createSequentialGroup()
                .addGroup(pnlProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pnlProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlProLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(34, 34, 34)
                                .addComponent(txtidprod, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlProLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnBusPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarPlato))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegPro)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlProLayout.setVerticalGroup(
            pnlProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel10)
                .addGap(23, 23, 23)
                .addGroup(pnlProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlProLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtidprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(pnlProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(pnlProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBusPro)
                    .addComponent(btnAgregarPlato))
                .addGap(18, 18, 18)
                .addGroup(pnlProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarPlato)
                    .addComponent(btnRegPro))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnActualizarPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/actualizar.png"))); // NOI18N
        btnActualizarPlato.setText("Actualizar");
        btnActualizarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPlatoActionPerformed(evt);
            }
        });

        btnNuevoPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/new.png"))); // NOI18N
        btnNuevoPlato.setText("Nuevo");
        btnNuevoPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPlatoActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado :");

        jLabel5.setText("Precio :");

        jLabel4.setText("Nombre de Plato :");

        cboCategoriaPlato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Categoria :");

        jLabel2.setText("Id_Plato :");

        txtIdPlato.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Plato");

        btnBusPla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/buscar.png"))); // NOI18N
        btnBusPla.setText("Buscar Plato");
        btnBusPla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusPlaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPlatoLayout = new javax.swing.GroupLayout(pnlPlato);
        pnlPlato.setLayout(pnlPlatoLayout);
        pnlPlatoLayout.setHorizontalGroup(
            pnlPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPlatoLayout.createSequentialGroup()
                        .addGroup(pnlPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(pnlPlatoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(49, 49, 49)
                                .addComponent(txtIdPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(btnBusPla, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlPlatoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(56, 56, 56)
                                .addComponent(cboEstadoPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(pnlPlatoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(42, 42, 42)
                        .addComponent(cboCategoriaPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevoPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(pnlPlatoLayout.createSequentialGroup()
                        .addGroup(pnlPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPlatoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)
                                .addComponent(txtNombrePlato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizarPlato))
                            .addGroup(pnlPlatoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(60, 60, 60)
                                .addComponent(txtPrecioPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        pnlPlatoLayout.setVerticalGroup(
            pnlPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(pnlPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPlatoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addGroup(pnlPlatoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtIdPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBusPla))
                .addGroup(pnlPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPlatoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3))
                    .addGroup(pnlPlatoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboCategoriaPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoPlato))))
                .addGroup(pnlPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPlatoLayout.createSequentialGroup()
                        .addGroup(pnlPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPlatoLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel4))
                            .addGroup(pnlPlatoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtNombrePlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPlatoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addComponent(txtPrecioPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(pnlPlatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPlatoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel6))
                            .addComponent(cboEstadoPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlPlatoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarPlato)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnCancelarPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/cerrar.png"))); // NOI18N
        btnCancelarPlato.setText("Cancelar");
        btnCancelarPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPlatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(pnlPlato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarPlato)
                        .addGap(36, 36, 36)))
                .addComponent(pnlPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarPlato)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPlatoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarPlatoActionPerformed

    private void btnAgregarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPlatoActionPerformed
        // TODO add your handling code here:
        dp= new detalle_plato(txtidprod.getText(),txtproducto.getText(),txtIdPlato.getText(), txtNombrePlato.getText(),Double.parseDouble(txtCant.getText()),1);
 
        System.out.println(dp.getIdproducto()+dp.getProducto());

        ddp.adicionar(dp);
        
        ddp.cargar_tabla_detalle_plato(dtmplato, tblprod, null);
    }//GEN-LAST:event_btnAgregarPlatoActionPerformed

    private void btnActualizarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPlatoActionPerformed
        // TODO add your handling code here:
        int rptaEdit = daoPla.editPlato(getIdPlato(), getNombrePlato(), getPrecioPlato(),getEstadoPlato(),getIdCategoriaPlato());
         if(rptaEdit > 0){
            JOptionPane.showMessageDialog(null, "Edicion exitosa.");
        }
        else{
            JOptionPane.showMessageDialog(null, "No se realizo la edicion.");
        }
    }//GEN-LAST:event_btnActualizarPlatoActionPerformed

    private void btnBorrarPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPlatoActionPerformed
        // TODO add your handling code here:
        int rptaDelete = daoPla.deletePlato(getIdPlato());
         if(rptaDelete > 0){
            JOptionPane.showMessageDialog(null, "Edicion exitosa.");
        }
        else{
            JOptionPane.showMessageDialog(null, "No se realizo la edicion.");
        } 
    }//GEN-LAST:event_btnBorrarPlatoActionPerformed

    private void btnNuevoPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPlatoActionPerformed
        // TODO add your handling code here:
        String respuestaRegistro = daoPla.insertPlato(getNombrePlato(), getPrecioPlato(),getEstadoPlato(),getIdCategoriaPlato());
        if(respuestaRegistro != null){
            JOptionPane.showMessageDialog(null, respuestaRegistro);
        }
        else{
            JOptionPane.showMessageDialog(null, "REGISTRO ERRONEO.");
        }
    }//GEN-LAST:event_btnNuevoPlatoActionPerformed

    private void btnBusPlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusPlaActionPerformed
        // TODO add your handling code here:
        frBpla = new frmBuscarPlato();
        if (frBpla.isShowing()) {
            JOptionPane.showMessageDialog(this, "ya esta abierto la venta", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);
        } else {
            frBpla.setVisible(true);
        }
        activador(pnlPlato, false);
    }//GEN-LAST:event_btnBusPlaActionPerformed

    private void btnBusProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusProActionPerformed
        // TODO add your handling code here:
        frBpro = new frmBuscarProducto();
        if (frBpro.isShowing()) {
            JOptionPane.showMessageDialog(this, "ya esta abierto la venta", "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);
        } else {
            frBpro.setVisible(true);
            frBpro.si = "frmPla";
        }
        
    }//GEN-LAST:event_btnBusProActionPerformed

    private void txtPrecioPlato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioPlato1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioPlato1ActionPerformed

    private void btnRegProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegProActionPerformed
        // TODO add your handling code here:
        ddp.dtlp.forEach((detalle_plato dpd) -> {
            ddp.insertar_detalle_plato(dpd);
        });
        limpiar();
    }//GEN-LAST:event_btnRegProActionPerformed

    
    void limpiar()
    {
        txtCant.setText("");
        txtIdPlato.setText("");
        txtNombrePlato.setText("");
        txtidprod.setText("");
        txtproducto.setText("");
        cboCategoriaPlato.setSelectedIndex(0);
        cboEstadoPlato.setSelectedIndex(1);
    }
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
            java.util.logging.Logger.getLogger(frmPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPlato().setVisible(true);
            }
        });
    }

    public void LlenaComboEstadoPlato(){
        cboEstadoPlato.addItem("DESACTIVADO");
        cboEstadoPlato.addItem("ACTIVADO");   
    }
    
    public String getIdPlato(){
        return txtIdPlato.getText();
    }
    
    public String getNombrePlato(){
        return txtNombrePlato.getText().toUpperCase();
    }
    
    public double getPrecioPlato(){
        return Double.parseDouble(txtPrecioPlato.getText());
    }
    
    public int getEstadoPlato(){
        //return (int)cboEstadoPlato.getSelectedItem();
        System.out.println(cboEstadoPlato.getSelectedIndex());
        return cboEstadoPlato.getSelectedIndex();
    }
    
    public String getIdCategoriaPlato(){
        
        String Buscar = cboCategoriaPlato.getSelectedItem().toString();
        for(CategoriaPlato cp:dcp.listCategoriaPlato())
        {
            if(cp.getNombreCategoria().equals(Buscar))
            {
                System.out.println(Buscar);
                Buscar=cp.getIdCategoriaPlato();
                System.out.println(Buscar);

                break;
                
            }
        }
        
        return Buscar;
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnActualizarPlato;
    private javax.swing.JButton btnAgregarPlato;
    public static javax.swing.JButton btnBorrarPlato;
    private javax.swing.JButton btnBusPla;
    private javax.swing.JButton btnBusPro;
    private javax.swing.JButton btnCancelarPlato;
    private javax.swing.JButton btnNuevoPlato;
    private javax.swing.JButton btnRegPro;
    public static javax.swing.JComboBox<String> cboCategoriaPlato;
    public static javax.swing.JComboBox<String> cboEstadoPlato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlPlato;
    public static javax.swing.JPanel pnlPro;
    public static javax.swing.JTable tblprod;
    public static javax.swing.JTextField txtCant;
    public static javax.swing.JTextField txtIdPlato;
    public static javax.swing.JTextField txtNombrePlato;
    public static javax.swing.JTextField txtPrecioPlato;
    public static javax.swing.JTextField txtidprod;
    public static javax.swing.JTextField txtproducto;
    // End of variables declaration//GEN-END:variables
}
