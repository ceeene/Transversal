
package universidadejemplo.AccesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;


public class InscripcionData {
    private int idInscripto;
    private Alumno alumno;
    private Materia materia;
    private double nota;
            
    private Connection con=null;

      
       
    public InscripcionData(){
        
        this.con=Conexion.getConexion();
    }
    
    public void guardarInscripcion (Inscripcion insc){
        
        String sql="INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,insc.getAlumno().getIdAlumno());
            ps.setInt(2,insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next());{
            
            insc.setIdInscripcion(rs.getInt(1));
            JOptionPane.showMessageDialog(null,"Inscripcion Registrada");
            
        }
           ps.close(); 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
            System.out.println(ex.getMessage());
            System.out.println("Codigo de error "+ex.getErrorCode());
        }
    }
}
    