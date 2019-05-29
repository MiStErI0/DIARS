/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class frmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuPrincipal
     */
    ImageIcon menu = new ImageIcon("src\\machis\\Menuf.jpg");
    public frmMenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        Icon mn =new ImageIcon(menu.getImage().getScaledInstance(Menufondo.getWidth(), Menufondo.getHeight(),Image.SCALE_DEFAULT));
        Menufondo.setIcon(mn);
        Menufondo.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menufondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Administrador = new javax.swing.JMenu();
        registrar = new javax.swing.JMenuItem();
        productos = new javax.swing.JMenuItem();
        mnuNF = new javax.swing.JMenu();
        facturas = new javax.swing.JMenuItem();
        ayuda = new javax.swing.JMenu();
        mnuCerrar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Menufondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 531, 400));

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBar1.setForeground(new java.awt.Color(0, 153, 204));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setOpaque(false);

        Administrador.setText("Administrador");
        Administrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministradorActionPerformed(evt);
            }
        });

        registrar.setText("Registar usuarios");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        Administrador.add(registrar);

        productos.setText("ingresar productor");
        Administrador.add(productos);

        jMenuBar1.add(Administrador);

        mnuNF.setText("Empleado");
        mnuNF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuNF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNFActionPerformed(evt);
            }
        });

        facturas.setText("facturacion");
        facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturasActionPerformed(evt);
            }
        });
        mnuNF.add(facturas);

        jMenuBar1.add(mnuNF);

        ayuda.setText("ayuda");
        ayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(ayuda);

        mnuCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.jpg"))); // NOI18N
        mnuCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuCerrarMouseClicked(evt);
            }
        });
        mnuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCerrarActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuCerrar);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministradorActionPerformed
    
    }//GEN-LAST:event_AdministradorActionPerformed

    private void mnuNFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNFActionPerformed
    
    }//GEN-LAST:event_mnuNFActionPerformed

    private void mnuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCerrarActionPerformed
    
    }//GEN-LAST:event_mnuCerrarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
    frmRegistro fr = new frmRegistro();
    fr.setVisible(true);
    dispose();
    
    }//GEN-LAST:event_registrarActionPerformed

    private void facturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturasActionPerformed
    frmFactura1 frm = new frmFactura1();
    dispose();
    frm.setVisible(true);
    }//GEN-LAST:event_facturasActionPerformed

    private void ayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudaMouseClicked
    frmAyuda fa=new frmAyuda();
    fa.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_ayudaMouseClicked

    private void mnuCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCerrarMouseClicked
       

        dispose();
        JOptionPane.showMessageDialog(this, "GRACIAS","VUELVA PRONTO",2);
// TODO add your handling code here:
    }//GEN-LAST:event_mnuCerrarMouseClicked
    
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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu Administrador;
    private javax.swing.JLabel Menufondo;
    private javax.swing.JMenu ayuda;
    private javax.swing.JMenuItem facturas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuCerrar;
    public javax.swing.JMenu mnuNF;
    private javax.swing.JMenuItem productos;
    public javax.swing.JMenuItem registrar;
    // End of variables declaration//GEN-END:variables
}
