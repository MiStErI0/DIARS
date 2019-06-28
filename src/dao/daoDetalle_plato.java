/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ConexionBD.Conexion;
import clases.departamento;
import clases.detalle_plato;
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

/**
 *
 * @author johan
 */
public class daoDetalle_plato {
    
    ArrayList<detalle_plato> dtlp;

    public daoDetalle_plato() {
        
    }
    
    private List<detalle_plato> getdeta_plato(String plato) {
        List<detalle_plato> lista = new ArrayList();
        String sql = "SELECT d.IDPRODUCTOS,p.producto,d.IDPLATO,a.plato,d.cantidad, d.estado from detalle_plato as d\n"
                + "inner join  producto as p on p.idproductos=d.idproductos\n"
                + "inner join plato as a on a.idplato= d.idplato where a.plato=?";
        Connection c = null;
        try {
            c = new Conexion().getMysql();
            ResultSet rs = null;
            PreparedStatement pst = c.prepareCall(sql);
            pst.setString(1,plato);
            rs = pst.executeQuery();
            while (rs.next()) {
                detalle_plato e = new detalle_plato(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getInt(6));
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
    
    public void cargar_tabla_detalle_plato(DefaultTableModel dtmtable,JTable jm,String Plato) {
        
            dtlp=(ArrayList)getdeta_plato(Plato);
            dtmtable.setRowCount(0);//Limpia las filas del JTable
            dtlp.stream().map((p) -> {
                Object vec[] = new Object[5];
                vec[0] = p.getIdproducto();
                vec[1] = p.getProducto();
                vec[2] = p.getIdplato();
                vec[3] = p.getPlato();
                vec[4] = p.getCantidad();
                if(p.getEstado()==1)
                {
                    vec[5]="ACTIVO";
                }else
                    vec[5]="DESACTIVADO";
             
            return vec;
        }).forEachOrdered((vec) -> {
            //agregar al JTable
            dtmtable.addRow(vec);
        });
            jm.setModel(dtmtable);
    }
    
    public void cargar_cabecera(DefaultTableModel dtmtable, JTable tabla)
    {
        dtmtable.addColumn("IDPRODUCTO");
        dtmtable.addColumn("PRODUCTO");
        dtmtable.addColumn("IDPLATO");
        dtmtable.addColumn("PLATO");
        dtmtable.addColumn("CANTIDAD");
        dtmtable.addColumn("ESTADO");
        tabla.setModel(dtmtable);
        
    }
}
