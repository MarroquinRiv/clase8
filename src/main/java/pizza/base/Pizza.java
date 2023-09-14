package pizza.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private String name;

    //convertir price en una funcion que retorne el valor de la pizza en base a sus ingredientes
    private List<Topping> toppings = new ArrayList<>();
    public enum Tamaño {
        PEQUEÑA, MEDIANA, GRANDE
    }

    //    los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
//    un significado especial en Java.
//    Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
//    conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
//    espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
//    objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
//    lista de objetos Topping.
    public Tamaño tamaño;
    public Pizza(String name) {
        this.name = name;
        this.tamaño = tamaño;
        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public List<Topping> getToppings() {

        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getName() {
        return name;
    }

    public Tamaño getTamaño() {
        return tamaño;
    }

    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\'' + " toppings=" + toppings + '}';
    }

    public void prepareEnSarten() {
        System.out.println("Preparing..... " + name);
        System.out.println("Adding toppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());
            //put 1 second delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Goes to the pan!");
        //Contador de 5 segundos en cuenta regresiva
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Lastly, the secret ingredient. Let's add some love!");
        System.out.println("The Pizza is ready!");
    }

    public void prepareAlHorno() {
        System.out.println("Preparing..... " + name);
        System.out.println("Adding toppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());
            //put 1 second delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Goes to the oven!");
        //Contador de 5 segundos en cuenta regresiva
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Lastly, the secret ingredient. Let's add some love!");
        System.out.println("The Pizza is ready!");
    }

    public void precio() {
        double precio = 0;
        for (Topping topping : toppings) {
            precio += topping.getPrecio();
        }
        switch (tamaño) {
            case MEDIANA:
                precio *= 1.20; // Aumento del 20%
            case GRANDE:
                precio *= 1.35; // Aumento del 35%
            case PEQUEÑA:
            default:
                precio=precio; // Tamaño pequeño (por defecto)
        }
        System.out.println("El precio de la pizza es: " + precio);
    }
}