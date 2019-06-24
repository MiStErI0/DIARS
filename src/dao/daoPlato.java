/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ConexionBD.Conexion;
import clases.CategoriaPlato;
import clases.Plato;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luigi
 */
public class daoPlato {
    Conexion conexion;
    ArrayList<CategoriaPlato> cap;
    ArrayList<Plato> Plat;
    daoCategoriaPlato dcp ;
    
    public daoPlato() {
        cap = (ArrayList) getCategoriaPlato();

    }
    
    private List<CategoriaPlato> getCategoriaPlato() {
        List<CategoriaPlato> lista = new ArrayList();
        String sql = "select * from categoria_plato";
        Connection c = null;
        try {
            c = new Conexion().getMysql();
            ResultSet rs = null;
            PreparedStatement pst = c.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                CategoriaPlato catplat = new CategoriaPlato(rs.getString("IDCATEGORIA_PLATO"), rs.getString("CATEGORIA"));
                System.out.println(catplat.getIdCategoriaPlato()+ " " + catplat.getNombreCategoria());
                lista.add(catplat);
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
    
    
    
    public String insertPlato(String Plato, double Precio, int Estado, String IdCategoriaPlato){
        String respuestaRegistro = null;
        Connection accesoDB;
        try {
            accesoDB = new Conexion().getMysql();
            CallableStatement cs = accesoDB.prepareCall("{call sp_insertPlato(fn_idplato(),?,?,?,?)}");
            cs.setString(1, Plato);
            cs.setDouble(2, Precio);
            cs.setInt(3, Estado);
            cs.setString(4, IdCategoriaPlato);
            
            int numFAfectadas = cs.executeUpdate();
            if(numFAfectadas>0){
                respuestaRegistro = "Registro Exitoso";
            }
            cs.close();

            cs = null;
            accesoDB.close();
            accesoDB = null;
        } catch (Exception e) {
        }
        
        return respuestaRegistro;
    }
    
    public ArrayList<Plato> listPlato(String idCate){
        
        for(CategoriaPlato cp:cap)
        {
            if(cp.getNombreCategoria().equals(idCate))
            {
                idCate=cp.getIdCategoriaPlato();
                break;
            }
        
        }
        
        ArrayList listaPlato = new ArrayList();
        String Sql;
        Connection c;
        if(idCate == null)
        {
            Sql="select * from plato;";
        }else{
            Sql="SELECT * FROM plato where IDCATEGORIA_PLATO='"+idCate+"';";
        }
        try {
            c = new Conexion().getMysql();
            ResultSet rs = null;
            PreparedStatement pst = c.prepareCall(Sql);
            rs = pst.executeQuery();
            while (rs.next()) {                
                Plato p = new Plato(rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4),rs.getString(5));
                listaPlato.add(p);
            }
        } catch (Exception e) {
            System.out.println("no ingreso gg");

        }
        return listaPlato;
    }
    

    
    public void cargar_tabla(DefaultTableModel dtmtable,JTable jm,String idCate) {
        
            Plat=listPlato(idCate);
            dtmtable.setRowCount(0);//Limpia las filas del JTable
            Plat.stream().map((p) -> {
                Object vec[] = new Object[5];
                vec[0] = p.getIdPlato();
                vec[1] = p.getPlato();
                vec[2] = p.getPrecio();
                vec[3] = p.getEstado();
                vec[4] = p.getIdCategoriaPlato();
            return vec;
        }).forEachOrdered((vec) -> {
            //agregar al JTable
            dtmtable.addRow(vec);
        });
            jm.setModel(dtmtable);
    }

    
    public int editPlato(String IdPlato, String Plato, double Precio, int Estado, String IdCategoriaPlato){
        int numFA = 0;
        try {
            Connection acceDB = conexion.getMysql();
            CallableStatement cs = acceDB.prepareCall("{call sp_editPlato(fn_idplato(),?,?,?,?)}");
            cs.setString(1, Plato);
            cs.setDouble(2, Precio);
            cs.setInt(3, Estado);
            cs.setString(4, IdCategoriaPlato);
            
            numFA = cs.executeUpdate();
            
            cs.close();

            cs = null;
            acceDB.close();
            acceDB = null;
            
        } catch (Exception e) {
        }
        return numFA;
    }
    
    public int deletePlato(String idPlato){
        int numFA = 0;
        try {
            Connection acceDB = conexion.getMysql();
            CallableStatement cs = acceDB.prepareCall("{call sp_deletePlato(?)}");
            cs.setString(1, idPlato);
            
            numFA = cs.executeUpdate();
            cs.close();

            cs = null;
            acceDB.close();
            acceDB = null;
            
        } catch (Exception e) {
        }
        return numFA;
    }
    
}
