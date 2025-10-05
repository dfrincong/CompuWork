package iudigital.compuwork;

/**
 *
 * @author dfrincong
 * 
 * esta subclase de Empleado modela a los empleados de tipo temporal.
 */
public class EmpleadoTemporal extends Empleado {
    // atributos
    private int horasContrato;
    private double sueldoHora;

    // constructor
    public EmpleadoTemporal(int horasContrato, double sueldoHora, String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.horasContrato = horasContrato;
        this.sueldoHora = sueldoHora;
    }

    // getters and setters
    public int getHorasContrato() {
        return horasContrato;
    }

    public void setHorasContrato(int horasContrato) {
        this.horasContrato = horasContrato;
    }

    public double getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    /**
     * método que retorna los datos de un empleado
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "EmpleadoTemporal{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + " horasContrato=" + horasContrato + ", sueldoHora=" + sueldoHora + '}';
    }

    
}
