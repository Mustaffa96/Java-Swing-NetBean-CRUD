

import java.sql.*;
import javax.swing.*;
        
public class MySqlConnect {
    
    Connection conn = null;
    
    public static Connection ConnectDB(){
        try{
            
           Class.forName("com.mysql.cj.jdbc.Driver"); //loading the driver
            
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","");
           //JOptionPane.showMessageDialog(null, "Connection Successful");
           return conn;
                   
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }  
    }
}
