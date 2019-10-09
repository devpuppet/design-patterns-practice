package factory.abstract_factory.store;

import factory.abstract_factory.model.pizza.Pizza;
import factory.abstract_factory.model.pizza.PizzaType;

public abstract class PizzaStore {

    protected abstract Pizza createPizza(PizzaType pizzaType);

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
