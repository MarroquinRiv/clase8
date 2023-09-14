package pizza.base;
import pizza.base.especialidades.PizzaItaliana;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Pizza Margarita");
        pizza.addTopping(new Topping("Tomato", 12.5));
        pizza.addTopping(new Topping("Mozzarella", 15.5));
        pizza.addTopping(new Topping("Basil", 5.5));
        System.out.println(pizza);
        pizza.prepareEnSarten();
        //System.out.println("La salsa es: " + PizzaItaliana.getSalsa());
        pizza.precio();
    }
}