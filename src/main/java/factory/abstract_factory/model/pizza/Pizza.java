package factory.abstract_factory.model.pizza;

import factory.abstract_factory.factory.PizzaIngredientFactory;
import factory.abstract_factory.model.cheese.Cheese;
import factory.abstract_factory.model.clam.Clam;
import factory.abstract_factory.model.dough.Dough;
import factory.abstract_factory.model.pepperoni.Pepperoni;
import factory.abstract_factory.model.sauce.Sauce;
import factory.abstract_factory.model.veggies.Veggies;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;
    protected PizzaIngredientFactory pizzaIngredientFactory;

    public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public abstract void prepare();

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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nName: " + name + "\n");
        builder.append("Dough: " + dough + "\n");
        builder.append("Sauce: " + sauce + "\n");
        builder.append("Cheese: " + cheese + "\n");

        if (veggies != null) {
            builder.append("Veggies:\n");
            for (Veggies veggie : veggies) {
                builder.append(" - " + veggie + "\n");
            }
        }

        if (clam != null) {
            builder.append("Clam: "+ clam + "\n");
        }

        if (pepperoni != null) {
            builder.append("Pepperoni: " + pepperoni + "\n");
        }

        return builder.toString();
    }

}
