package factory.factory_method.store;

import factory.factory_method.pizza.NYCheesePizza;
import factory.factory_method.pizza.NYHamPizza;
import factory.factory_method.pizza.Pizza;
import factory.factory_method.pizza.PizzaType;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new NYCheesePizza();
            case HAM:
                return new NYHamPizza();
            default:
                return null;
        }
    }
}
