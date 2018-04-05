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
public class java18_6 {
     public static void main(String[] args){
        Connection db_con =null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","KOBAYASHIKENTO","3649");
            System.out.println("接続できました");
            System.out.println("GetCatalog:"+db_con.getCatalog());
            
            PreparedStatement sql=null;
            ResultSet rs =null;
            sql=db_con.prepareStatement("DELETE from profiles where profilesID =?");
            sql.setInt(1, 6);
            
            int i =sql.executeUpdate();
            System.out.println(i+"行が削除されました");
            sql =db_con.prepareStatement("select * from profiles");
            
            //sql.setString(1,"%" + "茂" + "%");
            
            
            
            rs =sql.executeQuery();
            while(rs.next()){
                int id = rs.getInt("profilesID");
                String name =rs.getString("name");
                String tel =rs.getString("tel");
                int age =rs.getInt("age");
                Date date =rs.getDate("birthday");
              
                System.out.println(id+name+tel+age+date);
              
             
            }
            rs.close();
            
            
        }catch(Exception e_con){
            System.out.println(e_con.getMessage());
        }
}
}
