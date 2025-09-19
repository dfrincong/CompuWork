package iudigital.compuwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dfrincong
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Departamento> listaDept = new ArrayList();
        
        Departamento deptUno = new Departamento("1", "Recursos Humanos");
        Departamento deptDos = new Departamento("2", "Ventas");
        
        listaDept.add(deptUno);
        listaDept.add(deptDos);
        
        Empresa compuWork = new Empresa("CompuWork", listaDept);
        
        // Menú principal para la interfaz de usuario
        int opcion;
        
        do {
            
            System.out.println("Menú principal");
            System.out.println("--------------");
            System.out.println("opciones:");
            System.out.println("0 para salir");
            System.out.println("1 para crear departamento.");
            System.out.println("2 para modificar departamento.");
            System.out.println("3 para eliminar departamento.");
            System.out.println("4 para crear y asignar un empleado en un departamento.");
            System.out.println("5 para modificar empleado");
            System.out.println("6 para eliminar empleado de un departamento.");
            System.out.println("7 ver empleados asignados a cada deoartamento");
            System.out.println("8 generar reporte desempeño de cada empleado");
            System.out.println("9 generar reporte por departamento");
            System.out.println("--------------");
            
            System.out.println("seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            // para manipular los empleados desde un objeto de tipo Empresa
            List<Departamento> depts = compuWork.getListaDepartamentos();
            
            switch (opcion) {
                case 0:
                    System.out.println("Ha elegido salir.");
                    break;
                case 1:
                    System.out.println("Ingrese id de departamento: ");
                    String miId = sc.nextLine();

                    System.out.println("Ingrese nombre del departamento: ");
                    String miNombre = sc.nextLine();
                    
                    compuWork.CrearDept(miId, miNombre);
                    System.out.println("-------------");
                    break;
                case 2:
                    System.out.println("-------------");
                    
                    System.out.println("Ingrese id de departamento que quiere cambiar: ");
                    String miIdMod = sc.nextLine();

                    System.out.println("Ingrese nuevo nombre del departamento: ");
                    String miNombreMod = sc.nextLine();
                    
                    compuWork.ModificarDept(miIdMod, miNombreMod);
                    System.out.println("-------------");
                    break;
                case 3:
                    System.out.println("-------------");
                    
                    System.out.println("Ingrese id de departamento que quiere eliminar: ");
                    String miIdEli = sc.nextLine();
                    
                    compuWork.EliminarDept(miIdEli);
                    System.out.println("-------------");
                    break;
                case 4:
                    System.out.println("-------------");
                    int opcionX;
                    System.out.println("seleccione 1 para crear empleado permanente o 2 para crear empleado temporal: ");
                    opcionX = sc.nextInt();
                    sc.nextLine();
                    
                    String asignarDept;
                    System.out.println("escriba el departamento al cual va asignar el empleado: ");
                    asignarDept = sc.nextLine();
                    
                    
                    if (opcionX == 1) {
                        for (Departamento dept : depts) {
                            if (dept.getNombre().equalsIgnoreCase(asignarDept)) {
                                System.out.println("Ingrese el sueldo del empleado: ");
                                double sueldoP = sc.nextDouble();
                                sc.nextLine();
                                
                                System.out.println("Ingrese los dias de vacaciones del empleado: ");
                                int diasVacionesP = sc.nextInt();
                                sc.nextLine();

                                System.out.println("Ingrese cédula del empleado: ");
                                String cedulaP = sc.nextLine();
                                
                                System.out.println("Ingrese nombre del empleado: ");
                                String nombreP = sc.nextLine();
                                
                                System.out.println("Ingrese apellido del empleado: ");
                                String apellidoP = sc.nextLine();
                                dept.CrearEmpPermanente(sueldoP, diasVacionesP, cedulaP, nombreP, apellidoP);
                            }
                        }
                    } else if (opcionX == 2) {
                        for (Departamento dept : depts) {
                            if (dept.getNombre().equalsIgnoreCase(asignarDept)) {
                                System.out.println("Ingrese el sueldo por hora del empleado: ");
                                double sueldoHoraT = sc.nextDouble();
                                sc.nextLine();
                                
                                System.out.println("Ingrese las horas de contrato del empleado: ");
                                int horasContratoT = sc.nextInt();
                                sc.nextLine();

                                System.out.println("Ingrese cédula del empleado: ");
                                String cedulaT = sc.nextLine();
                                
                                System.out.println("Ingrese nombre del empleado: ");
                                String nombreT = sc.nextLine();
                                
                                System.out.println("Ingrese apellido del empleado: ");
                                String apellidoT = sc.nextLine();
                                
                                dept.CrearEmpTemporal(horasContratoT, sueldoHoraT, cedulaT, nombreT, apellidoT);
                            }
                        }
                    } else {
                        System.out.println("tipo de empleado incorrecto");
                    }
                    
                    System.out.println("-------------");
                    break;
                case 5:
                    System.out.println("-------------");
                    int opcionY;
                    System.out.println("seleccione 1 para modificar empleado permanente o 2 para modificar empleado temporal: ");
                    opcionY = sc.nextInt();
                    sc.nextLine();
                    
                    String asignarDeptM;
                    System.out.println("escriba el departamento del cual va modificar el empleado: ");
                    asignarDeptM = sc.nextLine();
                    
                    
                    if (opcionY == 1) {
                        for (Departamento dept : depts) {
                            if (dept.getNombre().equalsIgnoreCase(asignarDeptM)) {
                                System.out.println("Ingrese el nuevo sueldo del empleado: ");
                                double sueldoPM = sc.nextDouble();
                                sc.nextLine();
                                
                                System.out.println("Ingrese los dias de vacaciones actualizados del empleado: ");
                                int diasVPM = sc.nextInt();
                                sc.nextLine();

                                System.out.println("Ingrese cédula del empleado a modificar: ");
                                String cedulaPM = sc.nextLine();

                                dept.ModificarEmpPerm(sueldoPM, diasVPM, cedulaPM);
                            }
                        }
                    } else if (opcionY == 2) {
                        for (Departamento dept : depts) {
                            if (dept.getNombre().equalsIgnoreCase(asignarDeptM)) {
                                System.out.println("Ingrese el nuevo sueldo por hora del empleado: ");
                                double sueldoHoraTM = sc.nextDouble();
                                sc.nextLine();
                                
                                System.out.println("Ingrese las horas de contrato actualizadas del empleado: ");
                                int horasContratoTM = sc.nextInt();
                                sc.nextLine();

                                System.out.println("Ingrese cédula del empleado a modificar: ");
                                String cedulaTM = sc.nextLine();

                                dept.ModificarEmpTemp(horasContratoTM, sueldoHoraTM, cedulaTM);
                            }
                        }
                    } else {
                        System.out.println("tipo de empleado incorrecto");
                    }
                    
                    System.out.println("-------------");
                    break;
                case 6:
                    System.out.println("-------------");
                    
                    int opcionZ;
                    System.out.println("seleccione 1 para eliminar empleado permanente o 2 para eliminar empleado temporal: ");
                    opcionZ = sc.nextInt();
                    sc.nextLine();
                    
                    String asignarDeptE;
                    System.out.println("escriba el departamento del cual va eliminar el empleado: ");
                    asignarDeptE = sc.nextLine();
                    
                    
                    if (opcionZ == 1) {
                        for (Departamento dept : depts) {
                            if (dept.getNombre().equalsIgnoreCase(asignarDeptE)) {
                                System.out.println("Ingrese cédula de empleado que quiere eliminar: ");
                                String miCedulap = sc.nextLine();

                                dept.EliminarEmpPerm(miCedulap);
                            }
                        }
                    } else if (opcionZ == 2) {
                        for (Departamento dept : depts) {
                            if (dept.getNombre().equalsIgnoreCase(asignarDeptE)) {
                                System.out.println("Ingrese cédula de empleado que quiere eliminar: ");
                                String miCedulaT = sc.nextLine();

                                dept.EliminarEmpTemp(miCedulaT);
                            }
                        }
                    } else {
                        System.out.println("tipo de empleado incorrecto");
                    }
          
                    System.out.println("-------------");
                    break;
                case 7:
                    System.out.println("-------------");
                    
                    compuWork.verEmpleadosXDept();
                    
                    System.out.println("-------------");
                    break;
                case 8:
                    System.out.println("-------------");
                    
                    for (Departamento dept : depts) {
                        dept.generarReporteXEmpleado();
                    }
                    
                    System.out.println("-------------");
                    break;
                case 9:
                    System.out.println("-------------");
                    
                    compuWork.generarReporteXDepartamento();
                    
                    System.out.println("-------------");
                    break;
                default:
                    System.out.println("Ha elegido una opción invalida");
                    System.out.println("------------------------------");
            }
        } while (opcion != 0);
    }
}
