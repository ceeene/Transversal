package universidadejemplo.Vistas;




import java.sql.Connection;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.Conexion;
import universidadejemplo.Entidades.Alumno;


public class Universidad {

    
    public static void main(String[] args) {
        
     Connection con= Conexion.getConnection();
     AlumnoData alu=new AlumnoData();
     //alu.guardarAlumno();
     //alu.modificarAlumno();
     //alu.eliminarAlumno();
     Alumno alumnoEncontrado=alu.buscarAlumno();
     
     
     
     
     
       
    }
    
}
