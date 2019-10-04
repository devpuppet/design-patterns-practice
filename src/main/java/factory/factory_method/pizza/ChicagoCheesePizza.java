package factory.factory_method.pizza;

public class ChicagoCheesePizza extends Pizza{
    public ChicagoCheesePizza() {
        this.name = "Chicago Style Deep Dish Cheese Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza into square slices");
    }
}
