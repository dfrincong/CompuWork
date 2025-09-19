package iudigital.compuwork;

/**
 *
 * @author dfrincong
 */
public abstract class Empleado {
    protected String cedula;
    protected String nombre;
    protected String apellido;

    public Empleado(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Empleado{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
