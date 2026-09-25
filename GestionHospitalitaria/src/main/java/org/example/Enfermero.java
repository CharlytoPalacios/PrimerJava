package org.example;

public class Enfermero extends Empleado {

    //Los atributos

    private int turno;

    private int bonoTurno;

    //Getters y setters :


    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getBonoTurno() {
        return bonoTurno;
    }

    public void setBonoTurno(int bonoTurno) {
        this.bonoTurno = bonoTurno;
    }

    //Constructor vacio y con parametros

    public Enfermero(int idEnfermero, String nombreEnfermero, double sueldoEnfermero, String turno, double bonoTurno){}

    @Override
    public double calculoSueldoFinal() {
        double resultadoFinal = getSueldoBase() + getBonoTurno();
        return resultadoFinal;
    }

    //Se muestra su especialidad
    @Override
    public String getTipo() {
        return "Enfermero";
    }


    //Se junta la informacion para representar con la clase padre e hija

    @Override
    public String toString(){
        return super.toString()
                +" | Especialidad: " + turno
                +" | Bono: $" + bonoTurno;
    }

    }

