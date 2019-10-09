package factory.abstract_factory.factory;

import factory.abstract_factory.model.cheese.Cheese;
import factory.abstract_factory.model.clam.Clam;
import factory.abstract_factory.model.dough.Dough;
import factory.abstract_factory.model.pepperoni.Pepperoni;
import factory.abstract_factory.model.sauce.Sauce;
import factory.abstract_factory.model.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();

}
