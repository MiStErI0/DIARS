/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ConexionBD.Conexion;
import clases.cliente;
import clases.departamento;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class daoCliente {
    
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
    

}
