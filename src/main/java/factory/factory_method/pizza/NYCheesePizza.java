package factory.factory_method.pizza;

public class NYCheesePizza extends Pizza {

    public NYCheesePizza() {
        this.name = "New York Style Sauce and Cheese Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";

        toppings.add("Greated Reggiano Cheese");
    }

}
