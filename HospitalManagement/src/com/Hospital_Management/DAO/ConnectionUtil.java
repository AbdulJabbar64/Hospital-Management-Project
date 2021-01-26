
package com.Hospital_Management.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionUtil {
    static Connection connection=null;
    private ConnectionUtil(){
        if (connection==null) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","scott");
            } catch (ClassNotFoundException |SQLException ex) {
                JOptionPane.showConfirmDialog(null, ex, "Error", JOptionPane.ERROR);
            }   
        }
    }
    public static Connection getConnection(){
        new ConnectionUtil();
        return connection;
    }
}
