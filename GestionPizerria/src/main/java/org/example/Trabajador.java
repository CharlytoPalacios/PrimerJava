package org.example;

public  abstract class Trabajador {

    //Esta clase de trabajador sera una clase abstracta ya que sera la clase padre que moldeara los roles de trabajador

    //Se coloca los atributos en private
    private int id;
    private String nombre;
    private String apellido;
    private double sueldoBase;

    // Se genera los setters :


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    //Se genera los getters :


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    //Se genera el constructor con parametros y vacios :

    public Trabajador(){}


    public Trabajador(String nombre, String apellido, int id, double sueldoBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.sueldoBase = sueldoBase;

    }

    // Calcular los sueldos :

    public abstract Double calcularSueldo();

    // Mostrar area de trabajo

    public abstract String getAreaTrabajo();

    //Mostrar la informacion

    @Override
    public String toString(){

        return "El ID del trabajador es : " + id
                + "| El nombre del trabajador es :  " + nombre
                + "| El apellido del trabajador es :  " + apellido
                + "| El sueldo base  del trabajador es :  " + sueldoBase
                + "| El area de trabajo es :  " + getAreaTrabajo()
                + "| El sueldo final del trabajador es :  " + calcularSueldo();


    }
}
