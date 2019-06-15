/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ConexionBD.Conexion;
import clases.CategoriaPlato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    ArrayList<CategoriaPlato> CategoriaPlato;
    
    public daoPlato() {
        CategoriaPlato = (ArrayList) getCategoriaPlato();
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
        for(CategoriaPlato cp:CategoriaPlato)
        {
            CatPlaComboCat.addElement(cp.getNombreCategoria());
        }
        
        jm.setModel(CatPlaComboCat);
    }
    
}
