package iudigital.compuwork;

/**
 *
 * @author dfrincong
 */
public class EmpleadoTemporal extends Empleado {
    private int horasContrato;
    private double sueldoHora;

    public EmpleadoTemporal(int horasContrato, double sueldoHora, String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.horasContrato = horasContrato;
        this.sueldoHora = sueldoHora;
    }

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

    @Override
    public String toString() {
        return "EmpleadoTemporal{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + " horasContrato=" + horasContrato + ", sueldoHora=" + sueldoHora + '}';
    }

    
}
