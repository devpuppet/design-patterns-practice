package factory.factory_method.pizza;

public class ChicagoHamPizza extends Pizza {
    public ChicagoHamPizza() {
        this.name = "Chicago Style Deep Dish Ham Pizza";
        this.dough = "Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";

        toppings.add("Prosciutto Ham");
    }

    @Override
    public void bake() {
        System.out.println("Baking for 10 minutes at 350...");
    }
}
