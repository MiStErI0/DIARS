/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import modelo.Colorear_filas;
import ConexionBD.Conexion;
import dao.daoMesa;
import dao.daoComTip;
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
import javax.swing.table.TableColumn;
/**
 *
 * @author Luigi
 */
public class frmCuenta extends javax.swing.JFrame {

    /**
     * Creates new form frmCuenta
     */
    Conexion conexion;
    daoMesa dme = new daoMesa();
    daoComTip cmt=new daoComTip();
    Colorear_filas color_fila = new Colorear_filas();
    int filaseleccionada;
    
    public frmCuenta() {
        initComponents();
        dme.cargar_cabecera(jMesa);
        cmt.cargarCompro(cboComprobanteDePago);
        cmt.cargarMetodo(cboMetodoDePago);
        jMesa.setDefaultRenderer(jMesa.getColumnClass(1),color_fila );
        new Thread(new Hilo()).start();
        ocultar_Co();
        conexion = new Conexion();
        CargarComboMesero();
        
        this.setLocationRelativeTo(null);
    }
    
    private void ocultar_Co()
    {
        TableColumn columna = jMesa.getColumnModel().getColumn(1);
        columna.setMaxWidth(0);
        columna.setMinWidth(0);
        columna.setPreferredWidth(0);
        jMesa.doLayout();
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
        lblfecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboMesero = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMesa = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblprod = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboMetodoDePago = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboComprobanteDePago = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cuenta");

        lblfecha.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lblfecha.setText("FECHA Y TIEMPO");

        jLabel3.setText("Cajero :");

        jLabel4.setText("Mesero :");

        cboMesero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Mesa :");

        jMesa.setModel(new javax.swing.table.DefaultTableModel(
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
        jMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMesaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jMesa);

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Pedido");

        jLabel7.setText("Metodo de Pago");

        jLabel8.setText("Comprobante de Pago");

        jLabel9.setText("Sub Total :");

        jLabel10.setText("IGV :");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel11.setText("Total :");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/receipt.png"))); // NOI18N
        jButton1.setText("PRE - CUENTA");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/cash.png"))); // NOI18N
        jButton2.setText("PAGAR");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/machis/cancel.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel11))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jTextField4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(21, 21, 21)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(cboMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(154, 154, 154)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cboComprobanteDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cboMetodoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(cboMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboMetodoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(cboComprobanteDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMesaMouseClicked
        // TODO add your handling code here:
        try{
            filaseleccionada = jMesa.getSelectedRow();        
            if(filaseleccionada == -1){
                JOptionPane.showMessageDialog(this,"No se ha seleccionado ninguna fila","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                String colormesa = "";
                colormesa = jMesa.getValueAt(filaseleccionada,1).toString();
                System.out.println(colormesa);
                if(colormesa.equals("0")){
                    
                    JOptionPane.showMessageDialog(this,"La mesa seleccionada no cuenta con registros pendiente\n" + "Por favor elija otra mesa","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(colormesa.equals("1")){
                    
                    JOptionPane.showMessageDialog(this,"La mesa seleccionada aun no se ha imprimido la precuenta\n" + "Por favor procesa a realizar la Pre-Cuenta","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(colormesa.equals("2")){
                    
                    JOptionPane.showMessageDialog(this,"Se ha seleccionado \n"+ jMesa.getValueAt(filaseleccionada,0).toString()   +"\n" + "Se procede a mostrar sus pedidos","Mensaje del Sistema",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                }
                
                                            
            }
        }catch (HeadlessException ex){
            JOptionPane.showMessageDialog(this,"Error" + ex + "\nPor favor inténtelo nuevamente","Mensaje del Sistema",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMesaMouseClicked

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
            java.util.logging.Logger.getLogger(frmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCuenta().setVisible(true);
            }
        });
    }
    
    public class Hilo implements Runnable {

        @Override
        public void run() {
            new Timer(0, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Date d = new Date();
                    SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a dd-MMMM-YYYY");
                    lblfecha.setText(s.format(d));
                }
            }).start();
        }
    }
    
   public void CargarComboMesero(){
       Connection con = null;
       try {
           con = conexion.getMysql();
           String sql = "select p.NOMBRE_RS from persona as p inner join empleado as e inner join cargo as c on e.idpersona=p.idpersona and e.IDCARGO=c.IDCARGO where e.IDCARGO='CA00003';";
            PreparedStatement ps = con.prepareCall(sql);
            ResultSet rs = null;
            rs = ps.executeQuery();
            cboMesero.removeAllItems();
            while(rs.next()) {
                cboMesero.addItem(rs.getString(1));
            }
            rs.close();
       } catch (Exception e) {
       }
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboComprobanteDePago;
    private javax.swing.JComboBox<String> cboMesero;
    private javax.swing.JComboBox<String> cboMetodoDePago;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTable jMesa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JTable tblprod;
    // End of variables declaration//GEN-END:variables
}
