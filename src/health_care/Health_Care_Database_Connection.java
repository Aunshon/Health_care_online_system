
package health_care;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Health_Care_Database_Connection {
    Connection conn=null;
    public static Connection ConnecrDb(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_health","root","");
    
    return conn;
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());
    return null;
    }
    }
}
