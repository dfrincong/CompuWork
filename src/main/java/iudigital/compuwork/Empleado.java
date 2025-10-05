package iudigital.compuwork;

/**
 *
 * @author dfrincong
 * 
 * esta clase abstracta modela los datos por defecto de un empleados que serán utilizados por sus subclases.
 */
public abstract class Empleado {
    // atributos
    protected String cedula;
    protected String nombre;
    protected String apellido;

    // constructor
    public Empleado(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // getters and setters
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

    /**
     * método que retorna los datos de un empleado
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Empleado{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
