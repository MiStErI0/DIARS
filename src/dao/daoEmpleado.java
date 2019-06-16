package dao;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ConexionBD.Conexion;
import clases.empleado;
import clases.TipoCargo;
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
 * @author johan07
 */
public class daoEmpleado {
    
    ArrayList<empleado> emple ;
    ArrayList<TipoCargo> TipoCargo;

    public daoEmpleado() {
        
        emple=(ArrayList) getEmpleado();
        TipoCargo = (ArrayList) getTipoCargo();

    }
    
    private List<TipoCargo> getTipoCargo() {
        List<TipoCargo> lista = new ArrayList();
        String sql = "select * from cargo";
        Connection c = null;
        try {
            c = new Conexion().getMysql();
            ResultSet rs = null;
            PreparedStatement pst = c.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                TipoCargo tipcar = new TipoCargo(rs.getString("IDCARGO"), rs.getString("CARGO"));
                System.out.println(tipcar.getIdCargoEmpleado()+ " " + tipcar.getNombreCargoEmpleado());
                lista.add(tipcar);
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
    
    public void cargarTipoDeCargo(JComboBox jm)
    {
        DefaultComboBoxModel TipCarComboCargo = new DefaultComboBoxModel();
        TipCarComboCargo.addElement("Selec. Departamento");
        for(TipoCargo tc:TipoCargo)
        {
            TipCarComboCargo.addElement(tc.getNombreCargoEmpleado());
        }
        
        jm.setModel(TipCarComboCargo);
    }
    
    
    private List<empleado> getEmpleado() {
        List<empleado> lista = new ArrayList();
        String sql = "SELECT e.idempleado,p.NOMBRE_RS,p.APELLIDOP,p.APELLIDOM,p.CORREO,p.TELEFONO,p.DNI_RUC,p.FECHA_NACI,p.ESTADO FROM persona as p\n" +
"			inner join empleado as e on e.idpersona=p.idpersona";
        Connection c = null;
        try {
            c = new Conexion().getMysql();
            ResultSet rs = null;
            PreparedStatement pst = c.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                empleado e = new empleado(rs.getString("IDCLIENTE"), rs.getString("NOMBRE_RS"),rs.getString("APELLIDOP"),rs.getString("APELLIDOM"),rs.getString("CORREO"),rs.getLong("TELEFONO"),rs.getLong("DNI_RUC"),rs.getString("FECHA_NACI"),rs.getInt("ESTADO"));
                System.out.println(rs.getString("IDCLIENTE")+"  "+rs.getString("NOMBRE_RS")+" "+rs.getString("APELLIDOP"));
                lista.add(e);
            }
            rs.close();

            rs = null;
            c.close();
            c = null;
        } catch (SQLException ex) {
            Logger.getLogger(daoEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            try {
                c.close();
                c = null;
            } catch (SQLException ex1) {
                Logger.getLogger(daoEmpleado.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        return lista;
    }
    
    public void cargar_tabla(DefaultTableModel dtmtable,JTable jm) {
        
        if (tamaño()==0) {
            JOptionPane.showMessageDialog(null,"Lista sin elementos!!!", "Validar", 2);
        } else {
            dtmtable.setRowCount(0);//Limpia las filas del JTable
            for (empleado cl:emple) {
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
         return emple.size();
     }
     
     
    

}
