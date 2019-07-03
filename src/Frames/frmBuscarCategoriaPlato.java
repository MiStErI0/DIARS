/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import dao.daoCategoriaPlato;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Estudiante
 */
public class frmBuscarCategoriaPlato extends javax.swing.JFrame {

    /**
     * Creates new form frmBuscarCategoriaPlato
     */
    daoCategoriaPlato daoCatPla = new daoCategoriaPlato();
    DefaultTableModel dtmCategoriaPlato = new DefaultTableModel();
    int filaseleccionada;
    public frmBuscarCategoriaPlato() {
        initComponents();
        cargarCabeceraTable();
        listarTable();
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
        txtbuscarCategoriaPlato = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCategoriaPlato = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Buscar Categoria de Plato");

        txtbuscarCategoriaPlato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarCategoriaPlatoKeyTyped(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/buscar.png"))); // NOI18N
        btnBuscar.setText("Mantener Categoria");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jtCategoriaPlato.setModel(new javax.swing.table.DefaultTableModel(
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
        jtCategoriaPlato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCategoriaPlatoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCategoriaPlato);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/cerrar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtbuscarCategoriaPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(56, 56, 56)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarCategoriaPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtbuscarCategoriaPlatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarCategoriaPlatoKeyTyped
        // TODO add your handling code here:
        filtro("(?i)" + txtbuscarCategoriaPlato.getText(), jtCategoriaPlato);
    }//GEN-LAST:event_txtbuscarCategoriaPlatoKeyTyped

    private void jtCategoriaPlatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCategoriaPlatoMouseClicked
        // TODO add your handling code here:
        frmCategoriaPlato frmcatpla = new frmCategoriaPlato();
        try{
            filaseleccionada = jtCategoriaPlato.getSelectedRow();        
            if(filaseleccionada == -1){
                JOptionPane.showMessageDialog(this,"No se ha seleccionado ninguna fila","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                //DefaultTableModel modelotabla = (DefaultTableModel) jtCategoria.getModel();
                frmcatpla.txtidCategoriaPlato.setText(jtCategoriaPlato.getValueAt(filaseleccionada,0).toString());              
                frmcatpla.txtnombreCategoria.setText(jtCategoriaPlato.getValueAt(filaseleccionada,1).toString());                  
                
                JOptionPane.showMessageDialog(this,"¡Categoría encontrada!","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE); 
                frmcatpla.show();
                frmcatpla.btnActualizar.setEnabled(true);
                frmcatpla.btnBorrar.setEnabled(true);
                frmcatpla.txtnombreCategoria.setEnabled(true);
                dispose();
                                            
            }
        }catch (HeadlessException ex){
            JOptionPane.showMessageDialog(this,"Error" + ex + "\nPor favor inténtelo nuevamente","Mensaje del Sistema",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtCategoriaPlatoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        frmCategoriaPlato frmcatpla = new frmCategoriaPlato();
        frmcatpla.show();
        dispose();
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(frmBuscarCategoriaPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscarCategoriaPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscarCategoriaPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscarCategoriaPlato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBuscarCategoriaPlato().setVisible(true);
            }
        });
    }
    
    public void cargarCabeceraTable(){
        dtmCategoriaPlato.addColumn("ID Categoría Plato"); 
        dtmCategoriaPlato.addColumn("Nombre de Categoria"); 
        jtCategoriaPlato.setModel(dtmCategoriaPlato);
    }
    
    public void listarTable(){
        Object[] columna = new Object[2];
        int numRegistros = daoCatPla.listCategoriaPlato().size();
        
        for (int i = 0; i < numRegistros; i++){
            columna[0] = daoCatPla.listCategoriaPlato().get(i).getIdCategoriaPlato();
            columna[1] = daoCatPla.listCategoriaPlato().get(i).getNombreCategoria();
            dtmCategoriaPlato.addRow(columna);
        }
        jtCategoriaPlato.setModel(dtmCategoriaPlato);  
    }
    
    public void filtro(String filtro, JTable jtableBuscar){
        dtmCategoriaPlato = (DefaultTableModel) jtableBuscar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dtmCategoriaPlato);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(filtro));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCategoriaPlato;
    private javax.swing.JTextField txtbuscarCategoriaPlato;
    // End of variables declaration//GEN-END:variables
}
