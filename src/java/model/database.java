/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author theji
 */
public class database {
    public static Connection getConnection(){
        String URL="jdbc:mysql://localhost:3306/greenlineairways";
        String username="root";
        String password="";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(URL,username,password);
            return con;
        }
        catch(Exception ex){
            System.out.println("Database.getConnection() Error-->"+ex.getMessage());
            return null;
        }
    }
    
    public static void close(Connection con){
        try{
            con.close();
        }
        catch(Exception ex){
            
        }
    }
}
