
import java.sql.*;
import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Materia;



public class Transversal {

    
    public static void main(String[] args) throws ClassNotFoundException {
        
        try {
//cargamos driver de conexion
            Class.forName("org.mariadb.jdbc.Driver");
            
            //establecemos conexion
            String URL="jdbc:mariadb://localhost:3306/ulp";
            String usuario="root";
            String password="";
            Connection con=DriverManager.getConnection(URL,usuario,password);
            
            JOptionPane.showMessageDialog(null,"Conectado");
            
            
            //cargamos alumnos
       /* Alumno Juan= new Alumno (38514319,"Perez","Juan",LocalDate.of(2000,01,05),true);
       Alumno Carla= new Alumno (32584389,"Romero","Carla",LocalDate.of(1999,01,20),true);*/

       /*AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(Carla);
        //alu.eliminarAlumno(1);
        //alu.modificarAlumno();
        Alumno alumnoEncontrado=alu.buscarAlumno(36);
        if(alumnoEncontrado!=null){
           System.out.println("dni "+alumnoEncontrado.getDni());
           System.out.println("apellido "+alumnoEncontrado.getApellido());
           System.out.println("nombre "+alumnoEncontrado.getNombre());
           
        
        }*/
        
    //creamos objeto para enviar los datos de los alumnos
    /*PreparedStatement ps=con.prepareStatement(sql);
    int filas= ps.executeUpdate();
    if (filas>0){
        JOptionPane.showMessageDialog(null, "Alumno agregado");
        
    }*/
               
    //agregamos materias
    Materia mate=new Materia("Matematica", 2003, true);
    Materia leng=new Materia("Lengua", 2003, true);
    Materia Natu=new Materia("Naturales", 2003, true);
    Materia Soc=new Materia("Sociales", 2003, true);
    Materia Quim=new Materia("Quimica", 2003, true);
    MateriaData materia=new MateriaData();
    
    //guardamos cambios en materia
   // materia.guardarMateria(Quim);
    
    
    
    //creamos objeto para enviar los datos de las materias
    /*PreparedStatement ps=con.prepareStatement(sql);
    int filas= ps.executeUpdate();
    if (filas>0){
        JOptionPane.showMessageDialog(null, "Materia creada");
}    */
            
    
    
         } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al cargar Driver");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error de conexion");
           System.out.println("Codigo de error "+ex.getErrorCode());
        }
    }
    
    /*AlumnoData ad=new AlumnoData():
    MateriaData md=new MateriaData();
    InscripcionData id=new InscripcionData();
    
    Alumno agustina=ad.buscarAlumno(1);
    Materia mate=buscarMateria(5);
    Inscripcion insc=new Inscrpcion(ricardo,mate,9);
    
    id.guardarInscripcion(insc);*/
 
    
 }

    
    

