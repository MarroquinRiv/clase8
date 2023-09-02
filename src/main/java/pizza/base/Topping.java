package pizza.base;

import java.util.ArrayList;

public class Topping {

    private String nombre; // Nombre del topping
    private double precio; // Precio del topping
    private ArrayList<String> ingredientes = new ArrayList<>(); // Ingredientes del topping

    public void agregarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public Topping(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", ingredientes=" + ingredientes +
                '}';
    }


    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }


}