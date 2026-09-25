package org.example;

public class PreparadorPizza extends Trabajador{
    private int ingredientesUsados;
    private double bonoPorHora;

    //Setters :


    public void setIngredientesUsados(int ingredientesUsados) {
        this.ingredientesUsados = ingredientesUsados;
    }

    public void setBonoPorHora(double bonoPorHora) {
        this.bonoPorHora = bonoPorHora;
    }

    //Getters :


    public int getIngredientesUsados() {
        return ingredientesUsados;
    }

    public double getBonoPorHora() {
        return bonoPorHora;
    }

    //Constructor vacio y con parametros

    public PreparadorPizza(int idPreparadorPizza, String nombrePreparadorPizza, String apellidoPreparadorPizza, double sueldoBasePreparadorPizza, int ingredientesPreparadorPizza, double sueldoBonoPorHoraPreparadorPizza){}

    public PreparadorPizza(String nombre, String apellido, int id, double sueldoBase, int ingredientesUsados, double bonoPorHora) {
        super(nombre, apellido, id, sueldoBase);
        this.ingredientesUsados = ingredientesUsados;
        this.bonoPorHora = bonoPorHora;
    }

    // Se calcula el sueldo
    @Override
    public Double calcularSueldo() {
        double sueldoFinal = getSueldoBase() + getBonoPorHora();
        return sueldoFinal;
    }

    //Area de trabajo
    @Override
    public String getAreaTrabajo() {
        return "Preparador de pizza";
    }

    //Mostrar informacion


    @Override
    public String toString() {
        return super.toString()
                + "| Cuantos ingredientes ha usado durante el dia el preparado : " + ingredientesUsados
                + "| El bono por hora es de : " + bonoPorHora;
    }
}
