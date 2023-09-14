package pizza.base.especialidades;

import pizza.base.Pizza;
import pizza.base.Topping;

public class CincoCarnes extends Pizza {
    private String carnes;

    public CincoCarnes(String name, Tamaño tamaño, String salsa, Topping... toppings) {
        super(name);
        this.tamaño = tamaño;
        this.carnes = carnes;
    }

    public String getSalsa() {
        return carnes;
    }
}
