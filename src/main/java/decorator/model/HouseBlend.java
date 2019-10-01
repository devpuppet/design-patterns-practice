package decorator.model;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("House Blend");
    }

    @Override
    public double cost() {
        return .89;
    }
}
