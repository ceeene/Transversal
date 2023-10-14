
package universidadejemplo.Main;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.Conexion;
import universidadejemplo.Entidades.Alumno;


public class Universidad {

    
    public static void main(String[] args) {
        
     Connection con= Conexion.getConnection();
     
     Alumno pedro=new Alumno(124241, "Sanchez", "Ivo", LocalDate.of(1999, 5, 12), true); 
     AlumnoData alu=new AlumnoData(); 
     alu.guadarAlumno(pedro);
       
    }
    
}
