/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ConexionBD.Conexion;
import clases.cliente;
import clases.empleado;
import clases.pedido;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author johan07
 */
public class daoPedido {

    private ArrayList<pedido> ped;

    public daoPedido() {
        ped = new ArrayList<pedido>();
    }

    public void adicionar(pedido a) {
        ped.add(a);
    }

    //Obtener elementos de la lista
    public pedido obtener(int i) {
        return ped.get(i);
    }

    //Eliminar un objeto
    public void eliminar(pedido a) {
        ped.remove(a);
    }

    //El tamaño total de los elementos de la lista
    public int tamaño() {
        return ped.size();
    }

    public ArrayList<pedido> obtenList() {
        return ped;
    }

    public void cargar_tabla_pedido(DefaultTableModel dtmtable, JTable jm) {

        if (tamaño() == 0) {
            JOptionPane.showMessageDialog(null, "Lista sin elementos!!!", "Validar", 2);
        } else {
            dtmtable.setRowCount(0);//Limpia las filas del JTable
            for (pedido p : ped) {
                Object vec[] = new Object[5];
                vec[0] = p.getPLATO();
                vec[1] = p.getCANTIDAD();
                vec[2] = p.getDESCRIPCION();
                vec[3] = p.getPRECIO();
                vec[4] = p.getIMPORTE();
                //agregar al JTable
                dtmtable.addRow(vec);
            }

            jm.setModel(dtmtable);
        }

    }
    
    public double suma_platos()
    {
        double suma = 0;
        for (pedido p : ped) {
                suma=suma+p.getIMPORTE();
            }
        return suma; 
    }

    public void delibery(empleado e,cliente cl,String comprobante,String mesa,String tipo_pago) {
        String idpedi;
        Connection c;
        CallableStatement cs;
        Double monto=suma_platos();
        ResultSet rs;
        try {
            //int rs;

            c = new Conexion().getMysql();
            c.setAutoCommit(false);
            cs = c.prepareCall("{call sp_inse_pedi(?,?)}");
            cs.setString(1, mesa);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.executeUpdate();
            idpedi = cs.getString(2);
            for (pedido p : obtenList()) {
                
                cs = c.prepareCall("{call sp_inser_deta_pedi(?,?,?,?,?)}");
                cs.setString(1, idpedi);
                System.out.println(idpedi);
                cs.setString(2, p.getPLATO());
                System.out.println(p.getPLATO());
                cs.setString(3, e.getId());
                System.out.println(e.getId());
                cs.setInt(4, p.getCANTIDAD());
                System.out.println(p.getCANTIDAD());
                cs.setString(5, p.getDESCRIPCION());
                System.out.println(p.getDESCRIPCION());

                //cs.registerOutParameter(2, Types.VARCHAR);
                rs=cs.executeQuery();
            }
            cs = c.prepareCall("{call sp_venta(?,?,?,?,?,?)}");
            cs.setDouble(1,monto);
            cs.setString(2,comprobante);
            cs.setString(3,mesa);
            cs.setString(4,tipo_pago);
            cs.setString(5,e.getId());
            cs.setString(6,cl.getId());
            rs=cs.executeQuery();
            //respuestaRegistro=cs.getString(2);

            c.commit();
            c.close();
            c = null;
            cs.close();
            cs = null;
            //System.out.println(respuestaRegistro);
        } catch (SQLException ex) {
            Logger.getLogger(daoPedido.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void pedido(empleado e, String mesa)
    {
        String idpedi;
        Connection c;
        CallableStatement cs;
        Double monto=suma_platos();
        ResultSet rs = null;
        try {
            //int rs;

            c = new Conexion().getMysql();
            c.setAutoCommit(false);
            cs = c.prepareCall("{call sp_inse_pedi(?,?)}");
            cs.setString(1, mesa);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.executeUpdate();
            idpedi = cs.getString(2);
            for (pedido p : obtenList()) {
                
                cs = c.prepareCall("{call sp_inser_deta_pedi(?,?,?,?,?)}");
                cs.setString(1, idpedi);
                cs.setString(2, p.getPLATO());
                cs.setString(3, e.getId());
                cs.setInt(4, p.getCANTIDAD());
                cs.setString(5, p.getDESCRIPCION());

                //cs.registerOutParameter(2, Types.VARCHAR);
                rs=cs.executeQuery();
            }
            //respuestaRegistro=cs.getString(2);
            
            c.commit();
            c.close();
            c = null;
            cs.close();
            cs = null;
            JOptionPane.showConfirmDialog(null, "Registro exitoso", "Confirmacion",2);
            //System.out.println(respuestaRegistro);
        } catch (SQLException ex) {
            Logger.getLogger(daoPedido.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showConfirmDialog(null, "Registro fallido", "Confirmacion",2);

        }
    }
}
