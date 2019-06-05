/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.*;
import Conexion.Conexion;
import clases.Trabajador;
import java.util.ArrayList;

/**
 *
 * @author Luigi
 */
public class daoTrabajador {
    
    Conexion conexion;
    
    public daoTrabajador(){
        conexion = new Conexion();
    }
    
    public String insertTrabajador(String traId,
    String traNombre,
    String traApellidop,
    String traApellidom,
    String traCorreo,
    String traTelefono,
    String traDni,
    String traFechaNac,
    String traEstado,
    String dirId){
        String rptaRegistroTrabajador = null;
        try {
            Connection accesoDB = conexion.getMysql();
            CallableStatement cs = accesoDB.prepareCall("{call sp_insertTrabajador(?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, traId);
            cs.setString(2, traNombre);
            cs.setString(3, traApellidop);
            cs.setString(4, traApellidom);
            cs.setString(5, traCorreo);
            cs.setString(6, traTelefono);
            cs.setString(7, traDni);
            cs.setString(8, traFechaNac);
            cs.setString(9, traEstado);
            cs.setString(10, dirId);
            
            int numFAfectadas = cs.executeUpdate();
            
            if(numFAfectadas>0){
                rptaRegistroTrabajador = "Registro exitoso.";
            }      
        } catch (Exception e) {
        }
        return rptaRegistroTrabajador;
    }
    
    public ArrayList<Trabajador> listTrabajador(){
        ArrayList listaTrabajador = new ArrayList();
        Trabajador trabajador;
        try {
            Connection acceDB = conexion.getMysql();
            PreparedStatement ps = acceDB.prepareStatement("select * from trabajador");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                trabajador = new Trabajador();
                trabajador.setTraId(rs.getString(1));
                trabajador.setTraNombre(rs.getString(2));
                trabajador.setTraApellidop(rs.getString(3));
                trabajador.setTraApellidom(rs.getString(4));
                trabajador.setTraCorreo(rs.getString(5));
                trabajador.setTraTelefono(rs.getString(6));
                trabajador.setTraDni(rs.getString(7));
                trabajador.setTraFechaNac(rs.getString(8));
                trabajador.setTraEstado(rs.getString(9));
                trabajador.setDirId(rs.getString(10));
                listaTrabajador.add(trabajador);
            }
        } catch (Exception e) {
        }
        
        return listaTrabajador;
    }
}
