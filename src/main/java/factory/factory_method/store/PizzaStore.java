package factory.factory_method.store;

import factory.factory_method.pizza.Pizza;
import factory.factory_method.pizza.PizzaType;

public abstract class PizzaStore {

    protected abstract Pizza createPizza(PizzaType type);

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }



}
