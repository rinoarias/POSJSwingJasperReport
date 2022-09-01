
package app;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Rino Arias
 */
public class Conexion {
    
    public static Connection getConexion(){
        
        Connection conexion = null;
        
        try{
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/tienda",
                    "postgres", "123456");
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        return conexion;
    }
}
