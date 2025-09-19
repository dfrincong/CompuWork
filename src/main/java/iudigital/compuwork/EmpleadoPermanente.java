package iudigital.compuwork;

/**
 *
 * @author dfrincong
 */
public class EmpleadoPermanente extends Empleado {
    private double sueldo;
    private int diasVacaciones;

    public EmpleadoPermanente(double sueldo, int diasVacaciones, String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.sueldo = sueldo;
        this.diasVacaciones = diasVacaciones;
    }

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

    @Override
    public String toString() {
        return "EmpleadoPermanente{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido+ " sueldo=" + sueldo + ", diasVacaciones=" + diasVacaciones + '}';
    }

    
}
