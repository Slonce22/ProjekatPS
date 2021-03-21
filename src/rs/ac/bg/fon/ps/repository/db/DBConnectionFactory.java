/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.ac.bg.fon.ps.repository.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class DBConnectionFactory {
    private Connection connection;
    public static DBConnectionFactory instance;
    
    private DBConnectionFactory() {}
    
    public static DBConnectionFactory getInstance() {
        if (instance == null)
            instance = new DBConnectionFactory();
        return instance;
    }
    
    public Connection getConnection() {
        if (connection == null) {
            String url = "jdbc:mysql://localhost:3306/psdb";
            String user = "root";
            String password = "";
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
                Logger.getLogger(DBConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }
}
