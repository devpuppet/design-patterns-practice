package factory.abstract_factory;

import factory.abstract_factory.model.pizza.Pizza;
import factory.abstract_factory.model.pizza.PizzaType;
import factory.abstract_factory.store.ChicagoPizzaStore;
import factory.abstract_factory.store.NYPizzaStore;
import factory.abstract_factory.store.PizzaStore;

public class AbstractFactoryTest {

    public static void run() {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza nyCheesePizza = nyPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println(nyCheesePizza);

        Pizza nyClamPizza = nyPizzaStore.orderPizza(PizzaType.CLAM);
        System.out.println(nyClamPizza);

        Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println(chicagoCheesePizza);

        Pizza chicagoClamPizza = chicagoPizzaStore.orderPizza(PizzaType.CLAM);
        System.out.println(chicagoClamPizza);
    }

}
