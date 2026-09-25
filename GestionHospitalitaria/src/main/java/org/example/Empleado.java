package org.example;

public abstract class  Empleado {

    //Se establece los atributos
    private int id;
    private String nombre;
    private double sueldoBase;

    //Setter


    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    //Getter


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    //Se coloca un constructor vacio y otro con sus parametros
    public Empleado(){}

    public Empleado(int id, String nombre, double sueldoBase) {
        this.id = id;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    //Se coloca el abstracto
    public abstract double calculoSueldoFinal();



    //Se coloca para generar la muestra de informacion
    public abstract String getTipo();

    @Override
    public String toString() {
        return "ID: " + id
                + " | Nombre: " + nombre
                + " | Tipo: " + getTipo()
                + " | Sueldo final: $" + calculoSueldoFinal();
    }


}
