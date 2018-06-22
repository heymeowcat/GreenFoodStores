/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Meow-Meow!
 */
public class DB {
    private static Connection conn;
    private static void setConnection()throws Exception{
     Class.forName("com.mysql.jdbc.Driver");
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost/greenfoodstore", "root", "");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
     conn=DriverManager.getConnection("jdbc:mysql://localhost/greenfoodstore", "root", "");

    }
    public static void iud(String sql) throws Exception{
       if(conn == null){
           setConnection();
       }
       conn.createStatement().executeUpdate(sql);
    }
    public static ResultSet search(String sql)throws Exception{
        if(conn ==null){
            setConnection();
    }
      return conn.createStatement().executeQuery(sql);
    } 
    public static Connection getConnection(){
         
   Connection cn= null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             cn =DriverManager.getConnection("jdbc:mysql://localhost/greenfoodstore", "root", "");
        } catch (Exception e) {
                         JOptionPane.showMessageDialog(null, e.getMessage());
        }
    return cn;
    }
}
