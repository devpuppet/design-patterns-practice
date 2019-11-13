package template_method;

public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the Tea...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar...");
    }

    @Override
    protected void decorateBeverage() {
        System.out.println("Decorating tea cup with ginger cake sticks...");
    }

}
