package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //Se agregar nos nuevos nombres y a scanner su atributo
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        //Se le da inicio al numero para poder asignar a las diferentes opciones
        int opcion = 0;

        //El do sirve para crear los bucles a travez de evalua una condicion

        do{

            //Se coloca el visual del menu para lograr hacer vision
            System.out.println("");
            System.out.println("\n===== SISTEMA DE GESTIÓN HOSPITALARIA =====");
            System.out.println("1. Registrar médico");
            System.out.println("2. Registrar enfermero");
            System.out.println("3. Registrar administrativo");
            System.out.println("4. Listar empleados");
            System.out.println("5. Buscar empleado");
            System.out.println("6. Eliminar empleado");
            System.out.println("7. Mostrar resumen de sueldos");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            //Luego se abre un try para colocar el scanner y tomar la informacion

            try{

                //El scanner nos permite tomar la informacion de manera que sea sting y luego el parseInt lo hace un valor numerico
                opcion = Integer.parseInt(scanner.nextLine());

                //Switch sirve para el uso de varios if para casos como ifs

                switch (opcion){

                    //En la primera opcion esta la seccion de registro medico
                    case 1:

                        System.out.print("ID: ");
                        int idMedico = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nombre: ");
                        String nombreMedico = scanner.nextLine();
                        double sueldoMedico = Double.parseDouble(scanner.nextLine());
                        System.out.print("Especialidad: ");
                        String especialidad = scanner.nextLine();
                        System.out.print("Bono especialidad: ");
                        double bonoEspecialidad =
                                Double.parseDouble(scanner.nextLine());
                        Medico medico = new Medico(
                                idMedico,
                                nombreMedico,
                                sueldoMedico,
                                especialidad,
                                bonoEspecialidad
                        );
                        hospital.registrarEmpleado(medico);
                        System.out.println(
                                "Médico registrado correctamente."
                        );
                        break;


                        //En la opcion dos registramos lo que es el enfermero
                    case 2:
                        System.out.print("ID: ");
                        int idEnfermero = Integer.parseInt(scanner.nextLine());
                        System.out.print("Nombre: ");
                        String nombreEnfermero = scanner.nextLine();
                        System.out.print("Sueldo base: ");
                        double sueldoEnfermero =
                                Double.parseDouble(scanner.nextLine());
                        System.out.print("Turno: ");
                        String turno = scanner.nextLine();
                        System.out.print("Bono turno: ");
                        double bonoTurno =
                                Double.parseDouble(scanner.nextLine());
                        Enfermero enfermero = new Enfermero(
                                idEnfermero,
                                nombreEnfermero,
                                sueldoEnfermero,
                                turno,
                                bonoTurno
                        );
                        hospital.registrarEmpleado(enfermero);
                        System.out.println(
                                "Enfermero registrado correctamente."
                        );
                        break;

                        //El caso 3 vemos lo que es registrar al administrador

                    case 3:

                        System.out.print("ID: ");
                        int idAdministrativo =
                                Integer.parseInt(scanner.nextLine());

                        System.out.print("Nombre: ");
                        String nombreAdministrativo =
                                scanner.nextLine();

                        System.out.print("Sueldo base: ");
                        double sueldoAdministrativo =
                                Double.parseDouble(scanner.nextLine());

                        System.out.print("Área: ");
                        String area = scanner.nextLine();

                        System.out.print("Horas extra: ");
                        int horasExtra =
                                Integer.parseInt(scanner.nextLine());

                        Administrativo administrativo =
                                new Administrativo(
                                        idAdministrativo,
                                        nombreAdministrativo,
                                        sueldoAdministrativo,
                                        area,
                                        horasExtra
                                );

                        hospital.registrarEmpleado(administrativo);

                        System.out.println(
                                "Administrativo registrado correctamente."
                        );

                        break;

                        //Luego en la opcion 4 colocamos el registro de listas

                    case 4 :
                        hospital.listarEmpleados();

                        break;

                    //Buscar id del trabajador si no se encuentra mandar el mensaje de no encontrado ( esto a travez de la busqueda y el retorno de null en caso de que no este)

                    case 5:

                        System.out.print("Ingrese ID a buscar: ");

                        int idBuscar =
                                Integer.parseInt(scanner.nextLine());

                        Empleado encontrado =
                                hospital.buscarEmpleado(idBuscar);

                        if (encontrado != null) {
                            System.out.println(encontrado);
                        } else {
                            System.out.println(
                                    "Empleado no encontrado."
                            );
                        }

                        break;


                    //Se identifica si se logra eliminar algun trabajador a travez de la busqueda, al hacer null es porque no se encuentra el id, si se encuentra se borra exitosamente

                    case 6:

                        System.out.print("Ingrese ID a eliminar: ");

                        int idEliminar =
                                Integer.parseInt(scanner.nextLine());

                        boolean eliminado =
                                hospital.eliminarEmpleado(idEliminar);

                        if (eliminado) {
                            System.out.println(
                                    "Empleado eliminado correctamente."
                            );
                        } else {
                            System.out.println(
                                    "Empleado no encontrado."
                            );
                        }

                        break;

                    //En la opcion 7 es para mostrar todos los resultados de los sueldos

                    case 7:

                        hospital.mostrarResumenSueldos();

                        break;

                    //En el caso 8 es para salir del bucle y terminar el menu

                    case 8:

                        System.out.println(
                                "Saliendo del sistema..."
                        );

                        break;

                    default:

                        System.out.println(
                                "Opción no válida."
                        );
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "Error: debe ingresar un valor numérico válido."
                );

            } catch (EmpleadoNoEncontrado e) {

                System.out.println(
                        "Error: " + e.getMessage()
                );
            }
        }while (opcion != 8);
        scanner.close();









    }
}
