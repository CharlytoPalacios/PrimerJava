package org.example;

public class Cajero extends Trabajador{

//Se le coloca los atributos :

    private int ordenesEnElDia;
    private double bonoSueldo;

    //Se coloca los setters :


    public void setOrdenesEnElDia(int ordenesEnElDia) {
        this.ordenesEnElDia = ordenesEnElDia;
    }

    public void setBonoSueldo(double bonoSueldo) {
        this.bonoSueldo = bonoSueldo;
    }

    //Se coloca los getters :


    public int getOrdenesEnElDia() {
        return ordenesEnElDia;
    }

    public double getBonoSueldo() {
        return bonoSueldo;
    }

    //Se coloca los constructores

    public Cajero(int idCajero, String nombreCajero, String apellidoCajero, double sueldoBaseCajero, int ordenesDelDiaCajero, double sueldoBonoCajero){}

    public Cajero(String nombre, String apellido, int id, double sueldoBase, int ordenesEnElDia, double bonoSueldo) {
        super(nombre, apellido, id, sueldoBase);
        this.ordenesEnElDia = ordenesEnElDia;
        this.bonoSueldo = bonoSueldo;
    }

    // Se calcula el sueldo
    @Override
    public Double calcularSueldo() {
        double sueldoFinal = getSueldoBase() + getBonoSueldo();
        return sueldoFinal;
    }

    //Area de trabajo


    @Override
    public String getAreaTrabajo() {
        return "Cajero";
    }

    //Mostar informacion


    @Override
    public String toString() {
        return super.toString()
                + "Cuantas ordenes ha tenido el cajero en el dia : " + ordenesEnElDia
                + "El bono es de : " + bonoSueldo ;
    }
}
