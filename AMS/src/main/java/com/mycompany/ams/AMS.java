/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ams;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aianl
 */
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
        java.util.Random r = new java.util.Random();
        int start = 10000;
        int end = 100000;
        int result = r.nextInt(end-start) + start;
        
        System.out.println(result);
    }

    
}
