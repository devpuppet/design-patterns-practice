package decorator;

import decorator.model.Beverage;
import decorator.model.Espresso;
import decorator.model.HouseBlend;
import decorator.model.decorators.Mocha;
import decorator.model.decorators.SteamedMilk;
import decorator.model.decorators.Whip;

public class DecoratorTest {

    public static void run() {
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new SteamedMilk(espresso);
        espresso = new Whip(espresso);
        System.out.println(espresso.printOrder());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new SteamedMilk(houseBlend);
        houseBlend = new Whip(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.printOrder());
    }

}
