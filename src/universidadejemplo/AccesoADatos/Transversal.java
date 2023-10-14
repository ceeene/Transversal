/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccesoADatos;


public class Transversal {

    
    public static void main(String[] args) throws ClassNotFoundException {
        /*try {
//cargamos driver de conexion
            Class.forName("org.mariadb.jdbc.Driver");
            
            //establecemos conexion
            String URL="jdbc:mariadb://localhost:3306/ulp";
            String usuario="root";
            String password="";
            Connection con=DriverManager.getConnection(URL,usuario,password);
            
            
            //cargamos alumnos
        /*String sql="INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
            + "VALUES (38516415,'Gimenez','Agustina','1995,05,05',true)";
        String sql="INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
            + "VALUES (33251879,'Guzman','Leandro','1989,10,06',true)";
        String sql="INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
            + "VALUES (28592815,'Ramirez','Marianela','1982,01,14',true)";
        String sql="INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
            + "VALUES (31515247,'Masson','Jose','1999,03,28',true)";*/
    
        
    //creamos objeto para enviar los datos de los alumnos
    /*PreparedStatement ps=con.prepareStatement(sql);
    int filas= ps.executeUpdate();
    if (filas>0){
        JOptionPane.showMessageDialog(null, "Alumno agregado");
        
    }*/
               
    //agregamos materias
    /*String sql="INSERT INTO materia (asignatura,anio,estado)"
            + "VALUES ('Matematica', 2003, true)";
    String sql="INSERT INTO materia (asignatura,anio,estado)"
            + "VALUES ('Lengua', 2003, true)";
    String sql="INSERT INTO materia (asignatura,anio,estado)"
            + "VALUES ('Naturales', 2003, true)";
    /*String sql="INSERT INTO materia (asignatura,anio,estado)"
            + "VALUES ('Sociales', 2003, true)";*/
    
    
    
    //creamos objeto para enviar los datos de las materias
    /*PreparedStatement ps=con.prepareStatement(sql);
    int filas= ps.executeUpdate();
    if (filas>0){
        JOptionPane.showMessageDialog(null, "Materia creada");
}    */
            
    
    
       /*  } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al cargar Driver");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error de conexion");
           System.out.println("Codigo de error "+ex.getErrorCode());
        }*/
    }
    
    
 
    
 }

    
    

