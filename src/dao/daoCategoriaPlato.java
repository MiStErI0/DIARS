/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import ConexionBD.Conexion;
import clases.CategoriaPlato;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Luigi
 */
public class daoCategoriaPlato {
    Conexion conexion;
    
    public daoCategoriaPlato(){
        conexion = new Conexion();
    }
    
    
    public String insertCategoriaPlato(String nombreCategoria){
        String respuestaRegistro = null;
        Connection accesoDB;
        try {
            accesoDB = conexion.getMysql();
            CallableStatement cs = accesoDB.prepareCall("{call sp_insertCategoriaPlato(fn_idcategoria_plato(),?)}");
            
            cs.setString(1, nombreCategoria);
            
            int numFAfectadas = cs.executeUpdate();
            if(numFAfectadas>0){
                respuestaRegistro = "Registro Exitoso";
            }
        } catch (Exception e) {
        }
        
        return respuestaRegistro;
    }
    
    public ArrayList<CategoriaPlato> listCategoriaPlato(){
        ArrayList listaCategoriaPlato = new ArrayList();
        CategoriaPlato categoriaplato;
        try {
            Connection acceDB = conexion.getMysql();
            PreparedStatement ps = acceDB.prepareStatement("select * from categoria_plato");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                categoriaplato = new CategoriaPlato();
                categoriaplato.setIdCategoriaPlato(rs.getString(1));
                categoriaplato.setNombreCategoria(rs.getString(2));
                listaCategoriaPlato.add(categoriaplato);
            }
        } catch (Exception e) {
        }
        return listaCategoriaPlato;
    }
    
    public int editCategoriaPlato(String idCategoriaPlato,String nombreCategoria){
        int numFA = 0;
        try {
            Connection acceDB = conexion.getMysql();
            CallableStatement cs = acceDB.prepareCall("{call sp_editCategoriaPlato(?,?)}");
            cs.setString(1, idCategoriaPlato);
            cs.setString(2, nombreCategoria);
            
            numFA = cs.executeUpdate();
            
        } catch (Exception e) {
        }
        return numFA;
    }
    
    public int deleteCategoriaPlato(String idCategoriaPlato){
        int numFA = 0;
        try {
            Connection acceDB = conexion.getMysql();
            CallableStatement cs = acceDB.prepareCall("{call sp_deleteCategoriaPlato(?)}");
            cs.setString(1, idCategoriaPlato);
            
            numFA = cs.executeUpdate();
            
        } catch (Exception e) {
        }
        return numFA;
    }
    
}
