/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class conexion {

    public conexion() {
    }
    
   
   private static final String url ="jdbc:mysql://localhost:3306/machis?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private static final String user="root";
    private static final String password="database";
    
    public static synchronized Connection getConexion(){
        Connection cn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection(url,user,password);
            System.out.println(" me conecte");
        } catch (Exception e) {
            System.out.println(" no me conecte "+ e.getMessage());
        }
        
        return cn;
    }
    
    public static synchronized void CierraConexion(Connection cn){
        try {
            cn.close();
        } catch (Exception e) {
            System.out.println(" error al cerrar "+ e.getMessage());
        }
    }
    
}