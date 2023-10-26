
package universidadejemplo.AccesoADatos;

import java.sql.*;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;


public class AlumnoData {
    private Connection con = null;

 public AlumnoData() {

 con = Conexion.getConnection();
 
 }
 public void guardarAlumno(Alumno alumno){
     String sql="INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado)"
             + "VALUES(?, ?, ?, ?, ?)"; 
     
        try { 
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf (alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate(); 
            
            ResultSet rs=ps.getGeneratedKeys(); 
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1)); 
                JOptionPane.showMessageDialog(null, "Alumno agregado exitosamente");
                
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno");
            System.out.println(ex.getMessage());
            System.out.println("Codigo de error "+ex.getErrorCode());
        } 
        
        
 } 
  
 
 public void eliminarAlumno(int id) {
    String sql= "UPDATE alumno SET estado= 0 WHERE idAlumno= ? ";
         try{ 
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, id);
             int exito=ps.executeUpdate();
             
             if(exito==1){
                 JOptionPane.showMessageDialog(null, "Alumno eliminado");
             }
         }catch (SQLException ex){
         JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno");
     }
 }
    public Alumno buscarAlumno(int id){
    String sql="SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado=1"; 
    Alumno alumno=null;
    try{
    PreparedStatement ps=con.prepareStatement(sql);
    ps.setInt(1,id);
    ResultSet rs=ps.executeQuery();
    if(rs.next()){
        
        alumno=new Alumno();
        alumno.setIdAlumno(id);
        alumno.setDni(rs.getInt("dni"));
        alumno.setApellido(rs.getString("apellido"));
        alumno.setNombre(rs.getString("nombre"));
        alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
        alumno.setActivo(true);
    
    }else{
        
       JOptionPane.showMessageDialog(null,"Alumno no encontrado"); 
    }
    ps.close();
    
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno");
    
return alumno;
    }
        return null;
 
 }
    public Alumno buscarAlumnoPorDni(int dni){
    String sql="SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = ? AND estado=1"; 
    Alumno alumno=null;
    try{
    PreparedStatement ps=con.prepareStatement(sql);
    ps.setInt(1,dni);
    ResultSet rs=ps.executeQuery();
    if(rs.next()){
        
        alumno=new Alumno();
        alumno.setDni(rs.getInt("dni"));
        alumno.setApellido(rs.getString("apellido"));
        alumno.setNombre(rs.getString("nombre"));
        alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
        alumno.setActivo(true);
    
    }else{
        
       JOptionPane.showMessageDialog(null,"Alumno no encontrado"); 
    }
    ps.close();
    
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno");
    
return alumno;
    }
       
        
    

    } 

    public Alumno buscarAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

 



 
 
 

