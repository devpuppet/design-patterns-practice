package factory.abstract_factory.factory;

import factory.abstract_factory.model.cheese.Cheese;
import factory.abstract_factory.model.cheese.Mozarella;
import factory.abstract_factory.model.clam.Clam;
import factory.abstract_factory.model.clam.FrozenClam;
import factory.abstract_factory.model.dough.Dough;
import factory.abstract_factory.model.dough.ThickCrustDough;
import factory.abstract_factory.model.pepperoni.Pepperoni;
import factory.abstract_factory.model.pepperoni.SlicedPepperoni;
import factory.abstract_factory.model.sauce.PlumTomatoSauce;
import factory.abstract_factory.model.sauce.Sauce;
import factory.abstract_factory.model.veggies.BlackOlives;
import factory.abstract_factory.model.veggies.EggPlant;
import factory.abstract_factory.model.veggies.Spinach;
import factory.abstract_factory.model.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}
