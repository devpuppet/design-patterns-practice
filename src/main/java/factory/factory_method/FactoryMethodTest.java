package factory.factory_method;

import factory.factory_method.pizza.Pizza;
import factory.factory_method.pizza.PizzaType;
import factory.factory_method.store.ChicagoPizzaStore;
import factory.factory_method.store.NYPizzaStore;
import factory.factory_method.store.PizzaStore;

public class FactoryMethodTest {

    public static void run() {
        PizzaStore newYorkPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza newYorkCheesePizza = newYorkPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println(String.format("Kamil ordered a %s\n", newYorkCheesePizza.getName()));

        Pizza newYorkHamPizza = newYorkPizzaStore.orderPizza(PizzaType.HAM);
        System.out.println(String.format("Kamil ordered a %s\n", newYorkHamPizza.getName()));

        Pizza chicagoCheesePizza = chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println(String.format("Sara ordered a %s\n", chicagoCheesePizza.getName()));

        Pizza chicagoHamPizza = chicagoPizzaStore.orderPizza(PizzaType.HAM);
        System.out.println(String.format("Sara ordered a %s\n", chicagoHamPizza.getName()));

    }

}
