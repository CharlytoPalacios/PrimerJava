package org.example;

import java.util.ArrayList;
import java.util.List;


public class PizzeriaGestion {

    //Se coloca la lista y el mapa

    private List <Trabajador> pizarria = new ArrayList<>();

    // Setters y getters

    public List<Trabajador> getPizarria() {
        return pizarria;
    }

    public void setPizarria(List<Trabajador> pizarria) {
        this.pizarria = pizarria;
    }


    //Constructor


    public PizzeriaGestion(){}

    public PizzeriaGestion(List<Trabajador> pizarria) {
        this.pizarria = pizarria;
    }


    //Recorrer informacion

    public Trabajador buscarTrabajador (int id){

        for (Trabajador trabajador : pizarria) {
            if(trabajador.getId() == id)
                return trabajador;
        }
        return null;
    }

    //Registrar trabajador

    public void registrarTrabajador (Trabajador trabajador)
        throws ExceptionErrorPizzeria{

        if (buscarTrabajador(trabajador.getId()) != null){
            throw new ExceptionErrorPizzeria(
                    "El trabajador con el ID "
                    + " ya se encuentra ingrsado"
            );

        }
        pizarria.add(trabajador);
    }

    //Eliminar trabajador

    public boolean eliminarTrabajador (int id){

        Trabajador trabajador = buscarTrabajador(id);
        if (trabajador != null){

            pizarria.remove(trabajador);
            return true;
        }
        return  false;
    }

    //Mostrar informacion por listado

    public void mostrarSueldoFinal(){

        double total = 0;

        System.out.println("\n---SUELDO FINAL---");
        for (Trabajador trabajador : pizarria){
            double sueldo = trabajador.calcularSueldo();

            System.out.println(
                    trabajador.getNombre()
                    + " | "
                    + " | Sueldo : $"
                    + sueldo
            );

            total += sueldo;
        }
        System.out.println("------------------------------------");
        System.out.println("El total de pagar es de : $" + total);
    }

    public void listarEmpleados() {
        if (pizarria.isEmpty()) {
            System.out.println("No existen empleados registrados.");
            return;
        }

        for (Trabajador trabajador : pizarria) {
            System.out.println( trabajador);
        }


    }
}
