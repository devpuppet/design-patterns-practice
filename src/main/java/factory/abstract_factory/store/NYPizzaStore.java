package factory.abstract_factory.store;

import factory.abstract_factory.factory.NYPizzaIngredientFactory;
import factory.abstract_factory.factory.PizzaIngredientFactory;
import factory.abstract_factory.model.pizza.CheesePizza;
import factory.abstract_factory.model.pizza.ClamPizza;
import factory.abstract_factory.model.pizza.Pizza;
import factory.abstract_factory.model.pizza.PizzaType;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        switch (pizzaType) {
            case CHEESE:
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            default:
                throw new RuntimeException(String.format("Unknown pizza type = %s", pizzaType.toString()));
        }

        return pizza;
    }
}
