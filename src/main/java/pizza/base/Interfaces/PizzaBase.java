package pizza.base.Interfaces;

public class PizzaBase implements IPreparable{
    private String nombre;
    private double precio;

    public PizzaBase(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando la pizza base: " + this.nombre);
        System.out.println("La pizza está lista!");
    }

    @Override
    public String toString() {
        return "PizzaBase{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}