package factory.factory_method.pizza;

public class NYHamPizza extends Pizza {
    public NYHamPizza() {
        this.name = "New York Style Ham Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";

        toppings.add("Smoked Ham");
    }

    @Override
    public void box() {
        System.out.println("Place pizza in special HappyHam box");
    }
}
