package template_method;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
        decorateBeverage();
    }

    // 'primitive' operation, subclass has to implement
    protected abstract void brew();

    // 'primitive' operation, subclass has to implement
    protected abstract void addCondiments();

    // 'concrete' operation provided by abstract class
    private void boilWater() {
        System.out.println("Boiling water...");
    }

    // 'concrete' operation provided by abstract class
    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    // 'hook' method (optional operation)
    protected boolean customerWantsCondiments() {
        return true;
    }

    // 'hook' method (optional operation)
    protected void decorateBeverage() {

    }

}
