
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Materia;


public class MateriaData {
    
     private Connection con = null;
     
 public MateriaData() {

 con = Conexion.getConexion();
 }
 
 public void guardarMateria(Materia materia){
     String sql="INSERT INTO materia( asignatura, anio, estado)"
             + "VALUES(?, ?, ?)"; 
     
        try { 
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getAsignatura());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate(); 
            
            ResultSet rs=ps.getGeneratedKeys(); 
            if(rs.next()){
                materia.setIdMateria(rs.getInt(1)); 
                JOptionPane.showMessageDialog(null, "materia agregada exitosamente");
                
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
        } 
 }
 public void modificarMateria (Materia materia){

String sql="UPDATE materia SET asignatura= ?, anio= ? "
        + "WHERE  idMateria=? ";
try {
PreparedStatement ps= con.prepareStatement(sql);
 ps.setString(1, materia.getAsignatura());
 ps.setInt(2, materia.getAnio());
 ps.setInt(3,materia.getIdMateria());
 int exito =ps.executeUpdate();
 
 if (exito ==1) {}
 
 JOptionPane.showMessageDialog(null, "Materia modificada correctamente");
} catch (SQLException ex) {

JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
} 
 }
 

 public void eliminarMateria(int id){

String sql= "UPDATE Materia SET estado= 0 "
        + "WHERE idMateria= ?";


         try {
             PreparedStatement ps= con.prepareStatement(sql);
             ps.setInt(1, id);
             int exito= ps.executeUpdate();
             
             if (exito ==1) {
 
 JOptionPane.showMessageDialog(null, "Materia eliminada correctamente");}
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"error al eliminar");
         }
 }
public Materia buscarMateria (int id) {
        Materia materia= null;
String sql= "SELECT asignatura, anio FROM materia WHERE idMateria= ? AND estado=1";
         PreparedStatement ps=null;
        
         try {
             ps=con.prepareStatement(sql);
             ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            
            if (rs.next()){
            
                materia= new Materia ();
                materia.setIdMateria(id);
                materia.setAsignatura(rs.getString("asignatura"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo (true);
              
            } else {
            
            
            JOptionPane.showMessageDialog(null, "no existe un alumno con ese id");
            
            }            
            
            
            
            ps.close ();
            
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"error al buscar materia");
         }
         return materia;
}
 public List<Materia> ListaMaterias (){
 
 String sql= "SELECT idMateria, asignatura, anio, estado FROM materia WHERE estado = 1";
 
 ArrayList<Materia> materias= new ArrayList<>();
 
 
         try {
             PreparedStatement ps = con.prepareStatement(sql);
         
         
             
            ResultSet rs= ps.executeQuery();
            
            while (rs.next()){
                
              Materia materia= new Materia ();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setAsignatura(rs.getString("asignatura"));
                materia.setAnio(rs.getInt("año"));
                materia.setActivo (true);
                
                materias.add(materia);
 }
} catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error");
         }
        return materias;
 }
}




