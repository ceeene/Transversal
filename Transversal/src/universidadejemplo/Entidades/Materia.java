
package universidadejemplo.Entidades;


public class Materia {
    private int idMateria;
    private String asignatura;
    private int anio;
    private boolean activo;

    public Materia(int idMateria, String asignatura, int anio, boolean activo) {
        this.idMateria = idMateria;
        this.asignatura = asignatura;
        this.anio = anio;
        this.activo = activo;
    }

    public Materia() {
    }

    public Materia(String asignatura, int anio, boolean activo) {
        this.asignatura = asignatura;
        this.anio = anio;
        this.activo = activo;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", asignatura=" + asignatura + ", anio=" + anio + ", activo=" + activo + '}';
    }
    
    
}


