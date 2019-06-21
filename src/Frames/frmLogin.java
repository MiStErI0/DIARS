package Frames;

import clases.empleado;
import clases.usuario;
import dao.daoEmpleado;
import dao.daoLogin;
import dao.daousuarios;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.codec.digest.DigestUtils;

public class frmLogin extends javax.swing.JFrame {

    daousuarios ven = new daousuarios();
    daoEmpleado empl = new daoEmpleado();
    ImageIcon fondo = new ImageIcon("src\\machis\\fondo.jpg");
    ImageIcon logo = new ImageIcon("src\\machis\\Logo.png");
    ImageIcon ingresar = new ImageIcon("src\\machis\\ingresar.png");
    ImageIcon salir = new ImageIcon("src\\machis\\salir.png");
    ImageIcon usua = new ImageIcon("src\\machis\\User.png");

    public frmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        iconos();

    }

    private void iconos() {
        Icon fn = new ImageIcon(fondo.getImage().getScaledInstance(fondolg.getWidth(), fondolg.getHeight(), Image.SCALE_DEFAULT));
        Icon lg = new ImageIcon(logo.getImage().getScaledInstance(imglogo.getWidth(), imglogo.getHeight(), Image.SCALE_DEFAULT));
        Icon in = new ImageIcon(ingresar.getImage().getScaledInstance(btnIngresar.getWidth(), btnIngresar.getHeight(), Image.SCALE_DEFAULT));
        Icon sa = new ImageIcon(salir.getImage().getScaledInstance(btnSalir.getWidth(), btnSalir.getHeight(), Image.SCALE_DEFAULT));
        Icon us = new ImageIcon(usua.getImage().getScaledInstance(usuario.getWidth(), usuario.getHeight(), Image.SCALE_DEFAULT));
        imglogo.setIcon(lg);
        fondolg.setIcon(fn);
        btnIngresar.setIcon(in);
        btnSalir.setIcon(sa);
        usuario.setIcon(us);
        imglogo.repaint();
        fondolg.repaint();
        btnIngresar.repaint();
        btnSalir.repaint();
        usuario.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtuser = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        imglogo = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        fondolg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtuser.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 180, 40));

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        password.setSelectionColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 180, 40));

        btnIngresar.setBackground(java.awt.SystemColor.desktop);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 50, 50));

        btnSalir.setBackground(java.awt.SystemColor.controlLtHighlight);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setMaximumSize(new java.awt.Dimension(19, 13));
        btnSalir.setPreferredSize(new java.awt.Dimension(62, 36));
        btnSalir.setSelected(true);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 30, 30));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIAR SESION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 240, 30));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 3, 14)); // NOI18N
        jLabel2.setText("USUARIO : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 3, 14)); // NOI18N
        jLabel3.setText("CONTRASEÑA :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        getContentPane().add(imglogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 310, 250));
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 150, 130));
        getContentPane().add(fondolg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        if (getUser().length() == 0 || getPassword().length() == 0) {
            JOptionPane.showMessageDialog(this, "No deben haber campos vacios");

        } else {

            String pass = getPassword();
            usuario v = ven.buscar(getUser());
            empleado e;
            if (v != null) {
                if (pass.equals(v.getContraseña())) {
                    e=empl.obtener_cargo(getUser());
                    if (e.getCargo().equals("Cajero") || e.getCargo().equals("Administrador") ) {
                        ven.Sesion(v, "Iniciar");
                        JOptionPane.showMessageDialog(this, "Bienvenido " + v.getUsuario(), "BIENVENIDO", 1);
                        frmAbrirCaja r;
                        r = new frmAbrirCaja();
                        r.setVisible(true);
                        frmAbrirCaja.txtEmpleado.setText(e.getNombre()+" "+e.getApellidop()+" "+e.getApellidom());

                        dispose();

                    } else {
                        JOptionPane.showMessageDialog(this, "Bienvenido " + v.getUsuario(), "BIENVENIDO", 1);
                        frmMenuPrincipal r;
                        r = new frmMenuPrincipal();
                        r.setVisible(true);
                        dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "contraseña invalida");

                }
            } else {
                JOptionPane.showMessageDialog(this, "Usuario no existe");
            }

        }


    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        dispose();

    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    public String getUser() {
        return txtuser.getText();
    }

    public String getPassword() {
        return password.getText();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondolg;
    private javax.swing.JLabel imglogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtuser;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
