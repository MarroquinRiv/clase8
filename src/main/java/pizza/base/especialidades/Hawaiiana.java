package pizza.base.especialidades;
import pizza.base.Pizza;
import pizza.base.Topping;

public class Hawaiiana extends Pizza {
    private String piña;

    public Hawaiiana(String name, Tamaño tamaño, String salsa, Topping... toppings) {
        super(name);
        this.tamaño = tamaño;
        this.piña = piña;
    }

    public String getSalsa() {
        return piña;
    }
}