
package com.mycompany.ams;

import com.source.main.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class AMS {
    

    
    public static Connection connectmysqldb() {
        try{
            String username = "root";
            String pass = "Aianlouise24@";
            String sqlconn = "jdbc:mysql://localhost:3306/ams";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(sqlconn, username, pass);
            return conn;
            
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }

    
}
