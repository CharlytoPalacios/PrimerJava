package org.example;

import java.util.List;
import java.util.Map;

public class Hospital {

    //Atributo de guardado

    public List<Empleado> hospital;
    private Map<Empleado, List<Empleado>> registroHospital;


    //Getters y setters :


    public List<Empleado> getHospital() {
        return hospital;
    }

    public void setHospital(List<Empleado> hospital) {
        this.hospital = hospital;
    }

    public Map<Empleado, List<Empleado>> getRegistroHospital() {
        return registroHospital;
    }

    public void setRegistroHospital(Map<Empleado, List<Empleado>> registroHospital) {
        this.registroHospital = registroHospital;
    }

    // constructor :

    public Hospital(){}

    public Hospital(Map<Empleado, List<Empleado>> registroHospital, List<Empleado> hospital) {
        this.registroHospital = registroHospital;
        this.hospital = hospital;
    }

    public Hospital(List<Empleado> hospital, Map<Empleado, List<Empleado>> registroHospital) {
        this.hospital = hospital;
        this.registroHospital = registroHospital;
    }

    //Registrar empleado
    public void registrarEmpleado(Empleado empleado)
            throws EmpleadoNoEncontrado {
        if (buscarEmpleado(empleado.getId()) != null) {
            throw new EmpleadoNoEncontrado(
                    "El empleado con ID " + empleado.getId()
                            + " ya se encuentra registrado.");
        }
        hospital.add(empleado);
    }


    //Buscar empleado
    public Empleado buscarEmpleado(int id) {
        for (Empleado empleado : hospital) {
            if (empleado.getId() == id) {
                return empleado;
            }
        }
        return null;
    }

    //Eliminar empleado

    public boolean eliminarEmpleado(int id) {
        Empleado empleado = buscarEmpleado(id);
        if (empleado != null) {
            hospital.remove(empleado);
            return true;
        }
        return false;
    }

    //Se crea una lista y se ven los en listados

    // isEmpty sirve para reconocer que tipo de variable es y si esta se encuentra vacia o si contiene datoa


    public void listarEmpleados() {
        if (hospital.isEmpty()) {
            System.out.println("No existen empleados registrados.");
            return;
        }


    System.out.println("\n===== EMPLEADOS DEL HOSPITAL =====");
    for (Empleado empleado : hospital) {
        System.out.println(empleado);
    }
}

//Mostrar resumen de cada sueldo

public void mostrarResumenSueldos() {
    double total = 0;
    System.out.println("\n===== RESUMEN DE SUELDOS =====");
    for (Empleado empleado : hospital) {
        double sueldo = empleado.calculoSueldoFinal();

        System.out.println(
                empleado.getNombre()
                        + " | "
                        + empleado.getTipo()
                        + " | Sueldo: $"
                        + sueldo
        );
        total += sueldo;

    }
    System.out.println("-------------------------------");
    System.out.println("Total a pagar: $" + total);
}


}
