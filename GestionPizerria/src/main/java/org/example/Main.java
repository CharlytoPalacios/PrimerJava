package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //  Version lista

        Scanner scanner = new Scanner(System.in);
        PizzeriaGestion gestionPizza = new PizzeriaGestion();

        //Ahora se coloca el int opc para determinar el inicio

        int opc = 0;

        //Se abre el menu con do

        do{
            System.out.println("\n---MENU GEESTION PIZZERIA---");
            System.out.println(" | Registrar cajero ---> [1]");
            System.out.println(" | Registrar registrar preparador de masas --- >[2]");
            System.out.println(" | Registrar registrar preparador de pizzas ---> [3]");
            System.out.println(" | Eliminar trabajador ---> [4]");
            System.out.println(" | Buscar trabajador ---> [5]");
            System.out.println(" | Listar trabajador ---> [6]");
            System.out.println(" | Mostrar los sueldos ---> [7]");
            System.out.println(" | Salir del programa ---> [8]");
            System.out.println(" | Elige una opcion : ");

            try {

                //Luego dentro se coloca la opcion con el scanner para poder tomar los numeros de las opciones

                opc = Integer.parseInt(scanner.nextLine());

                switch (opc) {

                    case 1:
                        System.out.println("\n---Registro cajero---");
                        System.out.println(" | Ingrese su ID :");
                        int idCajero = Integer.parseInt(scanner.nextLine());
                        System.out.println(" | Ingrese su nombre :");
                        String nombreCajero = scanner.nextLine();
                        System.out.println(" | Ingrese su apellido :");
                        String apellidoCajero = scanner.nextLine();
                        System.out.println(" | Ingrese su sueldo base :");
                        double sueldoBaseCajero = Double.parseDouble(scanner.nextLine());
                        System.out.println(" | Ingrese las ordenes en el dia :");
                        int ordenesDelDiaCajero = Integer.parseInt(scanner.nextLine());
                        System.out.println(" | Ingrese su bonoSueldo :");
                        double sueldoBonoCajero = Double.parseDouble(scanner.nextLine());
                        Cajero cajero = new Cajero(
                                idCajero,
                                nombreCajero,
                                apellidoCajero,
                                sueldoBaseCajero,
                                ordenesDelDiaCajero,
                                sueldoBonoCajero

                        );
                        gestionPizza.registrarTrabajador(cajero);
                        System.out.println("¡ Cajero registrado correctamente !");
                        break;

                    case 2:
                        System.out.println("\n---REGISTRAR PREPARADOR DE MASA---");
                        System.out.println(" | Ingrese su ID :");
                        int idPreparadorMasa = Integer.parseInt(scanner.nextLine());
                        System.out.println(" | Ingrese su nombre :");
                        String nombrePreparadorMasa = scanner.nextLine();
                        System.out.println(" | Ingrese su apellido :");
                        String apellidoPreparadorMasa = scanner.nextLine();
                        System.out.println(" | Ingrese su sueldo base :");
                        double sueldoBasePreparadorMasa = Double.parseDouble(scanner.nextLine());
                        System.out.println(" | Ingrese las pizzas preparadas :");
                        int pizzaPreparadaPreparadorMasa = Integer.parseInt(scanner.nextLine());
                        PreparadorMasa preparadorMasa = new PreparadorMasa(
                                idPreparadorMasa,
                                nombrePreparadorMasa,
                                apellidoPreparadorMasa,
                                sueldoBasePreparadorMasa,
                                pizzaPreparadaPreparadorMasa
                        );
                        gestionPizza.registrarTrabajador(preparadorMasa);
                        System.out.println("¡ Preparador de masa registrado correctamente !");
                        break;

                    case 3:
                        System.out.println("\n---REGISTRAR PREPARADOR DE PIZZA---");
                        System.out.println(" | Ingrese su ID :");
                        int idPreparadorPizza = Integer.parseInt(scanner.nextLine());
                        System.out.println(" | Ingrese su nombre :");
                        String nombrePreparadorPizza = scanner.nextLine();
                        System.out.println(" | Ingrese su apellido :");
                        String apellidoPreparadorPizza = scanner.nextLine();
                        System.out.println(" | Ingrese su sueldo base :");
                        double sueldoBasePreparadorPizza = Double.parseDouble(scanner.nextLine());
                        System.out.println(" | Ingrese los ingredientes usados :");
                        int ingredientesPreparadorPizza = Integer.parseInt(scanner.nextLine());
                        System.out.println(" | Ingrese su bono por hora :");
                        double sueldoBonoPorHoraPreparadorPizza = Double.parseDouble(scanner.nextLine());
                        PreparadorPizza preparadorPizza = new PreparadorPizza(
                                idPreparadorPizza,
                                nombrePreparadorPizza,
                                apellidoPreparadorPizza,
                                sueldoBasePreparadorPizza,
                                ingredientesPreparadorPizza,
                                sueldoBonoPorHoraPreparadorPizza
                        );
                        gestionPizza.registrarTrabajador(preparadorPizza);
                        System.out.println("¡ Preparador de pizza registrado correctamente !");
                        break;

                    case 4:
                        System.out.print(" | Ingrese ID a eliminar: ");

                        int idEliminar =
                                Integer.parseInt(scanner.nextLine());

                        boolean eliminado =
                                gestionPizza.eliminarTrabajador(idEliminar);

                        if (eliminado) {
                            System.out.println(
                                    " | Empleado eliminado correctamente."
                            );
                        } else {
                            System.out.println(
                                    " | Empleado no encontrado."
                            );
                        }

                        break;

                    case 5:
                        System.out.print(" | Ingrese ID a buscar: ");

                        int idBuscar =
                                Integer.parseInt(scanner.nextLine());

                        Trabajador encontrado =
                                gestionPizza.buscarTrabajador(idBuscar);

                        if (encontrado != null) {
                            System.out.println(encontrado);
                        } else {
                            System.out.println(
                                    " | Empleado no encontrado."
                            );
                        }

                        break;

                    case 6:

                        gestionPizza.listarEmpleados();

                        break;

                    case 7:
                        gestionPizza.mostrarSueldoFinal();

                        break;

                    case 8 :
                        System.out.println("\n | Cerrando el sistema...");
                        break;

                    default:

                        System.out.println(
                                "| Opción no válida. Por favor, seleccione un número del 1 al 8."
                        );



                }

            } catch(NumberFormatException e){
                System.out.println(" | ERROR = No puedes ingresar numeros que no esten dentro del menu ");
            }  catch(ExceptionErrorPizzeria e){
                System.out.println(" | ERROR = " + e.getMessage());
            }



        } while (opc != 8);
        scanner.close();









    }
}
