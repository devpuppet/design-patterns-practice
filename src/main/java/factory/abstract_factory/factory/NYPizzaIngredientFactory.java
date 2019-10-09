package factory.abstract_factory.factory;

import factory.abstract_factory.model.cheese.Cheese;
import factory.abstract_factory.model.cheese.ReggianoCheese;
import factory.abstract_factory.model.clam.Clam;
import factory.abstract_factory.model.clam.FreshClam;
import factory.abstract_factory.model.dough.Dough;
import factory.abstract_factory.model.dough.ThinCrustDough;
import factory.abstract_factory.model.pepperoni.Pepperoni;
import factory.abstract_factory.model.pepperoni.SlicedPepperoni;
import factory.abstract_factory.model.sauce.MarinaraSauce;
import factory.abstract_factory.model.sauce.Sauce;
import factory.abstract_factory.model.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = { new Garlic(), new Mushroom(), new Onion(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
