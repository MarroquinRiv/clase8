package pizza.base.especialidades;

import pizza.base.Pizza;
import pizza.base.Topping;

public class Marinara extends Pizza{
    private String oregano;

    public Marinara(String name, Tamaño tamaño, String salsa, Topping... toppings) {
        super(name);
        this.tamaño = tamaño;
        this.oregano = oregano;
    }

    public String getSalsa() {
        return oregano;
    }
}
