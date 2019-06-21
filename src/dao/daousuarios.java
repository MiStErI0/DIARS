/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ConexionBD.Conexion;
import clases.empleado;
import clases.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mono
 */
public class daousuarios {
    private ArrayList<usuario>ven;
    public daousuarios() {
        
        ven =(ArrayList)getUsua();
    
        
    }
    private List<usuario> getUsua() {
        List<usuario> lista = new ArrayList();
        String sql = "select * from usuario";
        Connection c = null;
        try {
            c = new Conexion().getMysql();
            ResultSet rs = null;
            PreparedStatement pst = c.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                usuario e = new usuario(rs.getString("idusuario"), rs.getString("usuario"), rs.getString("contraseña"), rs.getInt("estado"), rs.getString("idempleado"));
                System.out.println(e.getIdUsuario() + " " + e.getUsuario() + " " + e.getContraseña() + " " + e.getEstado() + " " + e.getIdEmpleado());
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
    
    public int tamaño(){
        return ven.size();
    }
    public usuario buscar(String user){
        for(int i=0;i<tamaño();i++){
            if(ven.get(i).getUsuario().equalsIgnoreCase(user)){
                return ven.get(i);
            }
        }
        return null;
    } 
    
    public void Sesion(usuario e, String activo) {
        String sql = "UPDATE usuario set sesion=? where idUsuario=? and usuario=?";
        Connection c = null;
        try {
            c = new Conexion().getMysql();
            PreparedStatement pst = c.prepareCall(sql);
            if (activo.equals("Iniciar")) {
                pst.setInt(1, 2);
                pst.setString(2, e.getIdUsuario());
                pst.setString(3, e.getUsuario());
                System.out.println("sesion        inicio             funciona ");
            } else {
                pst.setInt(1, 1);
                pst.setString(2, e.getIdUsuario());
                pst.setString(3, e.getUsuario());
                System.out.println("sesion         Cerrar            funciona ");
            }
            int rs = pst.executeUpdate();
            c.close();
            c = null;
        } catch (SQLException ex) {
            Logger.getLogger(daousuarios.class.getName()).log(Level.SEVERE, null, ex);
            try {
                c.close();
                c = null;
                System.out.println("sesion           no          funciona ");
            } catch (SQLException ex1) {
                Logger.getLogger(daousuarios.class.getName()).log(Level.SEVERE, null, ex1);
                System.out.println("sesion           no          funciona ");

            }
        }
    }

    

}
