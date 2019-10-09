package factory.abstract_factory.model.pizza;

import factory.abstract_factory.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + this.getName());
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
