package iudigital.compuwork;

/**
 *
 * @author dfrincong
 * 
 * esta subclase de Empleado modela a los empleados de tipo  permanente
 */
public class EmpleadoPermanente extends Empleado {
    // atributos
    private double sueldo;
    private int diasVacaciones;

    // constructor
    public EmpleadoPermanente(double sueldo, int diasVacaciones, String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.sueldo = sueldo;
        this.diasVacaciones = diasVacaciones;
    }

    // getters and setter
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    /**
     * método que retorna los datos de un empleado
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "EmpleadoPermanente{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido+ " sueldo=" + sueldo + ", diasVacaciones=" + diasVacaciones + '}';
    }

    
}
