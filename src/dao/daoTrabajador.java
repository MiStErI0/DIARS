/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.*;
import Conexion.Conexion;

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
        } catch (Exception e) {
        }
        return rptaRegistroTrabajador;
    }
    
    
}
