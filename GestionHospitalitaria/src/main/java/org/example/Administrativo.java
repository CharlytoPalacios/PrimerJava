package org.example;

public class Administrativo extends  Empleado{

    private String area;

    private int horaExtra;

    //Agregarle el valor extra


    private static final double VALOR_HORA_EXTRA = 10000;


    //Setters y Getters :


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    //Contructor vacio y con parametros :

    public Administrativo(){}

    @Override
    public double calculoSueldoFinal() {
        double resultadoFinal= getSueldoBase() + VALOR_HORA_EXTRA;
        return resultadoFinal;
    }

    public Administrativo(String area, int horaExtra) {
        this.area = area;
        this.horaExtra = horaExtra;
    }

    public Administrativo(int id, String nombre, double sueldoBase, String area, int horaExtra) {
        super(id, nombre, sueldoBase);
        this.area = area;
        this.horaExtra = horaExtra;
    }



    //Muestra el tipo de trabajador que es

    @Override
    public String getTipo() {
        return "Administrador";
    }


    //Se junta la informacion para representar con la clase padre e hija

    @Override
    public String toString(){
        return super.toString()
                +" | ¿Cual es el area? : " + area
                +" | Horas extras : $" + horaExtra;
    }
    }

