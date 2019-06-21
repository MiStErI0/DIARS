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
    
    public void cargarCategoriaPlato(JComboBox jm)
    {
        DefaultComboBoxModel CatPlaComboCat = new DefaultComboBoxModel();
        CatPlaComboCat.addElement("Selec. Categoria");
        for(CategoriaPlato cp:cap)
        {
            CatPlaComboCat.addElement(cp.getNombreCategoria());
        }
        
        jm.setModel(CatPlaComboCat);
    }
    
    public String insertPlato(String IdPlato, String Plato, double Precio, int Estado, String IdCategoriaPlato){
        String respuestaRegistro = null;
        try {
            Connection accesoDB = conexion.getMysql();
            CallableStatement cs = accesoDB.prepareCall("{call sp_insertPlato(?,?,?,?,?)}");
            cs.setString(1, IdPlato);
            cs.setString(2, Plato);
            cs.setDouble(3, Precio);
            cs.setInt(4, Estado);
            cs.setString(5, IdCategoriaPlato);
            
            int numFAfectadas = cs.executeUpdate();
            if(numFAfectadas>0){
                respuestaRegistro = "Registro Exitoso";
            }
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
            CallableStatement cs = acceDB.prepareCall("{call sp_editPlato(?,?,?,?,?)}");
            cs.setString(1, IdPlato);
            cs.setString(2, Plato);
            cs.setDouble(3, Precio);
            cs.setInt(4, Estado);
            cs.setString(5, IdCategoriaPlato);
            
            numFA = cs.executeUpdate();
            
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
            
        } catch (Exception e) {
        }
        return numFA;
    }
    
}
