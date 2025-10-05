package iudigital.compuwork;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dfrincong
 * 
 * Esta clase modela un departamento que contiene empleados (permanentes y temporales).
 */
public class Departamento {
    // atributos
    private String id;
    private String nombre;
    private List<EmpleadoPermanente> listaEmpleadosPerm;
    private List<EmpleadoTemporal> listaEmpleadosTemp;

    // constructor
    public Departamento(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.listaEmpleadosPerm = new ArrayList<>();
        this.listaEmpleadosTemp = new ArrayList<>();
    }

    // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<EmpleadoPermanente> getListaEmpleadosPerm() {
        return listaEmpleadosPerm;
    }

    public void setListaEmpleadosPerm(List<EmpleadoPermanente> listaEmpleadosPerm) {
        this.listaEmpleadosPerm = listaEmpleadosPerm;
    }

    public List<EmpleadoTemporal> getListaEmpleadosTemp() {
        return listaEmpleadosTemp;
    }

    public void setListaEmpleadosTemp(List<EmpleadoTemporal> listaEmpleadosTemp) {
        this.listaEmpleadosTemp = listaEmpleadosTemp;
    }

    /**
     * método que retorna los datos de un departamento
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Departamento{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    /**
     * método para crear un empleado permanente y agregarlo a un departamento.
     * 
     * @param sueldo
     * @param diasVacaciones
     * @param cedula
     * @param nombre
     * @param apellido 
     */
    public void CrearEmpPermanente(double sueldo, int diasVacaciones, String cedula, String nombre, String apellido){
        try {    
            EmpleadoPermanente miEmpPerm = new EmpleadoPermanente(sueldo, diasVacaciones, cedula, nombre, apellido);
            listaEmpleadosPerm.add(miEmpPerm);
            System.out.println("Empleado permanente creado correctamente");
            
            for (EmpleadoPermanente empPerm : listaEmpleadosPerm) {
                System.out.println(empPerm.toString());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    
    /**
     * método para crear un empleado temporal y agregarlo a un departamento.
     * 
     * @param horasContrato
     * @param sueldoHora
     * @param cedula
     * @param nombre
     * @param apellido 
     */
    public void CrearEmpTemporal(int horasContrato, double sueldoHora, String cedula, String nombre, String apellido){
        try {    
            EmpleadoTemporal miEmpTemp = new EmpleadoTemporal(horasContrato, sueldoHora, cedula, nombre, apellido);
            listaEmpleadosTemp.add(miEmpTemp);
            System.out.println("Empleado temporal creado correctamente");
            
            for (EmpleadoTemporal empTemp : listaEmpleadosTemp) {
                System.out.println(empTemp.toString());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    
    /**
     * método para modificar datos de un empleado permanente.
     * 
     * @param sueldo
     * @param diasVacaciones
     * @param cedula 
     */
    public void ModificarEmpPerm(double sueldo, int diasVacaciones, String cedula){
        try {    
            for (EmpleadoPermanente empleadoP : listaEmpleadosPerm) {
                if (empleadoP.getCedula().equals(cedula)) {
                    empleadoP.setDiasVacaciones(diasVacaciones);
                    empleadoP.setSueldo(sueldo);
                    System.out.println("Se ha actualizado el sueldo y/o los dias de vacaciones del empleado");
                    
                    for (EmpleadoPermanente empleadoPermanente : listaEmpleadosPerm) {
                        System.out.println(empleadoPermanente.toString());
                    }
                    return;
                } 
            }
            
            System.out.println("El empleado no existe");
            
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    
    /**
     * método para modificar datos de un empleado temporal.
     * 
     * @param horasContrato
     * @param sueldoHora
     * @param cedula 
     */
    public void ModificarEmpTemp(int horasContrato, double sueldoHora, String cedula){
        try {    
            for (EmpleadoTemporal empleadoT : listaEmpleadosTemp) {
                if (empleadoT.getCedula().equals(cedula)) {
                    empleadoT.setHorasContrato(horasContrato);
                    empleadoT.setSueldoHora(sueldoHora);
                    System.out.println("Se ha actualizado el sueldo por hora y/o las horas de contrato del empleado");
                    
                    for (EmpleadoTemporal empleadoTemporal : listaEmpleadosTemp) {
                        System.out.println(empleadoTemporal.toString());
                    }
                    return;
                } 
            }
            
            System.out.println("El empleado no existe");
            
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    
    /**
     * método para eliminar un empleado permanente de un departamento.
     * 
     * @param cedula 
     */
    public void EliminarEmpPerm(String cedula){
        try {
            for (EmpleadoPermanente empleadoPermanente : listaEmpleadosPerm) {
                if (empleadoPermanente.getCedula().equals(cedula)) {
                    listaEmpleadosPerm.remove(empleadoPermanente);
                    System.out.println("El empleado fue eliminado correctamente");
                    
                    for (EmpleadoPermanente empleadoPermanente1 : listaEmpleadosPerm) {
                        System.out.println(empleadoPermanente1.toString());
                    }
                    return;
                } 
            }
            
            System.out.println("Error: Empleado no registrado.");
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    /**
     * método para eliminar un empleado temporal de un departamento.
     * 
     * @param cedula 
     */
    public void EliminarEmpTemp(String cedula){
        try {
            for (EmpleadoTemporal empleadoTemporal : listaEmpleadosTemp) {
                if (empleadoTemporal.getCedula().equals(cedula)) {
                    listaEmpleadosTemp.remove(empleadoTemporal);
                    System.out.println("El empleado fue eliminado correctamente");
                    
                    for (EmpleadoTemporal empleadoTemporal1 : listaEmpleadosTemp) {
                        System.out.println(empleadoTemporal1.toString());
                    }
                    return;
                } 
            }
            
            System.out.println("Error: Empleado no registrado.");
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    /**
     * método para generar un pequeño reporte de los datos de cada empleado de un departamento
     */
    public void generarReporteXEmpleado() {
        try {
            for (EmpleadoPermanente empleadoPermanente : listaEmpleadosPerm) {
                System.out.println("empleado permanente");
                System.out.println("empleado: " + empleadoPermanente.getNombre() + " " + empleadoPermanente.getApellido());
                System.out.println("sueldo: " + empleadoPermanente.getSueldo());
                System.out.println("dias de vaciones" + empleadoPermanente.getDiasVacaciones());
            }
            
            for (EmpleadoTemporal empleadoTemporal : listaEmpleadosTemp) {
                System.out.println("empleado temporal");
                System.out.println("empleado: " + empleadoTemporal.getNombre() + " " + empleadoTemporal.getApellido());
                System.out.println("horas contratadas: " + empleadoTemporal.getHorasContrato());
                System.out.println("sueldo por hora" + empleadoTemporal.getSueldoHora());
                System.out.println("sueldo total a pagar: " + (empleadoTemporal.getHorasContrato() * empleadoTemporal.getSueldoHora()));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
