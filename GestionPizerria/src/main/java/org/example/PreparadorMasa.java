package org.example;

public class PreparadorMasa extends Trabajador{

    //Atributo

    private int pizzaPreparada;


    //Setters


    public void setPizzaPreparada(int pizzaPreparada) {
        this.pizzaPreparada = pizzaPreparada;
    }


    //Getters


    public int getPizzaPreparada() {
        return pizzaPreparada;
    }



    //Constructor con y sin parametros

    public PreparadorMasa(int idPreparadorMasa, String nombrePreparadorMasa, String apellidoPreparadorMasa, double sueldoBasePreparadorMasa, int pizzaPreparadaPreparadorMasa){}


    public PreparadorMasa(String nombre, String apellido, int id, double sueldoBase, int pizzaPreparada) {
        super(nombre, apellido, id, sueldoBase);
        this.pizzaPreparada = pizzaPreparada;
    }


    private static final double VALOR_POR_PIZZA = 850;


    // Se calcula el sueldo


    @Override
    public Double calcularSueldo() {

        double sueldoFinal = getSueldoBase() + (VALOR_POR_PIZZA * getPizzaPreparada());
        return sueldoFinal;
    }

    //Area de trabajo


    @Override
    public String getAreaTrabajo() {
        return "Amasador de pizza";
    }

    //Mostrar informacion


    @Override
    public String toString() {
        return super.toString()
         + "| Cuantas pizzas han sido preparadas : " + pizzaPreparada;

    }
}

