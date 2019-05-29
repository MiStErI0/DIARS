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
    private final String url ="jdbc:mysql://localhost:3306/machis?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private final String user="root";
    private final String password="database";
    
    public Connection getMysql(){
        Connection c = null;     
        try {
            DriverManager.registerDriver(new Driver());
            c = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }      
        return c;
    }   
}