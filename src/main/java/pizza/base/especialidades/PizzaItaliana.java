package pizza.base.especialidades;
import pizza.base.Pizza;

public class PizzaItaliana extends Pizza {
    private String salsa;

    public PizzaItaliana(String name, String salsa) {
        super(name);
        this.salsa = salsa;
    }

    public String getSalsa() {
        return salsa;
    }
}
