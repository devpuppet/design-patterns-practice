package factory.factory_method.store;

import factory.factory_method.pizza.ChicagoCheesePizza;
import factory.factory_method.pizza.ChicagoHamPizza;
import factory.factory_method.pizza.Pizza;
import factory.factory_method.pizza.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new ChicagoCheesePizza();
            case HAM:
                return new ChicagoHamPizza();
            default:
                return null;
        }
    }
}
