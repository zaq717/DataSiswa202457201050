package datasiswa202457201050;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection mysqlconfig;
    public static Connection konek(){
        try {
           String url = "jdbc:mysql://localhost:3306/alumni202457201050";
           String user = "root";
           String password = "";
           mysqlconfig = DriverManager.getConnection(url,user,password);
        } catch (SQLException SQLException) {
            System.err.println(SQLException.getMessage());
        }
        return mysqlconfig;
        
    }
    
}
