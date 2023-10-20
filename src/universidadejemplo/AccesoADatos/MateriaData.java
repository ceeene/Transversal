
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Materia;


public class MateriaData {
    private Connection con = null;
    
    public MateriaData() {

 con = Conexion.getConnection();
 
 }
    public void guadarMateria(Materia materia){
     String sql;
        sql = "INSERT INTO materia(asignatura, anio, estado)" 
                + "VALUES( ?, ?, ?)";
    try { 
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getAsignatura());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate(); 
            
            ResultSet rs=ps.getGeneratedKeys(); 
            if(rs.next()){
                materia.setIdMateria(rs.getInt(1)); 
                JOptionPane.showMessageDialog(null, "Materia agregada exitosamente");
                
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
            System.out.println(ex.getMessage());
            System.out.println("Codigo de error "+ex.getErrorCode());
        } 
    }
}
    