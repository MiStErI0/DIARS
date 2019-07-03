/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ConexionBD.Conexion;
import clases.cliente;
import clases.empleado;

import clases.usuario;
import java.sql.CallableStatement;
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

public class daoCliente {
    Conexion conexion;
    ArrayList<cliente> clien ;

    public daoCliente() {
        
        clien=(ArrayList) getClien();
    }
    
    public List<cliente> getClien() {
        List<cliente> lista = new ArrayList();
        String sql = "SELECT c.idcliente,p.IDPERSONA,p.NOMBRE_RS,p.APELLIDOP,p.APELLIDOM,p.CORREO,p.TELEFONO,p.DNI_RUC,p.FECHA_NACI,p.ESTADO, d.IDDIRECCION,d.DESCRIPCION,d.IDDISTRITO FROM persona as p\n" +
"			inner join cliente as c inner join direccion as d on c.idpersona=p.idpersona AND p.IDPERSONA = d.IDPERSONA";
        Connection c = null;
        try {
            c = new Conexion().getMysql();
            ResultSet rs = null;
            PreparedStatement pst = c.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                cliente e = new cliente(rs.getString("IDCLIENTE"),rs.getString("IDPERSONA"), rs.getString("NOMBRE_RS"),rs.getString("APELLIDOP"),rs.getString("APELLIDOM"),rs.getString("CORREO"),rs.getLong("TELEFONO"),rs.getLong("DNI_RUC"),rs.getString("FECHA_NACI"),rs.getInt("ESTADO"),rs.getString("IDDIRECCION"),rs.getString("DESCRIPCION"),rs.getString("IDDISTRITO"));
                System.out.println(rs.getString("IDCLIENTE")+"  "+rs.getString("NOMBRE_RS")+" "+rs.getString("APELLIDOP"));
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
    
    public void cargar_tabla(DefaultTableModel dtmtable,JTable jm) {
        
        if (tamaño()==0) {
            JOptionPane.showMessageDialog(null,"Lista sin elementos!!!", "Validar", 2);
        } else {
            dtmtable.setRowCount(0);//Limpia las filas del JTable
            for (cliente cl:clien) {
                Object vec[] = new Object[11];
                vec[0] = cl.getId();
                vec[1] = cl.getNombre();
                vec[2] = cl.getApellidop();
                vec[3] = cl.getApellidom();
                vec[4] = cl.getCorreo();
                vec[5] = cl.getTelefono();
                vec[6] = cl.getDni();
                vec[7] = cl.getFechaNac();
                vec[8] = cl.getEstado();
                vec[9] = cl.getDescripcion();
                vec[10] = cl.getIdPersona();
                //agregar al JTable
                dtmtable.addRow(vec);
            }
            jm.setModel(dtmtable);
        }

    }
    
     public void cargar_cabecera(JTable tbl) {
        DefaultTableModel dtmCabecera = new DefaultTableModel();        
        dtmCabecera.addColumn("IDCLIENTE");
        dtmCabecera.addColumn("NOMBRE");
        dtmCabecera.addColumn("APELLIDO PAT");
        dtmCabecera.addColumn("APELLIDO MAT");
        dtmCabecera.addColumn("CORREO");
        dtmCabecera.addColumn("TELEFONO");
        dtmCabecera.addColumn("DNI/RUC");
        dtmCabecera.addColumn("FECHA NACI.");
        dtmCabecera.addColumn("ESTADO");
        dtmCabecera.addColumn("DESCRIPCION");
        dtmCabecera.addColumn("IDPERSONSA");
        tbl.setModel(dtmCabecera);
        
         cargar_tabla(dtmCabecera, tbl);
        
    }
     public int tamaño(){
         return clien.size();
     }

     public String insertCliente(String NombreCliente,String ApellidoPCliente,String ApellidoMCliente,String CorreoCliente,long TelefonoCliente,long DniRucCliente,String FechaNacCliente, int Estado, String Direccion,String IdDistrito){
        String respuestaRegistro = null;
        Connection accesoDB;
        try {
            accesoDB = new Conexion().getMysql();
            CallableStatement cs = accesoDB.prepareCall("{call sp_insertCliente(fn_idcliente(),fn_idpersona(),?,?,?,?,?,?,?,?,fn_idDireccion(),?,?)}");
            cs.setString(1, NombreCliente);
            cs.setString(2, ApellidoPCliente);
            cs.setString(3, ApellidoMCliente);
            cs.setString(4, CorreoCliente);
            cs.setLong(5, TelefonoCliente);
            cs.setLong(6, DniRucCliente);
            cs.setString(7, FechaNacCliente);
            cs.setInt(8, Estado);
            cs.setString(9, Direccion);
            cs.setString(10, IdDistrito);
            
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
    
    public int editCliente(String IdPersona, String Nombre, String Apellidop, String Apellidom, String Correo, Long Telefono, Long Dni, String FechaNac, Integer Estado, String Descripcion, String IdDistrito){
        int numFA = 0;
        Connection c;
        try {
            c = new Conexion().getMysql();
            CallableStatement cs = c.prepareCall("{call sp_editCliente(?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, IdPersona);
            cs.setString(2, Nombre);
            cs.setString(3, Apellidop);
            cs.setString(4, Apellidom);
            cs.setString(5, Correo);
            cs.setLong(6, Telefono);
            cs.setLong(7, Dni);
            cs.setString(8, FechaNac);
            cs.setInt(9, Estado);
            cs.setString(10, Descripcion);
            cs.setString(11, IdDistrito);
            
            numFA = cs.executeUpdate();
            
        } catch (Exception e) {
        }
        return numFA;
    }
   
    public int deleteCliente(String idPersona){
        int numFA = 0;
        Connection c;
        try {
            c = new Conexion().getMysql();
            CallableStatement cs = c.prepareCall("{call sp_deleteCliente(?)}");
            cs.setString(1, idPersona);
            
            numFA = cs.executeUpdate();
            
        } catch (Exception e) {
        }
        return numFA;
    }
    
//    public String obtener_IdDistrito(String user)
//    {
//        empleado z=null;
//        String cargo=null;
//        usuario u=du.buscar(user);
//        for(empleado e:emple)
//        {
//            if(u.getIdEmpleado().equals(e.getId()))
//            {
//                cargo=e.getCargo();
//                z=e;
//                break;
//            }
//        }
//        return z;
//    }
//    
//    public void cargarProvi(JComboBox jm,String depar)
//    {
//        
//        DefaultComboBoxModel dcmdepar = new DefaultComboBoxModel();
//        dcmdepar.addElement("Selec. Provincia");
//        for(departamento de:der)
//        {
//            if(de.getDepartamento().equals(depar))
//            {
//                for(provincia pr:pro)
//                {
//                    if(de.getIddepartamento().equals(pr.getIddepartamento()))
//                    {
//                        dcmdepar.addElement(pr.getProvincia());
//                    }
//                }
//            }
//        }
//        
//        jm.setModel(dcmdepar);
//    }
    
}
