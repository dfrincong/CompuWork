package iudigital.compuwork;

import java.util.List;

/**
 *
 * @author dfrincong
 */
public class Empresa {
    private String nombre;
    private List<Departamento> listaDepartamentos;

    public Empresa(String nombre, List<Departamento> listaDepartamentos) {
        this.nombre = nombre;
        this.listaDepartamentos = listaDepartamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }
    
    public void CrearDept(String id, String nombre){
        try {    
            Departamento miDept = new Departamento(id, nombre);
            listaDepartamentos.add(miDept);
            System.out.println("Departamento creado correctamente");
            
            for (Departamento departamento : listaDepartamentos) {
                System.out.println(departamento.toString());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    
    public void ModificarDept(String id, String nombreNuevo){
        try {    
            for (Departamento departamento : listaDepartamentos) {
                if (departamento.getId().equals(id)) {
                    departamento.setNombre(nombreNuevo);
                    System.out.println("Se ha actualizado el nombre del departamento");
                    
                    for (Departamento departamentoUno : listaDepartamentos) {
                        System.out.println(departamentoUno.toString());
                    }
                    return;
                } 
            }
            
            System.out.println("El departamento no existe");
            
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
    
    public void EliminarDept(String id){
        try {
            for (Departamento departamento : listaDepartamentos) {
                if (departamento.getId().equals(id)) {
                    listaDepartamentos.remove(departamento);
                    System.out.println("El departamento fue eliminado correctamente");
                    
                    for (Departamento departamentoUno : listaDepartamentos) {
                        System.out.println(departamentoUno.toString());
                    }
                    return;
                } 
            }
            
            System.out.println("Error: Departamento no registrado.");
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void verEmpleadosXDept(){
        try {
            for (Departamento departamento : listaDepartamentos) {
                System.out.println("departamento: " + departamento.getNombre());
                System.out.println(departamento.getListaEmpleadosPerm());
                System.out.println(departamento.getListaEmpleadosTemp());
            }
            
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    
    }


    public void generarReporteXDepartamento() {
        try {
            for (Departamento departamento1 : listaDepartamentos) {
                System.out.println("departamento: " + departamento1.getNombre());
                System.out.println("número de empleados permanentes " + departamento1.getListaEmpleadosPerm().size());
                System.out.println("número de empleados temporales " + departamento1.getListaEmpleadosTemp().size());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
