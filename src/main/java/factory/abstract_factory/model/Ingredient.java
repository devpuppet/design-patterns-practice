package factory.abstract_factory.model;

public abstract class Ingredient {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
