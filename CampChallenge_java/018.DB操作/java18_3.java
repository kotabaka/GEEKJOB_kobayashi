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
public class java18_3 {
     public static void main(String[] args){
        Connection db_con =null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","KOBAYASHIKENTO","3649");
            System.out.println("接続できました");
            System.out.println("GetCatalog:"+db_con.getCatalog());
            
            Statement stmt=db_con.createStatement();
            String sql ="insert into profiles(profilesID,name,tel,age,birthday) values (6,'小林　健人','090-1234-9876',27,'1990-08-30')";
            int num =stmt.executeUpdate(sql);
            sql="select * from profiles";
            
            ResultSet rs =stmt.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("profilesID");
                String name =rs.getString("name");
                String tel =rs.getString("tel");
                int age =rs.getInt("age");
                Date date =rs.getDate("birthday");
                
                System.out.println(id+name+tel+age+date);
                
                
            }
            rs.close();
                stmt.close();
            
        }catch(Exception e_con){
            System.out.println(e_con.getMessage());
        }
}
}
