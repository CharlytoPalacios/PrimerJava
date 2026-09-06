package org.example;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Producto producto1 = new Producto("Notebook","Tecnologia") ;
        Producto producto2 = new Producto("Teclado","Accesesorios") ;
        Producto producto3 = new Producto("Mouse","Accesorios") ;
        Producto producto4 = new Producto("Monitor","Tecnologia") ;
        Producto producto5 = new Producto("Auriculares","Accesorios") ;

        //Ahora se coloca las listas con los elementos

        List<Producto> producto = new ArrayList<>();

        producto.add(producto1);
        producto.add(producto2);
        producto.add(producto3);
        producto.add(producto4);
        producto.add(producto5);

        System.out.println("\n---NOMBRE DEL PRODUCTO---");
        for(Producto productos : producto){
            System.out.println(productos);
        }

        Map<String, Double> precio = new HashMap<>();
        precio.put("Notebook",799990.0);
        precio.put("Teclado",29990.0);
        precio.put("Mouse",14990.0);
        precio.put("Monitor",189990.0);
        precio.put("Auriculares",39990.0);

        System.out.println("\n---PRECIOS---");
        for(Map.Entry<String,Double> entrada : precio.entrySet()){
            System.out.println(entrada.getKey()+"->$"+entrada.getValue());
        }

        System.out.println("\n---PRECIOS BAJOS---");
        for(Map.Entry<String,Double> entrada : precio.entrySet()){
            if(entrada.getValue() <= 50000){
                System.out.println(entrada.getKey());
            }
        }

        System.out.println("\n---ALTOS PRECIOS---");
        for(Map.Entry<String,Double> entrada : precio.entrySet()){
            if(entrada.getValue() >= 50000){
                System.out.println(entrada.getKey());
            }
        }

        System.out.println("\n---CUANTO PRODUCTOS HAY---");
        int contadorProductos = precio.size();

        System.out.println("Cantidad de productos : " + contadorProductos);

        System.out.println("\n---PROMEDIO DE LOS PRODUCTOS---");

        double suma = 0.0;
        for (double num : precio.values()) {
            suma += num;
        }


        double promedio = suma / precio.size();

        System.out.println("El promedio es: " + promedio);

    }
}
