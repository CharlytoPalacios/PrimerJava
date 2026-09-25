package org.example;

public class Medico extends Empleado {
    //Atributos ;

    private String especialidad;
    private double bono;

    //Getters y setters :

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    //Contructor vacio y con parametros

    public Medico(){}

    @Override
    public double calculoSueldoFinal() {
        double sueldoFinal = getSueldoBase() + getBono();
        return sueldoFinal;
    }

    public Medico(String especialidad, double bono) {
        this.especialidad = especialidad;
        this.bono = bono;
    }

    public Medico(int id, String nombre, double sueldoBase, String especialidad, double bono) {
        super(id, nombre, sueldoBase);
        this.especialidad = especialidad;
        this.bono = bono;
    }


    //Se junta la informacion para representar con la clase padre e hija

    @Override
    public String getTipo() {
        return "Médico";
    }


    @Override
    public String toString() {
        return super.toString()
                + " | Especialidad: " + especialidad
                + " | Bono: $" + bono;
    }
}
