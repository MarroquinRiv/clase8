package pizza.base.especialidades;
import pizza.base.Pizza;
import pizza.base.Topping;

public class PizzaItaliana extends Pizza {
    private String salsa;

    public PizzaItaliana(String name, Tamaño tamaño, String salsa, Topping... toppings) {
        super(name);
        this.tamaño = tamaño;
        this.salsa = salsa;
    }

    public String getSalsa() {
        return salsa;
    }
}
