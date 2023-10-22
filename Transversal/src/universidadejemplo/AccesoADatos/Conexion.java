
package universidadejemplo.AccesoADatos;

import java.sql.*; 

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost/"; 
    private static final String BD="ulp"; 
    private static final String USUARIO= "root"; 
    private static final String PASSWORD=""; 
    private static Connection connection; 
    
    private Conexion(){}
    
    public static Connection getConnection(){
        if(connection==null){
            try { 
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+BD,USUARIO,PASSWORD); 
                
                JOptionPane.showMessageDialog(null,"Conectado");
                
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers"); 
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al conectarse a la base de datos");
                System.out.println(ex.getMessage());
                System.out.println("Codigo de error "+ex.getErrorCode());
            }
        }
        return connection; 
    }
    
}
