/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ConexionBD.Conexion;
import clases.cliente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class daoCliente {
    Conexion conexion;
    ArrayList<cliente> clien ;

    public daoCliente() {
        
        clien=(ArrayList) getClien();
    }
    
    private List<cliente> getClien() {
        List<cliente> lista = new ArrayList();
        String sql = "SELECT c.idcliente,p.NOMBRE_RS,p.APELLIDOP,p.APELLIDOM,p.CORREO,p.TELEFONO,p.DNI_RUC,p.FECHA_NACI,p.ESTADO FROM persona as p\n" +
"			inner join cliente as c on c.idpersona=p.idpersona";
        Connection c = null;
        try {
            c = new Conexion().getMysql();
            ResultSet rs = null;
            PreparedStatement pst = c.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                cliente e = new cliente(rs.getString("IDCLIENTE"), rs.getString("NOMBRE_RS"),rs.getString("APELLIDOP"),rs.getString("APELLIDOM"),rs.getString("CORREO"),rs.getLong("TELEFONO"),rs.getLong("DNI_RUC"),rs.getString("FECHA_NACI"),rs.getInt("ESTADO"));
                System.out.println(rs.getString("IDCLIENTE")+"  "+rs.getString("NOMBRE_RS")+" "+rs.getString("APELLIDOP"));
                lista.add(e);
            }
            rs.close();

            rs = null;
            c.close();
            c = null;
        } catch (SQLException ex) {
            Logger.getLogger(daousuarios.class.getName()).log(Level.SEVERE, null, ex);
            try {
                c.close();
                c = null;
            } catch (SQLException ex1) {
                Logger.getLogger(daousuarios.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        return lista;
    }
    
    public void cargar_tabla(DefaultTableModel dtmtable,JTable jm) {
        
        if (tamaño()==0) {
            JOptionPane.showMessageDialog(null,"Lista sin elementos!!!", "Validar", 2);
        } else {
            dtmtable.setRowCount(0);//Limpia las filas del JTable
            for (cliente cl:clien) {
                Object vec[] = new Object[7];
                vec[0] = cl.getId();
                vec[1] = cl.getNombre()+" "+cl.getApellidop()+" "+cl.getApellidom();
                vec[2] = cl.getCorreo();
                vec[3] = cl.getTelefono();
                vec[4] = cl.getDni();
                vec[5] = cl.getFechaNac();
                vec[6] = cl.getEstado();
                //agregar al JTable
                dtmtable.addRow(vec);
            }
            jm.setModel(dtmtable);
        }

    }
    
     public void cargar_cabecera(JTable tbl) {
        DefaultTableModel dtmCabecera = new DefaultTableModel();        
        dtmCabecera.addColumn("IDCLIENTE");
        dtmCabecera.addColumn("NOMBRE Y APELLIDOS/RAZON SOCIAL");
        dtmCabecera.addColumn("CORREO");
        dtmCabecera.addColumn("TELEFONO");
        dtmCabecera.addColumn("DNI/RUC");
        dtmCabecera.addColumn("FECHA NACI.");
        dtmCabecera.addColumn("ESTADO");
        tbl.setModel(dtmCabecera);
        
         cargar_tabla(dtmCabecera, tbl);
        
    }
     public int tamaño(){
         return clien.size();
     }

     
    
    
   
    
    
}
