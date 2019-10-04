package factory.factory_method.pizza;

import java.util.ArrayList;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough: " + dough);
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println(" - " + topping);
        }
    }

    public void bake() {
        System.out.println("Baking for 20 minutes at 300...");
    }

    public void cut() {
        System.out.println("Cutting in diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }

}
