/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java18;
import java.sql.*;

/**
 *
 * @author guest1Day
 */
public class java_18_1 {
    public static void main(String[] args){
        Connection db_con =null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","KOBAYASHIKENTO","3649");
            System.out.println("接続できました");
            System.out.println("GetCatalog;"+db_con.getCatalog());
        }catch(Exception e_con){
            System.out.println(e_con.getMessage());
        }
        
    }
    
}
